package com.btk.javapattern;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

public class DailyPractice {

    private Object o = new Object();
    private ArrayList<Integer> arrayList = new ArrayList();
    int count = 1;
    int maxLimit = 100;

    public DailyPractice() {
        reverseNumber();
    }

    private void reverseNumber() {
        int n = 3821, reverse = 0;
        while(n!=0) {
            int r = n%10;
            reverse = reverse * 10 + r;
            n = n/10;
        }
        Log.v("===","Reverse:"+reverse);
    }



    private void numberpattern() {
        int n =5;

        for(int i=0;i<5;i++) {

            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }

            for(int k =i+1;k<n;k++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }


    private void producerConsumer() {

        Thread pThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count!=maxLimit) {
                    synchronized (o) {
                        if(arrayList.isEmpty()) {
                            count = count +1;
                            arrayList.add(count);
                            Log.v("===", "Pthred added the item :" + count);
                            o.notify();
                        } else {
                            try {
                                o.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }

            }
        });

        pThread.start();

        Thread cThread = new Thread(new Runnable() {
            @Override
            public void run() {

                while (count!=maxLimit) {
                    synchronized (o) {

                        if (!arrayList.isEmpty()) {
                            int i = arrayList.remove(0);
                            Log.v("===", "Consume the element:" + i);
                            o.notify();
                        } else {
                            try {
                                o.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                    }
                }
            }

        });

        cThread.start();
    }

    private void createThread() {
        final int maxLimit =100;

        final Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count != maxLimit) {
                    synchronized (o) {
                        if(count%2 ==0) {

                            Log.v("===","evenThread:"+count);
                            count = count+1;
                            o.notify();
                        } else {
                            try {
                                o.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }


                }


            }
        },"evenThread");

        evenThread.start();


        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {

                while (count!=maxLimit) {
                    synchronized (o) {
                        if(count%2!=0) {

                            Log.v("===","OddThread:"+count);
                            count = count +1;
                            o.notify();
                        } else {
                            try {
                                o.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }

            }
        },"oddThread");

        oddThread.start();
    }

    private void findallPrime() {
        int n1 =2, n2 =100;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i =n1;i<=n2;i++) {
            if(isPrimeNumber(i)) {
                list.add(i);
            }
        }

        for(int i : list) {
            Log.v("===","i:"+i);
        }
    }

    private boolean isPrimeNumber(int i) {

        boolean isPrime = false;

        for(int k =2;k<=i/2;k++) {
            if(i%k ==0) {
                isPrime = false;
                break;
            }
            else
               isPrime = true;
        }
        return  isPrime;
    }

    private void findMissingNumber() {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,13};

        int sum = (a[a.length-1] * (a[a.length-1] +1)) /2;

        int sum1 =0;
        for(int i=0;i<a.length;i++) {
            sum1 = sum1 + a[i];
        }

        Log.v("===","Missing number is:" +(sum-sum1));
    }

    private void countOccurence() {
        int a[] = {10,21,21,54,12,23,45,12};

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<a.length;i++) {

            int count =1;
            if(hashMap.containsKey(a[i])) {
                count  = hashMap.get(a[i]);
                count = count +1;
                hashMap.put(a[i],count);
            } else {
                hashMap.put(a[i],count);
            }
        }

        for(HashMap.Entry<Integer,Integer> entry : hashMap.entrySet()) {
            Log.v("===","value "+ entry.getKey()+ " occured:"+ entry.getValue() + " times");
        }

    }

    private void reverrsearray() {
        int a[] = {10,21,32,54,12,23,45,78};

        for(int i =0;i<a.length/2;i++) {

            int temp = a[i];

            a[i] = a[a.length-i-1];

            a[a.length-i-1] = temp;
        }

        for (int x : a) {
            Log.v("===",""+x);
        }
    }

    private void factorial() {
        int n =6, fact =1;

        for(int i =1;i<=n;i++) {
            fact = fact * i;
        }

        Log.v("===","Fact of " + n + " is:"+ fact);
    }

    private void fibonacciSeries() {
        int n =6;
        int s1 =0,s2=1,sum =0;

        for(int i=1;i<=n;i++) {
            Log.v("==="," "+s1);

            sum = s1 +s2;
            s1 = s2;
            s2 = sum;

        }
    }

    private void isPrime() {
        System.out.print( "is prime number:");
        int  n =7;

        boolean isPrime = false;

        for(int i =2;i<=n/2;i++) {

            if(n%i==0) {
                isPrime =false;
                break;
            } else {
                isPrime = true;
            }
        }
        if(isPrime)
            Log.v("===",n+ " is prime");
        else
            Log.v("===",n+ "is not prime number:");

    }
}
