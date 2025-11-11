package inheritance.com;

public class box1 {
    int id ;
    int side1;
    int side2;
    public box1()
    {
        this.id = 12;
        this.side1 = 18;
        this.side2 = 188;
    }

   public box1(box1 ss)
    {
        this.id = ss.id;
        this.side1=ss.side1;
        this.side2=ss.side2;

    }
   public   box1(int id,int side1)
    {
        this.id = 123;
        this.side1 = side1;
    }
    protected void greeting()
    {
        System.out.println("hii welcome w h r ");
        System.out.println("fine guys");
    }

//    public box1(int id ,int side1,int side2) {
//
//        this.id = id;
//        this.side1=side1;
//        this.side2=side2;
//    }
}
