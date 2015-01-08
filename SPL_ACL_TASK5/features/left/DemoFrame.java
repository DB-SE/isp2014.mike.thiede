import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;

public class DemoFrame {
	private final JRadioButton		rdbtnLeft;
	public DemoFrame() {
		rdbtnLeft = new JRadioButton("left");
		rdbtnLeft.addActionListener(this);
		panel.add(rdbtnLeft);
		buttonGroup.add(rdbtnLeft);
	}
	
	public void actionPerformed(ActionEvent e) {
		original(e);
		if (!e.getSource().equals(btnRun))return;
		String s1 = textField.getText();
		int i1 = Integer.parseInt(spinner.getValue().toString());
		if (rdbtnLeft.isSelected()) {
			String res = StringUtils.left(s1, i1);
			txtrOutputWillBe.append("left(\"" + s1 + "\", " + i1 + ")");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}
	
	private void setupInput(Object reference) {
		if (rdbtnLeft.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(false);
			lblArgument3.setVisible(true);
			lblArgument4.setVisible(false);
		}
		original(reference);
	}
}