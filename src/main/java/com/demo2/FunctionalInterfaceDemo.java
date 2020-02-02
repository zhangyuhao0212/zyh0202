package com.demo2;

@FunctionalInterface //函数式接口
public interface FunctionalInterfaceDemo {

    // 抽象方法
    public void sub();

    // java.lang.Object中的public方法
    public boolean equals(Object var1);

    // 默认方法
    public default void defaultMethod(){

    }

    // 静态方法
    public static void staticMethod(){

    }
}
