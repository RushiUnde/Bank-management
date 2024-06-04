
import javax.swing.*;
import com.toedter.calendar.JCalendar;

public class CalendarDemo extends JFrame {

    public CalendarDemo() {
        JCalendar calendar = new JCalendar();
        add(calendar);
        setTitle("Calendar Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalendarDemo();
    }
}
