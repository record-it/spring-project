package pl.sda.springproject.console;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("average")
public class AverageData implements ProcessData{
    @Override
    public int process(List<Integer> data) {
        return (int) data.stream()
                .mapToInt(i -> i)
                .average()
                .orElseThrow(() -> new ArithmeticException("Niemożliwe obliczenie średniej dla pustej listy!"));
    }
}
