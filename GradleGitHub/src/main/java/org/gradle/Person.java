package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private  String name;

    public Person(String name) {
        this.name = name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        this.name = n;
    }
}
