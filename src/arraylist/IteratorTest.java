package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String [] args){
        List<String> stringList =new ArrayList<String>();
        List<Integer> integerList=new ArrayList<Integer>();

        Class classStringList=stringList.getClass();
        Class classIntegerList=integerList.getClass();

        if (classIntegerList.equals(classStringList)){
            System.out.println("类型相同");
        }

    }
}
