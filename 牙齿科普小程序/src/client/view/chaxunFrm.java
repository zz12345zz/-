package client.view;

import Server.data.ToothDAO;
import client.net.SimpleClient;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import Server.data.FileOperation;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.ServerSocket;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;

public class chaxunFrm extends JFrame {

	private JPanel contentPane;
	public static JTextField textField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chaxunFrm frame = new chaxunFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		//}
//	}
	

	/**
	 * Create the frame.
	 */
	public chaxunFrm() {
		setTitle("\u67E5\u8BE2\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u4F60\u60F3\u8981\u67E5\u8BE2\u7684\u7259\u9F7F\u540D\u79F0");
		
		JTextArea ansArea = new JTextArea();
/*		JScrollPane scroll = new JScrollPane(textArea); 
		scroll.setVerticalScrollBarPolicy( 
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);*/
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String code = "A01-";
		    String commandStr=textField.getText();
		    commandStr = code+commandStr;
		    SimpleClient sc = new SimpleClient("127.0.0.1",4330,commandStr);
		    String responsStr = sc.run();
		    String intro = getIntro(responsStr);
		    ansArea.setText(responsStr);
			ansArea.setLineWrap(true);
			ansArea.setWrapStyleWord(true);
		    
		    
			/*ToothDAO td = new ToothDAO();
			
			result = td.getIntro(txt);
			txtrTextarea.setText(result);
			txtrTextarea.setLineWrap(true);
			txtrTextarea.setWrapStyleWord(true);*/
	

			}

			private String getIntro(String responsStr) {
				String intro = "N";
				
				String[] result = responsStr.split("-");
				if(result.length!=2) {
					intro = "N";
				}
				else {
					if("A01".equals(result[0])) {
						intro = result[1].trim();
					}
				}
				return intro;
			}
		});
		
		
	
	
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(164)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(106)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(ansArea, GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(ansArea, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		this.setLocationRelativeTo(null);
	}
}
