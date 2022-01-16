package pl.sda.springproject.console;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class MessageConfiguration {

    public String intro(){
        return "Wpisz liczby do sumowania.";
    }

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }
}
