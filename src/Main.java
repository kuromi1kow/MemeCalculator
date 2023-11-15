import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.net.MalformedURLException;
import java.net.URL;
public class Main {
    public static int getInt() {
        String numsEnter = JOptionPane.showInputDialog("Введите целое число:");
        return Integer.parseInt(numsEnter);
    }
    public static char getOperation() {
        String imageUrl = "https://cdn.dribbble.com/users/13213684/screenshots/19501224/media/77c123ab10eb907ed8d8cb06f55c5e25.png?resize=400x300&vertical=center";
        ImageIcon icon = null;
        try {
            URL url = new URL(imageUrl);
            icon = new ImageIcon(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        String[] options = { "+", "-", "*", "/", "Выход" };
        int choice = JOptionPane.showOptionDialog(
                null, "Выберите операцию:", "Операция", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, icon, options, options[0]
        );

        return options[choice].charAt(0);
    }
    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                JOptionPane.showMessageDialog(null, "Сложение выполнено!");
                break;
            case '-':
                result = num1 - num2;
                JOptionPane.showMessageDialog(null, "Вычитание выполнено!");
                break;
            case '*':
                result = num1 * num2;
                JOptionPane.showMessageDialog(null, "Умножение выполнено!");
                break;
            case '/':
                result = num1 / num2;
                JOptionPane.showMessageDialog(null, "Деление выполнено!");
                break;
            case 'x':
                JOptionPane.showMessageDialog(null, "Выход из программы...");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Удачного дня:)");
                System.exit(0);
        }
        return result;
    }

    public static void main(String[] args) {
        while (true) {
            int num1 = getInt();
            int num2 = getInt();
            char operation = getOperation();
            int result = calc(num1, num2, operation);
            JOptionPane.showMessageDialog(null, "Результат: " + result);
        }
    }
}