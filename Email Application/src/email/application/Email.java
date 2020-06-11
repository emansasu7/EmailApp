package email.application;

import java.util.Scanner;

public class Email {

    private String fName, lName, password, dept, aEmail, email, companyprefex = "COMPANY.com";
    private int mailbox = 500, defaultPasswordLength = 10;

//    constructor for fName,lName
    public Email(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;

        System.out.println("Email creation for " + this.fName + " " + this.lName);
        System.out.println("");

//      call a method that asks for department and returns the dept
        dept = setDepartment();
        //System.out.println("Department : " + dept);

//        call random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("\nPassword " + password);
        System.out.println("");
//        combines and generates email email
        
        email = fName.toLowerCase()+"."+lName.toLowerCase()+"@"+dept+"."+companyprefex;
//        System.out.println("Email: "+email);
        
    }

    //ask for dept
    private String setDepartment() {

        System.out.print("Department codes : \n1. Sales \n2. "
                + "Development \n3. Accounting \n4. Psychology\n0. None"
                + "\nEnter Code: ");

        Scanner kb = new Scanner(System.in);
        int choice = kb.nextInt();

        switch (choice) {
            case 1:
                return "sales";
            case 2:
                return "development";
            case 3:
                return "accounting";
                case 4:
                return "psychology";
            default:
                return " ";
        }

    }

    //generate random password

    public String randomPassword(int length) {
//        sring of all posibilities we can choose from
        String p = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123457890@#$%^&";
//        array of char to generate and stor values
        char[] pa = new char[length];

        for (int x = 0; x < length; x++) {
//            generates random with scope and stores in rand
            int rand = (int) (Math.random() * p.length());
//            loops through scope and passes random char to our array
            pa[x] = p.charAt(rand);
        }
//        returns set of chars  
        return new String(pa);
    }

//    set mailBox capacity
    public void setMailboxCapacity(int mailbox) {
        this.mailbox = mailbox;
    }

    //set altenative email

    public void setAlternativeEmail(String aEmail) {
        this.aEmail = aEmail;
    }

    //change password
    public void changePssword(String password) {
        this.password = password;
    }
//  getters
    public int getMailboxCapacity() {
        return mailbox;
    }

    public String getAlternativeEmail() {
        return aEmail;
    }

    public String getChangePassword() {
        return password;
    }
    //displays details 
    public String showInfo(){
        return "Name : "+fName +" "+lName+"\nEmail : "+email+"\nMailbox capacity : "+mailbox+"MB";
    } 

}
