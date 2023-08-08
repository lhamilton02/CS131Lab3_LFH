package arraylist;

public class Square 
{
	//private instance variables
    private double side;
    
    //empty argument constructor
    public Square()
    {
    	this.side=0.0;
    }

    //constructor w/ paramaters
    public Square(double s)
    {
        this.side = s;
    }
    //end constructor

    //getArea method
    public double getArea()
    {
    	return side * side;
    }//end getArea method
    
    //toString Method
    @Override
    public String toString()
    {
        return "Square - Side: " + side;
    }
    //end toString Method
}//end class
