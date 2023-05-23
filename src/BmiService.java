public class BmiService {
    public int calculate (double heightInCm, double weightInKg) {
        double heightInM = heightInCm / 100.0;
        double bmi = weightInKg / (heightInM * heightInM);
        return (int)  bmi;
    }
}