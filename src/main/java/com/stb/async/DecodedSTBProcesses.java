/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stb.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 *
 * @author oracle
 */
@Component
public class DecodedSTBProcesses {

    private Process id;
  
    public DecodedSTBProcesses() {

    }

    public DecodedSTBProcesses(Process id) {
        this.id = id;
    }


    /**
     *
     */
    @Async
    public void doWork() throws InterruptedException {
        System.out.println("==== Started Decoding ====== (Deocoded Process is  = "
                + this.id.getID() + ")");
    }

}


