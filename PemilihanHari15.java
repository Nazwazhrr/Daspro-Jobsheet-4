    import java.util.Scanner;
/**
 * PemilihanHari15
 */
public class PemilihanHari15 {

    public static void main(String[] args) {
        Scanner Hari = new Scanner(System.in);
        Byte dayNumber;
        String dayType;

        System.out.print("Input day number:(1-7): ");
        dayNumber = Hari.nextByte();

        if (dayNumber >= 1 && dayNumber <= 5) {
                dayType = "weekday";
        } else if (dayNumber == 6 || dayNumber == 7) {
            dayType = "weekend";
        } else{
            dayType = "invalid day name";
        }
            System.out.println(dayNumber + " is a " + dayType);
    }
}

