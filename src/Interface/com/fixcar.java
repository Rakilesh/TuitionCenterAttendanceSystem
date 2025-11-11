package Interface.com;

public class fixcar implements engine , music{
    int balance ;
    @Override
    public void musicplayer() {
        System.out.println("music start play");
    }

    @Override
    public void greeting(int val) {
        this.balance+=val;
        System.out.println(balance + "hii start engine");

    }

//    public static void main(String[] args) {
//        fixcar car = new fixcar();
//
//        //engine.mm();
//
//    }
}
