import com.br.dio.desafio.dominio.Bootcamp;
import com.br.dio.desafio.dominio.Course;
import com.br.dio.desafio.dominio.Dev;
import com.br.dio.desafio.dominio.Mentoring;

public class Main {
    public static void main(String[] args) {

        var intermediateCourse = new Course();     
        intermediateCourse.setTitle("\033[1;31mJava\033[0m");               
        intermediateCourse.setDescription("\033[1;3;34mThe best course you've saw.\033[0m");
        intermediateCourse.setHourlyLoad((byte)(3));

        var proCourse = new Course();
        proCourse.setTitle("\033[1;31mSoftware Engineer\033[0m");
        proCourse.setDescription("\033[1;3;34mMastering soft and hard skills.\033[0m");
        proCourse.setHourlyLoad((byte)(5));

        var softwareEngineer = new Mentoring();
        softwareEngineer.setTitle("Pro-Up.");
        softwareEngineer.setDescription("Teaching you a better way to dealing with work market.");
        
        var bootcamp = new Bootcamp();
        bootcamp.setName("Go");
        bootcamp.setDescription("Level up your skills.");
        bootcamp.getContents().add(intermediateCourse);
        bootcamp.getContents().add(proCourse);
        System.out.println("\n\n");
        var laura = new Dev();
        laura.setName("Laura");
        laura.signUpInBootcamp(bootcamp);
        System.out.println("Signed contents of "+laura.getName()+": "+laura.getRegisteredContent());
        laura.grow();
        System.out.println("Completed contents of "+laura.getName()+": "+laura.getCompletedContent());
        System.out.println("\n");
        System.out.println("=================================================");
        System.out.println("\n");
        var duarte = new Dev();
        duarte.setName("Duarte");
        duarte.signUpInBootcamp(bootcamp);
        System.out.println("Signed contents of "+duarte.getName()+": "+duarte.getRegisteredContent());
        System.out.println("Completed contents of "+duarte.getName()+": "+duarte.getCompletedContent());
        System.out.println("\n\n");
    }
}
