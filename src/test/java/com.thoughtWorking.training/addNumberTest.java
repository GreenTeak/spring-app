package com.thoughtWorking.training;

import com.thoughtWork.training.Processor;
import com.thoughtWork.training.addNumber;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class addNumberTest {
    @Test
    void should_be_return_add_1(){
        Processor processor = new addNumber(1);
        Integer number[] ={1,2,3,4};
        Integer resultList[] ={1,2,3,4};
        List<Integer> input = Arrays.asList(number);
        List<Integer> result =Arrays.asList(resultList);
        //assertThat(processor.process(input),is(resultList));
    }
}
