class StringFormatter {  
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

public class Test1 {  
    public static void main(String[] args) {  
        System.out.println(StringFormatter.capitalizeWord("my name is khan"));  
        System.out.println(StringFormatter.capitalizeWord("I'm diknu jaiswal"));  
    }  
}  
