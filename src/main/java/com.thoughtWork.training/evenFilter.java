package com.thoughtWork.training;

import java.util.List;
import java.util.stream.Collectors;

public class evenFilter implements Processor {
   public List<Integer> process(List<Integer> list){
       return list.stream().filter( integer -> integer % 2 != 0).collect(Collectors.toList());

   }
}
