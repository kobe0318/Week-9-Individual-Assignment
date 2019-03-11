import java.util.Scanner;
import java.io.*;

public class Week9 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        // Prompts user to input a file to encrypt
        System.out.print("Enter a file to encrypt: ");
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File(input.next())));

        //Prompts user to input the file that the unencrypted output will be saved to
        System.out.print("Enter the output file: ");
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(input.next())));

        int value;
        // The encryption value is reversed from the beginning code, being
        // "out.write(value + 5);", to get the unencrypted version of the message
        while ((value = in.read()) != -1) {
            out.write(value - 5);
        }

        System.out.println("File Unencrypted!");
        input.close();
        out.close();
    }
}
