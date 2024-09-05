/**
 * Classe que representa um Carro com algumas propriedades básicas
 * e métodos para manipulação dessas propriedades.
 */
public class Carro {
    // Propriedades do carro
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    // Construtor para inicializar o carro
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0; // Inicialmente, o carro está parado
    }

    // Método para acelerar o carro
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("O carro acelerou para " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("O incremento deve ser positivo.");
        }
    }

    // Método para frear o carro
    public void frear(int decremento) {
        if (decremento > 0 && velocidadeAtual >= decremento) {
            velocidadeAtual -= decremento;
            System.out.println("O carro desacelerou para " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("O decremento deve ser positivo e não pode ser maior que a velocidade atual.");
        }
    }

    // Método para exibir as informações do carro
    public void exibirInformacoes() {
        System.out.println("Carro: " + marca + " " + modelo + ", Ano: " + ano + ", Velocidade Atual: " + velocidadeAtual + " km/h.");
    }

    // Getters e Setters (opcionais, dependendo do uso futuro)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}