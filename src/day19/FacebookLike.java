package day19;

public class FacebookLike {

    private int likes;

    public FacebookLike(int likes){
        this.likes = likes;
    }

    public synchronized void increaseLikes() {
        try {
            Thread.sleep(1000);
            System.out.println(likes++);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
