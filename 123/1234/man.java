/**
 * Created by User on 14.08.2017.
 */
import java.util.ArrayList;
import javr;
public class man {
    public static void main (String[]arg){

        Integer x=0;
        String plus = "+";
        ArrayList<Notepad> days = new ArrayList<Notepad>();
        Scanner buf = new Scanner(System.in);
        String input;
        int i = 0;
        int j = 0;
        while (true) {
            cheking date = new cheking();
            Notepad a = new Notepad(date.chekDate(), i);
            i++;
            while (true) {
                System.out.println("Фраза: ");
                input = buf.nextLine();
                a.addIvent(input, j);
                System.out.println("Нажмите '+' для продолжения");
                input = buf.nextLine();
                if (!input.equals(plus)) {
                    System.out.println("не равно");
                    break;
                }
                j++;
            }
            days.add(a);
            System.out.println("Нажмите '+' для продолжения");
            input = buf.nextLine();
            if (!input.equals(plus)) {
                System.out.println("не равно");
                break;
            }
        }

        for (Notepad d : days) {
            System.out.println(days.get(0).toString());
        }
    }

}
