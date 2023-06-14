// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Piramide piramideaux = new Piramide();
    piramideaux.ingresarPuntos();
    piramideaux.calcularBaricentro();
    piramideaux.calcularAreaSuperficial();
    piramideaux.calcularVolumen();
        System.out.println("El area superficial es: "+piramideaux.calcularAreaSuperficial());
        System.out.println("El volumen es: "+piramideaux.calcularVolumen());
    }
}