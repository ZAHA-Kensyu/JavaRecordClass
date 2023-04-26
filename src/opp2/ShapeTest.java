package opp2;

public class ShapeTest {
    public static void main(String[] args){
        Shape triangle = new Triangle(3,4);
        Shape rectangle = new Rectangle(3,4);
        Circle circle = new Circle(5);
        Shape[] shapes = {triangle,rectangle,circle};

        System.out.println("三角形の面積 "+triangle.calculateArea());
        System.out.println("四角の面積 "+rectangle.calculateArea());
        System.out.println("円の面積 "+circle.calculateArea());
        System.out.println("面積の合計値 "+getTotalArea(shapes));
    }

    //合計値返す処理
    static double getTotalArea(Shape[] shapes){
        double sum = 0;
        for(var shape : shapes){
            sum += shape.calculateArea();
        }
        return sum;
    }
}
