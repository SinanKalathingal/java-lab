class Box{
    double width;
    double height;
    double depth;
}

public class BoxDemo{
    public static void main(String args[]){
        Box MyBox = new Box();
        MyBox.width = 10;
        MyBox.height = 20;
        MyBox.depth = 15;

        double vol = MyBox.width * MyBox.height * MyBox.depth;

        System.out.println("Volume is "+ vol);
    }
}