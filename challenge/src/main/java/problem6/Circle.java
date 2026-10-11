package problem6;

public class Circle extends Forme{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public double getSurface(){
        return Math.round(Math.PI*Math.pow(radius,2)*100)/100.0;
    }

    @Override
    public String toString(){
        return "Circle (radius " + radius + " cm): area = " + getSurface() + " cm2";
    }
}
