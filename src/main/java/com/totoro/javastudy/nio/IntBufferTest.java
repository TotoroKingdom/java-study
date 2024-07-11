package com.totoro.javastudy.nio;

import java.nio.IntBuffer;
import java.util.Arrays;

/**
 * @author totoro
 * @date 2024年07月11日 18:45
 * @description
 */

public class IntBufferTest {

    public static void main(String[] args) {

        IntBuffer buffer = IntBuffer.allocate(10);

        int[] arr = new int[]{1, 2, 3, 4, 5};
        IntBuffer buff = IntBuffer.wrap(arr);

        buffer.put(1)
                .put(2)
                .put(3);
        System.out.println(buffer.mark());
        System.out.println(buffer);

        int[] array = new int[]{1,3,5,7,9};
        buffer.put(array,0,3);
        System.out.println(Arrays.toString(buffer.array()));

        buffer.reset();
        System.out.println("翻转 buffer后：" + buffer.mark());

        buffer.put(buff);

        System.out.println(Arrays.toString(buffer.array()));


    }
}
