package agh.po.Lab3;

public class CodingBat {
    public boolean array123(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
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
