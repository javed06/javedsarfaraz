package javaaasignment.src.String;

import java.util.Scanner;

public class String_assignment1 {
    public static void main(String[] args) {
    // 1) Write a simple program to take input from user?
//   Scanner sc=new Scanner(System.in);
//    String str=sc.nextLine();
//        System.out.println("the user input is " + str);

     // 2) How do you concatinate two strings in java? Give example
 //> concatination is done by concat method or + operator
 // example:
//        String c1="javed";
//        String c2="sarfaraz";
//        System.out.println(c1.concat(c2));
//        System.out.println(c1+c2);

     // 3) How do you find lengyh of a string in java Explain with a example?
 // >  lengkth of a string is find out by lengyh lnbuild method
// examp;e:
//     String l1="javed";
//        System.out.println(l1.length());

    //  4)  How do you compare two strings in java ?
// >   we can compare two strings in java by == or equals method
//      String c1="javed";
//      String c2="javed";
//        System.out.println(c1==c2); // compares obj ref
//        System.out.println(c1.equals(c2));  // compares content of the object

    //  5) Write a program to find tho length of the string "refrigerator"?
//>
//       String s1="refrigerator";
//        System.out.println(s1.length());

    //   6) write a program to check the letter 'e' present in the word 'umbrella'?
//>
//        String word="umbrella";
//        System.out.println(word.contains("e"));

    //   7) Write a program to delete all consonants from the string "Hello have a good day".
//>
      String s0="Hello have a good day";
      for (int i=0;i<s0.length();i++){
          if (s0.charAt(i)=='a'|| s0.charAt(i)=='A' || s0.charAt(i)=='e' || s0.charAt(i)=='E' ||
                  s0.charAt(i)=='i'|| s0.charAt(i)=='I'|| s0.charAt(i)=='o'|| s0.charAt(i)=='O'||
                  s0.charAt(i)=='u'|| s0.charAt(i)=='U')
          {
          s0.charAt(i);
          continue;
          }else {
              s0.charAt(i);
          }
          System.out.println(s0);

      }


    }
}
