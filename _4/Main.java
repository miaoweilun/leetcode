package _4;
/*
* mwl 4. 寻找两个正序数组的中位数
* */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0 || nums2.length==0){
            nums1 = nums1.length==0?nums2:nums1;
            int i=0, j=nums1.length-1;
            int mid=(i+j)/2;
            return nums1.length%2==0? (nums1[mid]+nums1[mid+1])/2.0:nums1[mid];
        }

        int index1=0, index2=0;
        boolean needAvg = (nums1.length+nums2.length)%2==0;
        int condition = needAvg ? (nums1.length+nums2.length)/2-1 : (nums1.length+nums2.length)/2;
        double ans = 0.0;

        for(int i=0; i<=condition; i++){
            // System.out.println(nums1[index1] + " : " + nums2[index2]);

            if(i==condition){
                if(!needAvg){
                    if(index1>=nums1.length || index2<nums2.length && nums1[index1]>=nums2[index2])
                        ans=nums2[index2];
                    else if(index2>=nums2.length || index1<nums1.length && nums1[index1]<=nums2[index2]){
                        ans=nums1[index1];
                    }
                }else{
                    if(index1>=nums1.length){
                        ans = (nums2[index2]+nums2[index2+1])/2.0;
                    }
                    else if(index2>=nums2.length){
                        ans = (nums1[index1]+nums1[index1+1])/2.0;
                    }
                    else if(nums1[index1]<nums2[index2]){
                        if(index1+1>=nums1.length || nums1[index1+1]>=nums2[index2])
                            ans = (nums1[index1]+nums2[index2])/2.0;
                        else
                            ans = (nums1[index1]+nums1[index1+1])/2.0;
                    }else{
                        if(index2+1>=nums2.length || nums2[index2+1]>=nums1[index1])
                            ans = (nums1[index1]+nums2[index2])/2.0;
                        else
                            ans = (nums2[index2]+nums2[index2+1])/2.0;
                    }
                }
                break;
            }

            if(index1>=nums1.length || index2 <nums2.length && nums1[index1]>nums2[index2]){
                index2++;
            }else{
                index1++;
            }

        }

        return ans;
    }
}
public class Main {
}
