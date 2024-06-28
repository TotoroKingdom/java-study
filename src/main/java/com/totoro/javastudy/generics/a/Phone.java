package com.totoro.javastudy.generics.a;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phone<T,V> {

    private Integer id;

    private T t;

    private V v;
}
