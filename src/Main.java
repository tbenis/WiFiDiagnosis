import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        String[] yesArray = new String[]{"yes", "y"};
//        String[] noArray = new String[]{"no", "n"};

        System.out.println("Reboot the computer ad try to connect");
        System.out.println("Did that fix it?");
        String response = scan.nextLine();

        if(response.equals("yes")) {
            System.out.println("Done");
            System.exit(0);
        } else if(response.equals("no")) {
            System.out.println("Reboot the computer and try to connect");
            System.out.println("Did that fix it?");
            response = scan.nextLine();
        }

        if(response.equals("yes")) {
            System.out.println("Done");
            System.exit(0);
        } else if(response.equals("no")) {
            System.out.println("Make sure the cables connecting the router are firmly plugged in and the power is getting to the router");
            System.out.println("Did that fix it?");
            response = scan.nextLine();
        }

        if(response.equals("yes")) {
            System.out.println("Done");
            System.exit(0);
        } else if(response.equals("no")) {
            System.out.println("Move the computer close to the router and try to connect");
            System.out.println("Did that fix it?");
            response = scan.nextLine();
        }
        if(response.equals("yes")) {
            System.out.println("Done");
            System.exit(0);
        } else if(response.equals("no")) {
            System.out.println("contact your ISP");
        }
        System.exit(0);

    }
}
