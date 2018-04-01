import java.io.File;

/**
 * Created by CJ on 2018/1/3.
 */
public class test11 {
    public static void main(String[] args) {
        File file = new File("h:/a.txt");
        file.delete();
        Test6.main(new String[]{"1"});
        Test6 t = new Test6();
        t.aa();
    }

    @Override
    public String toString() {
        System.out.println("test11.toString()");
        return "test11.toString()";
    }
}
