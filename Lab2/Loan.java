package Lab2;

public class Loan {

    public void HomeLoan(double annualIncome, double creditScore) {
        if (annualIncome >= 55000 && creditScore >= 750) {
            System.out.println("Eligible for home loan.");
        } else {
            System.out.println("Not eligible for home loan.");
        }
    }

    public void CarLoan(double annualIncome, double creditScore) {
        if (annualIncome >= 50000 && creditScore >= 740) {
            System.out.println("Eligible for car loan.");
        } else {
            System.out.println("Not eligible for car loan.");
        }
    }
}