//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.math.BigInteger;
//
//
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.BitSet;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.NavigableSet;
//import java.util.PriorityQueue;
//import java.util.Random;
//import java.util.Scanner;
//import java.util.SortedSet;
//import java.util.StringTokenizer;
//import java.util.TreeSet;
//
//
//
//public final class HE_2017_MayCircuits_Spanning{
//
//    static boolean verb=true;
//    static void log(Object X){if (verb) System.err.println(X);}
//    static void log(Object[] X){if (verb) {for (Object U:X) System.err.print(U+" ");System.err.println("");}}
//    static void log(int[] X){if (verb) {for (int U:X) System.err.print(U+" ");System.err.println("");}}
//    static void log(long[] X){if (verb) {for (long U:X) System.err.print(U+" ");System.err.println("");}}
//    static void logWln(Object X){if (verb) System.err.print(X);}
//    static void info(Object o){	System.out.println(o);}
//    static void output(Object o){outputWln(""+o+"\n");	}
//    static void outputWln(Object o){try {out.write(""+ o);} catch (Exception e) {}}
//
//
//    static InputReader reader;
//    static BufferedWriter out;
//
//    static void doGauss(long[][] mat,long mod){
//
//        // matrix is nx(n+1)
//        int n=mat.length;
//        boolean[] used=new boolean[n];
//        // adat to take care
//        for (int e=0;e<n;e++){
//            loop:for (int i=0;i<n;i++){
//                if (!used[i] && mat[i][i]!=0){
//                    //log("picking i:"+i);
//                    long inv=powerMod(mat[i][i],mod-2,mod);
//                    for (int j=0;j<n+1;j++){
//                        mat[i][j]*=inv;
//                        if (mat[i][j]>=mod)
//                            mat[i][j]%=mod;
//                    }
//                    for (int u=0;u<n;u++){
//                        if (u!=i){
//                            long fact=mat[u][i];
//
//
//
//                            for (int j=0;j<n+1;j++){
//                                long nv=fact*mat[i][j];
//                                if (nv>=mod)
//                                    nv%=mod;
//                                mat[u][j]=(mat[u][j]+mod-nv);
//                                if (mat[u][j]>=mod)
//                                    mat[u][j]-=mod;
//                                //mat[u][j]-=mat[u][i]*x*
//                            }
//                        }
//                    }
//                    //for (int f=0;f<n;f++)
//                    //	log(mat[f]);
//                    //log("---------------");
//                    used[i]=true;
//                    break loop;
//                }
//            }
//        }
//        //for (int i=0;i<n;i++)
//        //	log(mat[i]);
//
//    }
//
//
//    static long powerMod(long b,long e,long m){
//        long x=1;
//        while (e>0) {
//            if (e%2==1)
//                x=(b*x)%m;
//            b=(b*b)%m;
//            e=e/2;
//        }
//        return x;
//    }
//
//    static long detLUDecomposition (long[][] A,long MOD) {
//
//        // Use a "left-looking", dot-product, Crout/Doolittle algorithm.
//
//
//        int[] piv;
//        long[][] LU;
//
//        int N=A.length;
//        LU = new long[N][N];
//        for (int i=0;i<N;i++)
//            System.arraycopy(A[i],0,LU[i],0,N);
//        int m = N;
//        int n = N;
//        piv = new int[m];
//        for (int i = 0; i < m; i++) {
//            piv[i] = i;
//        }
//        long pivsign = 1;
//        long[] LUrowi;
//        long[] LUcolj = new long[m];
//
//        // Outer loop.
//
//        for (int j = 0; j < n; j++) {
//
//            // Make a copy of the j-th column to localize references.
//
//            for (int i = 0; i < m; i++) {
//                LUcolj[i] = LU[i][j];
//            }
//
//            // Apply previous transformations.
//
//            for (int i = 0; i < m; i++) {
//                LUrowi = LU[i];
//
//                // Most of the time is spent in the following dot product.
//
//                int kmax = Math.min(i,j);
//                long s=0;
//                for (int k = 0; k < kmax; k++) {
//                    s += LUrowi[k]*LUcolj[k];
//                    if (s>=MOD)
//                        s%=MOD;
//                }
//
//                LUrowi[j] = LUcolj[i] -= s;
//                LUrowi[j]%=MOD;
//                if (LUrowi[j]<0)
//                    LUrowi[j]+=MOD;
//                LUcolj[i]%=MOD;
//                if (LUcolj[i]<0)
//                    LUcolj[i]+=MOD;
//
//            }
//
//            // Find pivot and exchange if necessary.
//
//            int p = j;
//            for (int i = j+1; i < m; i++) {
//                if (LUcolj[i] > LUcolj[p]) {
//                    p = i;
//                }
//            }
//            if (p != j) {
//                for (int k = 0; k < n; k++) {
//                    long t = LU[p][k]; LU[p][k] = LU[j][k]; LU[j][k] = t;
//                }
//                int k = piv[p]; piv[p] = piv[j]; piv[j] = k;
//                pivsign = MOD-pivsign;
//            }
//
//            // Compute multipliers.
//
//            if (j < m & LU[j][j] != 0.0) {
//                for (int i = j+1; i < m; i++) {
//                    LU[i][j]*= powerMod(LU[j][j],MOD-2,MOD);
//                    if (LU[i][j]>=MOD)
//                        LU[i][j]%=MOD;
//                }
//            }
//        }
//        long res=1;
//        for (int i=0;i<N;i++){
//            res*=LU[i][i];
//            res%=MOD;
//            if (res<0)
//                res+=MOD;
//
//        }
//        res*=pivsign;
//        res%=MOD;
//        return res;
//
//    }
//
//
//    static void test(){
//
//        long start=System.currentTimeMillis();
//        int NTESTS=100;
//        long sum=0;
//        for (int t=0;t<NTESTS;t++){
//            int n=100;
//            long[][] A=new long[n][n];
//            Random r=new Random();
//            for (int i=0;i<n;i++)
//                for (int j=0;j<n;j++)
//                    A[i][j]=r.nextInt(10000);
//            long d=detLUDecomposition(A,mod);
//            sum+=d;
//        }
//        long end=System.currentTimeMillis();
//        output((end-start)+" ms");
//    }
//
//    static long mod=1000000007;
//
//
//
//
//
//
//
//
//    static void process() throws Exception {
//
//        //test();
//
//        out = new BufferedWriter(new OutputStreamWriter(System.out));
//        reader=new InputReader(System.in);
//
//        int n=reader.readInt();
//        int[][][] ref=new int[2][n][n];
//
//
//        for (int e=0;e<2;e++)
//            for (int i=0;i<n;i++)
//                for (int j=0;j<n;j++){
//                    ref[e][i][j]+=mod-reader.readInt();
//                    while (ref[e][i][j]>=mod)
//                        ref[e][i][j]-=mod;
//                    if (i!=j) {
//                        ref[e][i][i]+=mod-ref[e][i][j];
//                        while (ref[e][i][i]>=mod)
//                            ref[e][i][i]-=mod;
//                    }
//
//                }
//
//    		/*
//
//    		for (int e=0;e<2;e++){
//    			for (int i=0;i<n;i++)
//    				log(ref[e][i]);
//    			log("=============");
//    		}
//
//
//    		for (int i=0;i<n;i++){
//    			for (int j=0;j<n;j++){
//    				int u=ref[0][i][j];
//    				int v=ref[1][i][j];
//    				String U="";
//    				String V="";
//    				if (u!=0) {
//    					U+=u;
//    					U+="*x";
//    				}
//    				if (v!=0) {
//    					V+=v;
//    					if (v>0)
//    						V="+"+V;
//    				}
//    				outputWln(U+" "+V+"  ");
//    				if (u==0 && v==0)
//    					outputWln("0  ");
//    			}
//    			output("");
//    		}
//    	*/
//
//        long[] d=new long[n];
//        for (int a=0;a<n;a++){
//            long[][] mat=new long[n-1][n-1];
//            for (int i=0;i+1<n;i++)
//                for (int j=0;j+1<n;j++) {
//                    mat[i][j]=ref[0][i+1][j+1]+ref[1][i+1][j+1]*a;
//                    if (mat[i][j]>=mod)
//                        mat[i][j]%=mod;
//
//                }
//            d[a]=detLUDecomposition(mat,mod);
//        }
//
//        long[][] raoul=new long[n][n+1];
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++)
//                raoul[i][j]=powerMod(i,j,mod);
//            raoul[i][n]=d[i];
//        }
//        //for (int i=0;i<n;i++)
//        //	log(raoul[i]);
//        //log("=============");
//        doGauss(raoul,mod);
//
//        for (int i=0;i<n;i++){
//            outputWln(raoul[i][n]+" ");
//        }
//        output("");
//
//        try {
//            out.close();
//        }
//        catch (Exception e){}
//
//
//
//
//    }
//
//
//
//
//    public static void main(String[] args) throws Exception {
//        process();
//
//    }
//
//    static final class InputReader {
//        private final InputStream stream;
//        private final byte[] buf = new byte[1024];
//        private int curChar;
//        private int numChars;
//
//        public InputReader(InputStream stream) {
//            this.stream = stream;
//        }
//
//        private int read() throws IOException {
//            if (curChar >= numChars) {
//                curChar = 0;
//                numChars = stream.read(buf);
//                if (numChars <= 0) {
//                    return -1;
//                }
//            }
//            return buf[curChar++];
//        }
//
//
//        public final String readString() throws IOException {
//            int c = read();
//            while (isSpaceChar(c)) {
//                c = read();
//            }
//            StringBuilder res=new StringBuilder();
//            do {
//                res.append((char)c);
//                c = read();
//            } while (!isSpaceChar(c));
//            return res.toString();
//        }
//
//        public final int readInt() throws IOException {
//            int c = read();
//            boolean neg=false;
//            while (isSpaceChar(c)) {
//                c = read();
//            }
//            char d=(char)c;
//            //log("d:"+d);
//            if (d=='-') {
//                neg=true;
//                c = read();
//            }
//            int res = 0;
//            do {
//                res *= 10;
//                res += c - '0';
//                c = read();
//            } while (!isSpaceChar(c));
//            //log("res:"+res);
//            if (neg)
//                return -res;
//            return res;
//
//        }
//
//        public final long readLong() throws IOException {
//            int c = read();
//            boolean neg=false;
//            while (isSpaceChar(c)) {
//                c = read();
//            }
//            char d=(char)c;
//            //log("d:"+d);
//            if (d=='-') {
//                neg=true;
//                c = read();
//            }
//            long res = 0;
//            do {
//                res *= 10;
//                res += c - '0';
//                c = read();
//            } while (!isSpaceChar(c));
//            //log("res:"+res);
//            if (neg)
//                return -res;
//            return res;
//
//        }
//
//
//
//
//        private boolean isSpaceChar(int c) {
//            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
//        }
//    }
//
//
//}
//
//
//    /*
//
//    3
//    0 2 1
//    2 0 0
//    1 0 0
//
//    0 0 1
//    0 0 3
//    1 3 0
//
//    2 11 32
//
//
//
//
//     */