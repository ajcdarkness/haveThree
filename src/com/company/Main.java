package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr = {1, 2, 3, 3, 3, 4, 50};
	haveThree(arr);
    }
    public static boolean haveThree(int[] nums){
        int tres = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 3){
                if(i > 0) {
                    if (nums[i - 1] != 3 && nums[i + 1] != 3) {
                        tres++;
                    }

                    }
                }
            }
        }
        if(tres == 3){
            return true;
        }else{
            return false;
        }
    }
}
