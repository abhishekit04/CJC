public class Bank
{

public void createAccount() //method
{
System.out.println("create Account");
System.out.println("Abhishek Kumar Singh");
}

public void deposite()  // 2nd method
{
System.out.println("deposite");
System.out.println("10000");
}

public void withdraw() // 3rd method
{

System.out.println("withdraw");
System.out.println("5000");

}

public void  checkBalance() // 4th method
{
System.out.println("check Balance");
System.out.println("5000");
}

public static void main(String args[])
{
Bank a = new Bank();
a. createAccount();
a. deposite();
a. withdraw();
a.checkBalance();

System.out.println("END");
}
}