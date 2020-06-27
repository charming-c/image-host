package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String [] args){
        List<String> stringList =new ArrayList<String>();
        stringList.add("r");
        stringList.add("e");
        stringList.add("f");
        stringList.add("e");
        stringList.add("r");

        Iterator iterator=stringList.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }

    }
}
