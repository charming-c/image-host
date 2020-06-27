package arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class ArraysTest {
    public static void main (String[] args){
//        静态创建了一个String数组
        String[] array={"hello","world"};
        System.out.println(array[0]);
        System.out.println(array[1]);

//        数组在创建声明的时候就必须要确定他的大小，否则会报错
//        String[] array2;
//        array2= {"0", "0", "0"};

//        动态创建
        String[] array3=new String[5];
        array3[0]="1";
        array3[1]="2";
        array3[2]="3";
        array3[3]="4";
        array3[4]="5";
        for(int i=0;i<array3.length;i++){
            System.out.println("array3["+i+"]:"+array3[i]);

        }
//        数组里面不仅可以存储基本数据类型，还可以是对象
        IteratorTest[] a=new IteratorTest[3];
        ArrayList arr=new ArrayList();
        System.out.println(arr.contains(a));
    }
}
