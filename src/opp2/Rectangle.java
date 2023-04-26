package opp2;

public class Rectangle implements Shape{
    private double bottom;//底辺
    private double height;//高さ
    @Override
    public double calculateArea(){
        //Rectangleクラスは長方形の面積 (底辺×高さ)
        //System.out.println("四角の面積 "+);
        return bottom * height;
    }

    public Rectangle(double bottom,double height){
        this.bottom = bottom;
        this.height = height;
    }
}
