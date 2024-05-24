package Ex2;

import java.awt.Component;
import javax.swing.JOptionPane;

public class TestableMessageDialog extends JOptionPane {
    private static final long serialVersionUID = -792945141460920603L;
    private static String lastMessage;

    public static void showMessageDialog(Component parentComponent, Object message, String title, int messageType) {
        lastMessage = message.toString();
        JOptionPane.showMessageDialog(parentComponent, message, title, messageType);
    }

    public static String getLastMessage() {
        return lastMessage;
    }
}