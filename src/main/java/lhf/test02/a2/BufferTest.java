package lhf.test02.a2;


import java.nio.IntBuffer;

/**
 * buffer有好多具体的实现，int，byte....
 */
public class BufferTest {
    public static void main(String[] args){
        IntBuffer buffer = IntBuffer.allocate(10);
        buffer.put(23);
        buffer.put(24);
        buffer.put(25);
        buffer.put(23);
        //java.nio.HeapIntBuffer[pos=0 lim=4 cap=10]
        /**
         * pos代表位置
         * lim 上限
         * cap 容量
         */
        System.out.println(buffer);
        buffer.flip();  //复位
        System.out.println(buffer);
        //buffer的实际容量
        System.out.println(buffer.remaining());
    }
}
