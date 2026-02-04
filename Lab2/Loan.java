package Lab2;

public class Loan {
    // home loan
    public void HomeLoan(double annualIncome, double creditScore) {
        if (annualIncome >= 55000 && creditScore >= 750) { // check if income is greater than 55,000 and credit score is greater than 750
            System.out.println("Eligible for home loan."); // output if condiitions are met
        } else {
            System.out.println("Not eligible for home loan."); // output if condiitions are not met
        }
    }
    // car loan
    public void CarLoan(double annualIncome, double creditScore) {
        if (annualIncome >= 50000 && creditScore >= 740) { // check if income is greater than 50,000 and credit score is greater than 740
            System.out.println("Eligible for car loan."); // output if condiitions are met
        } else {
            System.out.println("Not eligible for car loan."); // output if condiitions are not met
        }
    }

}
