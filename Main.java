import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        suma(8,26,11);
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println("La cantidad de puertas ahora son " +  miCoche.puertas);
    }

public static int suma(int num1, int num2, int num3) {
        int resultado;
        resultado = num1 + num2 + num3;
        System.out.println("La suma total es" + " " + resultado);
        return resultado;
    }
}
class Coche{
    public int puertas = 4;

    public void AgregarPuerta(){
        this.puertas++;
    }
    }
