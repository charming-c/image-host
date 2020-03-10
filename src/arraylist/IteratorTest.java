package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String [] args){
        List<String> list =new ArrayList<>();
        list.add("123");
        list.add("1234");
        list.add("12345");
        list.add("123456");

        Iterator it=list.iterator();
        while(it.hasNext()){
            String str= (String) it.next();
            if("123".equals(str)){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
