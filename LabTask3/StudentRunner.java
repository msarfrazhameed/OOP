public class StudentRunner {
    public static void main(String[] args) {


                int[] sarfrazMarks = {85, 90, 78, 92, 88};
                int[] fazalMarks = {70, 65, 80, 75, 82};

                Student student1 = new Student("sarfraz", sarfrazMarks);
                Student student2 = new Student("fazal", fazalMarks);

                System.out.println(student1.getName() + "'s Average: " ); student1.Average();
                System.out.println(student2.getName() + "'s Average: " ); student2.Average();



    }
}
