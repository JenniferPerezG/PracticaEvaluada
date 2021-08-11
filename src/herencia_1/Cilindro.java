
package herencia_1;

import java.util.Scanner;

public class Cilindro extends Figuras{
    private double altura;
    private double radio;

    public Cilindro(String color) {
        super(color);
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }
    
    public double CalcularVolumenCi(){
        Scanner Cilindro = new Scanner(System.in);
        System.out.println("Ingrese el radio deseado");
        double radio = Cilindro.nextDouble();
        System.out.println("Ingrese la altura deseada");
        double altura = Cilindro.nextDouble();
        double Volumen = 3.14*Math.pow(radio, 2)*altura;
        return Volumen;
    }

    public void mostrarDatosCi(){
        System.out.println("La figura es de color: " +getColor() + " El volumen del cilindro es " +CalcularVolumenCi());
    }
}
