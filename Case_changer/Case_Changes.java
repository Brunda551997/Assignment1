public class Case_charger{
public static void main(String args[]){
	String str="Mary has a little dog. she calls him Pun";
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	System.out.println(capitalizeWord("I bbnnnn hhjjj"));

  System.out.println(Invert(str));
 
}
public static String Invert(String str){
   
        StringBuffer newStr=new StringBuffer(str);    
            
        for(int i = 0; i < str.length(); i++) {    
                
            
            if(Character.isLowerCase(str.charAt(i))) {    
                
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));    
            }    
            //Checks for upper case character    
            else if(Character.isUpperCase(str.charAt(i))) {    
                
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));    
            }    
}
return str;
}
	
	
  
public static String capitalizeWord(String str){  
    String words[]=str.split("\\s");  
    String capitalizeWord="";  
    for(String w:words){  
        String first=w.substring(0,1);  
        String afterfirst=w.substring(1);  
        capitalizeWord+=first.toUpperCase()+afterfirst+" ";
    }  
    return capitalizeWord.trim();  

}  
}

