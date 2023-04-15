public class Treadmill {

    Integer length;


    public Treadmill(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Treadmill length = " + length;
    }

    public Integer getLength() {
        return length;
    }

}
