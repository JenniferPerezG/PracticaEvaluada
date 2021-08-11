
package herencia_1;

public class Cubo extends Figuras{
    
    private double lado;

    public Cubo(String color) {
        super(color);
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public double CalcularVolumenC(){
        double Vol = Math.pow(lado, 3);
        return Vol;
    }

    public void mostrarDatosC(){
        System.out.println("La figura es de color: " +getColor() + " El volumen del cubo es " +CalcularVolumenC() );
    } 
}
