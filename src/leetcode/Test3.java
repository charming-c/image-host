package leetcode;//实现 strStr() 函数。
//
//        给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
//
//        示例 1:
//
//        输入: haystack = "hello", needle = "ll"
//        输出: 2
//
//        示例 2:
//
//        输入: haystack = "aaaaa", needle = "bba"
//        输出: -1

class Test3 {
    public int strStr(String haystack, String needle) {

        char[] c1=haystack.toCharArray();
        char[] c2=needle.toCharArray();
        int a=-1;

        if(c2.length==0) return 0;

        for(int i=0;i<c1.length;i++){

            if(c2[0]==c1[i]&& c2.length<=c1.length-i){
                a=i;
                for(int j=1;j<c2.length;j++){
                    if(c2[j]!=c1[i+j]&& c2.length>c1.length-i){
                        a=-1; break;
                    }
                    if(c2[j]!=c1[i+j]&& c2.length<=c1.length-i){
                        a=-3; break;
                    }
                }
                if(a!=-3)break;
            }
            else a=-1;
        }
        return a;
    }
}