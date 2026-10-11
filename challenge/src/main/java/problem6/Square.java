package problem6;

public class Square extends Forme{
    private double side;
    
    public Square(double side){
        this.side=side;
    }

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
    }

    @Override
    public double getSurface(){
        return Math.round(Math.pow(side, 2.0)*100)/100.0;
    }

    @Override
    public String toString(){
        return "Square (side " + side + " cm): area = " + getSurface() + " cm2";
    }

}
