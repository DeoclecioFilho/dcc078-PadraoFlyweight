package padroesestruturais;

import java.util.HashMap;
import java.util.Map;

public class OpcionalFactory {

    private static Map<String, Opcional> opcionais = new HashMap<>();

    public static Opcional getOpcional(String nome, String tipo) {
        Opcional opcional = opcionais.get(nome);
        if (opcional == null) {
            opcional = new Opcional(nome, tipo);
            opcionais.put(nome, opcional);
        }
        return opcional;
    }

    public static int getTotalOpcional() {
        return opcionais.size();
    }
}
