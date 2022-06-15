package client.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class importanceFrm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					importanceFrm frame = new importanceFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public importanceFrm() {
		setTitle("\u7259\u9F7F\u79D1\u666E\u5C0F\u7A0B\u5E8F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("仿宋", Font.PLAIN, 16));
		textArea.setText("\u7259\u9F7F\u867D\u7136\u770B\u8D77\u6765\u53EA\u662F\u6211\u4EEC\u8EAB\u4F53\u4E0A\u7684\u4E00\u4E2A\u5C0F\u5668\u5B98\uFF0C\u4F46\u662F\uFF0C\u7259\u9F7F\u5374\u662F\u6211\u4EEC\u8EAB\u4F53\u4E0A\u6700\u91CD\u8981\u7684\u5668\u5B98\u4E4B\u4E00\u3002 \u5927\u5BB6\u53EF\u80FD\u4F1A\u8BA4\u4E3A\uFF0C\u7259\u9F7F\u53EA\u662F\u7528\u6765\u5480\u56BC\u4E00\u4E0B\u98DF\u7269\uFF0C\u600E\u4E48\u4F1A\u662F\u6700\u91CD\u8981\u7684\u5668\u5B98\u5462?\u7259\u9F7F\u9664\u4E86\u5E73\u65F6\u5E2E\u52A9\u6211\u4EEC\u8FDB\u884C\u5480\u56BC\u98DF\u7269\uFF0C\u4F7F\u6211\u4EEC\u53EF\u4EE5\u5145\u5206\u5730\u5438\u6536\u98DF\u7269\u7684\u8425\u517B\u5916;\u8FD8\u6709\u53EF\u4EE5\u652F\u6491\u988C\u9AA8\uFF0C\u4F7F\u6211\u4EEC\u7684\u8138\u578B\u53D8\u7684\u66F4\u5B8C\u7F8E;\u7259\u9F7F\u8FD8\u662F\u5F71\u54CD\u6211\u4EEC\u8BF4\u8BDD\u53D1\u97F3\u7684\u91CD\u8981\u6240\u5728;\u6240\u4EE5\uFF0C\u5728\u65E5\u5E38\u7684\u751F\u6D3B\u4E2D\u5E94\u8BE5\u8981\u4FDD\u62A4\u597D\u6211\u4EEC\u7684\u7259\u9F7F\uFF0C\u54EA\u6015\u53EA\u662F\u7259\u9F7F\u7F3A\u635F\u4E86\u4E00\u70B9\u70B9\uFF0C\u6211\u4EEC\u4E5F\u5E94\u8BE5\u8981\u5C3D\u65E9\u5730\u8FDB\u884C\u8865\u7259\u6CBB\u7597\u3002");
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		JLabel lblNewLabel = new JLabel("\u7259\u9F7F\u91CD\u8981\u6027");
		lblNewLabel.setFont(new Font("楷体", Font.BOLD, 19));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 406, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(183)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
					.addGap(20))
		);
		contentPane.setLayout(gl_contentPane);
		this.setLocationRelativeTo(null);
	}
}
