import java.io.File;

public interface Strategy {
    File convert(File input, String output);
}
