public class Solution {
    static int SecondLargest(int n, int[] a)
    {
        int largest=a[0];
        int slargest=-1;
        for(int i=1;i<n;i++)
        {
            if(a[i]>largest)
            {
                slargest=largest;
                largest=a[i];
            }
            else if(a[i]<largest && slargest<a[i])
            {
                slargest=a[i];
            }
        }
        return slargest;
    }

    static int SecondSmallest(int n,int[] a)
    {
        int smallest=a[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            if(a[i]<smallest)
            {
                ssmallest=smallest;
                smallest=a[i];
            }
            else if(a[i]>smallest && ssmallest>a[i])
            {
                ssmallest=a[i];
            }
        }
        return ssmallest;
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int slargest=SecondLargest(n,a);
        int ssmallest=SecondSmallest(n,a);
        return new int[]{slargest, ssmallest};
    }
}
