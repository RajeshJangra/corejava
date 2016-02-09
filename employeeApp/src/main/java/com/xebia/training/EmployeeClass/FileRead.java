package com.xebia.training.EmployeeClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by kchoudhary on 03-Feb-16.
 */
public class FileRead {
    List<String> list;

    public List<String> readFromFile(String addList) throws IOException{
        list = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(addList));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(line, ";");
//            if(line.contains("\n"))
//            {
//                stringTokenizer = new StringTokenizer(line, "\n");
//                while (stringTokenizer.hasMoreElements()) {
//                    list.add(stringTokenizer.nextToken());
//                }
//            }
            while (stringTokenizer.hasMoreElements()) {
                list.add(stringTokenizer.nextToken());
            }
        }
        return list;
    }

}
