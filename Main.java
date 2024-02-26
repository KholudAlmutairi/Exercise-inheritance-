import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Shape sh1 = new Shape();
        System.out.println(sh1);

        Circle c1 = new  Circle(5.0, "Red", false);
        Circle c2=new Circle(2.5);
        Circle c3=new Circle();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Area c1: " + c1.getArea());
        System.out.println("Perimeter c1: " + c1.getPerimeter());
        c3.setRadius(3);
        c3.setColor("Yellow");
        c3.setFilled(false);
        System.out.println(c3.getRadius());
        System.out.println(c3.getColor());
        System.out.println(c3.isFilled());


        Rectangle r1=new Rectangle(20,10,"blue",true);
        Rectangle r2=new Rectangle(4.0,3.0);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Area r2: "+r2.getArea());
        System.out.println("Perimeter r2:  " +r2.getPerimeter());
        Rectangle r3=new Rectangle();
        r3.setLength(6.5);
        r3.setWidth(8.5);
        r3.setColor("purple");
        System.out.println(r3.getLength());
        System.out.println(r3.getWidth());
        System.out.println(r3.getColor());
        System.out.println(r3.isFilled());
        System.out.println(r3.getArea());
        System.out.println(r3.getPerimeter());

        Square sq1=new Square(30.5,"pink",true);
        Square sq2=new Square(2.5);
        Square sq3=new Square();
        System.out.println(sq1);
        System.out.println(sq2);
        System.out.println(sq3);
        System.out.println(sq3.isFilled());








    }
}
