package com.thoughtWork.training;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterEven {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(new Scanner(System.in)
                .nextLine().split(" ")).stream()
                .map(Integer::valueOf).collect(Collectors.toList());
        Processor second = new addNumber(3);
        Processor first = new oddFilter();
        List<Processor> operator = new ArrayList<>();
        operator.add(first);
        operator.add(second);

        //List<Integer> list = new NumberProcesser(operator).process(number);

        XmlBeanFactory beanFactory =new XmlBeanFactory(new ClassPathResource("context.xml"));
        NumberProcesser list =beanFactory.getBean(NumberProcesser.class);

        list.process(number).stream().map(String::valueOf).collect(Collectors.toList()).toString();
        System.out.print(list);
    }
}
