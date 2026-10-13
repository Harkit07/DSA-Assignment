// File name: StringsQuestions.java

import java.util.*;

public class StringsQuestions {

    public static int countLC(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // STRINGS QUESTIONS
            // Q1. Count how many times lowercase vowels occurred in a String entered by the user.
            // TODO: write your code here
            System.out.print("Enter a String : ");
            String str = sc.nextLine();
            System.out.println(countLC(str));

            // Q2. What will be the output of the following code?
            //   public class Solution {
            //       public static void main(String args[]) {
            //           String str = "ShradhaDidi";
            //           String str1 = "ApnaCollege";
            //           String str2 = "ShradhaDidi";
            //           System.out.println(str.equals(str1) + " " + str.equals(str2));
            //       }
            //   }
            // Your answer:
            System.out.println("False  True");

            // Q3. What will be the output of the following code?
            //   public class Solution {
            //       public static void main(String args[]) {
            //           String str = "ApnaCollege".replace("l", "");
            //           System.out.println(str);
            //       }
            //   }
            // Your answer:
            System.out.println("ApnaCoege");

            // Q4. Determine if 2 Strings are anagrams of each other.
            // What are anagrams?
            // If two strings contain the same characters but in a different order,
            // they can be said to be anagrams. Consider "race" and "care".
            // The characters of "race" can be rearranged to form "care", and vice versa.
            // TODO: write your code here
            String str1 = "race";
            String str2 = "care";
            System.out.println(isAnagram(str1, str2));

            // Q5. Search and read about:
            //   a. intern() method in String
            //   b. StringBuffer
            // TODO: write your code here (or your notes)
            {
                // ---------- a. intern() ----------
                // Java keeps a String Pool where string literals are stored.
                // Identical literals share the same object in the pool.
                // new String("hello") always creates a separate object on the heap.
                // intern() returns the pooled version of a string:
                //   - if the pool already has an equal string, that object is returned
                //   - otherwise the string is added to the pool and its reference is returned
                // Use: saves memory when many duplicate strings exist.
                // Always compare strings with equals(), not ==.
                String a = "hello";
                String b = new String("hello");
                String c = b.intern();

                System.out.println(a == b);       // false (b is a separate heap object)
                System.out.println(a == c);       // true  (c points to the pooled object)
                System.out.println(a.equals(b));  // true  (contents are the same)

                // ---------- b. StringBuffer ----------
                // String is immutable, so every change creates a new object.
                // StringBuffer is a mutable sequence of characters (changed in place).
                // It is thread-safe because its methods are synchronized (so slightly slower).
                // Default capacity is 16 and it grows automatically.
                // Common methods: append, insert, delete, deleteCharAt, replace, reverse,
                //                 setCharAt, length, capacity, toString
                //
                // String vs StringBuilder vs StringBuffer:
                //   String        -> immutable, thread-safe, slow for repeated edits
                //   StringBuilder -> mutable, NOT thread-safe, fastest (use in most cases)
                //   StringBuffer  -> mutable, thread-safe (synchronized), slower than StringBuilder
                StringBuffer sb = new StringBuffer("Apna");
                sb.append("College");
                System.out.println(sb);           // ApnaCollege

                sb.insert(4, " ");
                System.out.println(sb);           // Apna College

                sb.reverse();
                System.out.println(sb);           // egelloC anpA

                sb.reverse();
                sb.setCharAt(0, 'a');
                System.out.println(sb);           // apna College

                sb.deleteCharAt(sb.length() - 1);
                System.out.println(sb);           // apna Colleg

                System.out.println(sb.length());  // 11
                System.out.println(sb.capacity()); // 20 (initial 4 + 16)
            }
        }
    }
}
