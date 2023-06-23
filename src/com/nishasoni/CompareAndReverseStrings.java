package com.nishasoni;

public class CompareAndReverseStrings {
    public static void main(String[] args) {
        String s1 = "Nisha";
        String s2 = "Soni";
        String s3 = "Java";
        String s4 = "Java";

        System.out.println("Comparing "+s1+" and "+s2+": "+s1.equals(s2));
        System.out.println("Comparing "+s3+" and "+s4+": "+s3.equals(s4));
        System.out.println("Comparing "+s1+" and "+s4+": "+s1.equals(s4));

        System.out.println("==================================================");

        StringBuffer s5 = new StringBuffer();

        s5.append(s1);
        s5=s5.reverse();

        System.out.println("The Reverse String is : "+s5);
    }
}
