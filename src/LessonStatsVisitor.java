public class LessonStatsVisitor implements Visitor {
    private int totalHours = 0;
    private int maxScore = 0;

    @Override
    public void visit(Lecture lecture) {
        totalHours += lecture.getHours();
        maxScore += lecture.getMaxScore();
    }

    @Override
    public void visit(LabLesson labLesson) {
        totalHours += labLesson.getHours();
        maxScore += labLesson.getMaxScore();
    }

    @Override
    public void visit(Seminar seminar) {
        totalHours += seminar.getHours();
        maxScore += seminar.getMaxScore();
    }

    public int getTotalHours() {
        return totalHours;
    }

    public int getMaxScore() {
        return maxScore;
    }
}
