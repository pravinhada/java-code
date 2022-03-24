import java.util.ArrayList;
import java.util.List;

public class Directory implements AbstractFile {
    private String name;
    private List<AbstractFile> includedfiles = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(AbstractFile obj) {
        includedfiles.add(obj);
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + this.name);
        for (AbstractFile file: includedfiles) {
            file.ls();
        }
    }
}
