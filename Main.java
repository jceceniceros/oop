class Main
{
    public static void main(String[] args)
    {    
        Triangle triangle1 = new Triangle(1.0d);
        System.out.println(triangle1.getType());
        
        Triangle triangle2 = new Triangle(1.0d, 2.0d);
        System.out.println(triangle2.getType());

        Triangle triangle3 = new Triangle(1.0d, 2.0d, 3.0d);
        System.out.println(triangle3.getType());
        
        //Triangle triangle4 = new Triangle(1.0d, 2.0d, 3.0d, 1);
    }
}