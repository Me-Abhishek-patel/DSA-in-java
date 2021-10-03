public class BitProblems {

    //to count set bits in an integer
    //Brian kerningam's algorithm
    public int countSetBits(int num) {
        int res = 0;//Intialising the value of res
        while (num > 0) {
            num = (num & (num - 1));
            res++;//Incrementing the value of res
        }
        return res;//returning the value of res
    }

    //to check if a given no. is power of 2 or not
    //use of brian kerningam
    boolean isPow2(int num) {
        if (num == 0)
            return false;
        return ((num & (num - 1)) == 0);
    }

    //to find the only odd occuring number
    //by using xor ^
    int findOddOccuring(int arr[]) {

        int res = 0;
        for (int i = 0; i < arr.length; i++)
            res = res ^ arr[i];

        return res;//returning the value of res
    }

    //to find missing number in n natural numbers
    int missingNum(int arr[]) {
        int n = 0;
        int i = 0;//initializing the value of i
        while (n <= arr.length + 1) {
            i = i ^ n;
            n++;
        }
        for (int j = 0; j < arr.length; j++) {
            i = i ^ arr[j];
        }
        return i;
    }


}
