package com.company;

public class Main {

    public static void main(String[] args) {
        int []a = {16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        float[] x = new float[11]; // массив которых должен быть float
        double[][] c = new double[11][11]; // двумерный массив который нужно вывести в матрицу 11x11


        for (int i = 0; i<11; i++){
            x[i] = -14.0f + (float)(Math.random()*(12.0+14.0)); // рандом для x[i] от -14 до 11
        }


        for (int i = 0; i<11; i++){
            for (int j = 0; j<11; j++){
                switch(a[i]) {
                    case 8:
                        c[i][j] = Math.atan(Math.pow((1 / Math.pow(Math.E, Math.abs(x[i]))), 2)); // формула если a[i] = 8
                        break;
                    case 6:
                    case 9:
                    case 11:
                    case 12:
                    case 15:
                        c[i][j] = Math.pow((Math.pow(x[i], x[i]) / 2 - (1 / 3)) / Math.PI, 4 / x[i] * (Math.pow(Math.E, x[i]) - 1)); // формула если a[i] = 6,9,11,12,15
                        break;
                    default:
                        c[i][j] = Math.cbrt(Math.pow(Math.atan(Math.sin(x[i])),2)); //формула для остальных a[i]
                        break;
                }
            }
        }
        for (int i = 0; i<11; i++) {
            for (int j = 0; j < 11; j++) {
                if (Double.isNaN(c[i][j])) {
                    System.out.print(" Str1 ");
                } else {
                    System.out.printf(" " + "%6.3f", c[i][j]); }
            }
            System.out.println();
        }


        }
    }

