
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 70;
        double heightMeters = 1.8;
        int bmi = service.calculate(weightKg, heightMeters);
        System.out.println("Индекс массы тела: " + bmi);
    }
}
// Для вычислений необходимо взять вес в килограммах и
// разделить на собственный рост в метрах,возведенный в квадрат.
