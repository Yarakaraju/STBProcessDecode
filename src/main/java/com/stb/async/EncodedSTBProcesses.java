/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stb.async;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author oracle
 */
@Component
public class EncodedSTBProcesses {

    private final LinkedList<Process> procList = new LinkedList<>();

    public EncodedSTBProcesses() {

    }

    /**
     *
     * @param range
     * @param total_processes
     * @return
     */
    public List initiateProcess(int total_processes, int range) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < range; i++) {
            numbers.add(i + 1);
        }

        Collections.shuffle(numbers);
        for (int j = 0; j < total_processes; j++) {
            System.out.print(numbers.get(j) + " ");
            procList.add(new Process("Process P"+numbers.get(j)+" .", numbers.get(j)));
        }

        return procList;

    }

    public List getProcList() {
        return procList;
    }

}
