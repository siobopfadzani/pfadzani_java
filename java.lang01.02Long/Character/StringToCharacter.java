package Character;

public class StringToCharacter {
    public static void main(String[] args) {
        int i = 0;
         
        String value = "hello";
        
        for(;i <= 4;i++)
        {
            char CharValue = value.charAt(i);
            Character Charconverted = CharValue;
            System.out.print(Charconverted);

        }
            
    }
    
}
