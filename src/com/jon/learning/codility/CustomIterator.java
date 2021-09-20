package com.jon.learning.codility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomIterator {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/Users/jon/learning/src/resources/CustomIterator");
            MyIterable iterable = new MyIterable(new BufferedReader(fr));
            for (Integer i : iterable) {
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static class MyIterable implements Iterable<Integer> {
        List<Integer> ints = new ArrayList<>();

        public MyIterable(BufferedReader r) {
            BufferedReader br = (BufferedReader) r;
            String row;
            try {
                row = br.readLine();
                while (row != null) {
                    Integer i = getInt(row);
                    if (i != null) this.ints.add(i);
                    row = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private Integer getInt(String val) {
            try {
                return Integer.parseInt(val.trim());
            } catch (NumberFormatException formatEx) {
                System.out.println(val+" is not a valid Integer");
                return null;
            } catch (Exception e) {
                System.out.println("Exception converting "+val+" to Integer");
                return null;
            }
        }

        @Override
        public Iterator<Integer> iterator() {
            return this.ints.iterator();
        }
    }
}
