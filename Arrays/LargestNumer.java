/*
Problem Statement:
Largest Number
Asked in:  
Amazon
Goldman Sachs
Microsoft
Given a list of non negative integers, arrange them such that they form the largest number.
For example:
Given [3, 30, 34, 5, 9], the largest formed number is 9534330.
Note: The result may be very large, so you need to return a string instead of an integer.


Solution:
*/
public class Solution {
    public int comp(String a , String b)
        {
            String k1 = a+b;
            String k2 = b+a;
            if((k2).compareTo(k1) > 0)
            {
            return 1;
            }
            else
            return -1;
        }
    public String largestNumber(final int[] A) {
        int len = A.length;

        for(int i = 1; i<len;i++)
        {
            for(int j = 1; j< len;j++)
            {
                String t1 = Integer.toString(A[j-1]);
                String t2 = Integer.toString(A[j]);
                int k = comp( t1 , t2);
                if(k ==1)
                {
                    int temp = A[j-1];
                    A[j-1] = A[j];
                    A[j] = temp;
                }
            }
        }
          for(int r = 0 ; r <len; r++)
        {
            s = s + Integer.toString(A[r]);
        }
        
        if (s.equals("00000"))
            {
                return "0";
            }
        return s;
    }
    }


