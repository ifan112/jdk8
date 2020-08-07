package jdk8.lang.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo {

    public static void main(String[] args) {

        try {

            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
