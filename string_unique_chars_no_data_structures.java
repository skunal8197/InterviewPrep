import java.io.*;
import java.util.*;

// DETERMINE IF STRING HAS UNIQUE CHARACTERS WITHOUT DATA STRUCTURE

// http://www.geeksforgeeks.org/determine-string-unique-characters/

class Solution {
  public boolean checker(String str){
   // integer has 32 bits --> initialize all bits to 0
    int checker = 0;
    // iterate through the string
    for(int i = 0; i < str.length(); i++){
     // get value of each character with respect to a
      int index = str.charAt(i) - 'a';
      // set bit at that int value to 1 and use AND gate to compare
      if((checker & (index >> 1)) > 0)
        return false;

      // update checker to make bit 1 at that index
      checker = checker | (index >> 1);
    }
      return true;
  }
  public static void main(String[] args) {
    Solution obj = new Solution();
    String input = "street";

    if(obj.checker(input))
      System.out.println("is unique");
    else
      System.out.println("is not unique");
  }
}
