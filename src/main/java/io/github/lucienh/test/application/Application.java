package io.github.lucienh.test.application;

import com.mangofactory.swagger.plugin.EnableSwagger;
import io.github.lucienh.test.project.configuration.ProjectConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ProjectConfig.PATH})
@EnableSwagger
@EnableAutoConfiguration
public class Application {
    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }
}
