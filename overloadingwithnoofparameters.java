package methodoverLoadingoncept;

public class overloadingwithnoofparameters {
	
	void display(int a)
	{
	System.out.println("the number is:" +a);
	}
	void display(float a, int b,long c, char d)
	{
		System.out.println("the number is : " + a + " , "+ b +" , "+ c +" , "+ d);
		
		}
	
	public static void main(String[] args) {
		overloadingwithnoofparameters Obj=new overloadingwithnoofparameters();
		Obj.display(5);;
		Obj.display(6.5f, 8, 256, '&');
	}
}
		
