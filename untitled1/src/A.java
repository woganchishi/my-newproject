import java.util.Scanner;

public class A {
    public abstract static class l{

    }
    public static class k{
        public int []ff=new int[5];
        public void fz(int l[]){
            for(int u=0;u<5;u++){
                ff[u]=l[u];
            }
        }
    }
    public static class hh extends k{
        public void fz(int l[]){
            System.out.println("RNMD");
        }
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        k aaa=new k();
        hh u=new hh();
        int[] g = new int[5];
        System.out.println("请输入五个数");
        for (int gg = 0; gg < 5; gg++) {
            g[gg]=a.nextInt();
        }
        aaa.fz(g);
        for(int pp=0;pp<aaa.ff.length;pp++){
            System.out.println(aaa.ff[pp]);
        }
        u.fz(g);


    }
}

