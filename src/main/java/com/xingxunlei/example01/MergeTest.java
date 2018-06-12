package com.xingxunlei.example01;

/**
 * 合并两个有序数组
 * @author xingmin
 */
public class MergeTest {

    public static int[] merge(int[]a, int[]b) {

        if(a == null && b == null) {
            return null;
        }

        if(a == null && b!= null) {
            return b;
        }

        if(b == null && a!= null) {
            return a;
        }

        // step1. 定义一个长度为两个数组之和大小的数组
        int[] result = new int[a.length + b.length];

        // step2. 定义数组下标
        int i = 0, j = 0, k = 0;

        // step3. 按位比较两个数组中的元素，并且将值较小的元素放入结果数组，直到某一个数组的下标超长为止
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            }else {
                result[k++] = b[j++];
            }
        }

        // step4. 将有剩余元素的数组中的其它元素放入结果数组
        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }

    public static void print(int[] b) {
        for(int i=0; i<b.length ; i++) {
            System.out.print(b[i] + (i%10 ==9 ? "\n":"\t"));
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,3,5,7,9};
        int[] b = new int[]{0,2,4,6,8};
        print(merge(a, b));
    }

    private MergeTest() {}
}
