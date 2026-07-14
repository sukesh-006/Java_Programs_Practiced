/*
 * Program Name: CharacterFrequency
 * Problem Statement: Find frequency of each character in a string
 */
//easier method
public class CharacterFrequency{
    public static void main (String[]args){
        String str = "clock";
        for(int i =0;i<str.length();i++){
            int count =0;
            for(int j =0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}