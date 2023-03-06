package knoldus_kup.knoldus_BooleanOperations;

public class BooleanOperations {
    public static void main(String[] args) {

        //initilization of boolean variables
        boolean isCold = true;
        boolean isRainy = false;


        //Conditional statement
        if (isCold && isRainy) {
            System.out.println("Bring a jacket and an umbrella");
        } else if (isRainy) {
            System.out.println("Bring an umbrella");
        } else if (isCold) {
            System.out.println("Bring a jacket");
        }
    }
}
