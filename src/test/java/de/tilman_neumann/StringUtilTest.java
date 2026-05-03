package de.tilman_neumann;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    // repeat(String s, int n)
    @Test
    public void testRepeat_nullString() {
        assertNull(StringUtil.repeat(null, 1));
        assertNull(StringUtil.repeat(null, 0));
        assertNull(StringUtil.repeat(null, -1));
    }
    @Test
    public void testRepeat_nonPositiveN() {
        assertNull(StringUtil.repeat("a", 0));
        assertNull(StringUtil.repeat("a", -1));
    }
    @Test
    public void testRepeat_emptyString() {
        assertEquals("", StringUtil.repeat("", 1));
        assertEquals("", StringUtil.repeat("", 2));
    }
    @Test
    public void testRepeat_singleRepetition() {
        assertEquals("abc", StringUtil.repeat("abc", 1));
    }
    @Test
    public void testRepeat_multipleRepetitions() {
        assertEquals("abab", StringUtil.repeat("ab", 2));
    }

    // formatLeft(String s, String mask)
    @Test
    public void testFormatLeft_nullString() {
        assertEquals("", StringUtil.formatLeft(null, null));
        assertEquals("123", StringUtil.formatLeft(null, "123"));
    }
    @Test
    public void testFormatLeft_nullMask() {
        assertEquals("abc", StringUtil.formatLeft("abc", null));
        assertEquals("", StringUtil.formatLeft("", null));
        assertEquals("", StringUtil.formatLeft(null, null));
    }
    @Test
    public void testFormatLeft_stringShorterThanMask(){
        assertEquals("abc456", StringUtil.formatLeft("abc", "123456"));
        assertEquals("a2345", StringUtil.formatLeft("a", "12345"));
    }
    @Test
    public void testFormatLeft_stringEqualToMaskLength() {
        assertEquals("abc", StringUtil.formatLeft("abc", "123"));
        assertEquals("", StringUtil.formatLeft("", ""));
    }
    @Test
    public void testFormatLeft_stringLongerThanMask() {
        assertEquals("abcdef", StringUtil.formatLeft("abcdef", "123"));
    }
    @Test
    public void testFormatLeft_emptyMask() {
        assertEquals("abc", StringUtil.formatLeft("abc", ""));
        assertEquals("", StringUtil.formatLeft(null, ""));
    }

    // formatRight(String s, String mask)
    @Test
    public void testFormatRight_nullString() {
        assertEquals("", StringUtil.formatRight(null, null));
        assertEquals("123", StringUtil.formatRight(null, "123"));
    }
    @Test
    public void testFormatRight_nullMask() {
        assertEquals("abc", StringUtil.formatRight("abc", null));
        assertEquals("", StringUtil.formatRight("", null));
        assertEquals("", StringUtil.formatRight(null, null));
    }
    @Test
    public void testFormatRight_stringShorterThanMask() {
        assertEquals("123abc", StringUtil.formatRight("abc", "123456"));
        assertEquals("1234a", StringUtil.formatRight("a", "12345"));
    }
    @Test
    public void testFormatRight_stringEqualToMaskLength() {
        assertEquals("abc", StringUtil.formatRight("abc", "123"));
        assertEquals("", StringUtil.formatRight("", ""));
    }
    @Test
    public void testFormatRight_stringLongerThanMask() {
        assertEquals("abcdef", StringUtil.formatRight("abcdef", "123"));
    }
    @Test
    public void testFormatRight_emptyMask() {
        assertEquals("abc", StringUtil.formatRight("abc", ""));
        assertEquals("", StringUtil.formatRight(null, ""));
    }
}
