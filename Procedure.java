package assignment2;
/*
 * Class: CMSC203
 * Instructor: Professor Ahmed Tarek
 * Description: Procedure models a medical procedure performed on a patient. It
 *              stores the procedure name, date, practitioner, and charges, and
 *              provides constructors, accessors, mutators, and a toString method.
 * Due: 09/30/2026
 * Platform/compiler: Eclipse IDE, Java SDK
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Rick Banerjee
*/
public class Procedure
{
    private String procedureName;
    private String procedureDate;
    private String practitioner;
    private double charges;

    /**
     * No-arg constructor. Strings are empty and charges are 0.0.
     */
    public Procedure()
    {
        this("", "", "", 0.0);
    }

    /**
     * Constructor that initializes the procedure's name and date.
     * @param procedureName the name of the procedure
     * @param procedureDate the date of the procedure (example 06/12/2023)
     */
    public Procedure(String procedureName, String procedureDate)
    {
        this(procedureName, procedureDate, "", 0.0);
    }

    /**
     * Constructor that initializes all attributes of the procedure.
     * @param procedureName the name of the procedure
     * @param procedureDate the date of the procedure
     * @param practitioner the practitioner who performed the procedure
     * @param charges the charges for the procedure
     */
    public Procedure(String procedureName, String procedureDate,
                     String practitioner, double charges)
    {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitioner = practitioner;
        this.charges = charges;
    }

    /** @return the procedure name */
    public String getProcedureName() { return procedureName; }

    /** @return the procedure date */
    public String getProcedureDate() { return procedureDate; }

    /** @return the practitioner's name */
    public String getPractitioner() { return practitioner; }

    /** @return the charges for the procedure */
    public double getCharges() { return charges; }

    /** @param procedureName the new procedure name */
    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }

    /** @param procedureDate the new procedure date */
    public void setProcedureDate(String procedureDate) { this.procedureDate = procedureDate; }

    /** @param practitioner the new practitioner name */
    public void setPractitioner(String practitioner) { this.practitioner = practitioner; }

    /** @param charges the new charges */
    public void setCharges(double charges) { this.charges = charges; }

    /**
     * Displays all information about the procedure on one line, tab separated.
     * @return name, date, practitioner, and charges separated by tabs
     */
    @Override
    public String toString()
    {
        return "Procedure: " + procedureName + "\tDate: " + procedureDate
             + "\tPractitioner: " + practitioner
             + "\tCharges: $" + String.format("%,.2f", charges);
    }
}
