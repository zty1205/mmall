/**
 * Created by CJ on 2018-02-23.
 */
public class base1 {
    protected void a(int i){
        System.out.println("base print : "+i+1);
    }
    private Test2 t2= new Test2();
    private Test3 t3= new Test3();
    public base1(){
        a(2);
        System.out.println("base1 Construct");
    }
    {
        System.out.println("base not static");
    }
    static {
        System.out.println("base static");
    }
    private Test4 t4= new Test4();
}
