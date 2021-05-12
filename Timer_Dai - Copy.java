package XuLISuKien;

import java.awt.Color;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;


public class Timer_Dai extends JFrame implements ActionListener{
    private JButton timer, alarm, stopwatch;
    private JLabel jLabel;
    private JLabel labelClock;

    public void Window(){
        this.setSize(400, 400);
        this.setLayout(null);
        setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        timer = new JButton("Timer");           timer.setBounds(50, 10, 100, 50);
        alarm = new JButton("Alarm");           alarm.setBounds(50,150,100,50);
        stopwatch = new JButton("Stop Watch");  stopwatch.setBounds(50, 290, 100, 50);
        jLabel = new JLabel();
        labelClock = new JLabel();
        setVisible(true);
        this.add(timer);
        this.add(alarm);
        this.add(stopwatch);
        this.add(jLabel);
        this.add(labelClock);
        jLabel.setBounds(200,100,100,20);            
        labelClock.setBounds(200,150,50,20);
        
        setVisible(true);
        
    }

    public Timer_Dai(){
        this.setTitle("Đồng hồ A Khánh");
        this.Window();
        timer.addActionListener(this);
        alarm.addActionListener(this);
        stopwatch.addActionListener(this); 
        jLabel.setBounds(200,100,100,20);            
        labelClock.setBounds(200,150,50,20);
    }
    

    public static void main(String[] args) {
        new Timer_Dai();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String act = e.getActionCommand();
        jLabel.setText(act);
        timer.setBounds(10, 10, 100, 50);
        alarm.setBounds(10,150,100,50); 
        stopwatch.setBounds(10, 290,100,50);
        if(act == "Timer"){   
            //     
            try {
                while (true) {
                    Calendar calendar = Calendar.getInstance();
                    String hour = (calendar.get(Calendar.HOUR) > 9) ? "" + calendar.get(Calendar.HOUR) + "" : "0" + calendar.get(Calendar.HOUR);  
                    String minute = (calendar.get(Calendar.MINUTE) > 9) ? "" + calendar.get(Calendar.MINUTE) + "" : "0" + calendar.get(Calendar.MINUTE);
                    String second = (calendar.get(Calendar.SECOND) > 9) ? "" + calendar.get(Calendar.SECOND) + "" : "0" + (calendar.get(Calendar.SECOND));
                    labelClock.setText(hour + ":" + minute + ":" + second);
                    Thread.sleep(1);
                }
            } catch (InterruptedException ev) {
                ev.printStackTrace();
            }////////// tại sao em cho đoạn try catch này vào phan cuối của window() thì dc mà để đây lại sai nhỉ??
        }
        else if(act == "Alarm"){        
            labelClock.setText("Báo thức");
        }
        else if(act == "Stop Watch"){
            labelClock.setText("Đông hồ bấm h");
        }
        
    }
}
