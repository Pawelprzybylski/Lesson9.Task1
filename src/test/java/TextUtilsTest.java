import org.junit.Assert;
import org.junit.Test;

public class TextUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowSomeException() {
        //given
        String text = "";
        //when
        TextUtils.checkText(text);
        //then
        Assert.fail("Nie można sprawdzić pustego napisu");
    }

    }

