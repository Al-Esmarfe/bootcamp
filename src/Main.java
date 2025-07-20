import br.com.dominio.Bootcamp;
import br.com.dominio.Course;
import br.com.dominio.Dev;
import br.com.dominio.Mentoring;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java beginning course");
        course1.setDescription("Java course description");
        course1.setWorkload(5);

        Course course2 = new Course();
        course2.setTitle("Java level-up course");
        course2.setDescription("JS course description");
        course2.setWorkload(4);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Java mentoring");
        mentoring.setDescription("Jave mentoring description");
        mentoring.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer Bootcamp");
        bootcamp.setDescription("Java Developer Bootcamp description");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);

        Dev devMarcia = new Dev();
        devMarcia.setName("Márcia");
        devMarcia.subscribBootcamp(bootcamp);
        System.out.println("Subscribe Contents " + devMarcia.getName() + ": " + devMarcia.getSubscribedContent());

        devMarcia.progress();
        System.out.println("--");
        System.out.println("Subscribe Contents " + devMarcia.getName() + ": " + devMarcia.getSubscribedContent());
        System.out.println("Completed Contents " + devMarcia.getName() + ": " + devMarcia.getCompletedContent());
        System.out.println("XP: " + devMarcia.caculateTotalXP());

        System.out.println("---------------------------------");

        Dev devJoao = new Dev();
        devJoao.setName("João");
        devJoao.subscribBootcamp(bootcamp);
        System.out.println("Subscribe Contents " + devJoao.getName() + ": " + devJoao.getSubscribedContent());

        devJoao.progress();
        devJoao.progress();
        System.out.println("--");
        System.out.println("Subscribe Contents " + devJoao.getName() + ": " + devJoao.getSubscribedContent());
        System.out.println("Completed Contents " + devJoao.getName() + ": " + devJoao.getCompletedContent());
        System.out.println("XP: " + devJoao.caculateTotalXP());



    }
}
