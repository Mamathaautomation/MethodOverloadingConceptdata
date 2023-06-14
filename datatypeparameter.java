package methodoverLoadingoncept;

public class datatypeparameter {


	///////////Method Overloading by changing the data type of parameters
	
	void display(String a)
	{
		System.out.println("It is a string.");
	}
	
	void display(int b)
	{
		System.out.println("It is a Integer.");

	}
	
	public static void main(String[] args) {
		datatypeparameter Obj=new datatypeparameter();
		Obj.display("Hello");
		Obj.display(1);
}

}
