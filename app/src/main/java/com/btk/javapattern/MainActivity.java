package com.btk.javapattern;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberPyramid();
        startPyramid();
        showPyramid2();
    }

    private void startPyramid() {
        //Pattern to show
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        int n =5;

        //outer loop to loop through the rows // 5 rows

        for(int i=0;i<n;i++) {

            //inner loop to loop though the columns
            //1st iteration i.e 1st row show only one * - i =0
            //2nd iteration show i.e 2nd row show 2 *
            //hence limit for "j" is till i
            for(int j =0;j<=i;j++) {
                System.out.print("*");
            }
            //to print the space , from i+1 position to last.
            for(int k=i+1;k<=n-1;k++) {
                System.out.print("-");
            }

            System.out.println();
        }

        //Output as Below , here hyphen(-) is just identify the spaces.
        //                *----
        //                **---
        //                ***--
        //                ****-
        //                *****
    }

    private void showPyramid2() {

        int n =5;

        //Pattern to show
        //      *
        //    * *
        //  * * *
       // * * * *
     // * * * * *


        for(int i=0;i<n;i++) {

           //to print the space, for identification i have printed "-"
            for(int k =0;k<n-i-1;k++) {
                System.out.print("-");
            }
            for(int j=n;j>n-i-1;j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Output as Below , here hyphen(-) is just identify the spaces.
        //        ----*
        //        ---**
        //        --***
        //        -****
        //        *****
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
}
