/*
Write a program to demonstrate passing an object as parameter.
Create a class Bank Account with data members as account_number, name and saving_balance.
The member functions are setdata, display, withdraw, deposit and transfer amount. Create main()
to create 3 objects of class Bank Account and use all the methods.
*/
public class BankAccount{
        int account_No;
        String name;
        double saving_Balance;
        public void setData(int accNo,String name ,double sav_bal){
            this.account_No=accNo;
            this.name=name;
            this.saving_Balance=sav_bal
            ;
        }
        public void display(){
            System.out.println("Account Number : "+account_No);
            System.out.println("Name of the Account Holder : "+name);
            System.out.println("Available Saving  Balance in Account : "+saving_Balance);
        }
        public void withdraw(double amountForWithdraw){
            if(amountForWithdraw>saving_Balance){
                System.out.println("Insufficient Balance ");
            }
            else {
                saving_Balance=saving_Balance - amountForWithdraw;
                System.out.println("Amount " + amountForWithdraw + "has been successfully withdrawn from Your account .");
                System.out.println("Remaining balance :" + saving_Balance);
                 }
        }
        public void deposit(double amountForDeposit){
                saving_Balance=saving_Balance + amountForDeposit;
                System.out.println("Amount " + amountForDeposit + "has been successfully Deposited to Your account .");
                System.out.println("Balance :" + saving_Balance);
        }
        public void transferAmount(BankAccount account ,double amountToTransfer){
            if(amountToTransfer>saving_Balance){
                System.out.println("Insufficient Balance ");
            }
            else {
                account.deposit(amountToTransfer);
                saving_Balance=saving_Balance-amountToTransfer;
                System.out.println("Amount "+amountToTransfer+"has been Successfully Transferd to "+account.account_No);
                System.out.println("Account Balance :"+account.saving_Balance);
            }

        }
        public static void main (String[] args){
            BankAccount account1=new BankAccount();
            BankAccount account2=new BankAccount();
            BankAccount account3=new BankAccount();

            account1.setData(123456,"Bhushan",30000.0);
            account1.setData(654321,"Jay",40000.0);
            account1.setData(123654,"Om",50000.0);

            account1.deposit(2000.0);
            account1.withdraw(3000.0);
            account1.transferAmount(account2,10000);
        }
}