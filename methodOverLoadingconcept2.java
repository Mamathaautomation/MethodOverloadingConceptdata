package methodoverLoadingoncept;

public class methodOverLoadingconcept2 {

	void area(int a)
    {
        System.out.println("area with single parameter");
    }
    
    void area(int a,int b)
    {
        System.out.println("area with 2 parameter");
    }
    
    void area(double a)
    {
        System.out.println("area with single double parameter");
    }
    
    void area(float a)
    {
        System.out.println("area with single float parameter");
    }
    
    public static void main(String[] args) {
    	methodOverLoadingconcept2 Obj=new methodOverLoadingconcept2();
    	
    	Obj.area(250);
    	Obj.area(210,200);
    	Obj.area(250.75);
    	Obj.area(300.05f);
    }
}
    	
