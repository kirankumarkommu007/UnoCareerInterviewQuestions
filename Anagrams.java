import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        int frequency =0;
        String at =a.toLowerCase();
        String bt =b.toLowerCase();
        char n[] = at.toCharArray();
        char k[] =bt.toCharArray();
        for(int i =0; i<n.length;i++){
           char temp =0;
           
           for(int j =0;j<k.length;j++){
               if(n.length == k.length && n[i]==k[j]){
                   frequency++;
                   k[j] =temp;
                   break;
               }
           }
       }
       if(frequency==a.length()){
        return true;   
       }
       return false;
    }
    
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a ="kiran";
        String b = "narik";
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}