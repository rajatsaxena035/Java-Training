package jax;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher
{
    public static void main(String[] args) {
            // TODO Auto-generated method stub
           	System.out.println("hello");
            Endpoint.publish("http://localhost:7789/ws/hello",new HelloWorldImpl());
            System.out.println("hello2");
    }
}