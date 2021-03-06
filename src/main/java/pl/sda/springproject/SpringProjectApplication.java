package pl.sda.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import pl.sda.module.AppConfiguration;
import pl.sda.springproject.console.*;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication(scanBasePackages = {"pl.sda.module", "pl.sda.springproject"})
public class SpringProjectApplication implements CommandLineRunner {

    private final InputData input;

    private final ProcessData process;

    private final Output output;

    @Autowired
    private AppConfiguration appConfiguration;

    private MessageConfiguration messages;

    @Autowired
    private Scanner scanner;

    public SpringProjectApplication(InputData input, @Qualifier("average") ProcessData process, Output output) {
        this.input = input;
        this.process = process;
        this.output = output;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        version2();
    }

    private void version1() {
        int sum = 0;
        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
        }
        System.out.println("Suma: " + sum);
    }

    private void version2(){
        System.out.println(messages.intro());
        final List<Integer> data = input.getData();
        final int result = this.process.process(data);
        output.sendToOutput(result);
    }

    @Autowired
    public void setMessages(MessageConfiguration messageConfiguration){
        messages = messageConfiguration;
    }
}
