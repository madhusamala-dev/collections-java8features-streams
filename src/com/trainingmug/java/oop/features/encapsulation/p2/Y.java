package com.trainingmug.java.oop.features.encapsulation.p2;

import com.trainingmug.java.oop.features.encapsulation.p1.A;

public class Y extends A {

    public static void main(String[] args) {
        A a;
        a = new A();
        System.out.println(a.x);
        // System.out.println(a.y); can't access
        // System.out.println(a.z); can't access
        // System.out.println(a.value); can't access with parent object
        Y y = new Y();
        System.out.println(y.value); // protected can be accessed only through child object
    }
}
