package pl.sda.springproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpringProjectApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
        }
        System.out.println("Suma: " + sum);
    }
}
