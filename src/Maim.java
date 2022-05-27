public class Maim {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000; // сумма кредита в рублях
        int period = 1; // срок кредита в годах
        double percent = 9.99; // ставка в процентах годовых
        double payment = service.calculate(amount, period, percent);
        System.out.printf("Ежемесячный платеж - " + "%.0f", payment);
        }
}
