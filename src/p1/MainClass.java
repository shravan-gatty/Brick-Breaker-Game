package p1;

import javax.swing.JFrame;

public class MainClass {

    public static void main(String[] args) {
	// write your code here
        JFrame obj =new JFrame();
        GamePlay gamePlay=new GamePlay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Brick Breaker game");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}
