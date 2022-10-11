import java.util.*;
public class Main {

    static int red, green, blue;

    public static void main(String[] args) {                            // METHOD

        colorInput();                                                   // call METHOD colorInput()
        System.out.println("RED: " + red + "\nGREEN: " + green + "\nBLUE: " + blue);

        convertRGB(red, green, blue);

    }

    //private static void convertRGB(int red, int green, int blue) {}


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

    static void convertRGB(int red, int green, int blue){


                //double red = 182;

                int resultA = (int)red/16;
                double resultB = (1-((Math.ceil(red/16))-(red/16)))*16;
        switch (resultA) {
            case 10 -> resultA = 'a';
            case 11 -> resultA = 'b';
            case 12 -> resultA = 'c';
            case 13 -> resultA = 'd';
            case 14 -> resultA = 'e';
            case 15 -> resultA = 'f';
            default -> {
            }
        }


                System.out.println(resultA);
                System.out.println(resultB);
            }
        }

    }
}