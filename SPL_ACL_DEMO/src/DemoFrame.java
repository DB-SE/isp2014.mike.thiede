import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("javadoc")
public class DemoFrame extends JFrame {
	private final JPanel		contentPane;
	private final JTextField	textField;
	private final JTextField	textField_1;
	private final JTextArea		txtrOutputWillBe;
	private final JRadioButton	rdbtnIndexofany;
	private final JRadioButton	rdbtnStriptonull;
	private final JRadioButton	rdbtnNewRadioButton;
	private final JRadioButton	rdbtnNewRadioButton_1;
	private final JRadioButton	rdbtnIndexof;
	private final JRadioButton	rdbtnOrdinalindexof;
	private final JLabel		lblArgument;
	private final JLabel		lblNewLabel;
	private final ButtonGroup	buttonGroup	= new ButtonGroup();
	private final JPanel		panel;
	private final JButton		btnRun;
	
	public static void main(String[] args) {
		try {
			LookAndFeelInfo[] list = UIManager.getInstalledLookAndFeels();
			UIManager.setLookAndFeel(list[1].getClassName());
		}
		catch (Throwable e) {
		}
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					DemoFrame frame = new DemoFrame();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public DemoFrame() {
		setTitle("Unofficial Apache Commons Lang Demo Utility");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0 };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblSelectOneOf = new JLabel("Select one of the features to look what is makes:");
		GridBagConstraints gbc_lblSelectOneOf = new GridBagConstraints();
		gbc_lblSelectOneOf.gridwidth = 2;
		gbc_lblSelectOneOf.insets = new Insets(0, 0, 5, 0);
		gbc_lblSelectOneOf.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSelectOneOf.gridx = 0;
		gbc_lblSelectOneOf.gridy = 0;
		contentPane.add(lblSelectOneOf, gbc_lblSelectOneOf);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridwidth = 2;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));
		
		rdbtnStriptonull = new JRadioButton("stripToNull");
		panel.add(rdbtnStriptonull);
		buttonGroup.add(rdbtnStriptonull);
		
		rdbtnNewRadioButton = new JRadioButton("stripStart");
		panel.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("stripEnd");
		panel.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		rdbtnIndexof = new JRadioButton("indexOf");
		panel.add(rdbtnIndexof);
		buttonGroup.add(rdbtnIndexof);
		
		rdbtnIndexofany = new JRadioButton("indexOfAny");
		panel.add(rdbtnIndexofany);
		buttonGroup.add(rdbtnIndexofany);
		
		rdbtnOrdinalindexof = new JRadioButton("ordinalIndexOf");
		panel.add(rdbtnOrdinalindexof);
		buttonGroup.add(rdbtnOrdinalindexof);
		
		lblArgument = new JLabel("Argument 1:");
		GridBagConstraints gbc_lblArgument = new GridBagConstraints();
		gbc_lblArgument.insets = new Insets(0, 0, 5, 5);
		gbc_lblArgument.anchor = GridBagConstraints.EAST;
		gbc_lblArgument.gridx = 0;
		gbc_lblArgument.gridy = 2;
		contentPane.add(lblArgument, gbc_lblArgument);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("Argument 2:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 3;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		btnRun = new JButton("Run");
		GridBagConstraints gbc_btnRun = new GridBagConstraints();
		gbc_btnRun.anchor = GridBagConstraints.EAST;
		gbc_btnRun.insets = new Insets(0, 0, 5, 0);
		gbc_btnRun.gridx = 1;
		gbc_btnRun.gridy = 4;
		contentPane.add(btnRun, gbc_btnRun);
		
		txtrOutputWillBe = new JTextArea();
		txtrOutputWillBe.setEditable(false);
		txtrOutputWillBe.setText("Output will be here...");
		GridBagConstraints gbc_txtrOutputWillBe = new GridBagConstraints();
		gbc_txtrOutputWillBe.gridwidth = 2;
		gbc_txtrOutputWillBe.fill = GridBagConstraints.BOTH;
		gbc_txtrOutputWillBe.gridx = 0;
		gbc_txtrOutputWillBe.gridy = 5;
		contentPane.add(txtrOutputWillBe, gbc_txtrOutputWillBe);
	}
}
