import java.util.*;
public class Main {

    static double red, green, blue;

    public static void main(String[] args) {                            // METHOD

        colorInput();                                                   // call METHOD colorInput()
        System.out.println("RED: " + red + "\nGREEN: " + green + "\nBLUE: " + blue);
        convertRGB(red);
        convertRGB(green);
        convertRGB(blue);


    }

//==================================================================== METHOD BELOW ===========================

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


        double resultA = color / 16;
        double resultB = (1 - ((Math.ceil(color / 16)) - (color / 16))) * 16;

        switch ((int) resultA) {
            case 10 -> resultA = 'a';
            case 11 -> resultA = 'b';
            case 12 -> resultA = 'c';
            case 13 -> resultA = 'd';
            case 14 -> resultA = 'e';
            case 15 -> resultA = 'f';
            default -> {
            }
        }

        System.out.println("resultA: " + resultA);
        System.out.println("resultB: " + resultB);
    }

// ============================================================================== END =====
    }



