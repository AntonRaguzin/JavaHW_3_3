public class CreditPaymentService {
    public double calculate(int amount, int period, double percent) {
        double i = percent / 12 / 100; // сумма процентов в месяц
        int n = period * 12; // срок кредита в месяцах
        double pow = Math.pow(1 + i, n); // формула возведения в степень выражения
        double k = i * pow / (pow - 1); // коэфициент аннуитета
        double payment = k * amount; // расчет ежемесячного платежа
        return payment;
    }
}
