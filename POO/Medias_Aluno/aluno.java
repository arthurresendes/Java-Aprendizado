package Medias_Aluno;
import java.util.Arrays;
public class aluno {
        String matricula;
        String nome;
        float nota1,nota2, nota3;
       
        public aluno(String matricula, String nome, float nota1, float nota2, float nota3) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
   
    public String media(){
        float media_notas = (nota1 + nota2 + nota3) / 3;
        if(media_notas >= 6.0){
            return "Passou com media: " + media_notas;
        }else{
            float[] notas ={nota1,nota2,nota3};
            Arrays.sort(notas);
            float soma_maiores = notas[1] + notas[2];
            float achar = 18 - soma_maiores;
            return "Você vai ter que tirar " + achar + " na prova substituitiva";
        }
    }
}
