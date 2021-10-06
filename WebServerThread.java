package ca.client.assignment2;

import java.net.*;
import java.io.*;

public class WebServerThread extends Thread {
    private Socket socket = null;

    public WebServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

    }
}
