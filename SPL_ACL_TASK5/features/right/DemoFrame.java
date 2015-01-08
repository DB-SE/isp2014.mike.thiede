import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;

public class DemoFrame {
	private final JRadioButton		rdbtnRight;
	public DemoFrame() {
		rdbtnRight = new JRadioButton("right");
		rdbtnRight.addActionListener(this);
		panel.add(rdbtnRight);
		buttonGroup.add(rdbtnRight);
	}
	
	public void actionPerformed(ActionEvent e) {
		original(e);
		if (!e.getSource().equals(btnRun))return;
		String s1 = textField.getText();
		int i1 = Integer.parseInt(spinner.getValue().toString());
		if (rdbtnRight.isSelected()) {
			String res = StringUtils.right(s1, i1);
			txtrOutputWillBe.append("right(\"" + s1 + "\", " + i1 + ")");
			txtrOutputWillBe.append(":\n\n\"" + res + "\"");
		}
	}
	
	private void setupInput(Object reference) {
		if (rdbtnRight.equals(reference)) {
			lblArgument1.setVisible(true);
			lblArgument2.setVisible(false);
			lblArgument3.setVisible(true);
			lblArgument4.setVisible(false);
		}
		original(reference);
	}
}