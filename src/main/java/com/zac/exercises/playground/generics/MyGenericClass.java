package com.zac.exercises.playground.generics;

public class MyGenericClass<T> {
}

class MyGenericSubClass<U> extends MyGenericClass<U> {

}

class MyStringSubClass extends MyGenericSubClass<String> {

}
