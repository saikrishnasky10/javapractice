import java.util.Scanner;


public class AdultUser implements LibraryUser{
   
	int age;
	String bookType;
	
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		if(age < 12) {
			System.out.println("you have sucessfully registered under kids category");
		}
		else {
			System.out.println("you have registered under adults category");
		}
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		bookType = sc.next();
		if(bookType.equals("Fiction")) {
			System.out.println("book should be returned in 7 days");
		}
		else {
			System.out.println("no book taken");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Calculator add = new Calculator();
      LibraryUser rahul = new AdultUser();
//      rahul.registerAccount();
      rahul.requestBook();
//      LibraryUser raj = new AdultUser();
      
	}

}
