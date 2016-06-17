package io.github.iterrator.boot.admin.config;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 *
 * Created by itERRatOR on 17/06/2016.
 */
@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminServerApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminServerApp.class, args);
    }

    // Used when deploying to a standalone servlet container, i.e. tomcat
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootAdminServerApp.class);
    }
}
