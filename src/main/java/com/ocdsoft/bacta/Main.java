package com.ocdsoft.bacta;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import java.io.File;
import java.net.MalformedURLException;

/**
 * Created by Kyle on 4/1/2015.
 */
public class Main {

    public static void main(String[] args) throws ServletException, LifecycleException, MalformedURLException {

        // Define a folder to hold web application contents.
        String webappDirLocation = "src/main/webapp/";
        Tomcat tomcat = new Tomcat();

        // Define port number for the web application
        String webPort = System.getenv("PORT");
        if (webPort == null || webPort.isEmpty()) {
            webPort = "8080";
        }
        // Bind the port to Tomcat server
        tomcat.setPort(Integer.valueOf(webPort));

        // Define a web application context.
        Context context = tomcat.addWebapp("/admin", new File(webappDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
    }
}
