public interface Visitor {
    void visit(Lecture lecture);
    void visit(LabLesson labLesson);
    void visit(Seminar seminar);
}