package lhf.test;

import org.junit.Test;

import java.util.*;

public class OtherTest {
    @Test
    public void fun1(){
        String a = new String("abc");
        String b = new String("abc");
        print(a==b);
        print(Objects.equals(a,b));
        print(tf1(a,b));
        print(tf2(a,b));
        print("".isEmpty());
    }

    public static boolean tf1(Object v1,Object v2){
        return v1==v2;
    }

    public static boolean tf2(Object v1,Object v2){
        return v1!=null&&v1.equals(v2);
    }


    public void print(Object o){
        System.out.println(o);
    }
}
