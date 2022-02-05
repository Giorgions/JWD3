package pl.edu.wszib.exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws MalformedURLException {
        CheckedExceptionDemo ced = new CheckedExceptionDemo();
        /*ced.urlTesterByTryCatch("ttps://onet.pl");*/
        ced.urlTesterByThrows("https?://wszib.edu.pl");

    }

    public void urlTesterByTryCatch(String urlStr) {
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (Exception e) {
            System.out.println("Niepoprawny url: " + e.getMessage());
        }
    }

    public void urlTesterByThrows(String urlStr) throws MalformedURLException {
        URL url = new URL(urlStr);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }
}
