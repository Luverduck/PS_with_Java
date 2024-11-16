package Baekjoon.src.step00_by_ID.p26489;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        String input;
        while(true) {
            input = br.readLine();
            if(input == null) break;
            if(input.equals("gum gum for jay jay"))
                cnt++;
        }
        bw.append(String.valueOf(cnt));

        bw.flush();
        br.close();
        bw.close();
    }
}