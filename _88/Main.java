package _88;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {

    // mwl 1.优先队列
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer> queue1 = new PriorityQueue<>(0); //mwl 最好不要添加容量，0会报错
        if(m+n<=0)
            return;
        PriorityQueue<Integer> queue = new PriorityQueue<>(m+n);

        for (int i=0; i<m; i++){
            queue.add(nums1[i]);
        }
        for (int i=0; i<n; i++){
            queue.add(nums2[i]);
        }

        int i=0;
        while(!queue.isEmpty()){
            nums1[i++] = queue.poll();
        }

    }

    // 双指针
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums11 = Arrays.copyOf(nums1, m); // mwl 还有一种数组拷贝方式：
        System.arraycopy(nums2, 0, nums1, m, n);
        System.out.println(Arrays.toString(nums1));

        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n){
            if (nums11[i] <= nums2[j]){
                nums1[k++] = nums11[i++];
            }else {
                nums1[k++] = nums2[j++];
            }
        }

        while(i<m){
            nums1[k++] = nums11[i++];
        }
        while(j<n){
            nums1[k++] = nums2[j++];
        }
    }

}

public class Main {

    static void test1(){
        // 1. 创建一个容量为10的优先队列
        PriorityQueue<Student> queue = new PriorityQueue<>(10, (o1, o2) -> o1.age-o2.age);//mwl 按照升序就是o1在前

        // 2. 存入队列
        queue.add(new Student(18, "mwl"));
        queue.add(new Student(15, "msh"));

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }

    public static void main(String[] args) {
//        test1();
        int[] a = new int[]{1,2,3,0,0,0};
        int[] b = new int[]{2,5,6};
        new Solution().merge(a, a.length- b.length, b, b.length);
        System.out.println(Arrays.toString(a));
    }
}
/*
 * mwl 1. 测试优先队列
 * */
class Student{
    int age;
    String name;



    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}