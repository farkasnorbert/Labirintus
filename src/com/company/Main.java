package com.company;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;






public class Main {


    private static int SIZE;
    private static int cmp = 0;


    public static void main(String[] args) {
	// write your code here



        Scanner in = new Scanner(System.in);
        SIZE = in.nextInt();


        int[][] maze = generate_maze(SIZE);
        int[][] solution = new int[SIZE][SIZE];
        System.out.print("\n Current Maze:\n");
        printMaze(maze);
        System.out.print("\n\n");

        if (solveMaze(0,0,maze,solution))
        {
            System.out.print("\nSolution:\n");
            printSolution(solution);
            System.out.print("Total number of comparision: "+cmp);
        }
        else
        {
            System.out.println("No solution\n");
            System.out.print("Total number of comparision: "+cmp);
        }

        System.out.print("\nSize: "+SIZE+"\n");



    }






    private static int[][] generate_maze(int SIZE) {
        int[][] maze = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                int randomNum = ThreadLocalRandom.current().nextInt(1, 51 + 1);
                if (randomNum < 40) {
                    maze[i][j] = 0;
                } else {
                    maze[i][j] = 1;
                }

            }
        }
        return maze;
    }

    private static void printMaze(int[][] maze)
    {
        for(int i=0;i<SIZE;i++)
        {
            for(int j=0;j<SIZE;j++)
            {
                System.out.print(maze[i][j]+"\t");
            }
            System.out.print("\n\n");


        }


    }

    private static void printSolution(int[][] solution)
    {
        for(int i=0;i<SIZE;i++)
        {
            for(int j=0;j<SIZE;j++)
            {
                System.out.print(solution[i][j]+"\t");
            }
            System.out.print("\n\n");

        }

    }

    private static boolean solveMaze(int r, int c, int[][] maze, int[][] solution)
    {
        //utolso cella elerese
        if((r==SIZE-1) && (c==SIZE-1))
        {
            solution[r][c] = 1;
            return true;
        }
        cmp++;

        if(r>=0 && c>=0 && r<SIZE && c<SIZE && solution[r][c] == 0 && maze[r][c] == 0)
        {
            cmp++;
            solution[r][c] = 1;
            //lefele lepes
            if(solveMaze(r+1, c,maze,solution))
            {
                cmp++;
                return true;
            }

            //jobbra lepes
            if(solveMaze(r, c+1,maze,solution))
            {
                cmp++;
                return true;
            }
            //felfele lepes
            if(solveMaze(r-1, c,maze,solution))
            {
                cmp++;
                return true;
            }
            //balra lepes
            if(solveMaze(r, c-1,maze,solution))
            {
                cmp++;
                return true;
            }
            //backtracking
            solution[r][c] = 0;
            return false;
        }
        return false;

    }
}

