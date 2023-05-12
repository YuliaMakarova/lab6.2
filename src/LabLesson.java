public class LabLesson implements Lesson {
    private int hours;
    }
    @Override
    public int getHours() {
        return hours;
    }

    @Override
    public int getMaxScore() {
        return maxScore;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
