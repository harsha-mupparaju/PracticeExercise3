package com.stackroute;


public  class StudentMarks{
   private int numOfStudents;
   private int[] stuMarks;


    public StudentMarks(int numOfStudents,int[] stuMarks) {
        this.numOfStudents=numOfStudents;
        this.stuMarks=new int[numOfStudents];
        this.stuMarks = stuMarks;
    }


    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public int[] getStuMarks() {
        return stuMarks;
    }

    public void setStuMarks(int[] stuMarks) {
        this.stuMarks = stuMarks;
    }

    public String check(){



        return  null;
    }

}