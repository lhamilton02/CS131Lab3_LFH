package arraylist;

public class ListApp 
{
    public static void main(String[] args)
    {
    	
    	//instantiate ArrayLISt for strings
        ArrayList<String> stringList = new ArrayList<>();
        
        //adding strings
        stringList.addItem("Generic String");
        stringList.addItem("Arbitrary Words");

        //instantiate list for objects
        ArrayList<Square> squareList = new ArrayList<>();
        
        //creating objects and adding them to list
        squareList.addItem(new Square(5.0));
        squareList.addItem(new Square(5.0));
        
        //instantiating ArrayList to store PointThreeD objects
        ArrayList<PointThreeD> pointList = new ArrayList<>();
        
        //creating objects and adding to pointList
        pointList.addItem(new PointThreeD(1.0, 2.0, 3.0));
        pointList.addItem(new PointThreeD(4.0, 5.0, 6.0));

        //print stringList
        System.out.println("String List:");
        System.out.println(stringList);

        //Print squareList
        System.out.println("\nSquare List:");
        System.out.println(squareList);

        //print poiontList
        System.out.println("\nPoint3D List:");
        System.out.println(pointList);
    }
}//end class
