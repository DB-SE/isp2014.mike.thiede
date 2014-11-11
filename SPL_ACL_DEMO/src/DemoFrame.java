import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("all")
public class DemoFrame extends JFrame implements ActionListener {
	private final JPanel		contentPane;
	private final JTextField	textField;
	private final JTextField	textField_1;
	private final JTextArea		txtrOutputWillBe;
	private final JRadioButton	rdbtnIndexofany;
	private final JRadioButton	rdbtnStriptonull;
	private final JRadioButton	rdbtnStripStart;
	private final JRadioButton	rdbtnStripEnd;
	private final JRadioButton	rdbtnIndexof;
	private final JRadioButton	rdbtnOrdinalindexof;
	private final JLabel		lblArgument1;
	private final JLabel		lblArgument2;
	private final ButtonGroup	buttonGroup	= new ButtonGroup();
	private final JPanel		panel;
	private final JButton		btnRun;
	private final JSpinner		spinner;
	private final JLabel		lblArgument3;
	
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
		setBounds(100, 100, 550, 330);
		setMinimumSize(new Dimension(550, 330));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0 };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
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
		rdbtnStriptonull.addActionListener(this);
		rdbtnStriptonull.setSelected(true);
		panel.add(rdbtnStriptonull);
		buttonGroup.add(rdbtnStriptonull);
		
		rdbtnStripStart = new JRadioButton("stripStart");
		rdbtnStripStart.addActionListener(this);
		panel.add(rdbtnStripStart);
		buttonGroup.add(rdbtnStripStart);
		
		rdbtnStripEnd = new JRadioButton("stripEnd");
		rdbtnStripEnd.addActionListener(this);
		panel.add(rdbtnStripEnd);
		buttonGroup.add(rdbtnStripEnd);
		
		rdbtnIndexof = new JRadioButton("indexOf");
		rdbtnIndexof.addActionListener(this);
		panel.add(rdbtnIndexof);
		buttonGroup.add(rdbtnIndexof);
		
		rdbtnIndexofany = new JRadioButton("indexOfAny");
		rdbtnIndexofany.addActionListener(this);
		panel.add(rdbtnIndexofany);
		buttonGroup.add(rdbtnIndexofany);
		
		rdbtnOrdinalindexof = new JRadioButton("ordinalIndexOf");
		rdbtnOrdinalindexof.addActionListener(this);
		panel.add(rdbtnOrdinalindexof);
		buttonGroup.add(rdbtnOrdinalindexof);
		
		lblArgument1 = new JLabel("Argument 1 (String/char):");
		GridBagConstraints gbc_lblArgument = new GridBagConstraints();
		gbc_lblArgument.insets = new Insets(0, 0, 5, 5);
		gbc_lblArgument.anchor = GridBagConstraints.WEST;
		gbc_lblArgument.gridx = 0;
		gbc_lblArgument.gridy = 2;
		contentPane.add(lblArgument1, gbc_lblArgument);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblArgument2 = new JLabel("Argument 2 (String/char):");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		contentPane.add(lblArgument2, gbc_lblNewLabel);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 3;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		btnRun = new JButton("Run");
		btnRun.addActionListener(this);

		lblArgument3 = new JLabel("Argument 3 (int >=0):");
		GridBagConstraints gbc_lblArgumentinteger = new GridBagConstraints();
		gbc_lblArgumentinteger.anchor = GridBagConstraints.WEST;
		gbc_lblArgumentinteger.insets = new Insets(0, 0, 5, 5);
		gbc_lblArgumentinteger.gridx = 0;
		gbc_lblArgumentinteger.gridy = 4;
		contentPane.add(lblArgument3, gbc_lblArgumentinteger);

		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner.insets = new Insets(0, 0, 5, 0);
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 4;
		contentPane.add(spinner, gbc_spinner);
		GridBagConstraints gbc_btnRun = new GridBagConstraints();
		gbc_btnRun.anchor = GridBagConstraints.EAST;
		gbc_btnRun.insets = new Insets(0, 0, 5, 0);
		gbc_btnRun.gridx = 1;
		gbc_btnRun.gridy = 5;
		contentPane.add(btnRun, gbc_btnRun);
		
		txtrOutputWillBe = new JTextArea();
		txtrOutputWillBe.setEditable(false);
		txtrOutputWillBe.setTabSize(2);
		txtrOutputWillBe.setLineWrap(true);
		txtrOutputWillBe.setWrapStyleWord(true);
		txtrOutputWillBe.setText("Output will be here...");
		GridBagConstraints gbc_txtrOutputWillBe = new GridBagConstraints();
		gbc_txtrOutputWillBe.gridwidth = 2;
		gbc_txtrOutputWillBe.fill = GridBagConstraints.BOTH;
		gbc_txtrOutputWillBe.gridx = 0;
		gbc_txtrOutputWillBe.gridy = 6;
		contentPane.add(txtrOutputWillBe, gbc_txtrOutputWillBe);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnRun)) {
			String s1 = textField.getText();
			String s2 = textField_1.getText();
			int i = Integer.parseInt(spinner.getValue().toString());
			String res = "";
			txtrOutputWillBe.setText("Result of call\n\n");
			if (rdbtnStriptonull.isSelected()) {
				res = StringUtils.stripToNull(s1);
				txtrOutputWillBe.append("stringToNull(\"" + s1 + "\")");
			}
			else if (rdbtnStripStart.isSelected()) {
				res = StringUtils.stripStart(s1, s2);
				txtrOutputWillBe.append("stringStart(\"" + s1 + "\", \"" + s2 + "\")");
			}
			else if (rdbtnStripEnd.isSelected()) {
				res = StringUtils.stripEnd(s1, s2);
				txtrOutputWillBe.append("stringEnd(\"" + s1 + "\", \"" + s2 + "\")");
			}
			else if (rdbtnIndexof.isSelected()) {
				res = Integer.toString(StringUtils.indexOf(s1, s2.isEmpty() ? 0 : s2.charAt(0)));
				txtrOutputWillBe.append("indexOf(\"" + s1 + "\", '" + (s2.isEmpty() ? 0 : s2.charAt(0)) + "')");
			}
			else if (rdbtnIndexofany.isSelected()) {
				res = Integer.toString(StringUtils.indexOfAny(s1, s2));
				txtrOutputWillBe.append("indexOfAny(\"" + s1 + "\", \"" + s2 + "\")");
			}
			else if (rdbtnOrdinalindexof.isSelected()) {
				res = Integer.toString(StringUtils.ordinalIndexOf(s1, s2, i));
				txtrOutputWillBe.append("ordinalIndexOf(\"" + s1 + "\", \"" + s2 + "\")");
			}
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
		else if (e.getSource().equals(rdbtnStriptonull)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(false);
			lblArgument3.setVisible(false);
			textField.setVisible(true);
			textField_1.setVisible(false);
			spinner.setVisible(false);
		}
		else if (e.getSource().equals(rdbtnStripStart)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			textField.setVisible(true);
			textField_1.setVisible(true);
			spinner.setVisible(false);
		}
		else if (e.getSource().equals(rdbtnStripEnd)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			textField.setVisible(true);
			textField_1.setVisible(true);
			spinner.setVisible(false);
		}
		else if (e.getSource().equals(rdbtnIndexof)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			textField.setVisible(true);
			textField_1.setVisible(true);
			spinner.setVisible(false);
		}
		else if (e.getSource().equals(rdbtnIndexofany)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			textField.setVisible(true);
			textField_1.setVisible(true);
			spinner.setVisible(false);
		}
		else if (e.getSource().equals(rdbtnOrdinalindexof)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(false);
			lblArgument3.setVisible(true);
			textField.setVisible(true);
			textField_1.setVisible(false);
			spinner.setVisible(true);
		}
	}
}
