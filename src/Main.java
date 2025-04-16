import java.awt.desktop.SystemEventListener;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String welcome = "Big Tex says \n\t\"Howdy\"!";
        String formatted = "Name:\tGlen\nTitle  :\tDeveloper\nJob:\tUnemployoed";
        System.out.println(welcome);
        System.out.println(formatted);
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "A" + "B" + "C";
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("s1 equals s2 is TRUE");  // ✅ This will print
        }

        if (s1.equalsIgnoreCase(s3)) {
            System.out.println("s1 equals s3 is TRUE");  // ✅ This will also print
        }
        String fname = "Nesredin Adem";
        int lenght = fname.length();
        System.out.println("Length Of:\t" + fname + " is =\t"+ lenght);
        String username = "  danaw  ";
        username = username.trim();
        username = username.toUpperCase(Locale.ROOT);
        System.out.println("User Name:[" + username + "]");

        String discountCode = "SAVE-50";
        if (discountCode.endsWith("-50")) {// this is true
            String print = ("Eligiable for Discount");
            print = print.toUpperCase();
            System.out.println(print);

            // tracking
//            Scanner scan = new Scanner(System.in);
//            System.out.printf("Enter  A Word:");
//            String trackingCode = scan.nextLine().trim();
//            System.out.printf("Enter The Number of Character:");
//            int charnumb = scan.nextInt();
//            char hasShipped = trackingCode.charAt(charnumb);
//            System.out.println("Tracking Character At:" + charnumb + " is " + hasShipped );
        }
        String input = "Alice,Bob,Charlie,David,Nasri,Adem,,,,n";
        String[] names = input.split(",");
        for (String name : names) {
            System.out.println(name);
        }



    }

}