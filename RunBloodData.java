/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BloodBank2;

/**
 *
 * @author jhnnn
 */
import java.util.Scanner;

public class RunBloodData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BloodData bd = new BloodData(); 

        System.out.print("Enter blood type of patient: ");
        String input1 = scanner.nextLine().trim().toUpperCase();

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String input2 = scanner.nextLine().trim();

        if (input1.isEmpty()) {
            input1 = bd.getBloodType();
        }
        if (input2.isEmpty()) {
            input2 = bd.getRhFactor();
        }

        if (isValidBloodType(input1) && isValidRhFactor(input2)) {
            bd.setBloodType(input1); 
            bd.setRhFactor(input2); 
            bd.display();            
        } else {
            System.out.println("Error: Invalid blood type or Rhesus factor entered.");
        }

        scanner.close(); 
    }

    private static boolean isValidBloodType(String bloodType) {
        return bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB") || bloodType.equals("O");
    }

    private static boolean isValidRhFactor(String rhFactor) {
        return rhFactor.equals("+") || rhFactor.equals("-");
    }
}
