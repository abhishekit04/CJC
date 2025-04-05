package Task5;

public class Test {
	
	public static void main(String[] args) {
		
	
		Bank a = new Bank("HDFC", "Pune", 98765432l);
		Manager a1 = new Manager("Arvind", "Bandra Mumbai" , 87654l, 5000);
		Customer a2 = new Customer(5678 , "Ravi", 987654l, "Karve nagar Pune");
		
		System.out.println(a.name);
		System.out.println(a.location);
		System.out.println(a.mobno);
		System.out.println(a1.name);
		System.out.println(a1.address);
		System.out.println(a1.mobno);
		System.out.println(a1.sallery);
		System.out.println(a2.id);
		System.out.println(a2.name);
		System.out.println(a2.mobno);
		System.out.println(a2.addr);
	}
	

}
