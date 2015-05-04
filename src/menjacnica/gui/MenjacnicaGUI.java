package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import net.miginfocom.swing.MigLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Component;

import javax.swing.JTextArea;

import java.awt.Rectangle;

import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.ScrollPaneConstants;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JPanel centerPanel;
	private JPanel southPanel;
	private JPanel eastPanel;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JSeparator separator;
	private JMenuItem mntmAbout;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnDodajKurs;
	private JButton btnObrisiKurs;
	private JButton btnIzvrsiZamjenu;
	private JScrollPane scrollPaneStatus;
	public static JTextArea textAreaStatus;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObrsiKurs;
	private JMenuItem mntmIzvrsiZamenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
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
	public MenjacnicaGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/icons/JframeIcon.png")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			   public void windowClosing(WindowEvent evt) {
				   JOptionPane option = new JOptionPane();
					int returnVal = option.showConfirmDialog(getParent(), "Da li zelite da izadjete iz programa?");
					if(returnVal == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
			   }
		});
		setBounds(100, 100, 585, 408);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getCenterPanel(), BorderLayout.CENTER);
		contentPane.add(getSouthPanel(), BorderLayout.SOUTH);
		contentPane.add(getEastPanel(), BorderLayout.EAST);
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmNewMenuItem());
			mnFile.add(getMntmSave());
			mnFile.add(getSeparator());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JPanel getCenterPanel() {
		if (centerPanel == null) {
			centerPanel = new JPanel();
			centerPanel.setLayout(new GridLayout(0, 1, 0, 0));
			centerPanel.add(getScrollPane());
		}
		return centerPanel;
	}
	private JPanel getSouthPanel() {
		if (southPanel == null) {
			southPanel = new JPanel();
			southPanel.setPreferredSize(new Dimension(10, 73));
			southPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			southPanel.setLayout(new BorderLayout(0, 0));
			southPanel.add(getScrollPane_1_1());
		}
		return southPanel;
	}
	private JPanel getEastPanel() {
		if (eastPanel == null) {
			eastPanel = new JPanel();
			eastPanel.setPreferredSize(new Dimension(120, 10));
			eastPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			eastPanel.add(getBtnDodajKurs());
			eastPanel.add(getBtnObrisiKurs());
			eastPanel.add(getBtnIzvrsiZamjenu());
		}
		return eastPanel;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Open");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser chooser = new JFileChooser();
				    FileNameExtensionFilter filter = new FileNameExtensionFilter(
				        "JPG & GIF Images", "jpg", "gif");
				    chooser.setFileFilter(filter);
				    int returnVal = chooser.showOpenDialog(getParent());
				    if(returnVal == JFileChooser.APPROVE_OPTION) {
				    	String tekst = textAreaStatus.getText();
				    	tekst = tekst +  "Ucitan fajl: " + chooser.getSelectedFile().getName() + "\n";
				    	textAreaStatus.setText(tekst);
				    }
				}
			});
			mntmNewMenuItem.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/upFolder.gif")));
			mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser chooser = new JFileChooser();
				    FileNameExtensionFilter filter = new FileNameExtensionFilter(
				        "JPG & GIF Images", "jpg", "gif");
				    chooser.setFileFilter(filter);
				    int returnVal = chooser.showSaveDialog(getParent());
				    if(returnVal == JFileChooser.APPROVE_OPTION) {
				    	String tekst = textAreaStatus.getText();
				    	tekst = tekst +  "Sacuvan fajl: " + chooser.getSelectedFile().getName() + "\n";
				    	textAreaStatus.setText(tekst);
				    }
				}
			});
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
			mntmSave.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane option = new JOptionPane();
					int returnVal = option.showConfirmDialog(getParent(), "Da li zelite da izadjete iz programa?");
					if(returnVal == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(getParent(), "Autor: Nedovic Filip");
				}
			});
			mntmAbout.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/About.png")));
		}
		return mntmAbout;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"\u0160ifra", "Skra\u0107eni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"
				}
			) {
				Class[] columnTypes = new Class[] {
					Object.class, String.class, Double.class, Double.class, Double.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
			addPopup(table, getPopupMenu());
			table.getColumnModel().getColumn(0).setPreferredWidth(80);
			table.getColumnModel().getColumn(1).setPreferredWidth(80);
			table.getColumnModel().getColumn(2).setPreferredWidth(80);
			table.getColumnModel().getColumn(3).setPreferredWidth(80);
			table.getColumnModel().getColumn(4).setPreferredWidth(80);
			table.getColumnModel().getColumn(5).setPreferredWidth(80);
		}
		return table;
	}
	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.setPreferredSize(new Dimension(115, 30));
			btnDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					DodajKursGUI dodaj = new DodajKursGUI();
					dodaj.setVisible(true);
				}
			});
		}
		return btnDodajKurs;
	}
	private JButton getBtnObrisiKurs() {
		if (btnObrisiKurs == null) {
			btnObrisiKurs = new JButton("Obrisi kurs");
			btnObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ObrisiKursGUI frameObrisi = new ObrisiKursGUI();
					frameObrisi.setVisible(true);
				}
			});
			btnObrisiKurs.setPreferredSize(new Dimension(115, 30));
		}
		return btnObrisiKurs;
	}
	private JButton getBtnIzvrsiZamjenu() {
		if (btnIzvrsiZamjenu == null) {
			btnIzvrsiZamjenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamjenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					IzvrsiZamenuGUI frameIzmjena = new IzvrsiZamenuGUI();
					frameIzmjena.setVisible(true);
				}
			});
			btnIzvrsiZamjenu.setPreferredSize(new Dimension(115, 30));
		}
		return btnIzvrsiZamjenu;
	}
	private JScrollPane getScrollPane_1_1() {
		if (scrollPaneStatus == null) {
			scrollPaneStatus = new JScrollPane();
			scrollPaneStatus.setAutoscrolls(true);
			scrollPaneStatus.setViewportView(getTextArea_1());
		}
		return scrollPaneStatus;
	}
	private JTextArea getTextArea_1() {
		if (textAreaStatus == null) {
			textAreaStatus = new JTextArea();
			textAreaStatus.setWrapStyleWord(true);
			textAreaStatus.setLineWrap(true);
			textAreaStatus.setPreferredSize(new Dimension(4, 23));
		}
		return textAreaStatus;
	}
	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmObrsiKurs());
			popupMenu.add(getMntmIzvrsiZamenu());
		}
		return popupMenu;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			mntmDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DodajKursGUI dodaj = new DodajKursGUI();
					dodaj.setVisible(true);
				}
			});
		}
		return mntmDodajKurs;
	}
	private JMenuItem getMntmObrsiKurs() {
		if (mntmObrsiKurs == null) {
			mntmObrsiKurs = new JMenuItem("Obrisi kurs");
			mntmObrsiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ObrisiKursGUI frameObrisi = new ObrisiKursGUI();
					frameObrisi.setVisible(true);
				}
			});
		}
		return mntmObrsiKurs;
	}
	private JMenuItem getMntmIzvrsiZamenu() {
		if (mntmIzvrsiZamenu == null) {
			mntmIzvrsiZamenu = new JMenuItem("Izvrsi zamenu");
			mntmIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					IzvrsiZamenuGUI frameIzmjena = new IzvrsiZamenuGUI();
					frameIzmjena.setVisible(true);
				}
			});
		}
		return mntmIzvrsiZamenu;
	}
}
