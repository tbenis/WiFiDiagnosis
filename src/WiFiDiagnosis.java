import java.util.Scanner;
public class WiFiDiagnosis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //First set of instruction and question
        System.out.println("Reboot the computer and try to connect");
        System.out.println("Did that fix the problem?");
        //Collecting user input
        String response = scan.nextLine();
        //Edge case - In case user neither enters 'yes or no', question persists
        while (!(response.equals("no") || response.equals("yes"))) {
            System.out.println("Error! Please enter yes or no");
            System.out.println("Reboot the computer and try to connect");
            System.out.println("Did that fix the problem?");
            response = scan.nextLine();
        }
        //instruction and question set #2
        if(response.equals("yes")) {
            System.out.println("Done");
            System.exit(0);
        } else if(response.equals("no")) {
            System.out.println("Reboot the router and try to connect");
            System.out.println("Did that fix the problem?");
            response = scan.nextLine();

            while (!(response.equals("no") || response.equals("yes"))) {
                System.out.println("Error! Please enter yes or no");
                System.out.println("Reboot the router and try to connect");
                System.out.println("Did that fix the problem?");
                response = scan.nextLine();
            }
        }
        //instruction and question set #3
        if(response.equals("yes")) {
            System.out.println("Done");
            System.exit(0);
        } else if(response.equals("no")) {
            System.out.println("Make sure the cables connecting the router are firmly plugged in and the power is getting to the router");
            System.out.println("Did that fix the problem?");
            response = scan.nextLine();
            while (!(response.equals("no") || response.equals("yes"))) {
                System.out.println("Error! Please enter yes or no");
                System.out.println("Make sure the cables connecting the router are firmly plugged in and the power is getting to the router");
                System.out.println("Did that fix the problem?");
                response = scan.nextLine();
            }
        }
        //instruction and question set #4
        if(response.equals("yes")) {
            System.out.println("Done");
            System.exit(0);
        } else if(response.equals("no")) {
            System.out.println("Move the computer close to the router and try to connect");
            System.out.println("Did that fix the problem?");
            response = scan.nextLine();

            while (!(response.equals("no") || response.equals("yes"))) {
                System.out.println("Error! Please enter yes or no");
                System.out.println("Move the computer close to the router and try to connect");
                System.out.println("Did that fix the problem?");
                response = scan.nextLine();
            }
        }
        //Last instruction #2
        if(response.equals("yes")) {
            System.out.println("Done");
            System.exit(0);
        } else if(response.equals("no")) {
            //if all responses are 'no', program tells user to contact ISP
            System.out.println("contact your ISP");
        }
        System.exit(0);
    }
}
