package com.yquants.books.nettyinaction.ch02.server;

/**
 * Created by Wei on 2016/12/4.
 */
public class EchoServerTest {

    public static void main(String[] args) throws Exception {
        new EchoServer(9999).start();
    }
}
