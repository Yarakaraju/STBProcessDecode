package com.stb.async;

import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StbApplication {

    public static void main(String[] args) {

        SpringApplication.run(StbApplication.class, args);

        System.out.println("This require Minimum and Maximum number for generating number for process randomly \n"
                + "Enter Minimum Process and Maximum Processes \n Also Enter Total number of processes");

        /*Scanner sc = new Scanner(System.in);
        int total_Processes = sc.nextInt();
        int range = sc.nextInt();*/

        int total_Processes = 10;
        int range = 40;
        
        List processList = new EncodedSTBProcesses().initiateProcess(total_Processes, range);

         System.out.println("Process List Size is in main:"+ processList.size());
         
        new ParallelExecutionProcess().initiateDecode(processList);

    }
}
