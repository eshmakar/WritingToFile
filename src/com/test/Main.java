package com.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\1\\1.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < 1000; i++) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.close();
        System.out.println("Completed!");

    }
}
