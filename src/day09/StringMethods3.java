package day09;

public class StringMethods3 {

    ////toLowerCase()	      Converts a string to lower case letters	                        String
    //    //toUpperCase()	      Converts a string to upper case letters	                        String
    //    //trim()	              Removes whitespace from both ends of a string	                    String

    public static void main(String[] args) {
        String word="Aydin Baysoz";
        System.out.println(word.toLowerCase()); //aydin baysoz
        System.out.println(word.toUpperCase()); //AYDIN BAYSOZ

        String word2="aYDIN bAYSOZ";
                    //01234 6
        //PRINT ME full name at given format : Aydin BAYSOZ

        //Aydin
        //String firstName= word2.substring(0,1).toUpperCase() + word2.substring(1,5).toLowerCase();
        String firstName= word2.substring(0,1).toUpperCase().concat(word2.substring(1,5).toLowerCase());
                ////////                A                           + ydin

        System.out.println("First Name is :" +firstName);

        String lastName= word2.substring(6).toUpperCase();
        System.out.println("Last NAme is :"+lastName);

        String fullName=firstName.concat(" ").concat(lastName);
        System.out.println("Full Name is : "+ fullName);


        //    //trim()	              Removes whitespace from both ends of a string	                    String
        String str=" Aydin      Baysoz       123      ";
        System.out.println(str.trim()); //remove extra spaces from begignning and from end

        //please create a java logic which will count spaces inside of sentence

        System.out.println(str.replace(" ","")); //replace will remove all spaces
        System.out.println(str.replaceFirst(" ","")); //will only removed first spaces in the string

        str=str.replaceFirst(" ","");
        System.out.println(str);
        str=str.replaceFirst(" ","");
        System.out.println(str);

        //if you want to see library of the methods
        //windows hold on ctrl and move your mouse click on the method
        //mac     hold on command and move your mouse click on the method
    }
}

//Task 1 : String Methods
//Sentence =hello my name is hello worlD.     i am 25 years old. i am living in new yorK .       i have been in the IT industry for about 6 years.    i starteD as a manUal tesTer and now doing AutOMation for about 4 years.   i have experience in different DOmains: education, Energy, finance.i have Scrum Master and Oracle Java Programmer certificates.my main lanGuage is JAVA. i designed and deveLoped many automation test scripts by using BDD framework


//first create one string and copy pass above paragraf.
//then create multiple strings to store each sentence that you see in the paragraf.
//Do below modification for your sentences :
//make sure each sentence first letter capital .
//make sure city names start with capital .
//rest needs to be small cases.
//make sure to change name,age and city information with your personal information
//make sure to trim your sentences
//after those modifications
//print each sentence length , last index number
//print first,last and fifth character from each sentence.
//
