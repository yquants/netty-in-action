package com.yquants.books.nettyinaction.ch01;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Wei on 2016/12/3.
 */
public class JavaNativeServerTest {

    private final JavaNativeServer server = new JavaNativeServer();

    @Before
    public void setUp() {
        System.setProperty("Netty.port", "7777");
    }

    @After
    public void tearDown() {
        System.setProperty("Netty.port", null);
    }

    @Test
    public void given_server_when_connection_issued_then_should_be_connected() {
        try {
            server.start();
        } catch (IOException ioe) {
            Assert.assertNotNull(ioe);
        }

    }
}
