import java.util.Scanner;

public class Triangulo extends Figura {
    private Punto baricentro;
    public void ingresarPuntos() {
        System.out.println("Ingrese los puntos: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese la componente X punto " + i + " : ");
            double x = sc.nextDouble();
            System.out.println("Ingrese la componente Y punto " + i + " : ");
            double y = sc.nextDouble();
            System.out.println("Ingrese la componente Z punto " + i + " : ");
            double z = sc.nextDouble();
            Punto puntoaux = new Punto(x, y, z);
            listaPuntos.add(puntoaux);
        }
    }

    public void calcularBaricentro(){
        baricentro.setX((listaPuntos.get(0).getX()+listaPuntos.get(1).getX()+listaPuntos.get(2).getX())/3);
        baricentro.setY((listaPuntos.get(0).getY()+listaPuntos.get(1).getY()+listaPuntos.get(2).getY())/3);
        baricentro.setZ((listaPuntos.get(0).getZ()+listaPuntos.get(1).getZ()+listaPuntos.get(2).getZ())/3);
        listaPuntos.add(baricentro);
    }
    public double calcularArea(double a, double b, double c){
        double s= (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    
}
