/*
 * Program Name: PatternPrintThree
 * Problem Statement: Print a diamond or triangle pattern
 */
//patterns

public class PatternPrintThree {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j =0;j<=4;j++){
                if(j==0 || j==4||i==0||i==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}