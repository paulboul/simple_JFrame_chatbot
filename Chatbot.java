import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Chatbot extends JFrame {

    private static final long serialVersionUID=1L;
    private JTextArea ca=new JTextArea();
    private JTextField cf=new JTextField();
    private JButton b=new JButton();
    private JLabel l=new JLabel();

    Chatbot(){
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setSize(400,400);
        f.getContentPane().setBackground(Color.CYAN);
        f.setTitle("ChatBot");
        f.add(ca);
        f.add(cf);
        ca.setSize(300,310);
        ca.setLocation(1,1);
        ca.setBackground(Color.BLACK);
        cf.setSize(300,20);
        cf.setLocation(1,320);
        f.add(b);
        l.setText("SEND");
        b.add(l);
        b.setSize(400,20);
        b.setLocation(300,320);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==b){
                    String text=cf.getText().toLowerCase();
                    ca.setForeground(Color.green);
                    ca.append("You-->"+text+"\n");
                    cf.setText("");

                    if(text.contains("hi")){
                        replyMeth("hi there");
                    }
                    else if(text.contains("how are you")){
                        replyMeth("I'm Good :).Thankyou for asking");
                    }
                    else if(text.contains("what is your name")) {
                        replyMeth("I'm the Trending BINOD");
                    }
                    else if(text.contains("gender")) {
                        replyMeth("I'm Female.Don't Try to Flirt with me"+"\n"+"you Fell in love :)");
                    }
                    else if(text.contains("love you")) {
                        replyMeth("I'm Feeling Shy :) Love you to");
                    }
                    else if(text.contains("bye")) {
                        replyMeth("Too Soon :( AnyWays"+"\n"+"STAY HOME STAY SAFE ");
                    }
                    else if(text.contains("kyt")) {
                        replyMeth("是國棟老婆");
                    }
                    else if(text.contains("lick mouth")) {
                        replyMeth("又舔!又舔嘴唇!!!!!!");
                    }
                    else
                        replyMeth("I Can't Understand");

                }
            }
        });

    }
    public void replyMeth(String s){
        ca.append("ChatBot-->"+s+"\n");
    }


}
