package com.sjsu.sequncediagram;

public class Client {

    public static void runTest()
    {
        Component theOrder = BuildOrder.getOrder() ;
        theOrder.printDescription();
    }
}
