
class Triangle extends Polygon
    implements Figure
{
    public double base;
    protected double sideA;
    private double sideB;
    //String type; //default

    public Triangle(double base)
    {
        super();
        this.base = base;
        this.sideA = base;
        this.sideB = base;
        //this.type = "Equilatero";
    }

    public Triangle(double base, double sideA)
    {
        super();
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideA;
        //this.type = "Isoceles";
    }

    public Triangle(double base, double sideA, double sideB)
    {
        super();
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
        //this.type = "Escaleno";
    }

    public String getType()
    {
        return type;
    }
    /*
    public void setType(String newType)
    {
        type = newType;
    }
    */

    public double getPerimeter()
    {
        return base + sideA + sideB;
    }

    public double getArea()
    {
        return 0.0d;
    }
    
}