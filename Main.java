import java.util.*;
public class Main {

    static double red, green, blue, resultA, resultB;

    public static void main(String[] args) {                            // METHOD

        colorInput();                                                   // call METHOD colorInput()
        System.out.println("RED: " + red + "\nGREEN: " + green + "\nBLUE: " + blue);
        convertRGB(red);
        //convertRGB(green);
        //convertRGB(blue);


    }

//==================================================================== METHOD BELOW ===========================

    // Input Red, Green & Blue values within (0-255)
    static void colorInput() {

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
// =============================================================================== END ===


    // ====================================================================  METHOD BELOW ====
     static void convertRGB(double color) {

        if (color >= 16.0) {
            resultA = (int)color / 16.0;
            resultB = (int)(1 - ((Math.ceil(color / 16.0)) - (color / 16.0))) * 16.0;
        }
        else {
            resultA = color / 16.0;
            resultB = (1 - ((Math.ceil(color / 16.0)) - (color / 16.0))) * 16.0;
        }


        /*
        switch (resultA){
            case 10
        }
*/


         System.out.println((int)resultA);
         System.out.println((int)resultB);
    }
}