import java.util.*;
public class Main {

    static int red, green, blue;

    public static void main(String[] args) {                            // METHOD

        colorInput();                                                   // call METHOD colorInput()
        System.out.println("RED: " + red + "\nGREEN: " + green + "\nBLUE: " + blue);

        //ConvertRGB(red, green, blue);

    }



    static void colorInput() {                                          // METHOD

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter RED value (0-255): ");
            red = input.nextInt();
        } while (red < 0 || red > 255);

        do {
            System.out.print("Enter GREEN value (0-255): ");
            green = input.nextInt();
        } while (green < 0 || green > 255);

        do {
            System.out.print("Enter BLUE value (0-255): ");
            blue = input.nextInt();
        } while (blue < 0 || blue > 255);
    }
}