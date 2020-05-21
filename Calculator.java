import java.util.Scanner;

public class Calculator {

    public static void main (String[] args) {

        Parameters parameters = new Parameters();
        parameters.setHeight(1.50d);
        parameters.setWeight(60d);
        parameters.setUnit(Unit.KG);

        System.out.println(parameters.getHeight() + " " + parameters.getWeight());

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj jednostkę wagi");
        String firstName = scan.nextLine();

        if(firstName.equals("kg")){
         parameters.setUnit(Unit.KG);
        }

        double result = createBMI(parameters);
        System.out.println(result);
        System.out.println(result);
    }
    public static double createBMI(Parameters parameters) {
        if(Unit.KG.equals(parameters.getUnit())){
            System.out.println("są to kilogramy");
        } else {
            System.out.println(("wsaga w IBS"));
        }

        return parameters.getWeight() / (parameters.getHeight() * parameters.getHeight());
    }
}
