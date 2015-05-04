package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JTextField textFieldSifra;
	private JLabel label_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel label_2;
	private JTextField textField_3;
	private JLabel label_3;
	private JTextField textField_4;
	private JLabel label_4;
	private JTextField textField_5;
	private JLabel label_5;
	private JButton btnObrisi;
	private JButton btnOdustani;
	private JCheckBox chckbxNewCheckBox;
	boolean checked = false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setTitle("Obri\u0161i kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getLabel_1());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_2());
		contentPane.add(getLabel_2());
		contentPane.add(getTextField_3());
		contentPane.add(getLabel_3());
		contentPane.add(getTextField_4());
		contentPane.add(getLabel_4());
		contentPane.add(getTextField_5());
		contentPane.add(getLabel_5());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
		contentPane.add(getChckbxNewCheckBox());
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\u0160ifra");
			label.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label.setBounds(10, 11, 93, 14);
		}
		return label;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setEditable(false);
			textFieldSifra.setColumns(10);
			textFieldSifra.setBounds(10, 33, 202, 25);
		}
		return textFieldSifra;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Kupovni kurs");
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_1.setBounds(10, 83, 93, 14);
		}
		return label_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(10, 108, 202, 25);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setColumns(10);
			textField_2.setBounds(10, 180, 202, 25);
		}
		return textField_2;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Srednji kurs");
			label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_2.setBounds(10, 155, 93, 14);
		}
		return label_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setEditable(false);
			textField_3.setColumns(10);
			textField_3.setBounds(235, 180, 202, 25);
		}
		return textField_3;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Skraceni naziv");
			label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_3.setBounds(235, 155, 93, 14);
		}
		return label_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setEditable(false);
			textField_4.setColumns(10);
			textField_4.setBounds(235, 108, 202, 25);
		}
		return textField_4;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Prodajni kurs");
			label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_4.setBounds(235, 83, 93, 14);
		}
		return label_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setEditable(false);
			textField_5.setColumns(10);
			textField_5.setBounds(235, 33, 202, 25);
		}
		return textField_5;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("Naziv");
			label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_5.setBounds(235, 11, 93, 14);
		}
		return label_5;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sifra = Integer.parseInt(textFieldSifra.getText());
					double prodajni = Double.parseDouble(textField_2.getText());
					double kupovni = Double.parseDouble(textField_3.getText());
					double srednji = Double.parseDouble(textField_4.getText());
					String kurs = "Obrisan kurs - Sifra: " + sifra + ", " + "Naziv: " + textField_1.getText() + ", Prodajni kurs: " + prodajni +
											", Kupovni kurs: " + kupovni + ", Srednji kurs: " + srednji + ", Skraceni naziv: " +
												textField_5.getText() + "." + "\n";
					String status = MenjacnicaGUI.textAreaStatus.getText();
					status = status + kurs;
					MenjacnicaGUI.textAreaStatus.setText(status);
					setVisible(false);
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnObrisi.setBounds(10, 246, 202, 36);
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnOdustani.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnOdustani.setBounds(235, 246, 202, 36);
		}
		return btnOdustani;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("Zaista obrisi kurs");
			chckbxNewCheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!checked) {
						btnObrisi.setEnabled(true);
						checked = true;
					} else {
						btnObrisi.setEnabled(false);
						checked = false;
					}
					
				}
			});
			chckbxNewCheckBox.setBounds(10, 216, 140, 23);
		}
		return chckbxNewCheckBox;
	}
}
