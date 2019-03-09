package com.zac.exercises.playground.generics;

class MyGenericOuterClass<U> {
    public class MyGenericInnerClass<U> {

    }
}

class MyStringOuterSubClass extends MyGenericOuterClass<String> { }
