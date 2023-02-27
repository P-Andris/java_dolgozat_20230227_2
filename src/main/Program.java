package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import modell.Dolgozo;

public class Program {
    private List<String> adatok;
    
    public static void main(String[] args) {
        
    }
    
    public void fajlbeolvasas(String fajlNeve) throws IOException {
        Path path = Paths.get(fajlNeve);
        adatok = Files.readAllLines(path);
        
        String elsoSor = adatok.get(0);
        adatok.remove(elsoSor);
    }
}
