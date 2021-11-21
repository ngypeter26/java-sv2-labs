package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients = new ArrayList<>();

    public void addIngredients(Path path) {
        List<String> fileContent =  readFile(path);
        int index1;
        int index2;
        int index3;

        for (int i=0;i<fileContent.size();i++){
            index1 = fileContent.get(i).trim().indexOf(" ");
            index2 = fileContent.get(i).trim().indexOf(" ",index1+1);
            index3 = index2+1;
            ingredients.add(fileContent.get(i).substring(index3));
//            System.out.println(fileContent.get(i).substring(index3));
        }
    }

    public List<String> readFile(Path path){
        try {
            return Files.readAllLines(path);
        }catch (IOException ioe){
            throw new IllegalStateException("nincs ilyen file", ioe);
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public static void main(String[] args) {
        String fileName = "src/main/resources/introexceptionreadfiletestjunit4/recipe.txt";
        Path path = Paths.get(fileName);

        Recipe recipe = new Recipe();
        recipe.addIngredients(path);
        System.out.println(recipe.getIngredients());
    }
}
