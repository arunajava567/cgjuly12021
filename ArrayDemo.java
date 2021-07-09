package utility;
class Course{
	int id;
	String name;
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
public class ArrayDemo {
	
 static	void printNames(String[] names) {
	 System.out.println("inside function....");
	 for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
	}
 static	String[] convertUppercase(String[] names) {
	 System.out.println("inside function22....");
	 String names1[]=new String[names.length];
	 for(int i=0;i<names.length;i++) {
			names1[i]=names[i].toUpperCase();
		}
		return names1;
	}	
	
	public static void main(String[] args) {
	//declaration
	int a[]=new int[10];
		a[0]=10;
		a[1]=23;
		a[2]=56;
	//initialization
	int[] b= {2,3,4,5,6,7};
	System.out.println("elements o f A");
		for(int i=0;i<a.length;i++)
		   System.out.println(a[i]);
		
	System.out.println("elements o f B");
		for(int i=0;i<b.length;i++)
			   System.out.println(b[i]);
	
	System.out.println("elements of B using for- each");
		for(int x: b)
			   System.out.println(x);
		
	int s[]= {23,34,45,56,67,78,89};
	int d[]=new int[5];
	
	System.arraycopy(s, 3, d, 2, 2);
	System.out.println("elements o f Source");
	for(int i=0;i<s.length;i++)
		   System.out.print(s[i] +" ");

	System.out.println();
	System.out.println("elements of D using for- each");
	for(int x: d)
		   System.out.print(x +" ");
	
	
	System.out.println("==============");
	Course courses[]=new Course[5];
	courses[0]=new Course(10,"Java");
	courses[1]=new Course(11,"Oracle");
	courses[2]=new Course(12,"Spring");
	courses[3]=new Course(13,"React");
	courses[4]=new Course(14,"Rest");
	for(Course c:courses)
		System.out.println(c);
	
	System.out.println("==============");

	for(int i=0;i<courses.length;i++) {
		System.out.println(courses[i]);
	}
	
	String names[]=new String[5];
	names[0]="Ram1";
	names[1]="Ram2";
	names[2]="Ram3";
	names[3]="Ram4";
	names[4]="Ram5";
	
	
	printNames(names);
	String names1[]=convertUppercase(names);
	
	for(int i=0;i<names1.length;i++) {
		System.out.println(names1[i]);
	}
	
	
	}
}
