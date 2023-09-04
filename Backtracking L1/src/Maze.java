public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
//        path("",3,3);
        Diagonal("",3,3);
    }

    public static int count(int r, int c){
        if(r==1 || c ==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r, c-1);

        return left + right;
    }

    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }


        if(r>1){
            path(p + 'D', r-1, c);
        }
        if(c>1){
            path(p+ 'R',r, c-1 );
        }
    }

    static void Diagonal(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1 && c>1){
            Diagonal(p + 'D', r-1, c-1);
        }
        if(r>1){
            Diagonal(p + 'V', r-1, c);
        }
        if(c>1){
            Diagonal(p+ 'R',r, c-1 );
        }
    }
}
