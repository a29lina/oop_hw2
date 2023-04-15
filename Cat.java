public class Cat {
    Integer length;
    Integer height;

    public Cat(Integer length, Integer height) {
        this.length = length;
        this.height = height;
    }

    public void run() {
        System.out.println("Cat is running");
    }

    public void jump() {
        System.out.println("Cat is jumping");
    }

    public Integer getLength() {
        return length;
    }

    public Integer getHeight() {
        return height;
    }


}
