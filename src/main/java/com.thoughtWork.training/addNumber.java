package com.thoughtWork.training;

import java.util.List;
import java.util.stream.Collectors;

public class addNumber implements Processor {
     private Integer number;
     public addNumber(Integer number){
         this.number = number;
     }
     public List<Integer> process(List<Integer> list){
        return list.stream().map( integer -> integer + this.number).collect(Collectors.toList());
    }
}
