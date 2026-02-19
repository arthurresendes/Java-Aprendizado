public class automovel {
    static abstract class Automovel {
        private int rodas;
        private int km_rodado;
        private String modelo;

        public Automovel(int rodas, String modelo, int km_rodado) {
            this.rodas = rodas;
            this.modelo = modelo;
            this.km_rodado = km_rodado;
        }

        public abstract void som();

        public int get_rodas(){
            return rodas;
        }
        public int get_kmRodado(){
            return km_rodado;
        }
        public void set_kmRodado(int newKm){
            km_rodado = newKm;
        }
        public String get_modelo(){
            return modelo;
        }
    }

    static class Moto extends Automovel {
    
        public Moto(int rodas, String modelo, int km_rodado) {
            super(rodas, modelo, km_rodado);
        }

        @Override
        public void som() {
            System.out.println("Vrum vrum");
        }
    }
    static class Carro extends Automovel {
    
        public Carro(int rodas, String modelo, int km_rodado) {
            super(rodas, modelo, km_rodado);
        }

        @Override
        public void som() {
            System.out.println("Zummmmm");
        }
    }



    public static void main(String[] args) {
        Moto moto = new Moto(2, "Kawasaki", 60);
        System.out.println(moto.get_modelo());
        System.out.println(moto.get_rodas());
        System.out.println(moto.get_kmRodado());
        moto.set_kmRodado(100);
        System.out.println(moto.get_kmRodado());

        Carro car = new Carro(4, "Fusca", 200);
        System.out.println(car.get_modelo());
        System.out.println(car.get_rodas());
        System.out.println(car.get_kmRodado());
        car.set_kmRodado(300);
        System.out.println(car.get_kmRodado());

    }
}
