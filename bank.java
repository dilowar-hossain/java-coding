import java.util.Scanner;
public class bank{
	
		private double balance = 1000;
		private double password = 123;
		double  inputValue,addmoney;
		Scanner a=new Scanner (System.in);
		

		 public void Checkbalance(){
		 	System.out.println("Enter your password ");
		 	inputValue=a.nextDouble();
		 	if (inputValue==password){
		 		System.out.println(balance);
		 	}else{
		 		System.out.println("Incorrect password ...");
		 	}
		 }

		 public void Deposite(){
		 	System.out.println("Enter your password ");
		 	inputValue=a.nextDouble();
		 	if (inputValue==password){
		 		System.out.println("Enter amount ");
		 		addmoney=a.nextDouble();
		 		balance=balance+addmoney;
		 		System.out.println("Deposite ammount is  " + addmoney);
		 		System.out.println("Total balance " + balance);
		 	}else{
		 		System.out.println("incorrect password.... ");
		 	}

		 }

		 public void Withdrow(){
		 	System.out.println("Enter your password ");
		 	inputValue=a.nextDouble();
		 	if (inputValue==password){
		 		System.out.println("Enter Withdrow amount ");
		 		inputValue=a.nextDouble();
		 		balance=balance-inputValue;
		 		System.out.println("Current Amount " + balance);

		 }else{
		 	System.out.println("incorrect password.... ");
		 }
	}
	public static void main(String []args ){
			bank call=new bank();
		System.out.println("press 1: Check balance ");
		System.out.println("press 2: Deposite ");
		System.out.println("press 3: Withdrow ");
		System.out.print("Enter your choice ");
		Scanner k=new Scanner (System.in);
		int press=k.nextInt();
		switch(press){
			case 1 :call. Checkbalance();
			break;
			case 2 :call. Deposite();
			break;
			case 3 :call. Withdrow ();
			break;
			default : System.out.println("Invalid choice...");
		}
        k.close();
	}
}