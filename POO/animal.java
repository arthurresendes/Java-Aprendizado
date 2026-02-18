public class animal {

    static abstract class Animal {

        private int quantidadePatas;
        private String raca;
        private int tamanhoCm;

        public Animal(int quantidadePatas, String raca, int tamanhoCm) {
            this.quantidadePatas = quantidadePatas;
            this.raca = raca;
            this.tamanhoCm = tamanhoCm;
        }

        public abstract void emitirSom();

        public int getQuantidadePatas() {
            return quantidadePatas;
        }

        public String getRaca() {
            return raca;
        }

        public int getTamanhoCm() {
            return tamanhoCm;
        }

        public void setTamanhoCm(int tamanhoCm) {
            this.tamanhoCm = tamanhoCm;
        }
    }

    static class Cachorro extends Animal {

        private String nome;

        public Cachorro(int quantidadePatas, String raca, int tamanhoCm, String nome) {
            super(quantidadePatas, raca, tamanhoCm);
            this.nome = nome;
        }

        @Override
        public void emitirSom() {
            System.out.println("Au au!");
        }

        public String getNome() {
            return nome;
        }
    }

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro(4, "Labrador", 60, "Rex");

        System.out.println("Nome: " + cachorro1.getNome());
        System.out.println("Raça: " + cachorro1.getRaca());
        System.out.println("Tamanho (cm): " + cachorro1.getTamanhoCm());

        cachorro1.setTamanhoCm(70);

        System.out.println("Tamanho (cm) atualizado: " + cachorro1.getTamanhoCm());
        System.out.println("Quantidade de patas: " + cachorro1.getQuantidadePatas());

        cachorro1.emitirSom();

        Animal animal = new Cachorro(4, "Poodle", 40, "Bolt");
        animal.emitirSom();
    }
}