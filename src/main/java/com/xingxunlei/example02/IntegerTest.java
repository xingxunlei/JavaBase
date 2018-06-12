package com.xingxunlei.example02;

/**
 * @author xingmin
 */
public class IntegerTest {

    public static void main(String[] args) {
        Integer a = 11;
        Integer b = 11;
        System.out.println(a == b);

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);

        /**
         *
         * 所有的包装类对象之间值相等的判断应该使用‘equlas’，而不是‘==’。
         *
         * 说明：对于Integer var = ? 在-128至127之间的赋值，Integer对象是从IntegerCache.cache中产生，会复用已有对象，这个区间内的对象可以直接用‘==’判断是否相等。
         * ！！！但是，在这个区间外的对象全部从堆上产生，而不是复用已有对象，所以，‘==’并不会输出正确的判断结果，推荐全部使用equlas进行判断。
         *
         * 所以，以上程序结果为
         * true
         * false
         *
         */

    }
}
