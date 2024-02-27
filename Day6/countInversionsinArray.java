public class Solution {

    public static int merge(int[] a, int s, int mid, int e) {
        int n1 = mid - s + 1;
        int n2 = e - mid;
        int k = s;
        int cnt = 0;
        int[] b1 = new int[n1];
        int[] b2 = new int[n2];
        for (int i = 0; i < n1; i++)
            b1[i] = a[s + i];
        for (int j = 0; j < n2; j++)
            b2[j] = a[mid + j + 1];

        int i = 0, j = 0;

       
        while (i < n1 && j < n2) {
            if (b1[i] <= b2[j]) {
                a[k++] = b1[i++];
            } else {
                cnt += n1-i;
                a[k++] = b2[j++];
            }
        }

    
        while (i < n1)
            a[k++] = b1[i++];
        while (j < n2)
            a[k++] = b2[j++];

        return cnt;
    }

    public static int mergeSort(int[] a, int s, int e) {
        int cnt = 0;
        if(s>=e)return cnt;
            int mid = s + (e - s) / 2;
            cnt += mergeSort(a, s, mid);
            cnt += mergeSort(a, mid + 1, e);
            cnt += merge(a, s, mid, e);
        
        return cnt;
    }
    public static int numberOfInversions(int[] a, int n) {
        return mergeSort(a, 0, n - 1);
    }
}
