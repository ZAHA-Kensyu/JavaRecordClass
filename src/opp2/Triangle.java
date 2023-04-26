package opp2;

public class Triangle implements Shape{
    private  double oneHalf;//1/2を格納
    private double bottom;//底辺格納
    private double height;//高さ格納

    public Triangle(double bottom,double height) {
        this.bottom = bottom;
        this.height = height;
        this.oneHalf = 0.5;
    }

    // （底辺）×（高さ）×１/２」
    @Override
    public double calculateArea(){
        //Triangleクラスは三角形の面積を
        return (this.bottom * this.height) * this.oneHalf;
    }


}
