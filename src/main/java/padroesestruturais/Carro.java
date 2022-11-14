package padroesestruturais;

public class Carro {

    private String nome;
    private Opcional opcional;

    public Carro(String nome, Opcional opcional) {
        this.nome = nome;
        this.opcional = opcional;
    }

    public String obterCarro() {
        return "Carro{" +
                "nome='" + this.nome + '\'' +
                ", opcional='" + opcional.getNome() + '\'' +
                ", tipo='" + opcional.getTipo() + '\'' +
                '}';
    }


}
