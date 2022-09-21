import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class prova1 {
    public static void main(String[] args) {

        ImageIcon i = new ImageIcon("kyogre.png");
        Border border = BorderFactory.createLineBorder(Color.blue,5);

        JLabel l = new JLabel();
        l.setText("KYOGRE <3");
        l.setIcon(i);
        l.setHorizontalTextPosition(JLabel.CENTER);
        l.setVerticalTextPosition(JLabel.TOP);
        l.setForeground(new Color(0,0,255));
        l.setFont(new Font("MV Boli",Font.BOLD,20));
        l.setIconTextGap(-155);
        l.setBackground(Color.BLACK);
        l.setOpaque(true);//per mostrare il colore sfondo
        l.setBorder(border);
        l.setVerticalAlignment(JLabel.CENTER);//seleziona la posizione verticale text+icon in label
        l.setHorizontalAlignment(JLabel.CENTER);//stessa cosa in orizzontale
        //l.setBounds(100,100,850,850);

        JFrame f = new JFrame();
        f.setTitle("TITOLO");
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setResizable(false);
        f.add(l);
        f.pack();



        f.setIconImage(i.getImage());
        f.getContentPane().setBackground(new Color(0,255,255));

    }
}
