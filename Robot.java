public class Robot {
    Integer length;
    Integer height;

    public Robot(Integer length, Integer height) {
        this.length = length;
        this.height = height;
    }

    public void run() {
        System.out.println("Robot is running");
    }

    public void jump() {
        System.out.println("Robot is jumping");
    }

    public Integer getLength() {
        return length;
    }

    public Integer getHeight() {
        return height;
    }
}
