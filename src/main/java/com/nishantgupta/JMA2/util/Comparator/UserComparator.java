package com.nishantgupta.JMA2.util.Comparator;

import java.util.Comparator;

import com.nishantgupta.JMA2.Entity.User;

public class UserComparator {

    public static void main(String[] args) {
        //Comparator<User> comparator = Comparator.comparing(user -> countCharactersWithoutSpaces(user.getName()));
        
    }

  
    
    public static int countCharactersWithoutSpaces(String input) {
        // Use replaceAll to remove spaces, then get the length
    	
    	
        return input.replaceAll("\\s", "").length();
    }

 
    }


