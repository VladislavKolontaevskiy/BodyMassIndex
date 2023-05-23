public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInCm = 184;
        double weightInKg = 82;
        int bmi = service.calculate(heightInCm, weightInKg);
        System.out.println("Индекс массы тела: " + bmi);
    }
}