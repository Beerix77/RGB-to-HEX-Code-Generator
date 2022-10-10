import java.util.*;
public class Main {

    public static void main(String[] args){

        // TODO setup valid input range ie 0-255//DONE

        System.out.println(Arrays.toString(colorInput()));
    }

    static int[] colorInput(){

        Scanner input = new Scanner(System.in);
        int red, green, blue;

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

        int[] rgb = new int [3];
        rgb[0] = red;
        rgb[1] = green;
        rgb[2] = blue;
        return rgb;

    }
}
