
package herencia_1;

import java.util.Scanner;

public class Herencia_1 {

    public static void main(String[] args) {
        Esfera volEsfera = new Esfera("Rojo");
        volEsfera.setRadio(5);
        volEsfera.mostrarDatosE();
        
        Cubo volCubo = new Cubo("Negro");
        volCubo.setLado(5);
        volCubo.mostrarDatosC();
        

        Cilindro volCilindro = new Cilindro("Verde");
        volCilindro.mostrarDatosCi();

    } 
}
