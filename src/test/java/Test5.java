/**
 * Created by CJ on 2017/12/7.
 */
public class Test5 {
    public static void main(String[] args) {
        String s = "bb";
        byte[] bs = s.getBytes();
        for (byte b : bs){
            System.out.println(b);
        }

    }
    public Test5(){
        System.out.println("Test5 Construct");
    }
}
