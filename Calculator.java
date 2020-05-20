public class Calculator {

    public static void main (String[] args) {
        Parameters calculatorBMI = new Parameters();

        int result = createBMI(78, 2);
        System.out.println(result);
    }
    public static int createBMI(int weight, int height) {
        return weight / (height * height);
    }
}
