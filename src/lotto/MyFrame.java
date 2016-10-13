package lotto;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class MyFrame extends JFrame {

    iListener iL = new iListener();
    bListener zL = new bListener();
    cListener cL = new cListener();

    JLabel text = new JLabel("Noch 6/6 zahlen Auswählen");
    JLabel text2 = new JLabel("Name:");
    JLabel text3 = new JLabel("Ziehungen: 0");
    JLabel text31 = new JLabel("");
    JLabel textzahlen= new JLabel("");
    JLabel texteins = new JLabel("0 mal eine Richtige Zahl");
    JLabel textzwei = new JLabel("0 mal zwei Richtige Zahlen");
    JLabel textdrei = new JLabel("0 mal drei Richtige Zahlen");
    JLabel textvier = new JLabel("0 mal vier Richtige Zahlen");
    JLabel textfünf = new JLabel("0 mal fünf Richtige Zahlen");

    JToggleButton[] buttonArray = {
        new JToggleButton("1"),
        new JToggleButton("2"),
        new JToggleButton("3"),
        new JToggleButton("4"),
        new JToggleButton("5"),
        new JToggleButton("6"),
        new JToggleButton("7"),
        new JToggleButton("8"),
        new JToggleButton("9"),
        new JToggleButton("10"),
        new JToggleButton("11"),
        new JToggleButton("12"),
        new JToggleButton("13"),
        new JToggleButton("14"),
        new JToggleButton("15"),
        new JToggleButton("16"),
        new JToggleButton("17"),
        new JToggleButton("18"),
        new JToggleButton("19"),
        new JToggleButton("20"),
        new JToggleButton("21"),
        new JToggleButton("22"),
        new JToggleButton("23"),
        new JToggleButton("24"),
        new JToggleButton("25"),
        new JToggleButton("26"),
        new JToggleButton("27"),
        new JToggleButton("28"),
        new JToggleButton("29"),
        new JToggleButton("30"),
        new JToggleButton("31"),
        new JToggleButton("32"),
        new JToggleButton("33"),
        new JToggleButton("34"),
        new JToggleButton("35"),
        new JToggleButton("36"),
        new JToggleButton("37"),
        new JToggleButton("38"),
        new JToggleButton("39"),
        new JToggleButton("40"),
        new JToggleButton("41"),
        new JToggleButton("42"),
        new JToggleButton("43"),
        new JToggleButton("44"),
        new JToggleButton("45"),
        new JToggleButton("46"),
        new JToggleButton("47"),
        new JToggleButton("48"),
        new JToggleButton("49"),};

    JFormattedTextField feld = new JFormattedTextField();
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panelausgabetext = new JPanel();
    JButton button = new JButton("O.K");
    Font schrift = new Font("Sherif", Font.BOLD, 20);
    Font zahlenSchrift = new Font ("Sherif", Font.BOLD,50);

    boolean ok = false;
    boolean feldleer = false;

    public String name;
    public int[] i;
    int zahlenmenge = 6;

    public MyFrame() {
        this.i = new int[6];

        int j = 0;
        String temp = "";

        setSize(1050, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Lotto");
        setLayout(null);

        panel.setBounds(10, 10, 260, 290);
        panel.setLayout(null);
        add(panel);

        panel2.setBounds(10, 300, 250, 50);
        panel2.setLayout(null);
        add(panel2);

        panelausgabetext.setBounds(270, 125, 900, 800);
        panelausgabetext.setLayout(null);
        add(panelausgabetext);

        text.setBounds(0, 0, 500, 30);
        text.setFont(schrift);
        panel.add(text);

        text2.setBounds(0, 0, 40, 25);
        panel2.add(text2);

        text3.setBounds(0, 0, 900, 25);
        text3.setFont(schrift);
        panelausgabetext.add(text3);

        text31.setBounds(0, 25, 900, 25);
        text31.setFont(schrift);
        panelausgabetext.add(text31);
        
        textzahlen.setBounds(270, 60, 1000, 55);
        textzahlen.setFont(zahlenSchrift);
        add(textzahlen);

        texteins.setBounds(0, 75, 900, 25);
        texteins.setFont(schrift);
        panelausgabetext.add(texteins);

        textzwei.setBounds(0, 100, 900, 25);
        textzwei.setFont(schrift);
        panelausgabetext.add(textzwei);

        textdrei.setBounds(0, 125, 900, 25);
        textdrei.setFont(schrift);
        panelausgabetext.add(textdrei);

        textvier.setBounds(0, 150, 900, 25);
        textvier.setFont(schrift);
        panelausgabetext.add(textvier);

        textfünf.setBounds(0, 175, 900, 25);
        textfünf.setFont(schrift);
        panelausgabetext.add(textfünf);

        button.setBounds(210, 0, 30, 25);
        button.setEnabled(false);
        button.setBorder(null);
        button.addActionListener(iL);
        panel2.add(button);

        feld.setBounds(40, 0, 165, 25);
        feld.addCaretListener(cL);
        panel2.add(feld);

        int x = 0;
        int y = 40;
        int z = 0;

        for (JToggleButton bu : buttonArray) {
            bu.setBorder(null);
            bu.setBounds(x, y, 30, 30);
            bu.addItemListener(zL);
            panel.add(bu);
            x += 35;
            z++;
            if (z % 7 == 0) {
                x = 0;
                y += 35;
            }

        }

        do {
            System.out.print(".");
        } while (ok == false);

        this.name = feld.getText();

        for (JToggleButton ba : buttonArray) {

            if (ba.isSelected()) {

                temp = ba.getText();
                this.i[j] = Integer.parseInt(temp);
                j++;

            }

        }
        
        textzahlen.setText(i[0] + ", " + i[1] + ", " + i[2] + ", " + i[3] + ", " + i[4] + ", " + i[5]);

    }

    public void SetText3(String k) {

        text3.setText(k);
        panelausgabetext.updateUI();

    }

    public void SetText31(String k) {

        text31.setText(k);
        panelausgabetext.updateUI();

    }
    
    public void setZahlen(String k){
        textzahlen.setText(k);
    }

    public String getSpielerName(){
        return this.name;
    }

    public int[] getSpielerZahlen() {
        return this.i;
    }

    public void setK(long k) {
        text3.setText("Ziehungen: " + k);
    }

    public void setEins(int k) {
        texteins.setText(k + " mal eine Richtige Zahl");
    }

    public void setZwei(int k) {
        textzwei.setText(k + " mal zwei Richtige Zahlen");
    }

    public void setDrei(int k) {
        textdrei.setText(k + " mal drei Richtige Zahlen");
    }

    public void setVier(int k) {
        textvier.setText(k + " mal vier Richtige Zahlen");
    }

    public void setFünf(int k) {
        textfünf.setText(k + " mal fünf Richtige Zahlen");
    }

    public class iListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == button) {
                ok = true;

            }
        }

    }

    public class bListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent ie) {

            int i = 0;

            for (JToggleButton buttons : buttonArray) {
                if (buttons.isSelected()) {
                    i++;
                }

            }

            if (i > 6) {

                for (JToggleButton buttons : buttonArray) {
                    if (buttons == ie.getItem()) {
                        buttons.doClick();
                        i = 6;
                    }

                }
            }

            zahlenmenge = 6 - i;
            text.setText("Noch " + zahlenmenge + "/6 zahlen Auswählen");
                    

            if (zahlenmenge == 0 && feldleer) {
                button.setEnabled(true);
            }

        }
    }

    public class cListener implements CaretListener {

        @Override
        public void caretUpdate(CaretEvent ce) {

            String s = feld.getText();
            s = s.trim();
            feldleer = !s.isEmpty();
            
            
            if (zahlenmenge == 0 && feldleer) {
                button.setEnabled(true);
            }

        }

    }
}
