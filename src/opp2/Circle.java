package opp2;

public class Circle implements Shape{
    private double radius;
    private double pi;

    public Circle(double radius){ //コンストラクタ
        this.radius = radius;
        this.pi = 3.14;
    }

    @Override
    public double calculateArea() {
        return (radius * radius)* pi;
    }

}
