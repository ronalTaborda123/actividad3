package com.second.task.common;


import lombok.Value;

@Value(staticConstructor = "of")
public class Generics {
    public static <T> Integer entero(T object){
        return object.hashCode();
    }
}
