public class TestedMethods {


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
