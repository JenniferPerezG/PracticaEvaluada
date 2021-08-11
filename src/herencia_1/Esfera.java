
package herencia_1;

public class Esfera extends Figuras {
    private double radio;

    public Esfera(String color) {
        super(color);
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public double CalcularVolumenE(){
        double V = 1.33*3.14*Math.pow(radio, 3);
    return V;
    }

    public void mostrarDatosE(){
        System.out.println("La figura es de color: " +getColor() + " El volumen de la esfera es " +CalcularVolumenE() );
    }

}
