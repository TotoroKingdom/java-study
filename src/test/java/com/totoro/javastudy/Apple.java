package com.totoro.javastudy;

import java.util.HashMap;
import java.util.Map;

public class Apple {



    private Integer id;
    private Map map;

    public Apple(Integer id, Map map) {
        this.id = id;
        this.map = map;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                ", map=" + map +
                '}';
    }
}
