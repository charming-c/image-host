package arraylist.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args){
//        构造TreeSet时，传入person的比较年龄的方法
        TreeSet<Person> tree=new TreeSet<>(Person::compareTo);
        tree.add(new Person(10,"a"));
        tree.add(new Person(20,"b"));
        tree.add(new Person(30,"c"));
        tree.add(new Person(40,"d"));
//        年龄较小，而TreeSet是有序列的，无法放到集合中
        tree.add(new Person(10,"e"));
        System.out.println(tree);
//        返回年龄小于30的人里年龄最大的人
        System.out.println("Lower a:"+tree.lower(new Person(30,"n")));
//        TreeSet不支持快速随机遍历，只能通过迭代器进行遍历
//        可以倒序遍历
        Iterator iterator=tree.descendingIterator();
        while (iterator.hasNext()) System.out.println(iterator.next());


    }
}
