package padroesestruturais;

import java.util.ArrayList;
import java.util.List;

public class Modelo {


    private List<Carro> carros = new ArrayList<>();

    public void montarCarro(String nomeCarro , String nomeOpcional , String tipo) {
        Opcional opcional = OpcionalFactory.getOpcional(nomeOpcional, tipo);
        Carro carro = new Carro(nomeCarro, opcional);
        carros.add(carro);
    }

    public List<String> obterCarro() {
        List<String> saida = new ArrayList<String>();
        for (Carro carro : this.carros) {
            saida.add(carro.obterCarro());
        }
        return saida;
    }
}
