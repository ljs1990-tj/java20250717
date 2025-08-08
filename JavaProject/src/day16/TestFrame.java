package day16;

import javax.swing.JFrame;

public class TestFrame extends JFrame {
	public TestFrame() {
		 setTitle("test1234");
		 setSize(300,300); // 프레임크기300x300
		 setVisible(true); // 프레임출력
	}
	public static void main(String[] args) {
		TestFrame myFrame = new TestFrame();
	}
}

