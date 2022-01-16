package pl.sda.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.springproject.console.InputData;
import pl.sda.springproject.console.Output;
import pl.sda.springproject.console.ProcessData;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringProjectApplication implements CommandLineRunner {
    @Autowired
    InputData input;
    @Autowired
    ProcessData process;
    @Autowired
    Output output;

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        version1();
    }

    private void version1() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
        }
        System.out.println("Suma: " + sum);
    }

    private void version2(){
        final List<Integer> data = input.getData();
        final int result = this.process.process(data);
        output.sendToOutput(result);
    }


}
