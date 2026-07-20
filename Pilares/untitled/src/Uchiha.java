public class Uchiha extends Ninja{
    public Uchiha(String nome, int idade) {
        super(nome, idade);
    }

    public void sharinganAtivado(){
        System.out.println("Sharingan ativado");
    }

    @Override
    public void ataqueBasico(){
        System.out.println("Joguei uma kunai de fogo");
    }

    public void ataqueBasico(int nivelDeChacra){
        if(nivelDeChacra > 2){
            System.out.println("Susano ativado");
        }else if(nivelDeChacra < 1){
            System.out.println("Só ativei o Sharingan");
        }else{
            System.out.println("Sem Chacra");
        }

    }
}