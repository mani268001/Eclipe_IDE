package pojo_class;

public class POJO_DEMO {

	private int age = 59;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//------------------------------------------------------------	
	private String name = "mani";
	
	public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
//--------------------------------------------------------
    private double Height = 5.7;
    
	public double getHeight() {
		return Height;
	}

	public void setHeight(double height) {
		Height = height;
	}
   //---------------------------------------------------
	private long number = 9715957419l;
	
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

/*  
    private byte a = 32;

	public byte getA() {
		return a;
	}
	public void setA(byte a) {
		this.a = a;
	}	
*/
	public static void main(String[] args) {
	
		POJO_DEMO pj=new POJO_DEMO();
		pj.setAge(27);
		pj.setName("Manikutty");
		pj.setHeight(5.9);
		pj.setNumber(7339294459l);
		System.out.println(pj.getAge());
		System.out.println(pj.getName());
		System.out.println(pj.getHeight());
		System.out.println(pj.getNumber());
	
		
		
		
		
//		pj.setAge(20);
//		System.out.println(pj.getA());
	}

	

}
