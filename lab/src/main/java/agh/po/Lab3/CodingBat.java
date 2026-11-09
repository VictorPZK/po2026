package agh.po.Lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public boolean array123(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }
    public Map<String, String> mapAB4(Map<String, String> map) {
        HashMap<String, String> result = new HashMap<>(map);

        if (result.containsKey("a") && result.containsKey("b")) {
            String a = result.get("a");
            String b = result.get("b");

            if (a.length() > b.length()) {
                result.put("c", a);
            } else if (b.length() > a.length()) {
                result.put("c", b);
            } else {
                result.put("a", "");
                result.put("b", "");
            }
        }
        return result;
    }
    public Map<String, String> pairs(String[] strings) {
        HashMap<String, String> map = new HashMap<>();

        for (String s : strings) {
            String first = s.substring(0, 1);
            String last = s.substring(s.length() - 1);
            map.put(first, last);
        }
        return map;
    }
    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    public boolean only14(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 4) {
                count++;
            }
        }
        if (count == nums.length) {
            return true;
        }
        return false;
    }

    public String middleTwo(String str) {
        int len = str.length()/2;
        return str.substring(len-1,len+1);
    }
    public String middleThree(String str) {
        int len = str.length()/2;
        return str.substring(len-1,len+2);

    }

}
