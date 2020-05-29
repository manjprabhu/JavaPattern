package com.btk.javapattern;

public class CharPattern {

    public CharPattern() {
        alphabetPyramid();
    }

    private void alphabetPyramid() {
//        A
//        B B
//        C C C
//        D D D D
//        E E E E E

        int n =5;

        for(int i=0;i<n;i++) {

            for(int j=0;j<=i;j++) {
                if(i == 0)
                    System.out.print("A");
                if(i == 1)
                    System.out.print("B");
                if(i == 2)
                    System.out.print("C");
                if(i == 3)
                    System.out.print("D");
                if(i == 4)
                    System.out.print("E");
            }
            System.out.println();

        }

    }
}
