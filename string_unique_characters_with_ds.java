import java.io.*;
import java.util.*;

// DETERMINE IF STRING HAS UNIQUE CHARACTERS WITH DATA STRUCTURE

// http://www.geeksforgeeks.org/determine-string-unique-characters/

class Solution {
  public boolean checker(String str){
    // if string is greater than 265, some characters must have been repeated
    if(str.length() > 265) return false;
    // if string is just one character
    if(str.length() < 2) return true;

    // make boolean array of characters
    boolean[] arr = new boolean[265];
    Arrays.fill(arr, false); // make every index false

    // traverse through array
    for(int i = 0; i < str.length(); i++){
     // int value of the char per ASCII
      int val = (int) str.charAt(i);

      // set true at the index equal to the int value of the char
      if(arr[val] == false)
        arr[val] = true;
      else
        return false;
    }
    // string has all unique characters
    return true;
  }
  public static void main(String[] args) {
    Solution obj = new Solution();
    String input = "b";

    if(obj.checker(input))
      System.out.println("is unique");
    else
      System.out.println("is not unique");
  }
}
