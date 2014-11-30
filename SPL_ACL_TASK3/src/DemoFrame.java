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
	private final JSpinner		spinner;
	private final JSpinner		spinner_1;
	private final JTextArea		txtrOutputWillBe;
	// #ifdef indexany
//@	private final JRadioButton	rdbtnIndexofany;
	// #endif
	// #ifdef striptonull
//@	private final JRadioButton	rdbtnStriptonull;
	// #endif
	private final JRadioButton	rdbtnStripStart;
	private final JRadioButton	rdbtnStripEnd;
	private final JRadioButton	rdbtnIndexof;
	// #ifdef ordinalindexing
//@	private final JRadioButton	rdbtnOrdinalindexof;
	// #endif
	// #ifdef indexic
//@	private final JRadioButton	rdbtnIndexofignorecase;
	// #endif
	private final JRadioButton	rdbtnLeft;
	private final JRadioButton	rdbtnMid;
	private final JRadioButton	rdbtnRight;
	private final JLabel		lblArgument1;
	private final JLabel		lblArgument2;
	private final JLabel		lblArgument3;
	private final JLabel		lblArgument4;
	private final ButtonGroup	buttonGroup	= new ButtonGroup();
	private final JPanel		panel;
	private final JButton		btnRun;
	
	public static void main(String[] args) {
		System.out.println("preprocessor defines to enable features: ");
		System.out.println("ordinalindexing=1, striptonull=1, indexic=1, indexany=1");
		System.out.println("!needed as global defines in project properties!");
		try {
			LookAndFeelInfo[] list = UIManager.getInstalledLookAndFeels();
			UIManager.setLookAndFeel(list[1].getClassName());
		}
		catch (Throwable e) {
		}
		EventQueue.invokeLater(new Runnable() {
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
		System.out.println("");
		setTitle("Unofficial Apache Commons Lang Demo Utility");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		setMinimumSize(new Dimension(550, 330));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0 };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblSelectOneOf = new JLabel("Select one of the features to look what it makes:");
		GridBagConstraints gbc_lblSelectOneOf = new GridBagConstraints();
		gbc_lblSelectOneOf.gridwidth = 2;
		gbc_lblSelectOneOf.insets = new Insets(0, 0, 5, 0);
		gbc_lblSelectOneOf.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSelectOneOf.gridx = 0;
		gbc_lblSelectOneOf.gridy = 0;
		contentPane.add(lblSelectOneOf, gbc_lblSelectOneOf);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weighty = 1.0;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridwidth = 2;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));
		
		rdbtnStripStart = new JRadioButton("stripStart");
		rdbtnStripStart.addActionListener(this);
		rdbtnStripStart.setSelected(true);
		panel.add(rdbtnStripStart);
		buttonGroup.add(rdbtnStripStart);
		
		rdbtnStripEnd = new JRadioButton("stripEnd");
		rdbtnStripEnd.addActionListener(this);
		panel.add(rdbtnStripEnd);
		buttonGroup.add(rdbtnStripEnd);
		
		// #ifdef striptonull
//@		rdbtnStriptonull = new JRadioButton("stripToNull");
//@		rdbtnStriptonull.addActionListener(this);
//@		panel.add(rdbtnStriptonull);
//@		buttonGroup.add(rdbtnStriptonull);
		// #endif
		
		rdbtnIndexof = new JRadioButton("indexOf");
		rdbtnIndexof.addActionListener(this);
		panel.add(rdbtnIndexof);
		buttonGroup.add(rdbtnIndexof);
		
		// #ifdef indexany
//@		rdbtnIndexofany = new JRadioButton("indexOfAny");
//@		rdbtnIndexofany.addActionListener(this);
//@		panel.add(rdbtnIndexofany);
//@		buttonGroup.add(rdbtnIndexofany);
		// #endif
		
		// #ifdef ordinalindexing
//@		rdbtnOrdinalindexof = new JRadioButton("ordinalIndexOf");
//@		rdbtnOrdinalindexof.addActionListener(this);
//@		panel.add(rdbtnOrdinalindexof);
//@		buttonGroup.add(rdbtnOrdinalindexof);
		// #endif
		
		// #ifdef indexic
//@		rdbtnIndexofignorecase = new JRadioButton("indexOfIgnoreCase");
//@		rdbtnIndexofignorecase.addActionListener(this);
//@		buttonGroup.add(rdbtnIndexofignorecase);
//@		panel.add(rdbtnIndexofignorecase);
		// #endif
		
		rdbtnLeft = new JRadioButton("left");
		rdbtnLeft.addActionListener(this);
		buttonGroup.add(rdbtnLeft);
		panel.add(rdbtnLeft);
		
		rdbtnMid = new JRadioButton("mid");
		rdbtnMid.addActionListener(this);
		buttonGroup.add(rdbtnMid);
		panel.add(rdbtnMid);
		
		rdbtnRight = new JRadioButton("right");
		rdbtnRight.addActionListener(this);
		buttonGroup.add(rdbtnRight);
		panel.add(rdbtnRight);
		
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
		
		lblArgument4 = new JLabel("Argument 4 (int>=0)");
		GridBagConstraints gbc_lblArgument4 = new GridBagConstraints();
		gbc_lblArgument4.anchor = GridBagConstraints.WEST;
		gbc_lblArgument4.insets = new Insets(0, 0, 5, 5);
		gbc_lblArgument4.gridx = 0;
		gbc_lblArgument4.gridy = 5;
		contentPane.add(lblArgument4, gbc_lblArgument4);
		
		spinner_1 = new JSpinner();
		GridBagConstraints gbc_spinner_1 = new GridBagConstraints();
		gbc_spinner_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_1.insets = new Insets(0, 0, 5, 0);
		gbc_spinner_1.gridx = 1;
		gbc_spinner_1.gridy = 5;
		contentPane.add(spinner_1, gbc_spinner_1);
		GridBagConstraints gbc_btnRun = new GridBagConstraints();
		gbc_btnRun.anchor = GridBagConstraints.EAST;
		gbc_btnRun.insets = new Insets(0, 0, 5, 0);
		gbc_btnRun.gridx = 1;
		gbc_btnRun.gridy = 6;
		contentPane.add(btnRun, gbc_btnRun);
		
		txtrOutputWillBe = new JTextArea();
		txtrOutputWillBe.setEditable(false);
		txtrOutputWillBe.setTabSize(2);
		txtrOutputWillBe.setLineWrap(true);
		txtrOutputWillBe.setWrapStyleWord(true);
		txtrOutputWillBe.setText("Output will be here...");
		GridBagConstraints gbc_txtrOutputWillBe = new GridBagConstraints();
		gbc_txtrOutputWillBe.weighty = 2.0;
		gbc_txtrOutputWillBe.gridwidth = 2;
		gbc_txtrOutputWillBe.fill = GridBagConstraints.BOTH;
		gbc_txtrOutputWillBe.gridx = 0;
		gbc_txtrOutputWillBe.gridy = 7;
		contentPane.add(txtrOutputWillBe, gbc_txtrOutputWillBe);
		
		setupInput(rdbtnStripStart);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnRun)) {
			String s1 = textField.getText();
			String s2 = textField_1.getText();
			int i1 = Integer.parseInt(spinner.getValue().toString());
			int i2 = Integer.parseInt(spinner_1.getValue().toString());
			String res = "";
			txtrOutputWillBe.setText("Result of call\n\n");
			if (rdbtnStripStart.isSelected()) {
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
			// #ifdef indexany
//@			else if (rdbtnIndexofany.isSelected()) {
//@				res = Integer.toString(StringUtils.indexOfAny(s1, s2));
//@				txtrOutputWillBe.append("indexOfAny(\"" + s1 + "\", \"" + s2 + "\")");
//@			}
			// #endif
			// #ifdef ordinalindexing
//@			else if (rdbtnOrdinalindexof.isSelected()) {
//@				res = Integer.toString(StringUtils.ordinalIndexOf(s1, s2, i1));
//@				txtrOutputWillBe.append("ordinalIndexOf(\"" + s1 + "\", \"" + s2 + "\", " + i1 + ")");
//@			}
			// #endif
			// #ifdef striptonull
//@			else if (rdbtnStriptonull.isSelected()) {
//@				res = StringUtils.stripToNull(s1);
//@				txtrOutputWillBe.append("stringToNull(\"" + s1 + "\")");
//@			}
			// #endif
			// #ifdef indexic
//@			else if (rdbtnIndexofignorecase.isSelected()) {
//@				res = Integer.toString(StringUtils.indexOfIgnoreCase(s1, s2));
//@				txtrOutputWillBe.append("indexOfIgnoreCase(\"" + s1 + "\", \"" + s2 + "\")");
//@			}
			// #endif
			else if (rdbtnLeft.isSelected()) {
				res = StringUtils.left(s1, i1);
				txtrOutputWillBe.append("left(\"" + s1 + "\", " + i1 + ")");
			}
			else if (rdbtnMid.isSelected()) {
				res = StringUtils.mid(s1, i1, i2);
				txtrOutputWillBe.append("left(\"" + s1 + "\", " + i1 + ", " + i2 + ")");
			}
			else if (rdbtnRight.isSelected()) {
				res = StringUtils.right(s1, i1);
				txtrOutputWillBe.append("left(\"" + s1 + "\", " + i1 + ")");
			}
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
		else {
			setupInput(e.getSource());
		}
	}
	
	private void setupInput(Object reference) {
		if (reference == null) return;
		if (reference.equals(rdbtnStripStart)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		else if (reference.equals(rdbtnStripEnd)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		else if (reference.equals(rdbtnIndexof)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		// #ifdef indexany
//@		else if (reference.equals(rdbtnIndexofany)) {
//@			lblArgument1.setVisible(true);
//@			lblArgument2.setVisible(true);
//@			lblArgument3.setVisible(false);
//@			lblArgument4.setVisible(false);
//@		}
		// #endif
		// #ifdef ordinalindexing
//@		else if (reference.equals(rdbtnOrdinalindexof)) {
//@			lblArgument1.setVisible(true);
//@			lblArgument2.setVisible(false);
//@			lblArgument3.setVisible(true);
//@			lblArgument4.setVisible(false);
//@		}
		// #endif
		// #ifdef striptonull
//@		else if (reference.equals(rdbtnStriptonull)) {
//@			lblArgument1.setVisible(true);
//@			lblArgument2.setVisible(false);
//@			lblArgument3.setVisible(false);
//@			lblArgument4.setVisible(false);
//@		}
		// #endif
		// #ifdef indexic
//@		else if (reference.equals(rdbtnIndexofignorecase)) {
//@			lblArgument1.setVisible(true);
//@			lblArgument2.setVisible(true);
//@			lblArgument3.setVisible(false);
//@			lblArgument4.setVisible(false);
//@		}
		// #endif
		else if (reference.equals(rdbtnLeft)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(false);
			lblArgument3.setVisible(true);
			lblArgument4.setVisible(false);
		}
		else if (reference.equals(rdbtnRight)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(false);
			lblArgument3.setVisible(true);
			lblArgument4.setVisible(false);
		}
		else if (reference.equals(rdbtnMid)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(false);
			lblArgument3.setVisible(true);
			lblArgument4.setVisible(true);
		}
		textField.setVisible(lblArgument1.isVisible());
		textField_1.setVisible(lblArgument2.isVisible());
		spinner.setVisible(lblArgument3.isVisible());
		spinner_1.setVisible(lblArgument4.isVisible());
	}
}
