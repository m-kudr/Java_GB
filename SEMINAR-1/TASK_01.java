import java.util.Date;

public class TASK_01 {

    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }
        Date date2 = new Date();
        System.out.println(date2);
        System.out.println(date2.getTime() - date1.getTime() + "ms");

    }

}
