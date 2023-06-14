public class Piramide extends Triangulo{
    public double calcularAreaSuperficial(){
        double a = calcularDistancia(0,1);
        double b = calcularDistancia(1,2);
        double c = calcularDistancia(0,2);
        double area1 = calcularArea(a,b,c);


        double d = calcularDistancia(0,3);
        double e = calcularDistancia(1,3);
        double area2 = calcularArea(a,d,e);

        double f = calcularDistancia(2,3);
        double area3 = calcularArea(b,d,f);

        double area4 = calcularArea(c,e,f);
        return area1+area2+area3+area4;
    }

    public double calcularVolumen(){
        double a = calcularDistancia(0,1);
        double b = calcularDistancia(1,2);
        double c = calcularDistancia(0,2);
        double area1 = calcularArea(a,b,c);

        double altura = calcularDistancia(3,4);
    return ((area1)*(altura))/3;
    }


}
