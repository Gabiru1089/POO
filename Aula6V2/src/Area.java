public class Area
{
    private double base;
    private double altura;

    public Area(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public Area(int base, int altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public Area(String base, String altura)
    {
        this.base = Double.parseDouble(base);
        this.altura = Double.parseDouble(altura);
    }

    public double triangulo()
    {
        return (this.base * this.altura) / 2;
    }

    public double quadrado()
    {
        return this.base * this.altura;
    }

    public double getBase()
    {
        return this.base;
    }

    public double getAltura()
    {
        return this.altura;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }
}