package lhf.test;

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
}
