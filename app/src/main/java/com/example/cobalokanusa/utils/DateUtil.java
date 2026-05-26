package com.example.cobalokanusa.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtil {

    public static String getCurrentDate() {

        SimpleDateFormat sdf = new SimpleDateFormat(
                "yyyy-MM-dd",
                Locale.getDefault()
        );

        return sdf.format(new Date());
    }
}