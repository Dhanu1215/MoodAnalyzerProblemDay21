package com.blp.moodanalyzer;

public class MoodAnalyzer {
    public static String message1;
    public static String message2;

    public MoodAnalyzer(){
    }
    public MoodAnalyzer(String message1,String message2){
        MoodAnalyzer.message1 = message1;
        MoodAnalyzer.message2 = message2;
    }

    /**
     * Call method to test the mood
     */
    public static String analyzeMood() {
        MoodAnalyzer md = new MoodAnalyzer("I am in sad mood","I am in HAPPY mood");
        String mood = null;
        if (message1.contains("sad")){
            mood = "SAD";
        }
        else if (message2.contains("HAPPY")) {
            mood = "HAPPY";
        }
        return mood;
    }
}
