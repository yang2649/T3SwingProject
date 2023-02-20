package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Category extends JFrame {

	GridBagLayout gbl;
	GridBagConstraints gbc;
	JLabel title, bigLbl, middleLbl, locLbl;
	JTextField bigTxt, middleTxt, locTxt;
	JButton bigBtn, middleBtn, locBtn;

	public Category() {
		setTitle("카테고리");
		
		init();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(600,600);
		setVisible(true);
	}
	
	private void init() {
		
		gbl = new GridBagLayout();
		this.setLayout(gbl);
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		// 제목
		title = new JLabel("카테고리 추가 및 수정");
		title.setHorizontalAlignment(JLabel.CENTER);
		gblAdd(title, 0, 0, 4, 1);
		
		// 대분류
		JPanel bigJ = new JPanel();
		bigLbl = new JLabel("대분류");
		bigTxt = new JTextField(20);
		bigBtn = new JButton("추가");
		
		bigJ.add(bigLbl);
		bigJ.add(bigTxt);
		bigJ.add(bigBtn);
		
		gblAdd(bigJ, 0, 1, 4, 1);
		
	}

	public void gblAdd(JComponent c, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbl.setConstraints(c, gbc);
		gbc.insets = new Insets(5,5,5,5);
		this.add(c,gbc);
	}

	public static void main(String[] args) {
		new Category();
	}

}
