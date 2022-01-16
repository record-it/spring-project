package pl.sda.springproject.console;

import org.springframework.context.annotation.Configuration;

import java.nio.file.Path;

@Configuration
public class FileConfiguration {

    public String filePath(){
        return "c://data/spring.txt";
    }

    public String filename(){
        return Path.of(filePath()).getFileName().toString();
    }
}
