package Inhertitnce;

public class Box {
    int l;
    int h;
    int w;

//    Constructor
    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

//    Calling constructor with an argument
    Box(int side){
        this.w = side;
        this.l = side;
        this. h = side;
    }


//    When user pass three arguments
    Box(int l, int w, int h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void Information(){
        System.out.println("This came from Box");
    }
}
