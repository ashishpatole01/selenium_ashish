
public class Dmo2imp{
public static void main(String[] args) {
	
      IDemo id= new IDemo(){
    	  @Override
    	  public int add(int a,int b)
    	  {
    		  return a+b;
		  //sanjay
		  //akshay
		  //ashish
    		  
    	  }
      };
      System.out.println(id.add(5,7));
}
}
