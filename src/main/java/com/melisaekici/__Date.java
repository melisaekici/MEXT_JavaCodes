package com.melisaekici;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class __Date {
    /*
    localData: Yıl/Ay/Gün
    localTime: Saat/Dakika/Saniye/Nanosaniye
    localDateTime: hem tarih hem saat

    *******************
    1. Otomatik date ve time çekme
    2. Manuel date ve time girme
    3. Formatter

     */

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today);

        // manuel giriş
        LocalDate createdData = LocalDate.parse("2024-05-30");
        System.out.println("Created date is: " + createdData);

        LocalTime rightNow = LocalTime.now();
        System.out.println("Right now is: " + rightNow);

        // manuel giriş
        LocalTime createdTime = LocalTime.parse("09:00:00");
        System.out.println("CreatedTime is: " + createdTime);

        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println("Date and time is: " + dateAndTime); // date ve time arasına T koyuyor

        // manuel giriş
        LocalDateTime createdDateTime = LocalDateTime.parse ("2024-05-30T09:00:00");
        System.out.println("Created Date and Time is: " + createdDateTime);

        // of methodu

        LocalDate meetingDate = LocalDate.of(2024, 07, 13);
        LocalTime meetingTime = LocalTime.of(10,30,00);

        // date

        LocalDateTime expireDate = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy, hh:mm:ss");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM");

        String dayAndMonth = today.format(dateFormat);      // today tepede girilmişti
        String timeString = rightNow.format(dateFormat);
        String expireDateFormatted = expireDate.format(format);

        System.out.println("Expire Date is: " + expireDateFormatted);
        System.out.println("Date and Month: " + dayAndMonth);

        // egzersiz
        LocalDate todayIs = LocalDate.now();
        DateTimeFormatter todayFormat = DateTimeFormatter.ofPattern("MM-dd-yyy");
        String dayAndMonthIs = todayIs.format(todayFormat);
        System.out.println("Today is: " + dayAndMonthIs);

        LocalTime timeIs = LocalTime.now();
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
        String timeIsFormat = timeIs.format(timeFormat);
        System.out.println("Time is: " + timeIsFormat);

        LocalDateTime meetingTimeIs = LocalDateTime.now();
        DateTimeFormatter meetingTimeFormat = DateTimeFormatter.ofPattern("dd-MM, mm");
        String meetingTimeIsFormat = meetingTimeIs.format(meetingTimeFormat);
        System.out.println("Meeting is at: " + meetingTimeIsFormat);



    }
}
