public class Human {

    Integer height;
    Integer length;

    public Human(Integer length, Integer height) {
        this.height = height;
        this.length = length;
    }

    public void run() {
        System.out.println("Human is running");
    }

    public void jump() {
        System.out.println("Human is jumping");
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getLength() {
        return length;
    }

}
