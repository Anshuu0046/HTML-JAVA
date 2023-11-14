package ad1;

public class q18 {

	
		  public static void main (String[]args)
		  {
		    int base = 2, x = 8;
		    System.out.println ("Required Power is " + power (base, x));
		  }
		  //Recursive Function
		  static int power (int base, int x)
		  {
		    if (x == 0)     //Base Condition
		      return 1;
		    return (base * power (base, x - 1));
		  }
		}