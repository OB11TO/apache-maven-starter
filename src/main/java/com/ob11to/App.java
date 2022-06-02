package com.ob11to;

import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Supplier<String> str = () -> "OB11TO";
        System.out.println( "Hello World! "  + str.get());
    }
}
