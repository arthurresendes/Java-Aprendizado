public  class Main {
    static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Arthur", 2026,2006);
        Pessoa pessoa2 = new Pessoa("Jose", 2026,1950);
        Pessoa pessoa3 = new Pessoa("Davi", 2026, 2000);
        Pessoa pessoa4 = new Pessoa("Matheus", 2026, 2004);
        Mensagem msg = new Mensagem();

        System.out.println(msg.retonarMensagem(pessoa1));
        System.out.println(msg.retonarMensagem(pessoa2));
        System.out.println(msg.retonarMensagem(pessoa3));
        System.out.println(msg.retonarMensagem(pessoa4));
    }
}