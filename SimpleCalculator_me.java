import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextArea;

public class SimpleCalculator_me extends JFrame implements ActionListener {
    public static void main(String[] args) {
        SimpleCalculator_me mt = new SimpleCalculator_me("Calculator");
        mt.setVisible(true);
    }

    private JPanel panel1, panel2;
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11,
            button12, button13, button14, button15, button16, button17, button18, button19, button20;
    private JTextArea textArea;
    private Container cont;
    private int casenumber;
    private Double a = 0.0, b, result = 0.0;

    public SimpleCalculator_me(String s) {
        this.setTitle(s);
        cont = this.getContentPane();

        button1 = new Button("^_^");
        button2 = new Button("Del");
        button3 = new Button("C");
        button4 = new Button("/");
        button5 = new Button("7");
        button6 = new Button("8");
        button7 = new Button("9");
        button8 = new Button("*");
        button9 = new Button("4");
        button10 = new Button("5");
        button11 = new Button("6");
        button12 = new Button("-");
        button13 = new Button("1");
        button14 = new Button("2");
        button15 = new Button("3");
        button16 = new Button("+");
        button17 = new Button("neg");
        button18 = new Button("0");
        button19 = new Button(".");
        button20 = new Button("=");

        textArea = new JTextArea();
        textArea.setBackground(Color.WHITE);
        textArea.setForeground(Color.DARK_GRAY);
        textArea.setColumns(25);
        textArea.setEditable(false);

        // control
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);
        button16.addActionListener(this);
        button17.addActionListener(this);
        button18.addActionListener(this);
        button19.addActionListener(this);
        button20.addActionListener(this);

        panel1 = new JPanel();
        panel1.add(textArea);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(5, 4));
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        panel2.add(button7);
        panel2.add(button8);
        panel2.add(button9);
        panel2.add(button10);
        panel2.add(button11);
        panel2.add(button12);
        panel2.add(button13);
        panel2.add(button14);
        panel2.add(button15);
        panel2.add(button16);
        panel2.add(button17);
        panel2.add(button18);
        panel2.add(button19);
        panel2.add(button20);

        cont.add(panel1);
        cont.add(panel2, "South");
        // this.setContentPane(panel2);

        this.setSize(350, 300);
        this.setBackground(Color.LIGHT_GRAY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Ở đây chúng ta sẽ bắt sự kiến cho từng nút
        if (e.getActionCommand() == "1")
            textArea.append("1");
        if (e.getActionCommand() == "2")
            textArea.append("2");
        if (e.getActionCommand() == "3")
            textArea.append("3");
        if (e.getActionCommand() == "4")
            textArea.append("4");
        if (e.getActionCommand() == "5")
            textArea.append("5");
        if (e.getActionCommand() == "6")
            textArea.append("6");
        if (e.getActionCommand() == "7")
            textArea.append("7");
        if (e.getActionCommand() == "8")
            textArea.append("8");
        if (e.getActionCommand() == "9")
            textArea.append("9");
        if (e.getActionCommand() == "0")
            textArea.append("0");
        if (e.getActionCommand() == ".")
            textArea.append(".");
        if (e.getActionCommand() == "neg")// Dấu âm (negative)
            textArea.append("-");

        /*
         * Khi bắt sự kiến các toán tử chúng ta sẽ gán biến casenumber để thực hiện câu
         * lệnh switch case
         */
        if (e.getActionCommand() == "+") {
            a = Double.parseDouble(textArea.getText());
            casenumber = 1;
            textArea.setText("");
        }
        if (e.getActionCommand() == "-") {
            a = Double.parseDouble(textArea.getText());
            casenumber = 2;
            textArea.setText("");
        }

        if (e.getActionCommand() == "*") {
            a = Double.parseDouble(textArea.getText());
            casenumber = 3;
            textArea.setText("");
        }

        if (e.getActionCommand() == "/") {
            a = Double.parseDouble(textArea.getText());
            casenumber = 4;
            textArea.setText("");
        }

        if (e.getActionCommand() == "=") {
            b = Double.parseDouble(textArea.getText());
            switch (casenumber) {
            case 1:
                result = a + b;
                break;

            case 2:
                result = a - b;
                break;

            case 3:
                result = a * b;
                break;

            case 4:
                result = a / b;
                break;

            default:
                result = 0.0;
            }
            textArea.setText(result.toString());
        }
        /*
         * Ý tưởng ở đây chúng ta sẽ getText ở textArea sau đó xóa toàn bộ Tiếp đến
         * duyệt đoạn chuỗi vừa rồi đồng thời lùi về một ký tự Và cuối cùng setText cho
         * textArea
         */
        if (e.getActionCommand() == "Del") {
            String s = textArea.getText();
            textArea.setText("");
            for (int i = 0; i < s.length() - 1; i++) {
                textArea.setText(textArea.getText() + s.charAt(i));
            }
            // Xóa hết
            if (e.getActionCommand() == "C")
                textArea.setText("");
        }
    }
}
