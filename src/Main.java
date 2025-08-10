import com.br.dio.desafio.dominio.Course;

public class Main {
    public static void main(String[] args) {
        Course newCourse = new Course();
        newCourse.setTitle("\033[1;31mJava: Mastering the high level programming language.\033[0m");
        newCourse.setDescription("\033[1;32mBeginner to Pro.\033[0m");
        newCourse.setHourlyLoad((byte) 4);
        System.out.println(newCourse);
                            
    }
}
