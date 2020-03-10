package exceptionTest;

public class Test {
    public static void f() throws Exception{
        throw new Exception();
    }

    public static void g() throws Exception{

        try {
            f();
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args){
        try{
            g();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
