package algorithmn;

public class PowerSum {

    static int res = 0;
    static int checkRecursive(int num, int x, int k, int n)
    {
        if (x == 0)
            res++;

        int r = (int)Math.floor(Math.pow(num, 1.0 / n));

        for (int i = k + 1; i <= r; i++) {
            int a = x - (int)Math.pow(i, n);
            if (a >= 0)
                checkRecursive(num,
                        x - (int)Math.pow(i, n), i, n);
        }
        return res;
    }

    // Wrapper over checkRecursive()
    static int check(int x, int n)
    {
        return checkRecursive(x, x, 0, n);
    }

    public static void main(String[] args)
    {
        System.out.println(check(100, 2));
    }
}


