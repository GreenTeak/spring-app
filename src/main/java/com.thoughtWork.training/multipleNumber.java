package com.thoughtWork.training;

import java.util.List;
import java.util.stream.Collectors;

public class multipleNumber implements Processor {
    private Integer number;
    multipleNumber(Integer number){
        this.number = number;
    }
    public List<Integer> process(List<Integer> list){
        return list.stream().map( integer -> integer * this.number).collect(Collectors.toList());
    }
}
