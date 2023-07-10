import java.util.*;
public class String1 {
    public String toString(){
        return"Abc";

    }
    public static void main(String args[]){
     //   String s1 = "Hello";
     //   String s3 = "Hello";
       // String s2  = new String("Hello");
      //  String s4  = new String("Hello");
     //   System.out.println((s1 == s2)); // false because they are two different
       // System.out.println(s1==s3);//true becuse they both are same 
      //  System.out.println(s2==s4);// false if we strore thae value with the helpof ndew keyword give different value
           String s1 = "Hello";
           String s2 = "Abc";
           String s3= s1+s2;
           String s4= "HelloAbc";
           System.out.println(s3==s4);

      
    }
    
}

// === add 