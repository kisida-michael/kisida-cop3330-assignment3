package ex41;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.io.IOException;


public class AppTest
{

    @Test
    public void testFile() throws IOException {
        NameSorter nameSorter = new NameSorter();
        String[] lines = nameSorter
                .file("src/main/java/ex41/App.java");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}