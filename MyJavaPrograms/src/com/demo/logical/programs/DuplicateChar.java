package com.demo.logical.programs;
public class DuplicateChar {
 public static void main(String argu[]) {

  String str = "Reddisekhar";
  int count = 0;
  char[] input = str.toCharArray();
  System.out.println("Duplicate Characters are:");
  for (int i = 0; i < str.length(); i++) {
   for (int j = i + 1; j < str.length(); j++) {
    if (input[i] == input[j]) {
     System.out.println(input[j]);
    count++;
     break;
    }
   }
  }
 }
}
//e d