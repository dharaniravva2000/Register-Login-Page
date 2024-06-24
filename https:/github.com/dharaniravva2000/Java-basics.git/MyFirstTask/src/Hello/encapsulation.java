package Hello;

class encapsulation {
	
	private int age=22;
	private String name="Megha";
	private long marks=80;
	private char intial='A';
	
	public int getage() {
		return age;
	}
	
	public void setage(int a) {
		age=a;
		a=22;
	}
	
	public String getname() {
		return name;
		
	}
	
	public void setname(String b) {
		name=b;
		b="Megha";
	}
	public long getmarks() {
		return marks;
	}
	
	public void setmarks(long c) {
		marks=c;
		c=80;
	}
	
	public char getintial() {
	return intial;
	}
	
	public void setintial(char d) {
		intial=d;
		d='A';
	}
	
	
	
	public class demo{

	public static void main(String[] args) {
		
		encapsulation obj=new encapsulation();
		
		//obj.setage( 22);
		//obj.setname( "dharani");
		
		//obj.setmarks(50);
		//obj.setintial('R');
		// TODO Auto-generated method stub
		
		//System.out.println(obj.intial+" "+obj.name+" "+obj.age+" "+obj.marks);
		
		System.out.println(obj.getintial()+"."+obj.getname()+"\n"+obj.getmarks());

	}

}
}
