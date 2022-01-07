package interfacedefaultmethods.longword;


import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations {

    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }


    @Override
    public String getLongWord() {
        List<String> lines = readFromFile(path);
        int lastIndex = lines.get(0).length();

        StringBuilder sb = new StringBuilder(lines.get(0));

        for (int i = 1; i<lines.size();i++){
            sb.append(lines.get(i).substring(lastIndex-1));
        }
        return sb.toString();
    }
}
