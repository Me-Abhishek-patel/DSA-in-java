package org.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class sortDate {
    public static void main(String[] args) {
        ArrayList<String> modified = new ArrayList<>(Arrays.asList("20 Jan 2000",
                "12 May 1966",
                "9 Oct 2000",
                "10 Oct 1966",
                "19 Jun 2001"));
        modified.sort(new Comparator<>() {
            final DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");

            @Override
            public int compare(String o1, String o2) {
                try {
                    return dateFormat.parse(o1).compareTo(dateFormat.parse(o2));
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        });

        for(String date : modified)
            System.out.println(date);
    }
}
