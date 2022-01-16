package pl.sda.springproject.console;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@Component
@Primary
public class FileInputData implements InputData{

    @Override
    public List<Integer> getData() {
        try {
            return Files.lines(Path.of(""))
                    .map(line -> Integer.parseInt(line))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }
}
