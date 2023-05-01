public class Lecture implements Lesson {
    private int hours;
    private int maxScore;
    public Lecture(int hours_, int maxScore_) {
        hours = hours_;
        maxScore = maxScore_;
    }
    @Override
    public int getHours() {
        return hours;
    }

    @Override
    public int getMaxScore() {
        return maxScore;
    }
}
