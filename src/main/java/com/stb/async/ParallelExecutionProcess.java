/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stb.async;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.springframework.stereotype.Component;

/**
 *
 * @author oracle
 */
@Component
public class ParallelExecutionProcess {

    static int workerId;

    public ParallelExecutionProcess() {
    }

    /**
     *
     * @param processList
     */
    public void initiateDecode(List processList) {

        Date startTime = new java.util.Date();
        System.out.println("Start Work" + startTime);
        ExecutorService es = Executors.newFixedThreadPool(10);
        Collections.sort(processList, new ProcessCompare());

        List<Future> futures = new ArrayList<>();

        for (Iterator it = processList.iterator(); it.hasNext();) {
            Process e = (Process) it.next();
            workerId = processList.indexOf(e);
            System.out.println("* Start Decode process " + processList.indexOf(e));
            futures.add(es.submit(() -> {
                new DecodedSTBProcesses((Process) processList.get(ParallelExecutionProcess.workerId)).doWork();
                return null;
            }));
        }

        es.shutdown();

        System.out.println("... The Process is under execution! Using CPU core which are available, wait while work is being done....");
        int ctr = 0;
        for (Future future : futures) {
            try {
                future.get();  // blocking call, explicitly waiting for the response from a specific task, not necessarily the first task that is completed
                System.out.println("** Response of process " + ++ctr + " is in.");
            } catch (InterruptedException | ExecutionException e) {
            }
        }

        Date endTime = new java.util.Date();
        System.out.println("End work at " + endTime);
        System.out.println("Total decoding took " + new Double(0.001 * (endTime.getTime() - startTime.getTime())) + " seconds");
        System.exit(0);
    }
}
