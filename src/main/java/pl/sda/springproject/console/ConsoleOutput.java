package pl.sda.springproject.console;

import org.springframework.stereotype.Component;

@Component
public class ConsoleOutput implements Output{
    @Override
    public void sendToOutput(int data) {
        System.out.println("Wynik: " + data);
    }
}
