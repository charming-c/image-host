package arraylist.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {

    public static void main(String[] args){

        HashSet<Person> set=new HashSet<>();

        set.add(new Person(10,"abc"));
        set.add(new Person(10,"a"));
        set.add(new Person(10,"a"));


        System.out.println(set.toString());

        LinkedHashSet<Person> set2=new LinkedHashSet<>();
        set2.add(new Person(20,"lala"));
        set2.add(new Person(20,"haha"));
        System.out.println(set2);

    }
}
