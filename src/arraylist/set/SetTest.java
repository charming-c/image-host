package arraylist.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetTest {
    public static void main(String[] args){
        int count=0;
        Random random=new Random();
        Set<Integer> set1=new HashSet<>();
        while(set1.size()<10){
            set1.add(random.nextInt(20));
            count++;
        }
        set1.add(0);
        set1.add(0);
        System.out.println(set1);
        System.out.println("一共随即生成了"+count+"个数字");

        Iterator iterator= set1.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }
    }

}
