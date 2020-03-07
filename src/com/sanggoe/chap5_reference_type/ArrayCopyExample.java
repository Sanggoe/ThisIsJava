package com.sanggoe.chap5_reference_type;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = { "java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for(String s : newStrArray) {
            System.out.print(s + ", ");
        }

    }
}
