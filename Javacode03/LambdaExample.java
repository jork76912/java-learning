package com.java_learning.Javacode03;

public class LambdaExample {
    //参考文章：https://blog.csdn.net/LHY537200/article/details/136889277
    //首先理解函数式接口：如果一个接口只有一个抽象方法，那么该接口就是一个函数式接口


    public static void main(String[] args) {


        //List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Lambda表达式使用多个语句块
//        numbers.forEach(number ->{
//            int doubled = number * 2;
//            System.out.println(number + " 两倍是 " + doubled);
//        });

//        numbers.replaceAll(n -> n = n + 5);
//        System.out.println(numbers);


        // 创建一个助手对象，使用Lambda表达式实现任务
        //  Task assistant = () -> System.out.println("助手正在切洋葱...");
        // 调用厨师的方法，传递助手对象执行任务
        //  cookMeal(assistant);

     //Lambda的变量捕获
//        int a = 10;
//        NoParameterNoReturn noParameterNoReturn = ()->{
//
//            System.out.println("捕获变量："+a);
//        };
//        noParameterNoReturn.test();


    }

    @FunctionalInterface
    interface NoParameterNoReturn {
        void test();


        public static void cookMeal(Task task) {
            // 准备食材
            System.out.println("准备食材...");

            // 执行任务
            task.perform();

            // 煮菜
            System.out.println("开始烹饪...");
        }

        @FunctionalInterface
        interface Task {
            //注意只能有一个方法
            void perform();
        }
    }
}



