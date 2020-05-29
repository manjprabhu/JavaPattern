package com.btk.javapattern;

public class NumberPattern {

    public NumberPattern() {
//        numberPyramid();
        numberPyramind2();
    }

    private void numberPyramid() {
        int n =5;

        for(int i=1;i<=n;i++) {

            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }

            for(int k =i+1;k<=n;k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //Output as Below , here star(*) is just identify the spaces.
        //            1****
        //            12***
        //            123**
        //            1234*
        //            12345
    }

    private void numberPyramind2() {
        //Output as Below , here star(*) is just identify the spaces.
        //            1****
        //            22***
        //            333**
        //            4444*
        //            55555

        int n =5;
        for(int i =1;i<=n;i++) {

            for(int j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
