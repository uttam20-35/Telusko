package com.telusko;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello world");
        Tomcat tomcat=new Tomcat();
        tomcat.setPort(4040);
        // Servlet Mapping
        Context context =tomcat.addContext("", null);
        Tomcat.addServlet(context, "HelloServlet", new HelloServlets());

        context.addServletMappingDecoded("/hello", "HelloServlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}