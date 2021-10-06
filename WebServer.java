package ca.client.assignment2;

import java.net.*;
import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer {
    public static void main(String[] args) throws IOException {
        boolean listening = true;
        ExecutorService threadPool = Executors.newCachedThreadPool();

        try (ServerSocket serverSocket = new ServerSocket(8086)) {
            while (listening)
                threadPool.execute(new WebServerThread(serverSocket.accept()));
        } catch (Exception e) {
            // Print error message
            System.err.println("Error Creating Socket\n");
            System.exit(-1);
        }
    }
}
