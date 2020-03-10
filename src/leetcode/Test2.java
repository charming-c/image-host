package leetcode;

//给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
//
//        说明:
//
//        初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
//        你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/merge-sorted-array
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class Test2 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int j=0;

            for(int i=m;i<m+n;i++){
                nums1[i]=nums2[j];
                j++;
            }
            for(int x=0;x<nums1.length-1;x++){
                for(int i=0;i<nums1.length-1;i++){
                    if(nums1[i]>nums1[i+1]){
                        int a=nums1[i];
                        nums1[i]=nums1[i+1];
                        nums1[i+1]=a;
                    }
                }
            }
        }
}
