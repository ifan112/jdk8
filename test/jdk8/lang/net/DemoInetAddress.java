package jdk8.lang.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DemoInetAddress {

    public static void main(String[] args) {

        // 优先使用 IPv6 协议的网络地址
        // System.setProperty("java.net.preferIPv6Addresses","true");

        try {

            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost.getHostAddress());
            System.out.println(localHost.getHostName());

            // https://zh.wikipedia.org/wiki/分类网络


            // any local address 或 wildcard address 通配符地址，只有一个那就是 0.0.0.0
            System.out.println(localHost.isAnyLocalAddress());

            // link local address 链路本地地址，指定是 169.254.0.0/16 地址块中的地址，用于该地址段内主机之间的通信
            // https://zh.wikipedia.org/wiki/链路本地地址
            System.out.println(localHost.isLinkLocalAddress());

            // site local address 等同于私有 IP 地址
            // 10.0.0.0/8
            // 172.16.0.0/12
            // 192.168.0.0/16
            // https://4sysops.com/archives/ipv6-tutorial-part-6-site-local-addresses-and-link-local-addresses/#site-local-addresses
            // https://www.quora.com/What-is-the-difference-between-link-local-address-and-site-local-address
            System.out.println(localHost.isSiteLocalAddress());


            // 224.0.0/24
            System.out.println(localHost.isMCLinkLocal());
            // 224.0.1.0 ~ 238.255.255.255
            System.out.println(localHost.isMCGlobal());
            System.out.println(localHost.isMCNodeLocal());
            System.out.println(localHost.isMCOrgLocal());
            System.out.println(localHost.isMCSiteLocal());

            // multicast address 多播地址，分类网络地址中的 D 类 IP 地址，范围 224.0.0.1—239.255.255.254
            System.out.println(localHost.isMulticastAddress());


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
