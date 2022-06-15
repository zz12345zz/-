package client.view;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class mainFrm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrm frame = new mainFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
//	}

	/**
	 * Create the frame.
	 */
	public mainFrm() {
	
		setType(Type.UTILITY);
		setTitle("\u7CFB\u7EDF\u4E3B\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u7259\u9F7F\u79D1\u666E\u5C0F\u7A0B\u5E8F",JLabel.CENTER);
		lblNewLabel.setFont(new Font("华文彩云", Font.BOLD, 20));
		
		
		JButton btnNewButton = new JButton("\u4E86\u89E3\u7259\u9F7F\u4FE1\u606F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new chaxunFrm().setVisible(true);

			}
		});
		
		JButton btnNewButton_1 = new JButton("\u7259\u9F7F\u7684\u91CD\u8981\u6027");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new importanceFrm().setVisible(true);
			}
		});
		
		JButton btnNewButton_2 = new JButton("\u9000\u51FA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "是否退出系统");
				if (result == 0)
				dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(156)
					.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
					.addGap(163))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(156)
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
					.addGap(164))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(157)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
					.addGap(164))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addComponent(btnNewButton)
					.addGap(41)
					.addComponent(btnNewButton_1)
					.addGap(43)
					.addComponent(btnNewButton_2)
					.addContainerGap(144, Short.MAX_VALUE))
		);
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {btnNewButton, btnNewButton_1, btnNewButton_2});
		contentPane.setLayout(gl_contentPane);
		this.setLocationRelativeTo(null);
	}
	
}
