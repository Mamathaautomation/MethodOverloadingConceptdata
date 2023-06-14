package methodoverLoadingoncept;

public class MethodOverloadingConcept {

	void record(String studentName,int id)
	{
		System.out.println("Record of student " +studentName);
		System.out.println("Record of student " +id);
	}

	void record(String studentName,int id,char grade)
	{
		System.out.println("Record of student " +studentName);
		System.out.println("Record of student " +id);
		System.out.println("Record of student " +grade);

	}
	public static void main(String[] args) {
		
		MethodOverloadingConcept Obj=new MethodOverloadingConcept();
		Obj.record("Manisha", 8);
		Obj.record ("Trishna", 6, 'A');
	}
	}
