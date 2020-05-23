import java.util.Scanner;

public class Calculator {

    public static void main (String[] args) {

        Parameters parameters = new Parameters();
        parameters.setHeight(1.50d);
        parameters.setWeight(60d);
        parameters.setUnit(Unit.KG);

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj jednostkę wagi");
        String firstName = scan.nextLine();

        if(firstName.equals("kg")){
         parameters.setUnit(Unit.KG);
        }
        else {
            parameters.setUnit(Unit.IBS);
        }

        Scanner scanWeight = new Scanner(System.in);
        System.out.println("Podaj wagę");
        Double userWeight = Double.parseDouble(scanWeight.nextLine());
        parameters.setWeight(userWeight);

        Scanner scanHeight = new Scanner(System.in);
        System.out.println("Podaj wzrost");
        Double userHeight = Double.parseDouble(scanHeight.nextLine());
        parameters.setHeight(userHeight);

        double result = createBMI(parameters);
        System.out.println(result);
        
    }
    public static double createBMI(Parameters parameters) {
        if(Unit.KG.equals("kg")){
            return (parameters.getWeight() / (parameters.getHeight() * parameters.getHeight()));
        }
        else {
            return ((parameters.getWeight() / (parameters.getHeight() * parameters.getHeight())) * 703);
        }

    }
}
