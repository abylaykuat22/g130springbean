package kz.bitlab.g130springbean.db;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DBManager3 {

    @Getter
    private final List<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }
}
