package app;

import java.util.Random;

public class Lesson_09_03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array2d = new int[4][4];
        System.out.println("Матриця 4х4:");

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = random.nextInt(50) + 1;
                System.out.print(array2d[i][j] + ",  ");
            }
            System.out.println();
        }
        int sumEvenRow = 0;
        int sumOddRow = 0;
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (i % 2 == 0) {
                    sumEvenRow += array2d[i][j];
                } else {
                    sumOddRow += array2d[i][j];
                }
            }
        }

        long multEvenCollumn = 1L;
        long multOddCollumn = 1L;
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (j % 2 == 0) {
                    multEvenCollumn *= array2d[i][j];
                } else {
                    multOddCollumn *= array2d[i][j];
                }

            }

        }

        System.out.println();
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + sumEvenRow);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sumOddRow);
        System.out.println("Добуток елементів у парних стовпцях (стовбець 0, 2): " + multEvenCollumn);
        System.out.println("Добуток елементів у непарних стовпцях (стовбець 1, 3): " + multOddCollumn);
        System.out.println();

        int sum1Diag = 0;
        int sum2Diag = 0;
        for (int i = 0; i < array2d.length; i++) {
            sum1Diag += array2d[i][i];
            sum2Diag += array2d[i][array2d.length - 1 - i];
        }


        boolean eqD = sum1Diag == sum2Diag;
        int mag = eqD ? sum1Diag : 0;
        for (int i = 0; i < array2d.length; i++) {
            int sumRows = 0;
            for (int j = 0; j < array2d.length; j++) {
                sumRows += array2d[i][j];
            }
            if (sumRows != mag) {
                eqD = false;
                break;
            }
        }
        for (int j = 0; j < array2d.length; j++) {
            int sumCols = 0;
            for (int i = 0; i < array2d.length; i++) {
                sumCols += array2d[i][j];
            }
            if (sumCols != mag) {
                eqD = false;
                break;
            }

        }
        if (!eqD) {
            System.out.println("Матриця не є магічним квадратом");

        } else {
            System.out.println("Матриця є магічним квадратом");
        }
    }
}
