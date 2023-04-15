public class Wall {

    Integer height;

    public Wall(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Wall height = " + height;
    }

    public Integer getHeight() {
        return height;
    }

}
