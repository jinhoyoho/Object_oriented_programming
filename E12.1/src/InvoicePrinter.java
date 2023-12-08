import java.util.Scanner;

public class InvoicePrinter {
	public static void main(String[] args)
	{		
		Scanner in = new Scanner(System.in);
		System.out.println("This Program reads an invoice (name, address, products purchased");
		System.out.println("and prints an invoice.");
		System.out.println();
		
		while(true)
		{
			System.out.println("Please enter an address (empty line to terminate)");
			System.out.print("Name: ");
			String address = in.nextLine();
			System.out.print("Street: ");
			String street = in.nextLine();
			System.out.print("City: ");
			String city = in.nextLine();
			System.out.print("State: ");
			String state = in.nextLine();
			System.out.print("Zipcode: ");
			String zip = in.nextLine();
			
	        Address Iaddress = new Address(address, street, city, state, zip);
			
			Invoice invoice = new Invoice(Iaddress);
		
			
			while (true)
			{
				System.out.print("Product description (empty line to terminate): ");
				String product = in.nextLine();
				if (product.equals("")) break; // 공백이면 탈출
				System.out.print("Price: ");
				Double price = in.nextDouble();
				System.out.print("Quantity: ");
				int quantity = in.nextInt();
				in.nextLine(); // 버퍼 지우기
				
				invoice.add(new Product(product, price), quantity);
			}
			
			System.out.println(invoice.format());
		}
	}
}
