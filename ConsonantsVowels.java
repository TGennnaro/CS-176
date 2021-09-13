import java.util.Scanner;

public class ConsonantsVowels
{
    void test()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = in.nextLine();
        str = str.toLowerCase();
        
        // Count consonants & vowels
        int cCount = 0;
        int vCount = 0;
        int pCount = 0;
        int dCount = 0;
        int sCount = 0;
        for (int i = 0; i < str.length(); i++)
        {
            // take current character of str at index i
            String current = str.substring(i, i+1);
            
            // update cCount or vCount
            if (isVowel(current)){
                vCount++;
            } else if (isConsonant(current)){
                cCount++;
            } else if (isDigit(current)){
                dCount++;
            } else if (isPunc(current)){
                pCount++;
            } else if (current.equals(" ")){
                sCount++;
            }
        } // end for
        
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
        System.out.println("Number of digits: " + dCount);
        System.out.println("Number of punctuations: " + pCount);
        System.out.println("Number of spaces: " + sCount);
    }
    
    boolean isVowel(String str){
        String vowels = "aeiou";
        for (int i=0;i<vowels.length();i++){
            if (str.equals(vowels.split("")[i])){
                return true;
            }
        }
        return false;
    }
    
    boolean isConsonant(String str){
        String consonants = "bcdfghjklmnpqrstvwxyz";
        for (int i=0;i<consonants.length();i++){
            if (str.equals(consonants.split("")[i])){
                return true;
            }
        }
        return false;
    }
    
    boolean isDigit(String str){
        String digits = "0123456789";
        for (int i=0;i<digits.length();i++){
            if (str.equals(digits.split("")[i])){
                return true;
            }
        }
        return false;
    }
    
    boolean isPunc(String str){
        String puncs = ".,-!'\"?";
        for (int i=0;i<puncs.length();i++){
            if (str.equals(puncs.split("")[i])){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        ConsonantsVowels obj = new ConsonantsVowels();
        obj.test();
    }
}
