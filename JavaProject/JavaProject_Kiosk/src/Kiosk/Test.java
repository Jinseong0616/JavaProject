package Kiosk;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {

		JFrame f = new JFrame();
		
		
		
		String imageAddr = "src/Kiosk/Images/";
		
		String str[] = {"김밥","참치김밥","치즈김밥","쫄면","떡볶이","로제 떡볶이","순대","핫도그","라면","오뎅탕"};
		
		for(int i = 0; i< str.length; i++) {
			JButton[] bt = new  JButton[str.length];
			bt[i] = new JButton(new ImageIcon(imageAddr+str[i]+".jpg"));
			if (i<5) {
				bt[i].setBounds(20+i*150,30,130,130);
			} else if(i<10) {
				
				bt[i].setBounds(20+(i-5)*150,250,130,130);
			}
			f.add(bt[i]);
		};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setBounds(100,100,500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
