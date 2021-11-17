package com.blp.moodanalyzer;

/**
 * Custom exception-MoodAnalysisException
 */
class MoodAnalysisException extends Exception {

}

public class MoodAnalyzer {

    public static String message1;
    static String mood = null;
    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message1) {
        MoodAnalyzer.message1 = message1;
    }

    /**
     * Call method to test the mood and handle exception
     */
    public static String analyzeMood() {

        MoodAnalyzer md = new MoodAnalyzer("");
        try {
            if (message1.length() == 0)
                throw new MoodAnalysisException();
        }
        catch (MoodAnalysisException e) {
            mood = e.toString();
        }
        return mood;
    }
}
