import java.util.ArrayList;
import java.util.List;

public class Figura {
    List<Punto> listaPuntos = new ArrayList<>();

    public double calcularDistancia(int aux1, int aux2) {
        return Math.sqrt(Math.pow(listaPuntos.get(aux1).getX() - listaPuntos.get(aux2).getX(), 2) +
                Math.pow(listaPuntos.get(aux1).getY() - listaPuntos.get(aux2).getY(), 2) +
                Math.pow(listaPuntos.get(aux1).getZ() - listaPuntos.get(aux2).getZ(), 2));
    }
}