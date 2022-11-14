package padroesestruturais;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModeloTest {

    @Test
    void deveRetornarCarros() {
        Modelo modelo = new Modelo();
        modelo.montarCarro("Mobi","Alarme","EL");
        modelo.montarCarro("Argo","Alarme", "EL");
        modelo.montarCarro("Cronos","Retrovissor com câmera de ré","ST");
        modelo.montarCarro("Pulse","Retrovissor com câmera de ré","ST");
        modelo.montarCarro("Toro","Bagageiro tubular","50kg");
        modelo.montarCarro("Strada","Bagageiro tubular","50kg");


        List<String> saida = Arrays.asList(
                "Carro{nome='Mobi', opcional='Alarme', tipo='EL'}",
                "Carro{nome='Argo', opcional='Alarme', tipo='EL'}",
                "Carro{nome='Cronos', opcional='Retrovissor com câmera de ré', tipo='ST'}",
                "Carro{nome='Pulse', opcional='Retrovissor com câmera de ré', tipo='ST'}",
                "Carro{nome='Toro', opcional='Bagageiro tubular', tipo='50kg'}",
                "Carro{nome='Strada', opcional='Bagageiro tubular', tipo='50kg'}");

        assertEquals(saida, modelo.obterCarro());
    }

    @Test
    void deveRetornarTotalOpcionais() {
        Modelo modelo = new Modelo();
        modelo.montarCarro("Mobi","Alarme","EL");
        modelo.montarCarro("Argo","Alarme", "EL");
        modelo.montarCarro("Cronos","Retrovissor com câmera de ré","ST");
        modelo.montarCarro("Pulse","Retrovissor com câmera de ré","ST");
        modelo.montarCarro("Toro","Bagageiro tubular","50kg");
        modelo.montarCarro("Strada","Bagageiro tubular","50kg");

        assertEquals(3, OpcionalFactory.getTotalOpcional());
    }
}