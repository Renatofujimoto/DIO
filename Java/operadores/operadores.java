package variaveis;

public class operadores {
    public static void main(String[] args){
        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmeticos");
        aritmeticos();
        System.out.println("Atribuicao");
        atribuicao();
        System.out.println("Precedencia");
        precedencia();
    }

    private static void prePos(){
        int k = 10;

        int i = ++k;
        int j = --k;
        int x = k;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);
    }

    private static void aritmeticos(){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;


        System.out.println("a+b: " + r1);
        System.out.println("c-a: " + r2);
        System.out.println("d*b: " + r3);
        System.out.println("e/a: " + r4);
        System.out.println("c%b: " + r5);
    }

    private static void atribuicao(){
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        double d = 3.5f;


        System.out.println("d: " + d);

        i += 5;
        j -= 3;
        d /= 2.7d;
        l *= 3;
        k %= 2;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

        i = k = j;

        System.out.println("k: " + k);
        System.out.println("i: " + i);
    }

    private static  void precedencia(){
        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k;
        System.out.println("i++ + --j * k: " + a);
        System.out.println("i: " + i);

        int b = k / --i % 3 + 1;// 30 / 10 % 3 + 1 = 1
        System.out.println("k / --i % 3+1: " + b);
        System.out.println("i: " + i);

        int c = 2;
        c *= i += 5; //c = 2*i; i = i +5 => c = 2 * i; i= 10 + 5; => c= 2*15; => c=30

        System.out.println("c *= i += 5 " + c);

    }
}
