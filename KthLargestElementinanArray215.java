/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

public class KthLargestElementinanArray215 {

    public void KthLargestElementinanArray215() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 0;
        Arrays.sort(nums);
        System.out.println(nums[nums.length - k]);
    }
}
