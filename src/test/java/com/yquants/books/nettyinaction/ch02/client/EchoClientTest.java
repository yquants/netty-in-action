package com.yquants.books.nettyinaction.ch02.client;

/**
 * Created by Wei on 2016/12/4.
 */
public class EchoClientTest {

    public static void main(String... args) throws Exception{
        new EchoClient("localhost", 9999).start();

    }
}
