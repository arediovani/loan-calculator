
package simple.loanin.calculator;

import static java.lang.Math.pow;

public class SimpleLoaninCalculator {

    private double payment;
    private double loan;
    private double rate;
    private double NoPeriods;
    
    

    public SimpleLoaninCalculator( double loan, double rate, double NoPeriods) {
        this.loan = loan;
        this.rate = rate;
        this.NoPeriods = NoPeriods;
        this.payment =  (loan*rate)/1 - (pow((1+rate),-NoPeriods));
    }
    
    

    public double getPayment() {
         if (payment > 0) {
            return payment;
        } else {
            throw new IllegalArgumentException("GO KILL YOURSELF");
        }
         
        
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getNoPeriods() {
        return NoPeriods;
    }

    public void setNoPeriods(double NoPeriods) {
        this.NoPeriods = NoPeriods;
    }

}

