import com.blp.moodanalyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void analyzeMood() {
        String check = MoodAnalyzer.analyzeMood("I am in sad mood");
        Assert.assertEquals("SAD", check);
    }

    @Test
    public void analyzeMood1() {
        String check = MoodAnalyzer.analyzeMood1("I am in Any mood");
        Assert.assertEquals("HAPPY", check);
    }
}
