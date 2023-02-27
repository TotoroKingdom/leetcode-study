package hot100;




import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;

/**
 * @author:totoro
 * @createDate:2023/2/23
 * @description:
 */
public class Hot3 {

    public static void main(String[] args) {
        String s = "abba";
        int i = lengthOfLongestSubstringSet(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstringSet(String s){
        if (null == s){
            return 0;
        }

        int max = 0;
        int left = 0;

        HashSet<Object> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max = Math.max(max, set.size());
            }else {
                while (set.contains(s.charAt(i))){
                    set.remove(s.charAt(left));
                    left ++;
                }
                set.add(s.charAt(i));
            }
        }

        return max;
    }


    public static int lengthOfLongestSubstring(String s) {

        //1-如果s为空，返回0
        if (null == s){
            return 0;
        }
        int max = 0; //记录最大长度
        int leftIndex = 0; //记录左边界index
        HashMap<Character, Integer> map = new HashMap<>(); //存储字符和index

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                //如果map里存在这个值了，说明重复了，将左边界index往右移一位（移除重复值）
                //1-找到重复值之前的位置,比较一下和当前左边界的大小，看是否需要右移
                leftIndex = Math.max(map.get(s.charAt(i)) + 1, leftIndex) ;
            }
            //将字符和index存到map
            map.put(s.charAt(i),i);
            //当前不重复长度 = 当前index - leftIndex + 1
            int uniqueLength = i - leftIndex + 1;
            //最大长度 = 当前不重复长度 和 最大长度的 最大值
            max = Math.max(uniqueLength,max);
        }
        return max;
    }

}
