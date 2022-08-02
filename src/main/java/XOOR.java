import java.util.*;
class XOOR{

    // Lower bound
    static int lower_bound(int[] a, int low,
                           int high, int element)
    {
        while(low < high)
        {
            int middle = low + (high - low) / 2;
            if(element > a[middle])
                low = middle + 1;
            else
                high = middle;
        }
        return low;
    }

    // Function to calculate the
// XOR of the sum of every pair
    static int XorSum(int A[],
                      int B[], int N)
    {
        // Stores the maximum bit
        final int maxBit = 29;

        int ans = 0;

        // Look for all the k-th bit
        for (int k = 0; k < maxBit; k++)
        {
            // Stores the modulo of
            // elements B[] with (2^(k+1))
            int []C = new int[N];

            for (int i = 0; i < N; i++)
            {
                // Calculate modulo of
                // array B[] with (2^(k+1))
                C[i] = B[i] % (1 << (k + 1));
            }

            // Sort the array C[]
            Arrays.sort(C);

            // Stores the total number
            // whose k-th bit is set
            long count = 0;
            long l, r;

            for (int i = 0; i < N; i++)
            {
                // Calculate and store the modulo
                // of array A[] with (2^(k+1))
                int x = A[i] % (1 << (k + 1));

                // Lower bound to count
                // the number of elements
                // having k-th bit in
                // the range (2^k - x,
                // 2* 2^(k) - x)
                l = lower_bound(C, 0, N,
                        (1 << k) - x);

                r = lower_bound(C, 0, N,
                        (1 << k) *
                                2 - x);

                // Add total number i.e
                // (r - l) whose k-th bit is one
                count += (r - l);

                // Lower bound to count
                // the number of elements
                // having k-th bit in
                // range (3 * 2^k - x,
                // 4*2^(k) - x)
                l = lower_bound(C, 0, N,
                        (1 << k) *
                                3 - x);
                r = lower_bound(C, 0, N,
                        (1 << k) *
                                4 - x);

                count += (r - l);
            }

            // If count is even, Xor of
            // k-th bit becomes zero, no
            // need to add to the answer.
            // If count is odd, only then,
            // add to the final answer
            if ((count & 1) != 0)
                ans += (1 << k);
        }

// Return answer
        return ans;
    }

    // Driver code
    public static void main(String[] args)
    {
        int A[] = {4, 6, 0, 0, 3, 3};
        int B[] = {0, 5, 6, 5, 0, 3};
        int N = A.length;

        // Function call
        System.out.print(XorSum(A, B,
                N) + "\n");
    }
}