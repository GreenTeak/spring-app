package com.thoughtWork.training;

import java.util.List;

public class NumberProcesser {
    private List<Processor> processers;

    NumberProcesser(List processers) {
        this.processers = processers;
    }

    public List<Integer> process(List<Integer> line) {
        for (Processor pro : processers) {
            line = pro.process(line);
        }
        return line;
    }
}


