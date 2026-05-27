import java.awt.FileDialog;
import javax.swing.JDialog;
import java.io.File;
import Context.Type;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\caminho";
        path = path.substring(path.lastIndexOf(".") + 1);
        System.out.println(path);
        
        /* 
        FileDialog dialog = new FileDialog(new JDialog());
        dialog.setVisible(true);

        String dialogPath = dialog.getDirectory() + dialog.getFile();
        File f = new File(dialogPath);
        
        // Corrigido: Agora chama passando apenas os 2 parâmetros que o método espera
        Context.convert(Type.PNG, f); 
        */
    }
}
