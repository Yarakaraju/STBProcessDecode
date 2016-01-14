/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stb.async;

import java.util.Comparator;
import javax.annotation.Resource;

/**
 *
 * @author oracle
 */
@Resource
public class Process {

    private String name;
    private int id;

    public Process(String n, int s) {
        this.name = n;
        this.id = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Process Name: " + this.name + "-- and ID: " + this.id;
    }
}

class ProcessCompare implements Comparator<Process> {

    @Override
    public int compare(Process p1, Process p2) {
        if (p1.getID() > p2.getID()) {
            return 1;
        } else {
            return -1;
        }
    }
}
