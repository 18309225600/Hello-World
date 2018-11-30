package lhf.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream API test
 */
public class StreamApiTest {
    //一共有五种方式产生Stream

    //1. 可以通过Collection 提供的 stream() 或者 parallelStream()

    //2.通过Arrays 中的静态方法 stream()

    //3.通过Stream中的静态方法 of()

    //4.通过迭代产生无限流   Stream.iterate(seed,uni)

    //5.通过生成产生无限流   Stream.generate(Supplier)


    //产生了stream，几种操作：
    //1.filter 过滤
    //2.limit  截断
    //3.skip(n) 跳过
    //4.distinct 去重
    @Test
    public void Test1(){
        //Collection的stream方法
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(13);
        list.add(34);
        Stream<Integer> stream = list.stream();
    }

    @Test
    public void Test2(){
        //Arrays 的 stream方法
        int [] arr = new int[20];
        IntStream stream = Arrays.stream(arr);

    }

    @Test
    public void Test3(){
        //Stream 类的of方法
        Stream<Integer> integerStream = Stream.of(2);
    }

    @Test
    public void Test4(){
        //迭代无限流
        Stream.iterate(0,x->x+2).forEach(System.out::println);
    }

    @Test
    public void Test5(){
        //生成无限流
        Stream.generate(()->Math.random()).limit(5).forEach(System.out::println);
    }
}
