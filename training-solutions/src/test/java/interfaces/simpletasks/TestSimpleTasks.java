package interfaces.simpletasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSimpleTasks {

    @Test
    void testRun(){
        List<String> tasks = new ArrayList<>(Arrays.asList("Email","táblázat","vizsga","főzés"));
        SimpleTasks sT = new SimpleTasks(tasks);

        sT.run();
    }
}
