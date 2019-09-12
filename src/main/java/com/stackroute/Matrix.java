package com.stackroute;
import java.util.*;


public class Matrix {
    private int Row;
    private int Col;
    private int[][] Matrix1;
    private int[][] Matrix2;

    public int[][] getMatrix1() { return Matrix1; }
    public void setMatrix1(int[][] matrix1) { Matrix1 = matrix1; }

    public int[][] getMatrix2() { return Matrix2; }
    public void setMatrix2(int[][] matrix2) { Matrix2 = matrix2; }

    public int getRow() { return Row; }
    public void setRow(int row) { Row = row; }

    public int getCol() { return Col; }
    public void setCol(int col) { Col = col;}

    public Matrix(int row, int col, int[][] matrix1, int[][] matrix2) {
        this.Row = row;
        this.Col = col;
        this.Matrix1=matrix1;
        this.Matrix2=matrix2;
    }


    public int[][] Addition() {


        return null;
    }
}