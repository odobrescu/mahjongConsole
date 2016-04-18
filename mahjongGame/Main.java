package mahjongGame;

import javax.swing.JFrame;

public class Main extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().setVisible(true);
	}
	
	private Main(){
		super("Mahjong Game");
		setSize (600,600);
		setResizable (false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
