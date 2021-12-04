package com.company;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Challange1 {
    int score;
    String name;

    public Challange1() {
        super();
    }

    public int length() {
        return name.length();
    }

    public boolean isEmpty() {
        return name.isEmpty();
    }

    public char charAt(int index) {
        return name.charAt(index);
    }

    public int codePointAt(int index) {
        return name.codePointAt(index);
    }

    public int codePointBefore(int index) {
        return name.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return name.codePointCount(beginIndex, endIndex);
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return name.offsetByCodePoints(index, codePointOffset);
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        name.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    @Deprecated(since = "1.1")
    public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
        name.getBytes(srcBegin, srcEnd, dst, dstBegin);
    }

    public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return name.getBytes(charsetName);
    }

    public byte[] getBytes(Charset charset) {
        return name.getBytes(charset);
    }

    public byte[] getBytes() {
        return name.getBytes();
    }

    public boolean contentEquals(StringBuffer sb) {
        return name.contentEquals(sb);
    }

    public boolean contentEquals(CharSequence cs) {
        return name.contentEquals(cs);
    }

    public boolean equalsIgnoreCase(String anotherString) {
        return name.equalsIgnoreCase(anotherString);
    }

    public int compareTo(String anotherString) {
        return name.compareTo(anotherString);
    }

    public int compareToIgnoreCase(String str) {
        return name.compareToIgnoreCase(str);
    }

    public boolean regionMatches(int toffset, String other, int ooffset, int len) {
        return name.regionMatches(toffset, other, ooffset, len);
    }

    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return name.regionMatches(ignoreCase, toffset, other, ooffset, len);
    }

    public boolean startsWith(String prefix, int toffset) {
        return name.startsWith(prefix, toffset);
    }

    public boolean startsWith(String prefix) {
        return name.startsWith(prefix);
    }
}
