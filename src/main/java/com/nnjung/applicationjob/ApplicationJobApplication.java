package com.nnjung.applicationjob;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class ApplicationJobApplication {

    public static void main(String[] args) {
      //  SpringApplication.run(ApplicationJobApplication.class, args);
        SpringApplication app = new SpringApplication(ApplicationJobApplication.class);
        //배너세팅
        app.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                out.println("CUstom");
            }
        });
        //배너끄기
        //app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
