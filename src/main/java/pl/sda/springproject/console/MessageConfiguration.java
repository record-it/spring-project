package pl.sda.springproject.console;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    public String intro(){
        return "Wpisz liczby do sumowania.";
    }
}
