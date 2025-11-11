package inheritance.com;

 class box2 extends box1{
    String colour;
    box2(){
       //super();
        this.colour = "red";
        this.id = 34;
        this.side1 = 123;
}
    box2(box2 AA) {
        super(AA);
       // this.colour = "blue";
    }
    box2(int is,int df,String cv)
    {  super(is,df);

        this.colour = cv;
//        this.id = is;
//        this.side1 = df;

    }

     public static void main(String[] args) {
         box2 s = new box2();
         s.greeting();
     }

//   {
//      this.colour = AA.colour;
//  }
//    @Override
//    void greeting()
//    {
//        System.out.println("hii welcome");
//    }

//    public box2(String Colour,int id,int side1,int side2)
//    {
//        super(id,side1,side2);
//        this.colour = Colour;
//    }
}
