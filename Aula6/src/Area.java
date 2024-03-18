public class Area {

    private double base;
    private double altura;

    public double getBase(){
        return this.base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public Area(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void calcAreaT(){
        double area1 = (base * altura)/2;
        System.out.printf("Área de um triângulo de base %.2f e altura %.2f é %.2f", base, altura, area1);
    }

    public void calcAreaQ(){
        double area2 = base * altura;
        System.out.printf("\nÁrea de um quadrado de base %.2f e altura %.2f é %.2f", base, altura, area2);
    }
}
