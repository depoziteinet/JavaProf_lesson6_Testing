import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Lesson7Test {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        start(Lesson7Test.class);
    }

    public static void start(Class c) throws InvocationTargetException, IllegalAccessException {
        int countBefore = 0;
        int countAfter = 0;
        int maxNumPriority = 10;

        ArrayList<ArrayList<Method>> arrTests = new ArrayList<ArrayList<Method>>();
        ArrayList<Method> arrBefore = new ArrayList<Method>();
        ArrayList<Method> arrAfter  = new ArrayList<Method>();

        for (int i = 0; i < maxNumPriority; i++) {
            arrTests.add(new ArrayList<Method>());
        }

        Method[] methods = c.getDeclaredMethods();

        for (Method method : methods) {

            if(method.isAnnotationPresent(BeforeSuite.class)) {
                countBefore++;
                arrBefore.add(method);
            }
            else if(method.isAnnotationPresent(AfterSuite.class)) {
                countAfter++;
                arrAfter.add(method);
            }
            else if(method.isAnnotationPresent(Test.class))
                arrTests.get(method.getAnnotation(Test.class).priority() - 1).add(method);


        }

        if(countBefore > 1 || countAfter >1)
            throw new RuntimeException("Методов с аннотациями @BeforeSuite и @AfterSuite > 1");


        if(arrBefore.size() > 0)
            arrBefore.get(0).invoke(Lesson7Test.class);

        for (int i = 0; i < arrTests.size(); i++) {
            for (Method method : arrTests.get(i)) {
                System.out.println(method.toString() + i);
                method.invoke(Lesson7Test.class);
            }
        }

        if(arrAfter.size() > 0)
            arrAfter.get(0).invoke(Lesson7Test.class);

    }

    @BeforeSuite
    public static void before(){
        System.out.println("Начинаем тестирование\n");
    }


    @AfterSuite
    public static void after(){
        System.out.println("Конец тестировани\n");
    }


    @Test(priority = 1)
    public static void test1(){
        System.out.println("Тест 1 приоритет 1\n");
    }

    @Test(priority = 10)
    public static void test2(){
        System.out.println("Тест 2 приоритет 10\n");
    }

    @Test(priority = 3)
    public static void test3(){
        System.out.println("Тест 3 приоритет 3\n");
    }

    @Test
    public static void test4(){
        System.out.println("Тест 4 приоритет 5\n");
    }

    @Test(priority = 8)
    public static void test5(){
        System.out.println("Тест 5 приоритет 8\n");
    }

    @Test(priority = 10)
    public static void test6(){
        System.out.println("Тест 6 приоритет 10\n");
    }

    @Test(priority = 3)
    public static void test7(){
        System.out.println("Тест 7 приоритет 3\n");
    }


}
