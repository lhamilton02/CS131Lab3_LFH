package arraylist;

public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
  
  
  public boolean addItem(T item) 
  { //checking for space in array
      if (currentItem < arList.length) 
      {
          arList[currentItem] = item;
          currentItem++; 
          return true; //item added successfully
      }
      return false;
  }

  //creating string builder
  @Override
  public String toString() 
  { 
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < currentItem; i++) 
      {	//append each eleement and call for a new line
          sb.append(arList[i].toString()).append("\n");
      }
      return sb.toString();
  }

	
}//end class
