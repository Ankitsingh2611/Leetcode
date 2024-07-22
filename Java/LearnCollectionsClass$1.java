import java.util.Comparator;

class LearnCollectionsClass$1 implements Comparator<Student> {
   LearnCollectionsClass$1() {
   }

   public int compare(Student o1, Student o2) {
      return o1.name.compareTo(o2.name);
   }
}
