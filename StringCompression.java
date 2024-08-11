public class StringCompression {

    public static void main(String[] args) {
        char[] abc = { 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c' };
        int index = 0;

        for (int i = 0; i < abc.length;) {
            int count = 1;

            for (int j = i + 1; j < abc.length; j++) {
                if (abc[i] == abc[j]) {
                    count++;
                } else {
                    break;
                }
            }
            abc[index++] = abc[i];
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    abc[index++] = c;
                }
            }

            i = i + count;
        }

        for (int i = 0; i < index; i++) {
            System.out.print(abc[i]);
        }
    }
}

/*
 * public class Solution {
 * public int compress(char[] chars) {
 * int index = 0;
 * int i = 0;
 * 
 * while (i < chars.length) {
 * char currentChar = chars[i];
 * int count = 0;
 * 
 * while (i < chars.length && chars[i] == currentChar) {
 * i++;
 * count++;
 * }
 * 
 * chars[index++] = currentChar;
 * 
 * if (count > 1) {
 * for (char c : Integer.toString(count).toCharArray()) {
 * chars[index++] = c;
 * }
 * }
 * }
 * 
 * return index;
 * }
 * }
 * 
 */