package pl.sda.springproject.console;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("sum")
@Primary
public class SumData implements ProcessData{
    @Override
    public int process(List<Integer> data) {
        return data.stream().mapToInt(i -> i).sum();
    }
}
