import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {public static void main(String[] args) {
 String first =JOptionPane.showInputDialog("TYPE FIRST NAME");
	JOptionPane.showConfirmDialog(null,first);
String last=JOptionPane.showInputDialog("TYPE LAST NAME");
    JOptionPane.showConfirmDialog(null,last);
String dest= JOptionPane.showInputDialog("WHAT IS YOUR DESTINATION");
    JOptionPane.showConfirmDialog(null,dest);
String dob= JOptionPane.showInputDialog("WHAT IS YOUR DATE OF BIRTH");
    JOptionPane.showConfirmDialog(null, dob);
String gender= JOptionPane.showInputDialog("WHAT IS YOUR PREFFERED GENDER");
    JOptionPane.showConfirmDialog(null, gender);
    JOptionPane.showMessageDialog(null, last+"/"+first+" ("+dob+","+gender+")\n Traveling to:" +dest);

}
}


