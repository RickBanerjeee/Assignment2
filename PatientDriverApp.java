package assignment2;
import java.util.Scanner;

/*
 * Class: CMSC203
 * Instructor: Professor Ahmed Tarek
 * Description: Driver application. Reads a patient's information and three
 *              procedures from the keyboard, displays them, and displays the
 *              total charges of the three procedures.
 * Due: 09/30/2026
 * Platform/compiler: Eclipse IDE, Java SDK
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Rick Banerjee
*/
public class PatientDriverApp
{

    private static final String STUDENT_NAME = "Rick Banerjee";
    private static final String M_NUMBER = "M21168151";
    private static final String DUE_DATE = "09/30/2026";

    private static final Scanner keyboard = new Scanner(System.in);

    /**
     * Program entry point. Creates the patient and three procedures from user
     * input, displays them, and displays the total charges.
     * @param args not used
     */
    public static void main(String[] args)
    {
        // Patient: created with the name constructor, then the remaining
        // attributes are set with mutators.
        System.out.println("Enter the patient's information:");
        String first = prompt("First name: ");
        String middle = prompt("Middle name: ");
        String last = prompt("Last name: ");
        Patient patient = new Patient(first, middle, last);
        patient.setStreetAddress(prompt("Street address: "));
        patient.setCity(prompt("City: "));
        patient.setState(prompt("State: "));
        patient.setZip(prompt("ZIP code: "));
        patient.setPhone(prompt("Phone (example 301-123-4567): "));
        patient.setEmergencyName(prompt("Emergency contact name: "));
        patient.setEmergencyPhone(prompt("Emergency contact phone: "));

        // Procedure 1: no-arg constructor, then every attribute is set
        System.out.println("\nEnter information for procedure 1:");
        Procedure procedure1 = new Procedure();
        procedure1.setProcedureName(prompt("Procedure name: "));
        procedure1.setProcedureDate(prompt("Date (example 06/12/2023): "));
        procedure1.setPractitioner(prompt("Practitioner: "));
        procedure1.setCharges(promptCharges("Charges: "));

        // Procedure 2: name/date constructor, then the rest are set
        System.out.println("\nEnter information for procedure 2:");
        String name2 = prompt("Procedure name: ");
        String date2 = prompt("Date (example 06/12/2023): ");
        Procedure procedure2 = new Procedure(name2, date2);
        procedure2.setPractitioner(prompt("Practitioner: "));
        procedure2.setCharges(promptCharges("Charges: "));

        // Procedure 3: constructor that initializes all attributes.
        System.out.println("\nEnter information for procedure 3:");
        String name3 = prompt("Procedure name: ");
        String date3 = prompt("Date (example 06/12/2023): ");
        String practitioner3 = prompt("Practitioner: ");
        double charges3 = promptCharges("Charges: ");
        Procedure procedure3 = new Procedure(name3, date3, practitioner3, charges3);

        // this is the output
        System.out.println();
        displayPatient(patient);
        System.out.println();
        System.out.println("Procedures");
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);
        System.out.println();
        System.out.printf("Total Charges: $%,.2f%n",
                calculateTotalCharges(procedure1, procedure2, procedure3));
        System.out.println();
        System.out.println("The program was developed by a Student: "
                + STUDENT_NAME + " " + M_NUMBER + " " + DUE_DATE);
    }

    /**
     * displays the information of the given patient.
     * @param patient the patient to display
     */
    public static void displayPatient(Patient patient)
    {
        System.out.println(patient);
    }

    /**
     * Displays the information of the given procedure.
     * @param procedure the procedure to display
     */
    public static void displayProcedure(Procedure procedure)
    {
        System.out.println(procedure);
    }

    /**
     * Calculates the total charges of three procedures.
     * @param p1 the first procedure
     * @param p2 the second procedure
     * @param p3 the third procedure
     * @return the sum of the three procedures' charges
     */
    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3)
    {
        return p1.getCharges() + p2.getCharges() + p3.getCharges();
    }

    /**
     * Prompts the user and reads one line of text.
     * @param message the prompt to show
     * @return the text the user typed
     */
    private static String prompt(String message)
    {
        System.out.print(message);
        return keyboard.nextLine().trim();
    }

    /**
     * Prompts the user for a charge amount, repeating until a valid,
     * non-negative number is entered. A leading $ and commas are allowed.
     * @param message the prompt to show
     * @return the valid charge amount
     */
    private static double promptCharges(String message)
    {
        while (true)
        {
            String text = prompt(message).replace("$", "").replace(",", "");
            try
            {
                double value = Double.parseDouble(text);
                if (value >= 0)
                {
                    return value;
                }
                System.out.println("Charges cannot be negative. Try again.");
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid amount. Enter a number such as 250.00.");
            }
        }
    }
}
