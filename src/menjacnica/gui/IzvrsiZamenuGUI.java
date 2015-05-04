package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.Font;

import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JLabel lblValuta;
	private JLabel lblProdajniKurs;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JLabel lblIznos;
	private JTextField textFieldIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton button_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		setTitle("Izvr\u0161i zamenu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblValuta());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getComboBox());
		contentPane.add(getLblIznos());
		contentPane.add(getTextFieldIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getButton_1());
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblKupovniKurs.setBounds(10, 11, 164, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblValuta.setBounds(184, 11, 63, 14);
		}
		return lblValuta;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblProdajniKurs.setBounds(257, 11, 177, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(10, 28, 164, 25);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(257, 28, 177, 25);
		}
		return textField_1;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(184, 28, 63, 25);
			comboBox.addItem("EUR");
			comboBox.addItem("USD");
			comboBox.addItem("CHF");
		}
		return comboBox;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblIznos.setBounds(10, 91, 76, 14);
		}
		return lblIznos;
	}
	private JTextField getTextFieldIznos() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setColumns(10);
			textFieldIznos.setBounds(10, 107, 164, 25);
		}
		return textFieldIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblVrstaTransakcije.setBounds(184, 91, 164, 14);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setBounds(184, 108, 90, 23);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(270, 108, 109, 23);
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setBounds(20, 143, 403, 61);
			slider.addChangeListener(new ChangeListener() {
				
				@Override
				public void stateChanged(ChangeEvent arg0) {
					// TODO Auto-generated method stub
					int value = slider.getValue();
					textFieldIznos.setText("" + value);
				}
			});
		}
		return slider;
	}
	
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String valuta = (String) comboBox.getSelectedItem();
					String iznos = textFieldIznos.getText();
					String vrstaTransakcije;
					if(rdbtnKupovina.isSelected()) {
						vrstaTransakcije = "Kupovina";
					} else {
						vrstaTransakcije = "Prodaja";
					}
					String izmjena = "Iznos za zamjenu: " +  iznos + " " + valuta + ", Vrsta transakcije: "+ vrstaTransakcije +"\n";
					String status = MenjacnicaGUI.textAreaStatus.getText();
					status = status + izmjena;
					MenjacnicaGUI.textAreaStatus.setText(status);
					setVisible(false);
				}
			});
			btnIzvrsiZamenu.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnIzvrsiZamenu.setBounds(7, 225, 202, 36);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("Odustani");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			button_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			button_1.setBounds(232, 225, 202, 36);
		}
		return button_1;
	}
}
