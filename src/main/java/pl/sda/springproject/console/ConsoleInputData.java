package pl.sda.springproject.console;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class ConsoleInputData implements InputData{
    private static final Scanner scanner = new Scanner(System.in);
    @Override
    public List<Integer> getData() {
        List<Integer> list = new ArrayList<>();
        while(scanner.hasNextInt()){
            list.add(scanner.nextInt());
        }
        return list;
    }
}
