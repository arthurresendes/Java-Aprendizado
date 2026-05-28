import java.util.ArrayList;
import java.util.List;

public class Canal {

    private List<Inscrito> inscritos = new ArrayList<>();

    public void inscrever(Inscrito inscrito){
        inscritos.add(inscrito);
    }

    public void publicarVideo(String video){

        System.out.println("Novo vídeo: " + video);

        for(Inscrito i : inscritos){
            i.atualizar(video);
        }
    }
}