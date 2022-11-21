public class Box <T>{
    private T word;

    public Box(T word) {
        this.word = word;
    }

    public T getWord() {
        return word;
    }

    public void setWord(T word) {
        this.word = word;
    }

    public static <T> Box<T> method (Box<T> word) {
        return word;
    }

    @Override
    public String toString() {
        return "Box{" +
                "word=" + word +
                '}';
    }
}
