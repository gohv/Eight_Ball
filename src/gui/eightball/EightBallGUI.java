package gui.eightball;

import chooser.eightball.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import answershandler.eightball.*;

public class EightBallGUI extends JFrame {
	private JTextField textField;
	private JTextField questionText;
	private JTextField answersText;
	AnswerChooser chooser = new AnswerChooser();
	Answers answer = new Answers();
	private String answerString;
	private JButton askButton = new JButton("ASK!");
	private boolean isClicked = false;

	public EightBallGUI() {
		createUI();
	}

	public void createUI() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		questionText = new JTextField();
		questionText.setBounds(12, 13, 482, 52);
		getContentPane().add(questionText);
		questionText.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				updateButton();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				updateButton();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				updateButton();
			}
		});
		questionText.setColumns(10);

		askButton.setEnabled(false);

		askButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				updateButton();
				choose();
				clickAgain();

			}
		});

		setTitle("The Magic 8 Ball");
		setBounds(100, 100, 524, 314);
		getContentPane().setLayout(null);

		answersText = new JTextField();
		answersText.setBounds(12, 189, 482, 52);

		answersText.setEditable(false);
		getContentPane().add(answersText);
		answersText.setColumns(10);

		askButton.setBounds(12, 78, 482, 90);
		getContentPane().add(askButton);

	}

	private void choose() {

		if (chooser.getChooser() == 1) {
			answerString = answer.getAnswer1();
		} else if (chooser.getChooser() == 2) {
			answerString = answer.getAnswer2();
		} else if (chooser.getChooser() == 3) {
			answerString = answer.getAnswer3();
		} else if (chooser.getChooser() == 4) {
			answerString = answer.getAnswer4();
		} else if (chooser.getChooser() == 5) {
			answerString = answer.getAnswer5();
		} else if (chooser.getChooser() == 6) {
			answerString = answer.getAnswer6();
		} else if (chooser.getChooser() == 7) {
			answerString = answer.getAnswer7();
		} else if (chooser.getChooser() == 8) {
			answerString = answer.getAnswer8();
		} else if (chooser.getChooser() == 10) {
			answerString = answer.getAnswer10();
		} else if (chooser.getChooser() == 11) {
			answerString = answer.getAnswer11();
		} else if (chooser.getChooser() == 12) {
			answerString = answer.getAnswer12();
		} else if (chooser.getChooser() == 13) {
			answerString = answer.getAnswer13();
		} else if (chooser.getChooser() == 14) {
			answerString = answer.getAnswer14();
		} else if (chooser.getChooser() == 15) {
			answerString = answer.getAnswer15();
		} else if (chooser.getChooser() == 16) {
			answerString = answer.getAnswer16();
		} else if (chooser.getChooser() == 17) {
			answerString = answer.getAnswer17();
		} else if (chooser.getChooser() == 18) {
			answerString = answer.getAnswer18();
		} else if (chooser.getChooser() == 19) {
			answerString = answer.getAnswer19();
		} else if (chooser.getChooser() == 20) {
			answerString = answer.getAnswer20();
		} else if (chooser.getChooser() == 21) {
			answerString = answer.getAnswer21();
		}
		answersText.setText(answerString);
	}

	private void updateButton() {

		String getText = questionText.getText();
		if (getText.contains("?") && getText.length() >= 5) {
			askButton.setEnabled(true);

		} else {
			askButton.setEnabled(false);
			
		}
	}

	private void clickAgain() {
		askButton.setText("Click Again to Exit");
		askButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});

	}

}
