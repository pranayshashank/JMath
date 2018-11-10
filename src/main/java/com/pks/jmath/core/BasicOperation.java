package com.pks.jmath.core;

public interface BasicOperation <T, U, V> {


    V add (T one, U two);


    V multiply (T one, U two);


    V subtract (T one, U two);


    V divide (T one, U two);
}
