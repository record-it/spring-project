package pl.sda.module;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    public String appName(){
        return "Demo Spring App";
    }
}
