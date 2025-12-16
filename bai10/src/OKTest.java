import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OKTest {
    public static void main(String[] in) {
        //1
        Pattern p = Pattern.compile(".s");//. represents single character
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        //2
        boolean b2=Pattern.compile(".s").matcher("as").matches();
        //3
        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b+" "+b2+" "+b3);
    }


}
