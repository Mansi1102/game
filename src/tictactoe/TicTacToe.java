
package tictactoe;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import javax.swing.event.*;
public class TicTacToe extends JFrame implements ActionListener{
   JFrame f;
    JTextField tf;
    JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int k=0;int l;int count=0;
    TicTacToe(){
        tf=new JTextField();
        tf.setBounds(40,390,250,30);
        tf.setEditable(false);
        b1=new JButton();
        b1.setBounds(13,13,90,90);
        b2=new JButton();
        b2.setBounds(110,13,90,90);
        b3=new JButton();
        b3.setBounds(207,13,90,90);
        b4=new JButton();
        b4.setBounds(13,110,90,90);
        b5=new JButton();
        b5.setBounds(110,110,90,90);
        b6=new JButton();
        b6.setBounds(207,110,90,90);
        b7=new JButton();
        b7.setBounds(13,207,90,90);
        b8=new JButton();
        b8.setBounds(110,207,90,90); 
        b9=new JButton();
        b9.setBounds(207,207,90,90);
        b=new JButton("Start Again");
        b.setBounds(110,330,130,30);
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        tf.addActionListener(this);
        add(b);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);
        add(tf);
        setSize(350,500);
        setLayout(null);
        setVisible(true);
    }
    public int Check(){
        count++;
        if(b1.getText()=="X" && b2.getText()=="X" &&b3.getText()=="X"){
            return 1;
        }
        else if(b1.getText()=="X" && b4.getText()=="X" &&b7.getText()=="X"){
            return 1;
        }
        else if(b1.getText()=="X" && b5.getText()=="X" &&b9.getText()=="X"){
            return 1;
        }
        else if(b4.getText()=="X" && b5.getText()=="X" &&b6.getText()=="X"){
            return 1;
        }
        else if(b7.getText()=="X" && b8.getText()=="X" &&b9.getText()=="X"){
            return 1;
        }
        else if(b2.getText()=="X" && b5.getText()=="X" &&b8.getText()=="X"){
            return 1;
        }
        else if(b3.getText()=="X" && b6.getText()=="X" &&b9.getText()=="X"){
            return 1;
        }
        else if(b3.getText()=="X" && b5.getText()=="X" &&b7.getText()=="X"){
            return 1;
        }
        else if(b1.getText()=="0" && b2.getText()=="0" &&b3.getText()=="0"){
            return 2;
        }
        else if(b1.getText()=="0" && b4.getText()=="0" &&b7.getText()=="0"){
            return 2;
        }
        else if(b1.getText()=="0" && b5.getText()=="0" &&b9.getText()=="0"){
            return 2;
        }
        else if(b4.getText()=="0" && b5.getText()=="0" &&b6.getText()=="0"){
            return 2;
        }
        else if(b7.getText()=="0" && b8.getText()=="0" &&b9.getText()=="0"){
            return 2;
        }
        else if(b2.getText()=="0" && b5.getText()=="0" &&b8.getText()=="0"){
            return 2;
        }
        else if(b3.getText()=="0" && b6.getText()=="0" &&b9.getText()=="0"){
            return 2;
        }
        else if(b3.getText()=="0" && b5.getText()=="0" &&b7.getText()=="0"){
            return 2;
        }
        else {
            if(count==9){
                tf.setText("Match draw");
            }
            return 3;
        }
    
}
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            if(k==0){
                b1.setText("X");
                    b1.setEnabled(false);
                k=1;
                l=Check();
                if(l==1){
                   tf.setText("player 1 won");
                   b1.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b1.setEnabled(false);
               }
               else;
                
                 }
            else{
                b1.setText("0");
                    b1.setEnabled(false);
                k=0;
                 int l=Check();
               
               if(l==1){
                   tf.setText("player 1 won");
                   b1.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b1.setEnabled(false);
               }
               else;
                
                 }
        }

            if(e.getSource()==b2){
            if(k==0){
                b2.setText("X");
                b2.setEnabled(false);
                k=1;
                 int l=Check();
                if(l==1){
                   tf.setText("player 1 won");
                   b2.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b2.setEnabled(false);
               }
               else;
                 }
            else{
                b2.setText("0");
                b2.setEnabled(false);
                k=0;
                 int l=Check();
               
               if(l==1){
                   tf.setText("player 1 won");
                   b2.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b2.setEnabled(false);
               }
               else;
 
            }
            
        }   
          if(e.getSource()==b3){
            if(k==0){
                b3.setText("X");
                b3.setEnabled(false);
                k=1;
                 int l=Check();
                if(l==1){
                   tf.setText("player 1 won");
                   b3.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b3.setEnabled(false);
               }
               else;

                 }
            else{
                b3.setText("0");
                b3.setEnabled(false);
                k=0;
                 int l=Check();
               
               if(l==1){
                   tf.setText("player 1 won");
                   b3.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b3.setEnabled(false);
               }
               else;
 
            }
            
        }
           if(e.getSource()==b4){
            if(k==0){
                b4.setText("X");
                b4.setEnabled(false);
                k=1;
                 int l=Check();
                if(l==1){
                   tf.setText("player 1 won");
                   b4.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b4.setEnabled(false);
               }
               else;

                 }
            else{
                b4.setText("0");
                b4.setEnabled(false);
                k=0;
                 int l=Check();
               
               if(l==1){
                   tf.setText("player 1 won");
                   b4.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b4.setEnabled(false);
               }
               else;
 
            }
            
        }
            if(e.getSource()==b5){
            if(k==0){
                b5.setText("X");
                b5.setEnabled(false);
                k=1;
                 int l=Check();
                if(l==1){
                   tf.setText("player 1 won");
                   b5.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b5.setEnabled(false);
               }
               else;

                 }
            else{
                b5.setText("0");
                b5.setEnabled(false);
                k=0;
                 int l=Check();
               
               if(l==1){
                   tf.setText("player 1 won");
                   b5.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b5.setEnabled(false);
               }
               else;
 
            }
            
        }
             if(e.getSource()==b6){
            if(k==0){
                b6.setText("X");
                b6.setEnabled(false);
                k=1;
                 int l=Check();
                if(l==1){
                   tf.setText("player 1 won");
                   b6.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b6.setEnabled(false);
               }
               else;

                 }
            else{
                b6.setText("0");
                b6.setEnabled(false);
                k=0;
                 int l=Check();
               
               if(l==1){
                   tf.setText("player 1 won");
                   b6.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b6.setEnabled(false);
               }
               else;
 
            }
            
        }
              if(e.getSource()==b7){
            if(k==0){
                b7.setText("X");
                b7.setEnabled(false);
                k=1;
                 int l=Check();
                if(l==1){
                   tf.setText("player 1 won");
                   b7.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b7.setEnabled(false);
               }
               else;

                 }
            else{
                b7.setText("0");
                b7.setEnabled(false);
                k=0;
                 int l=Check();
               
               if(l==1){
                   tf.setText("player 1 won");
                   b7.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b7.setEnabled(false);
               }
               else;
 
            }
            
        }
               if(e.getSource()==b8){
            if(k==0){
                b8.setText("X");
                b8.setEnabled(false);
                k=1;
                 int l=Check();
                if(l==1){
                   tf.setText("player 1 won");
                   b8.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b8.setEnabled(false);
               }
               else;

                 }
            else{
                b8.setText("0");
                b8.setEnabled(false);
                k=0;
                 int l=Check();
               
               if(l==1){
                   tf.setText("player 1 won");
                   b8.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b8.setEnabled(false);
               }
               else;
 
            }
            
        }
                if(e.getSource()==b9){
            if(k==0){
                b9.setText("X");
                b9.setEnabled(false);
                k=1;
                 int l=Check();
                if(l==1){
                   tf.setText("player 1 won");
                   b9.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b9.setEnabled(false);
               }
               else;

                 }
            else{
                b9.setText("0");
                b9.setEnabled(false);
                k=0;
                 int l=Check();
               
               if(l==1){
                   tf.setText("player 1 won");
                   b9.setEnabled(false);
               }
               else if(l==2){
                   tf.setText("Player 2 won");
                   b9.setEnabled(false);
               }
               else;
 
            }
                }
                if(e.getSource()==b){
                    int k=0;int l;int count=0;
                    b1.setText(" ");
                    b2.setText(" ");
                    b3.setText(" ");
                    b4.setText(" ");
                    b5.setText(" ");
                    b6.setText(" ");
                    b7.setText(" ");
                    b8.setText(" ");
                    b9.setText(" ");
                    tf.setText(" ");
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    b3.setEnabled(true);
                    b4.setEnabled(true);
                    b5.setEnabled(true);
                    b6.setEnabled(true);
                    b7.setEnabled(true);
                    b8.setEnabled(true);
                    b9.setEnabled(true);
                }
        }
    


    public static void main(String[] args) {
        new TicTacToe();
    }
    
}
