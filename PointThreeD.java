package arraylist;

public class PointThreeD 
{
	//define instance variables
    private double xPoint;
    private double yPoint;
    private Double zPoint;
    //end instance variables
    
    //empty-argument constructor
    public PointThreeD()
    {
    	this.xPoint = 0.0;
    	this.yPoint = 0.0;
        this.zPoint = 0.0;
    }
    
    //Preferred constructor with parameters
    public PointThreeD(double x, double y, double z)
    {
        this.xPoint = x;
        this.yPoint = y;
        this.zPoint = z;
    }
    //end constructor
    
    //toString method
    @Override
    public String toString()
    {
        return "Point3D - X: " + xPoint + ", Y: " + yPoint + ", Z: " + zPoint;
    }
    //end toString method
}//end class
