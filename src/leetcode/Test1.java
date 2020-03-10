package leetcode;

//给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//
//        不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class Test1 {
    public int removeDuplicates(int[] numbs) {

        if (numbs.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < numbs.length; j++) {
            if (numbs[j] != numbs[i]) {
                i++;
                numbs[i] = numbs[j];
            }
        }
        return i + 1;
    }
}
