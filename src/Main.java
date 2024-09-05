public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);

        meuCarro.exibirInformacoes(); // Exibe informações do carro

        meuCarro.acelerar(50); // Acelera o carro
        meuCarro.frear(20); // Freia o carro
        meuCarro.exibirInformacoes(); // Exibe informações do carro novamente
    }
}
