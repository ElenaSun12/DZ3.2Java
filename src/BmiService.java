public class BmiService {
    public int calculate(int weightKg, double heightMeters) {

        double bmi = weightKg / (heightMeters * heightMeters);
        return (int) bmi;

    }

}
