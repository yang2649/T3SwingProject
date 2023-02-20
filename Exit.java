package view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Exit extends JFrame{

	GridBagConstraints gbc;
	GridBagLayout gbl;
	JLabel title, idLbl, pwLbl, pwcfLbl;
	JPasswordField pwTxt, pwcfTxt;
	JTextField idTxt;
	JButton exitBtn, cancelBtn;
	Font f1;
	
	public Exit() {
		setTitle("회원 탈퇴");
		
		init();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500,700);
		setVisible(true);
	}
	
	private void init() {
		
		gbl = new GridBagLayout();
		this.setLayout(gbl);
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;

		f1 = new Font("HY견고딕", Font.BOLD, 40);
		
		// 제목
		title = new JLabel("회원탈퇴");
		title.setFont(f1);
		title.setHorizontalAlignment(JLabel.CENTER);
		gblAdd(title, 0, 0, 4, 1);
		
		// 아이디
		JPanel pId = new JPanel();
		idLbl = new JLabel("아이디 :");
		idTxt = new JTextField(20);
		idTxt.setEditable(false);

		pId = new JPanel();
		pId.add(idLbl);
		pId.add(idTxt);

		gblAdd(pId, 0, 1, 4, 1);
		
		// 이전 비밀번호
		JPanel pPw = new JPanel();
		pwLbl = new JLabel("이전 비밀번호 :");
		pwTxt = new JPasswordField(20);

		pPw.add(pwLbl);
		pPw.add(pwTxt);

		gblAdd(pPw, 0, 2, 4, 1);

		// 비밀번호 확인
		JPanel pCF = new JPanel();
		pwcfLbl = new JLabel("비밀번호 확인:");
		pwcfTxt = new JPasswordField(20);

		pCF.add(pwcfLbl);
		pCF.add(pwcfTxt);

		gblAdd(pCF, 0, 3, 4, 1);
		
		// 버튼
		JPanel pButton = new JPanel();
		JButton loginBtn = new JButton("회원탈퇴");
		JButton joinBtn = new JButton("취소");

		pButton.add(loginBtn);
		pButton.add(joinBtn);
		gblAdd(pButton, 0, 4, 4, 1);
		
	}

	private void gblAdd(JComponent c, int x, int y, int w, int h) {
		gbc.gridx      = x;
		gbc.gridy      = y;
		gbc.gridwidth  = w;
		gbc.gridheight = h;
		gbl.setConstraints(c, gbc);
		gbc.insets     = new Insets(5, 5, 5, 5);
		this.add(c, gbc);
	}
	
	public static void main(String[] args) {
		new Exit();
		
	}

}
