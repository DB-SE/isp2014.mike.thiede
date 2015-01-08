import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;


public class DemoFrame {
	private final JRadioButton		rdbtnOrdinalIndex;
	public DemoFrame() {
		rdbtnOrdinalIndex = new JRadioButton("ordinalIndex");
		rdbtnOrdinalIndex.addActionListener(this);
		panel.add(rdbtnOrdinalIndex);
		buttonGroup.add(rdbtnOrdinalIndex);
	}
	
	public void actionPerformed(ActionEvent e) {
		original(e);
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
	
	private void setupInput(Object reference) {
		if (rdbtnOrdinalIndex.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(true);
			lblArgument3.setVisible(true);
			lblArgument4.setVisible(false);
		}
		original(reference);
	}
}