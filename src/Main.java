void main() {
    //Declare variables
    double balance = 6767.0;
    double interestRate = 0.11;
    double interestMonth1;
    double interestMonth2;

    System.out.println("Starting balance: $" + balance);
    System.out.println("Interest Rate: " + interestRate * 100 + "%");
    //calculate interest after 1st month
    interestMonth1 = balance * interestRate;
    balance = balance + interestMonth1;
    //calculate interest after 2nd month
    interestMonth2 = balance * interestRate;

    //output
    System.out.println("Interest due after one month: $" + interestMonth1);
    System.out.println("Interest due after two months: $" + interestMonth2);
}