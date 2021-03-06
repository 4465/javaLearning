package com.basicExersice.reflection;


import java.lang.annotation.ElementType;

//测试所有类型的Class
public class Test03 {

    public static void main(String[] args) {
        Class c1 =Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = Override.class;
        Class c6 = ElementType.class;
        Class c7 = Integer.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

        int[] a = new int[10];
        int[] b = new int[1000];

        //只要元素类型和维度一样，就是同一个Class
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());

    }

}
