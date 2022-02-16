public class CreditPaymentService {
    public double paymentCalculate (int amountCredit, float creditTerm, int interestRate){
        double payment = (amountCredit * (creditTerm/(12*100)))/((1 - Math.pow((1+ creditTerm/(12*100)), -interestRate)));
        return payment;
    }

}
