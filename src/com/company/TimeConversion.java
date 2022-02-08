package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeConversion {

    public TimeConversion() {
    }

    //This method takes in a String ex: 07:35:19AM and converts it to a 24-hour format
    public String ConvertToTwentyFourHours(String timeInput) {

        String input = timeInput;
        String hours = "";
        String minutes = "";
        String seconds = "";
        String amOrPm = "";

        //Read in timeInput and assign it to it's corresponding variables
        String[] arrayOfStrings = timeInput.split(":");
        hours = arrayOfStrings[0];
        minutes = arrayOfStrings[1];
        seconds = arrayOfStrings[2];

        Pattern patternAM = Pattern.compile("AM");
        Matcher matcherAM = patternAM.matcher(timeInput);

        //If matcher finds AM, sets amOrPm variable to AM, else sets it to PM
        if (matcherAM.find()) {
            amOrPm = matcherAM.group();
        } else {
            amOrPm = "PM";
        }

        int tempHours = Integer.valueOf(hours);

        if (amOrPm.equals("AM")) {
            seconds = seconds.replace("AM", "");
            seconds = seconds.replace("PM", "");
            String AmOutput = hours + ":" + minutes + ":" + seconds;
            return AmOutput;
        } else {
            tempHours += 12;
            hours = String.valueOf(tempHours);
            seconds = seconds.replace("AM", "");
            seconds = seconds.replace("PM", "");
            String TwentyFourHourOutput = hours + ":" + minutes + ":" + seconds;
            return TwentyFourHourOutput;
        }
    }

}
