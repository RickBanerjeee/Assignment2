package assignment2;
/*
 * Class: CMSC203
 * Instructor: Professor Ahmed Tarek
 * Description: Patient models a person receiving care. It stores the patient's
 *              name, address, phone number, and emergency contact, and provides
 *              constructors, accessors, mutators, and helper methods that build
 *              display strings.
 * Due: 09/30/2026
 * Platform/compiler: Eclipse IDE, Java SDK
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Rick Banerjee
*/
public class Patient
{
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String emergencyName;
    private String emergencyPhone;

    /**
     * No-arg constructor. Sets every field to an empty string.
     */
    public Patient()
    {
        this("", "", "");
    }

    /**
     * Constructor that initializes only the patient's name.
     * All other fields are set to an empty string.
     * @param firstName the patient's first name
     * @param middleName the patient's middle name
     * @param lastName the patient's last name
     */
    public Patient(String firstName, String middleName, String lastName)
    {
        this(firstName, middleName, lastName, "", "", "", "", "", "", "");
    }

    /**
     * Constructor that initializes all attributes of the patient.
     * @param firstName the patient's first name
     * @param middleName the patient's middle name
     * @param lastName the patient's last name
     * @param streetAddress the street address
     * @param city the city
     * @param state the state
     * @param zip the ZIP code
     * @param phone the patient's phone number (example 301-123-4567)
     * @param emergencyName the emergency contact's name
     * @param emergencyPhone the emergency contact's phone number
     */
    public Patient(String firstName, String middleName, String lastName,
                   String streetAddress, String city, String state, String zip,
                   String phone, String emergencyName, String emergencyPhone)
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.emergencyName = emergencyName;
        this.emergencyPhone = emergencyPhone;
    }

    // ---------------------------- Accessors ----------------------------

    /** @return the first name */
    public String getFirstName() { return firstName; }

    /** @return the middle name */
    public String getMiddleName() { return middleName; }

    /** @return the last name */
    public String getLastName() { return lastName; }

    /** @return the street address */
    public String getStreetAddress() { return streetAddress; }

    /** @return the city */
    public String getCity() { return city; }

    /** @return the state */
    public String getState() { return state; }

    /** @return the ZIP code */
    public String getZip() { return zip; }

    /** @return the patient's phone number */
    public String getPhone() { return phone; }

    /** @return the emergency contact's name */
    public String getEmergencyName() { return emergencyName; }

    /** @return the emergency contact's phone number */
    public String getEmergencyPhone() { return emergencyPhone; }

    // ---------------------------- Mutators -----------------------------

    /** @param firstName the new first name */
    public void setFirstName(String firstName) { this.firstName = firstName; }

    /** @param middleName the new middle name */
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    /** @param lastName the new last name */
    public void setLastName(String lastName) { this.lastName = lastName; }

    /** @param streetAddress the new street address */
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }

    /** @param city the new city */
    public void setCity(String city) { this.city = city; }

    /** @param state the new state */
    public void setState(String state) { this.state = state; }

    /** @param zip the new ZIP code */
    public void setZip(String zip) { this.zip = zip; }

    /** @param phone the new phone number */
    public void setPhone(String phone) { this.phone = phone; }

    /** @param emergencyName the new emergency contact name */
    public void setEmergencyName(String emergencyName) { this.emergencyName = emergencyName; }

    /** @param emergencyPhone the new emergency contact phone number */
    public void setEmergencyPhone(String emergencyPhone) { this.emergencyPhone = emergencyPhone; }

    // ------------------------- Build methods ---------------------------

    /**
     * Builds the patient's full name.
     * @return first, middle, and last name separated by spaces
     */
    public String buildFullName()
    {
        return firstName + " " + middleName + " " + lastName;
    }

    /**
     * Builds the patient's address.
     * @return street address, city, state, and ZIP separated by spaces
     */
    public String buildAddress()
    {
        return streetAddress + " " + city + " " + state + " " + zip;
    }

    /**
     * Builds the emergency contact information.
     * @return emergency contact name and phone separated by a space
     */
    public String buildEmergencyContact()
    {
        return emergencyName + " " + emergencyPhone;
    }

    /**
     * Displays all information about the patient, using the build methods.
     * @return a multi-line String describing the patient
     */
    @Override
    public String toString()
    {
        return "Patient Information\n"
             + "Name: " + buildFullName() + "\n"
             + "Address: " + buildAddress() + "\n"
             + "Phone: " + phone + "\n"
             + "Emergency Contact: " + buildEmergencyContact();
    }
}
