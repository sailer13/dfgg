/**
 * Created by User on 14.08.2017.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cheking {
    public String chekDate(){
        String consist;
        Scanner input = new Scanner(System.in);
        int x = 0;
        while (true) {
            try {
                System.out.println("Введите дaту");
                if (x >= 2) {
                    throw new Error("ввели слишком много раз");
                }
                System.out.println();
                x++;
                consist = input.nextLine();
                Pattern p = Pattern.compile("^(((0[1-9]|[12]\\d|3[01])\\.(0[13578]|1[02])\\.((19|[2-9]\\d)\\d{2}))|((0[1-9]|[12]\\d|30)\\.(0[13456789]|1[012])\\.((19|[2-9]\\d)\\d{2}))|((0[1-9]|1\\d|2[0-8])\\.02\\.((19|[2-9]\\d)\\d{2}))|(29\\.02\\.((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$");
                Matcher m = p.matcher(consist);
                if (!m.matches()) {
                    System.out.println("Неверно введён параметр дата");
                } else {
                    return consist;
                }
            } catch (Error ex) {
                System.out.println(ex.getMessage());
                System.exit(0);

            }

        }
    }

}
