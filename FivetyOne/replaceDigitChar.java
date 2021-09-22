package FivetyOne;

//https://leetcode.com/problems/replace-all-digits-with-characters/
public class replaceDigitChar {
    public String replaceDigits(String s) {
       /* String st="";
        char c=' ';
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                char ch=s.charAt(i-1);
                int conv=(int)(ch);
                System.out.println(conv);
                int add=conv+(int)s.charAt(i)-48;
                System.out.println((int)s.charAt(i));
                
                c=(char)(add);
            }
            else{
                 c=s.charAt(i);
            }
        st=st+c;
        }
        return st;*/
        char c[]=s.toCharArray();
        for(int i=1;i<s.length();i+=2){
            c[i]=(char)(c[i-1]+c[i]-'0');
        }
        return String.valueOf(c);
    }
}