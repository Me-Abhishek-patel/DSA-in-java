public class BitWise {
    public int divideBy2(int x) {  //right shift bitwise operator
        return x >> 1;  //right shift by one position

    }

    public int multiplyBy2(int x) {  //left shift bitwise operator
        return x << 1; //left shift by one position 
    }

    public int log2(int x) {
        int res = 0;
        while ((x >>= 1) != 0)
            res++;

        return res;
    }

    //to check a number is power of 2
    boolean isPow2(int n) {
        return (n != 0 && ((n & (n - 1)) == 0));
    }

    //count number of set bits in a number
    int countBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) count++;
            n = n >> 1;
        }
        return count;
    }

}
