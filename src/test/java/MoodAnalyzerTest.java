import com.blp.moodanalyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void analyzeMood() {
        String check = MoodAnalyzer.analyzeMood();
        Assert.assertEquals("com.blp.moodanalyzer.MoodAnalysisException", check);
    }
    @Test
    public void analyzeMood1() {
        String check = MoodAnalyzer.analyzeMood1();
        Assert.assertEquals("EMPTY", check);
    }
}

