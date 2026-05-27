import java.io.File;

public class Context {
    static enum Type { PNG, WEBP }

    public static void convert(Type type, File input) {
        String absolutePath = input.getAbsolutePath();
        String output = absolutePath.substring(0, absolutePath.lastIndexOf(".")) + ".png";

        Strategy strategy = switch (type) {
            case PNG -> new PNGStrategy();
            default -> throw new IllegalArgumentException("Unknown format");
        };

        strategy.convert(input, output);
    }
}
