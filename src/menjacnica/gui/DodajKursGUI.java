package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.TextComponent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import menjacnica.gui.*;
public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNaziv;
	private JLabel lblKupovniKurs;
	private JLabel lblProdajniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNazic;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JTextField textFieldKupovni;
	private JTextField textFieldProdajni;
	private JTextField textFieldSrednji;
	private JTextField textFieldSkraceni;
	private JButton btnDodaj;
	private JButton btnOdustani;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frameDodaj = new DodajKursGUI();
					frameDodaj.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DodajKursGUI() {
		setTitle("Dodaj kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNaziv());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNazic());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getTextFieldProdajni());
		contentPane.add(getTextFieldSrednji());
		contentPane.add(getTextFieldSkraceni());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\u0160ifra");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel.setBounds(10, 11, 93, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNaziv.setBounds(235, 11, 93, 14);
		}
		return lblNaziv;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblKupovniKurs.setBounds(10, 83, 93, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblProdajniKurs.setBounds(235, 83, 93, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblSrednjiKurs.setBounds(10, 155, 93, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNazic() {
		if (lblSkraceniNazic == null) {
			lblSkraceniNazic = new JLabel("Skraceni naziv");
			lblSkraceniNazic.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblSkraceniNazic.setBounds(235, 155, 93, 14);
		}
		return lblSkraceniNazic;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(10, 33, 202, 25);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setColumns(10);
			textFieldNaziv.setBounds(235, 33, 202, 25);
		}
		return textFieldNaziv;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setColumns(10);
			textFieldKupovni.setBounds(10, 108, 202, 25);
		}
		return textFieldKupovni;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setColumns(10);
			textFieldProdajni.setBounds(235, 108, 202, 25);
		}
		return textFieldProdajni;
	}
	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();
			textFieldSrednji.setColumns(10);
			textFieldSrednji.setBounds(10, 180, 202, 25);
		}
		return textFieldSrednji;
	}
	private JTextField getTextFieldSkraceni() {
		if (textFieldSkraceni == null) {
			textFieldSkraceni = new JTextField();
			textFieldSkraceni.setColumns(10);
			textFieldSkraceni.setBounds(235, 180, 202, 25);
		}
		return textFieldSkraceni;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int sifra = Integer.parseInt(textFieldSifra.getText());
					double prodajni = Double.parseDouble(textFieldProdajni.getText());
					double kupovni = Double.parseDouble(textFieldKupovni.getText());
					double srednji = Double.parseDouble(textFieldSrednji.getText());
					String kurs = "Dodat kurs - Sifra: " + sifra + ", " + "Naziv: " + textFieldNaziv.getText() + ", Prodajni kurs: " + prodajni +
											", Kupovni kurs: " + kupovni + ", Srednji kurs: " + srednji + ", Skraceni naziv: " +
												textFieldSkraceni.getText() + "." + "\n";
					String status = MenjacnicaGUI.textAreaStatus.getText();
					status = status + kurs;
					MenjacnicaGUI.textAreaStatus.setText(status);
					setVisible(false);
				}
			});
			btnDodaj.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnDodaj.setBounds(10, 216, 202, 36);
		}
		return btnDodaj;
	}
	
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					setVisible(false);
				}
			});
			btnOdustani.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnOdustani.setBounds(235, 216, 202, 36);
		}
		return btnOdustani;
	}
}
