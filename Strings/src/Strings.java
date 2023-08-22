public class Strings {
    public static void main(String[] args) {
//        String name  = "Aman";
//        System.out.println(name);

//        //String concatenation
//        String firstname = "Aman";
//        String lastname = "Bansal";
//        String ans = firstname + " " + lastname;
//        System.out.println(ans);

//        String from loop
        String series = "";
        for(int i=0; i<26; i++){
            char ch = (char)('a'+i);
            series = series + ch;
        }
        System.out.println(series);
    }
}
