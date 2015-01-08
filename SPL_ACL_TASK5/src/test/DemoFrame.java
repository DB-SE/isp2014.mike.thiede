import java.awt.Dimension; 
import java.awt.EventQueue; 
import java.awt.FlowLayout; 
import java.awt.GridBagConstraints; 
import java.awt.GridBagLayout; 
import java.awt.Insets; import java.awt.event.ActionEvent; 
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

public   class  DemoFrame  extends JFrame  implements ActionListener {
	
	private final JPanel			contentPane;

	
	private final JTextField		textField;

	
	private final JTextField		textField_1;

	
	private final JSpinner			spinner;

	
	private final JSpinner			spinner_1;

	
	private final JTextArea			txtrOutputWillBe;

	
	private final JLabel			lblArgument1;

	
	private final JLabel			lblArgument2;

	
	private final JLabel			lblArgument3;

	
	private final JLabel			lblArgument4;

	
	private final ButtonGroup		buttonGroup	= new ButtonGroup();

	
	private final JPanel			panel;

	
	private final JButton			btnRun;

	
	
	public static void main(String[] args) {
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

	
	
	public DemoFrame  () {
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
	
		rdbtnStripToNull = new JRadioButton("stripToNull");
		rdbtnStripToNull.addActionListener(this);
		panel.add(rdbtnStripToNull);
		buttonGroup.add(rdbtnStripToNull);
	
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
	
		rdbtnOrdinalIndex = new JRadioButton("ordinalIndex");
		rdbtnOrdinalIndex.addActionListener(this);
		panel.add(rdbtnOrdinalIndex);
		buttonGroup.add(rdbtnOrdinalIndex);
	
		rdbtnIndexIC = new JRadioButton("indexOfIgnoreCase");
		rdbtnIndexIC.addActionListener(this);
		panel.add(rdbtnIndexIC);
		buttonGroup.add(rdbtnIndexIC);
	
		rdbtnIndexAny = new JRadioButton("indexOfAny");
		rdbtnIndexAny.addActionListener(this);
		panel.add(rdbtnIndexAny);
		buttonGroup.add(rdbtnIndexAny);
	
		rdbtnLeft = new JRadioButton("left");
		rdbtnLeft.addActionListener(this);
		panel.add(rdbtnLeft);
		buttonGroup.add(rdbtnLeft);
	
		rdbtnRight = new JRadioButton("right");
		rdbtnRight.addActionListener(this);
		panel.add(rdbtnRight);
		buttonGroup.add(rdbtnRight);
	
		rdbtnMid = new JRadioButton("mid");
		rdbtnMid.addActionListener(this);
		panel.add(rdbtnMid);
		buttonGroup.add(rdbtnMid);
	}

	
	
	 private void  actionPerformed__wrappee__SPLApacheCommonsLang  (ActionEvent e) {
		if (e.getSource().equals(btnRun)) {
			txtrOutputWillBe.setText("Result of call\n\n");
		}
		else {
			setupInput(e.getSource());
		}
	}

	
	
	 private void  actionPerformed__wrappee__stripToNull  (ActionEvent e) {
		actionPerformed__wrappee__SPLApacheCommonsLang(e);
		if (!e.getSource().equals(btnRun))return;
		String s1 = textField.getText();
		if (rdbtnStripToNull.isSelected()) {
			String res = StringUtils.stripToNull(s1);
			txtrOutputWillBe.append("stripToNull(\"" + s1 + "\")");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}

	
	
	 private void  actionPerformed__wrappee__stripStart  (ActionEvent e) {
		actionPerformed__wrappee__stripToNull(e);
		if (!e.getSource().equals(btnRun)) return;
		String s1 = textField.getText();
		String s2 = textField_1.getText();
		if (rdbtnStripStart.isSelected()) {
			String res = StringUtils.stripStart(s1, s2);
			txtrOutputWillBe.append("stripStart(\"" + s1 + "\", \"" + s2 + "\")");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}

	
	
	 private void  actionPerformed__wrappee__stripEnd  (ActionEvent e) {
		actionPerformed__wrappee__stripStart(e);
		if (!e.getSource().equals(btnRun)) return;
		String s1 = textField.getText();
		String s2 = textField_1.getText();
		if (rdbtnStripEnd.isSelected()) {
			String res = StringUtils.stripEnd(s1, s2);
			txtrOutputWillBe.append("stripEnd(\"" + s1 + "\", \"" + s2 + "\")");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}

	
	
	 private void  actionPerformed__wrappee__indexOf  (ActionEvent e) {
		actionPerformed__wrappee__stripEnd(e);
		if (!e.getSource().equals(btnRun))return;
		String s1 = textField.getText();
		String s2 = textField_1.getText();
		if (rdbtnIndexof.isSelected()) {
			String res = Integer.toString(StringUtils.indexOf(s1, s2.isEmpty() ? 0 : s2.charAt(0)));
			txtrOutputWillBe.append("indexOf(\"" + s1 + "\", '" + (s2.isEmpty() ? 0 : s2.charAt(0)) + "')");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}

	
	
	 private void  actionPerformed__wrappee__ordinalIndexOf  (ActionEvent e) {
		actionPerformed__wrappee__indexOf(e);
		if (!e.getSource().equals(btnRun))return;
		String s1 = textField.getText();
		String s2 = textField_1.getText();
		int i1 = Integer.parseInt(spinner.getValue().toString());
		if (rdbtnOrdinalIndex.isSelected()) {
			String res = Integer.toString(StringUtils.ordinalIndexOf(s1, s2, i1));
			txtrOutputWillBe.append("ordinalIndex(\"" + s1 + "\", \"" + s2 + "\", " + i1 + ")");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}

	
	
	 private void  actionPerformed__wrappee__indexOfIgnoreCase  (ActionEvent e) {
		actionPerformed__wrappee__ordinalIndexOf(e);
		if (!e.getSource().equals(btnRun))return;
		String s1 = textField.getText();
		String s2 = textField_1.getText();
		if (rdbtnIndexIC.isSelected()) {
			String res = Integer.toString(StringUtils.indexOfIgnoreCase(s1, s2));
			txtrOutputWillBe.append("indexOfIgnoreCase(\"" + s1 + "\", '" + (s2.isEmpty() ? 0 : s2.charAt(0)) + "')");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}

	
	
	 private void  actionPerformed__wrappee__indexOfAny  (ActionEvent e) {
		actionPerformed__wrappee__indexOfIgnoreCase(e);
		if (!e.getSource().equals(btnRun)) return;
		String s1 = textField.getText();
		String s2 = textField_1.getText();
		if (rdbtnIndexAny.isSelected()) {
			String res = Integer.toString(StringUtils.indexOfAny(s1, s2));
			txtrOutputWillBe.append("indexOfAny(\"" + s1 + "\", '" + s2 + "')");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}

	
	
	 private void  actionPerformed__wrappee__left  (ActionEvent e) {
		actionPerformed__wrappee__indexOfAny(e);
		if (!e.getSource().equals(btnRun))return;
		String s1 = textField.getText();
		int i1 = Integer.parseInt(spinner.getValue().toString());
		if (rdbtnLeft.isSelected()) {
			String res = StringUtils.left(s1, i1);
			txtrOutputWillBe.append("left(\"" + s1 + "\", " + i1 + ")");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}

	
	
	 private void  actionPerformed__wrappee__right  (ActionEvent e) {
		actionPerformed__wrappee__left(e);
		if (!e.getSource().equals(btnRun))return;
		String s1 = textField.getText();
		int i1 = Integer.parseInt(spinner.getValue().toString());
		if (rdbtnRight.isSelected()) {
			String res = StringUtils.right(s1, i1);
			txtrOutputWillBe.append("right(\"" + s1 + "\", " + i1 + ")");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}

	
	
	public void actionPerformed(ActionEvent e) {
		actionPerformed__wrappee__right(e);
		if (!e.getSource().equals(btnRun)) return;
		String s1 = textField.getText();
		int i1 = Integer.parseInt(spinner.getValue().toString());
		int i2 = Integer.parseInt(spinner_1.getValue().toString());
		if (rdbtnMid.isSelected()) {
			String res = StringUtils.mid(s1, i1, i2);
			txtrOutputWillBe.append("mid(\"" + s1 + "\", " + i1 + "\", " + i2 + ")");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}

	
	
	 private void  setupInput__wrappee__SPLApacheCommonsLang  (Object reference) {
		if (reference == null) return;		
		textField.setVisible(lblArgument1.isVisible());
		textField_1.setVisible(lblArgument2.isVisible());
		spinner.setVisible(lblArgument3.isVisible());
		spinner_1.setVisible(lblArgument4.isVisible());
	}

	
	
	 private void  setupInput__wrappee__stripToNull  (Object reference) {
		if (rdbtnStripToNull.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(false);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		setupInput__wrappee__SPLApacheCommonsLang(reference);
	}

	
	
	 private void  setupInput__wrappee__stripStart  (Object reference) {
		if (rdbtnStripStart.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		setupInput__wrappee__stripToNull(reference);
	}

	
	
	 private void  setupInput__wrappee__stripEnd  (Object reference) {
		if (rdbtnStripEnd.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		setupInput__wrappee__stripStart(reference);
	}

	
	
	 private void  setupInput__wrappee__indexOf  (Object reference) {
		if (rdbtnIndexof.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		setupInput__wrappee__stripEnd(reference);
	}

	
	
	 private void  setupInput__wrappee__ordinalIndexOf  (Object reference) {
		if (rdbtnOrdinalIndex.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(true);
			lblArgument4.setVisible(false);
		}
		setupInput__wrappee__indexOf(reference);
	}

	
	
	 private void  setupInput__wrappee__indexOfIgnoreCase  (Object reference) {
		if (rdbtnIndexIC.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		setupInput__wrappee__ordinalIndexOf(reference);
	}

	
	
	 private void  setupInput__wrappee__indexOfAny  (Object reference) {
		if (rdbtnIndexAny.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(false);
			lblArgument4.setVisible(false);
		}
		setupInput__wrappee__indexOfIgnoreCase(reference);
	}

	
	
	 private void  setupInput__wrappee__left  (Object reference) {
		if (rdbtnLeft.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(false);
			lblArgument3.setVisible(true);
			lblArgument4.setVisible(false);
		}
		setupInput__wrappee__indexOfAny(reference);
	}

	
	
	 private void  setupInput__wrappee__right  (Object reference) {
		if (rdbtnRight.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(false);
			lblArgument3.setVisible(true);
			lblArgument4.setVisible(false);
		}
		setupInput__wrappee__left(reference);
	}

	
	
	private void setupInput(Object reference) {
		if (rdbtnMid.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(false);
			lblArgument3.setVisible(true);
			lblArgument4.setVisible(true);
		}
		setupInput__wrappee__right(reference);
	}

	
	private final JRadioButton		rdbtnStripToNull;

	
	private final JRadioButton	rdbtnStripStart;

	
	private final JRadioButton	rdbtnStripEnd;

	
	private final JRadioButton		rdbtnIndexof;

	
	private final JRadioButton		rdbtnOrdinalIndex;

	
	private final JRadioButton		rdbtnIndexIC;

	
	private final JRadioButton	rdbtnIndexAny;

	
	private final JRadioButton		rdbtnLeft;

	
	private final JRadioButton		rdbtnRight;

	
	private final JRadioButton	rdbtnMid;


}
