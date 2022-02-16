import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment1 = service.paymentCalculate(1_000_000, 9.99F, 12);
        DecimalFormat decimalFormat1 = new DecimalFormat("#");
        String result1 = decimalFormat1.format(payment1);
        System.out.println("ОР:87911 - ФР:" + result1);

        double payment2 = service.paymentCalculate(1_000_000, 9.99F, 24);
        DecimalFormat decimalFormat2 = new DecimalFormat("#");
        String result2 = decimalFormat2.format(payment2);
        System.out.println("ОР:46140 - ФР:" + result2);

        double payment3 = service.paymentCalculate(1_000_000, 9.99F, 36);
        DecimalFormat decimalFormat3 = new DecimalFormat("#");
        String result3 = decimalFormat3.format(payment3);
        System.out.println("ОР:32262 - ФР:" + result3);
    }
}
