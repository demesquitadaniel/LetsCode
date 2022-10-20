public class Array {

    public static void main(String[] args) {

        int[] arrayInteiros = new int[3];

        arrayInteiros[0] = 3;
        arrayInteiros[1] = 5;
        arrayInteiros[2] = 9;

        System.out.println(arrayInteiros[0]);
        System.out.println(arrayInteiros[1]);
        System.out.println(arrayInteiros[2]);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        String[] arrayString = new String[2];

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        int[] arrayInteiros2 = {1,2,3,4,5,6};
        int[] arrayInteiros3 = new int[]{1,2,3};
        System.out.println(arrayInteiros2[2]);
        System.out.println(arrayInteiros2[0]);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        for(int i = 0; i < arrayInteiros2.length; i++) {
            System.out.println(arrayInteiros2[i]);
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        for(int inteiro : arrayInteiros2) {
            System.out.println(inteiro);
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        int[][] arrayMultidimensao = new int[2][2];
            System.out.println(arrayMultidimensao[0][0]); // 0

            arrayMultidimensao[0][0] = 3;
            arrayMultidimensao[0][1] = 5;
            arrayMultidimensao[1][0] = 27;
            arrayMultidimensao[1][1] = 99;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println(arrayMultidimensao[0][0]); // 3
        System.out.println(arrayMultidimensao[0][1]); // 5
        System.out.println(arrayMultidimensao[1][0]); // 27
        System.out.println(arrayMultidimensao[1][1]); // 99

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        for(int i = 0; i < arrayMultidimensao.length; i++) {
            for(int j = 0; j < arrayMultidimensao[i].length; j++) {
                System.out.print(arrayMultidimensao[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        int[][] matrizInteiros = new int[3][2];
        matrizInteiros[0][0] = 5;
        matrizInteiros[0][1] = 10;

        matrizInteiros[1][0] = 25;
        matrizInteiros[1][1] = 50;

        matrizInteiros[2][0] = 100;
        matrizInteiros[2][1] = 200;

        for(int i = 0; i < matrizInteiros.length; i++) {
            for(int j = 0; j < matrizInteiros[i].length; j++) {
                System.out.print(matrizInteiros[i][j] + " ");
            }
            System.out.println();

        }

    }

}
