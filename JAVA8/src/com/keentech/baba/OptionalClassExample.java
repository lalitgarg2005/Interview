package com.keentech.baba;

import java.util.Optional;  

/**
 * Java Optional :
 * It is a public final class and used to deal with NullPointerException in Java application.  
 * It provides methods which are used to check the presence of value for particular variable.
 *
 */
class OptionalExample {  
    public static void main(String[] args) {  
        String[] str = new String[10];  
        String lowercaseString = str[5].toLowerCase();  
        System.out.print(lowercaseString);  //NullPointerException
    }  
}  

public class OptionalClassExample {  
    public static void main(String[] args) {  
        String[] str = new String[10];  
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        if(checkNull.isPresent()){  // check for value is present or not  
            String lowercaseString = str[5].toLowerCase();  
            System.out.print(lowercaseString);  
        }else  
            System.out.println("string value is not present");  
    }  
}  
