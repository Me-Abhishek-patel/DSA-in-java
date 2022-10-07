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
}
