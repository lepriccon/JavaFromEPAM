package ChapterOne.VarA;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static void main(String[] args) throws ParseException {
        DateFormat dataFormat = new SimpleDateFormat("yyyy/MM/dd:hh");
        Date data = dataFormat.parse(args[1]);
        System.out.println("Name: " + args[0] + "\n" + "Date: " + data);
    }
}
