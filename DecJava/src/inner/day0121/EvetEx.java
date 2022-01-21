package inner.day0121;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvetEx {
	
	
	public static void main(String[] args) {
		Frame f = new Frame();
		Panel p =new Panel();
		Button b = new Button("push1");
		Button b1 = new Button("push2");
		
		
		// 응애(응애2() {오버라이드});
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭 by inner");
				
			}
			
		});
		
		//두번째 버튼을 클릭하면 "helllo"가 출력되도록 익명클래스 작성
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello");
				
			}
			
		});

			
		p.add(b);
		p.add(b1);
		p.add(p);
		f.add(b);
		f.setBounds(100, 100, 300, 30);
		f.setVisible(true);
		

	}

}

class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 눌렸습니다.");
		
	}
	
	}

