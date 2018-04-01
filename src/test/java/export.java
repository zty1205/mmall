/**
 * Created by CJ on 2018-02-23.
 */
public class export extends base1 {

    private Test3 t3 = new Test3();
    public export(){
        super();
        System.out.println("export constrouct");

    }
    private Test6 t6 = null;

    public static void main(String[] args) {
        System.out.println("export main");
        new export();
    }
    @Override
    protected void a(int i) {
        System.out.println("export print : "+i);
    }
    {
        System.out.println("export not static");
    }
    static {
        System.out.println("export static");
    }
}
