package recursao;

public final class Soma {
    private static int soma (int A, int D){
        int Aux = A;

        if ((!Negativo.isNegativo(A)) && (Negativo.isNegativo(D))){
            A = D;
            D = Aux;
        }

        return A == 0 ? A : D == 0 ? D : soma(A + 1, D - 1);
    }

    public static void main(String[] args) {
        System.out.println(soma(3,-5));
        System.out.println(soma(-3,5));
        System.out.println(soma(3,5));
        System.out.println(soma(-3,-5));
    }
}