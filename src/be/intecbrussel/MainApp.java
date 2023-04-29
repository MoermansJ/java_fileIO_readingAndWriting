package be.intecbrussel;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainApp {
    public static void main(String[] args) {
        oefening1();
    }


    private static void oefening1() {

        try {
            //CREATING DIRECTORIES
            Path path1 = Paths.get("resources/fromJonathanToManuelTheInstructor/");
            Path path2 = Paths.get("resources/fromJonathanToManuelInTheJungle");
            if (!path1.toFile().exists()) {
                Files.createDirectories(path1);
            }
            if (!path2.toFile().exists()) {
                Files.createDirectories(path2);
            }


            //MESSAGE.TXT
            path1 = path1.resolve("message.txt");
            try (FileWriter fileWriter = new FileWriter(path1.toFile())) {
                fileWriter.write("In the beginning the Universe was created. This has made a lot of people very angry and been widely regarded as a bad move.");
            }


            //ANIMAL.TXT
            Animal animal = new Animal("Manuel the Monkey", false);
            path2 = path2.resolve("message.txt");
            try (FileWriter fileWriter = new FileWriter(path2.toFile(), true)) {
                fileWriter.write(animal.getName() + "█" + animal.isEdible() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
