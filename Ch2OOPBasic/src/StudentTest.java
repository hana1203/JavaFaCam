public class StudentTest {

    public static void main(String[] args) {

        Student harry = new Student(100,"Harry");
        harry.setPotionsSubject("Potions1🧪", 90, "dark room", "Severus Snape");
        harry.setCharmsSubject("Charms1🔮", 100, "astrology tower", "Trilony");

        Student ron = new Student(101, "Ron");
        ron.setPotionsSubject("Potions2🧪🧪", 80, "basement corner room", "Severus Snape");
        ron.setCharmsSubject("Charms2🪄", 90, "2nd room of astrology tower", "Filtwick");

        System.out.println(harry);
        harry.showStudentScore();
        System.out.println(ron);
        ron.showStudentScore();
    }
}
