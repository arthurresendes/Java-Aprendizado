package aula01;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        int minhaIdade = 19;
        String meuNome = "Arthur";

        byte b = 100;
        short s = 10000;
        int in = 1000000;
        long l = 100000000L;
        float f = 10.5f;
        double d = 10.5;
        char c = 'A';
        String str = "Ola";
        boolean bool = true;

        if(str.isBlank()){
            System.out.println("Esta vazio");
        }else if("Ola".equals(str)){
            System.out.println("Hello World");
        }else{
            System.out.println("Ola para ninguem");
        }

        int[] colecaoDeInteiros = {1,2,3,4,5};
        int[] meusNumeros = new int[7];

        meusNumeros[3] = 2;

        System.out.println(colecaoDeInteiros[3]);
        System.out.println(colecaoDeInteiros.length);

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Arthur");
        lista.add("Maria");
        lista.add("Jose");

        System.out.println(lista.get(0));
        lista.remove(2);
        lista.remove("Arthur");
        System.out.println(lista.get(0));
        lista.add("Arthur");
        lista.add("Jose");

        System.out.println("----------");
        for(int i = 0; i < meusNumeros.length; i++){
            System.out.println(meusNumeros[i]);
        }
        System.out.println("----------");
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println("----------");
        for(String nome: lista){
            System.out.println(nome);
        }

        System.out.println("----------");
        int contador = 1;
        while (contador < 11){
            System.out.println("5 * " + contador + " = " + 5*contador);
            contador++;
        }

        System.out.println("----------");
        double resultado = 0.0;
        int resultadoInt = (int) resultado;
        System.out.println(resultadoInt);

        System.out.println("----------");
        String intSting = "10";
        int meuInt = Integer.parseInt(intSting);
        String minhStr = String.valueOf(meuInt);
        System.out.println(minhStr);

        System.out.println("----------");
        Carro car1 = new Fusca();
        String result = car1.acelerar();
        System.out.println(result);
        car1.parar();

        System.out.println("----------");
        Moto mot1 = new Naked();
        String resultMot = mot1.freiar();
        System.out.println(resultMot);
        mot1.parar();

        System.out.println("----------");
        Carro meuErro = null;
        try {
            meuErro.acelerar();
        } catch (NullPointerException e) {
            System.out.println("Vender carro com erro");
        }

    }
}