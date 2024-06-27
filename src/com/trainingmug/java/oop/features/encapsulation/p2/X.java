package com.trainingmug.java.oop.features.encapsulation.p2;

import com.trainingmug.java.oop.features.encapsulation.p1.A;

public class X {
    public static void main(String[] args) {
        A a;
        a = new A();
        System.out.println(a.x);
        //System.out.println(a.y); can't access
        // System.out.println(a.z); can't access
       // System.out.println(a.value); can't access
    }
}
