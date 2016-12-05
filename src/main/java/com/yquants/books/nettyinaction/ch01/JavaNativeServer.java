package com.yquants.books.nettyinaction.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Wei on 2016/12/3.
 */
public class JavaNativeServer {

    private final String PORT = System.getProperty("Netty.port", "9090");

    public void start() throws IOException {

        ServerSocket serverSocket = new ServerSocket(Integer.parseInt(PORT));

        while (true) {
            Socket clientSocket = serverSocket.accept();

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String request, response;

            while ((request = in.readLine()) != null) {
                if ("Done".equalsIgnoreCase(request)) {
                    break;
                }

                if ("Shutdown".equalsIgnoreCase(request)) {
                    //A method to shutdown server besides of Ctrl + C
                    serverSocket.close();
                    return;
                }
                response = processRequest(request);
                out.println(response);
            }
        }

    }

    private String processRequest(String request) {
        //TODO: some business processing should be done here
        return null;
    }
}
