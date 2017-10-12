/**
 * Created by User on 14.08.2017.
 */
import java.util.ArrayList;
public class Notepad {
    private String date;
    private int idD;
    private  ArrayList<Fraze>  day = new ArrayList<Fraze>();

    Notepad (String data, int idD) {
        this.idD = idD;
        this.date = data;
    }

    public class Fraze {
        private int idF;
        private String fraza;
        Fraze (String fraza, int idF) {
            this.fraza = fraza;
            this.idF = idF;
        }
        public String getFraze() {
            return fraza;
        }
        public String getFulIdF() {
            return (idF+" "+idD);

        }

    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDate () {
        return date;
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }
    public int getIdD () {
        return idD;
    }

    public void addIvent  (String fraza, int idF){
        Fraze ivent = new Fraze(fraza, idF);
        day.add(ivent);
    }

    @Override
    public String toString () {
        StringBuilder s = new StringBuilder();
        s.append("Date: '" + date + "'\n");
        for (Fraze a : day) {
            s.append("Fraze: '" + a.getFraze() + "'\n");
            s.append("Full ID: '" + a.getFulIdF() + "'\n");
        }
        return s.toString();
    }

}
