class Swap
{
	public static void main(String args[])
{
	int a=22, b=10;                  //assigning vaues to a and b
	System.out.println("value of a and b before swap are = \n" +a+" , \n"+b);    //printing values of a and b before swap operation
	a=a+b;						
	b=a-b;
	a=a-b;								//swapping of values in a and b
	System.out.println("value of a and b after swap are = \n"+a+" ,\n"+b);			//printing values of a and b after swap is performed
	
	

}
}