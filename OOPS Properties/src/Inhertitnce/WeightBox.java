package Inhertitnce;

public class WeightBox extends Box{
    int weight;

//    Constructor
    public WeightBox(){
        this.weight = -3;
    }

    public WeightBox(int l, int h, int w, int weight){
        super(l,w,h);              //Call the parent class constructor
        this.weight = weight;
    }
}
