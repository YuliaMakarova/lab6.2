public interface Lesson {
    public int getHours();
    public int getMaxScore();
    public void accept(Visitor visitor);
}
