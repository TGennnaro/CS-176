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
        int oCount = 0;
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
            } else {
                oCount++;
            }
        } // end for
        
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
        System.out.println("Number of digits: " + dCount);
        System.out.println("Number of punctuations: " + pCount);
        System.out.println("Number of spaces: " + sCount);
        System.out.println("Number of other characters: " + oCount);
    }
    
    boolean isVowel(String str){
        String vowels = "aeiou";
        if (vowels.contains(str)){return true;}
        return false;
    }
    
    boolean isConsonant(String str){
        String consonants = "bcdfghjklmnpqrstvwxyz";
        if (consonants.contains(str)){return true;}
        return false;
    }
    
    boolean isDigit(String str){
        String digits = "0123456789";
        if (digits.contains(str)){return true;}
        return false;
    }
    
    boolean isPunc(String str){
        String puncs = ".,-!'\"?";
        if (puncs.contains(str)){return true;}
        return false;
    }
    
    public static void main(String[] args)
    {
        ConsonantsVowels obj = new ConsonantsVowels();
        obj.test();
    }
}
