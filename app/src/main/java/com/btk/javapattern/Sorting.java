package com.btk.javapattern;

import android.util.Log;

public class Sorting {

    public Sorting() {
    }

    private void selectionSort() {

        int a[] =  {12,65,21,23,76,14,27,43,98,11};

        //outer loop to move the boundry of sorted array
        for(int i=0;i<a.length;i++) {

            int min = i;

            //inner loop to find the minimum element
            for(int j=i+1;j<a.length;j++) {
                if(a[j] < a[min]) {
                    min = j;

                    //swap the current element
                    int temp = a[min];
                    a[min] = a[i];
                    a[i] = temp;
                }
            }
        }
        for(int x : a) {
            Log.v("===",""+x);
        }
    }

    private void bubblesort2() {

        int[] a = {10,12,9,4,8};

        int n = a.length;

        for(int i=0;i<n;i++) {

            for(int j =0;j<n-i-1;j++) {
                int temp;
                if(a[j] > a[j+1]) {

                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for(int x : a) {
            Log.v("===",""+x);
        }
    }


    private void bubbleSort() {
        int a[] =  {12,43,65,21,23,76,14,27,43,98,11};

        for(int i=0;i<a.length;i++) {

            for (int j = 1; j < a.length - i; j++) {

                int temp;

                if (a[j-1] > a[j]) {
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int x : a) {
            Log.v("===",""+x);
        }
    }
}
