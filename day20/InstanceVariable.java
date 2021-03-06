package day20;

public class InstanceVariable {
		String name;
		int snumber;
				
		public InstanceVariable(String stdname)
		{
			name=stdname;
		}
		
		public void Studentsno(int SNO)
		{
			snumber=SNO;
		}
		
		public void print() {
			System.out.println(name);
			System.out.println(snumber);
		}
		
		
		public static void main(String[] args) {
			InstanceVariable obj=new InstanceVariable("Baskar");
			InstanceVariable obj2=new InstanceVariable("Kuzhali");
			InstanceVariable obj1=new InstanceVariable("Mritha");
			obj.Studentsno(1);
			obj1.Studentsno(2);
			obj2.Studentsno(3);
			obj.print();
			obj1.print();
			obj2.print();
	}

}
