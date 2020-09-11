import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.text.DecimalFormat;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField snack;
	private JTextField moneyTF;
	private JTextField change;
	private JTextField mainScreen;
	public static JButton[] array = new JButton[12];
	public static JButton[] mon = new JButton[5];
	public static boolean flag = true;
	public static double t = 0;
	private JTextField textField;

	public static void check(int index) {
		array[index].setSelected(true);
		for (int i = 0; i < 12; i++)
			if (i != index)
				array[i].setSelected(false);

	}

	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 800);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Desktop.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{452, 219, 0};
		gbl_contentPane.rowHeights = new int[]{47, 623, 58, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		JLabel lblVendingMachine = new JLabel("Vending Machine");
		lblVendingMachine.setFont(new Font("Times New Roman", Font.BOLD, 40));
		GridBagConstraints gbc_lblVendingMachine = new GridBagConstraints();
		gbc_lblVendingMachine.anchor = GridBagConstraints.NORTH;
		gbc_lblVendingMachine.insets = new Insets(0, 0, 5, 5);
		gbc_lblVendingMachine.gridx = 0;
		gbc_lblVendingMachine.gridy = 0;
		contentPane.add(lblVendingMachine, gbc_lblVendingMachine);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 139, 139));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{145, 150, 147, 0};
		gbl_panel.rowHeights = new int[]{59, 29, 126, 29, 125, 0, 29, 190, 29, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

		JButton btnNewButton = new JButton("KITKAT $1.50");
		array[0] = btnNewButton;
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		panel.add(btnNewButton, gbc_btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(0);
			}
		});

		JButton btnNewButton_1 = new JButton("BABYRUTH $1.20");
		array[1] = btnNewButton_1;
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 1;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(1);
			}
		});

		JButton btnNewButton_2 = new JButton("SNICKERS $1.10");
		array[2] = btnNewButton_2;
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 1;
		panel.add(btnNewButton_2, gbc_btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(2);
			}
		});

		JButton btnNewButton_3 = new JButton("WATER $1.80");
		array[3] = btnNewButton_3;
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 3;
		panel.add(btnNewButton_3, gbc_btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(3);
			}
		});

		JButton btnNewButton_4 = new JButton("PEPSI $2.50");
		array[4] = btnNewButton_4;
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 1;
		gbc_btnNewButton_4.gridy = 3;
		panel.add(btnNewButton_4, gbc_btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(4);
			}
		});

		JButton btnNewButton_5 = new JButton("COFFEE $2.90");
		array[5] = btnNewButton_5;
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_5.gridx = 2;
		gbc_btnNewButton_5.gridy = 3;
		panel.add(btnNewButton_5, gbc_btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(5);
			}
		});

		JButton btnNewButton_6 = new JButton("CASHEWS $1.00");
		array[6] = btnNewButton_6;
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 0;
		gbc_btnNewButton_6.gridy = 5;
		panel.add(btnNewButton_6, gbc_btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(6);
			}
		});

		JButton btnNewButton_10 = new JButton("CRUMBLE $1.00");
		array[10] = btnNewButton_10;
		GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
		gbc_btnNewButton_10.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_10.gridx = 1;
		gbc_btnNewButton_10.gridy = 5;
		panel.add(btnNewButton_10, gbc_btnNewButton_10);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(10);
			}
		});

		JButton btnNewButton_8 = new JButton("PECANS $1.50");
		array[8] = btnNewButton_8;
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_8.gridx = 2;
		gbc_btnNewButton_8.gridy = 5;
		panel.add(btnNewButton_8, gbc_btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(8);
			}
		});

		JButton btnNewButton_9 = new JButton("POPCORN $1.50");
		array[9] = btnNewButton_9;
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_9.gridx = 0;
		gbc_btnNewButton_9.gridy = 7;
		panel.add(btnNewButton_9, gbc_btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(9);
			}
		});

		JButton btnNewButton_7 = new JButton("LAY'S $1.20");
		array[7] = btnNewButton_7;
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_7.gridx = 1;
		gbc_btnNewButton_7.gridy = 7;
		panel.add(btnNewButton_7, gbc_btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(7);
			}
		});

		JButton btnNewButton_11 = new JButton("JALAPENO $1.50");
		array[11] = btnNewButton_11;
		GridBagConstraints gbc_btnNewButton_11 = new GridBagConstraints();
		gbc_btnNewButton_11.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_11.gridx = 2;
		gbc_btnNewButton_11.gridy = 7;
		panel.add(btnNewButton_11, gbc_btnNewButton_11);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(11);
			}
		});

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 139, 139));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.VERTICAL;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 1;
		contentPane.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{71, 0, 0, 50, 0};
		gbl_panel_2.rowHeights = new int[]{26, 16, 16, 26, 29, 0, 29, 29, 29, 29, 29, 16, 26, 29, 29, 35, 29, 29, 29, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);


		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		JButton btnClear = new JButton("CLEAR");


		JButton btnDone = new JButton("DONE");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(moneyTF.getText().isEmpty() && change.getText().isEmpty())
					mainScreen.setText("ERROR");
				if(moneyTF.getText().isEmpty())
					moneyTF.setText("0");

				else {
					double mo = Double.parseDouble(moneyTF.getText());

					double price = 0.0;
					for (int i = 0; i < 12; i++) {
						if (array[i].isSelected()) {
							String b[] = array[i].getText().split(" ");
							b[1] = b[1].replaceAll(" ", "");
							b[1] = b[1].replaceFirst("\\$", "");
							price = Double.parseDouble(b[1]);
							break;

						}
					}

					double c = mo - price;
					DecimalFormat df2 = new DecimalFormat("#.##");
					String nc = df2.format(c);
					if(nc.length() == 3)
						nc = nc + "0";


					if (c < 0) {
						mainScreen.setText("$" + nc + " More");
						change.setText(moneyTF.getText() );
						snack.setText("Waiting");
						clearEvery(moneyTF);
					}

					else if (mo == c) {
						change.setText("$" + nc);
						snack.setText("Waiting");
						clearEvery(moneyTF);
					}

					else if (c == 0) {
						change.setText("");
						snack.setText("Delivered");
						clearEvery(moneyTF);
					}

					else {
						change.setText("$" + nc);
						snack.setText("Delivered");
						clearEvery(moneyTF);
					}
				}
			}


		});



		JButton button = new JButton("5.00");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc(button, moneyTF);
			}
		});

		JButton btnNewButton_13 = new JButton("0.25");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc(btnNewButton_13, moneyTF);
			}
		});

		JButton button_2 = new JButton("0.05");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc(button_2, moneyTF);
			}
		});

		mainScreen = new JTextField();
		mainScreen.setBackground(Color.ORANGE);
		mainScreen.setText("    WELCOME!");
		mainScreen.setColumns(10);
		GridBagConstraints gbc_mainScreen = new GridBagConstraints();
		gbc_mainScreen.anchor = GridBagConstraints.NORTH;
		gbc_mainScreen.insets = new Insets(0, 0, 5, 5);
		gbc_mainScreen.gridwidth = 3;
		gbc_mainScreen.gridx = 0;
		gbc_mainScreen.gridy = 2;
		panel_2.add(mainScreen, gbc_mainScreen);

		JLabel lblInsertMoney = new JLabel("INSERT MONEY");
		GridBagConstraints gbc_lblInsertMoney = new GridBagConstraints();
		gbc_lblInsertMoney.anchor = GridBagConstraints.NORTH;
		gbc_lblInsertMoney.insets = new Insets(0, 0, 5, 5);
		gbc_lblInsertMoney.gridwidth = 3;
		gbc_lblInsertMoney.gridx = 0;
		gbc_lblInsertMoney.gridy = 3;
		panel_2.add(lblInsertMoney, gbc_lblInsertMoney);

		JLabel label = new JLabel("$.05,$.10,$.25,$1,$5");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.NORTH;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridwidth = 3;
		gbc_label.gridx = 0;
		gbc_label.gridy = 4;
		panel_2.add(label, gbc_label);

		moneyTF = new JTextField();
		moneyTF.setEditable(false);
		moneyTF.setColumns(10);
		GridBagConstraints gbc_moneyTF = new GridBagConstraints();
		gbc_moneyTF.anchor = GridBagConstraints.NORTH;
		gbc_moneyTF.insets = new Insets(0, 0, 5, 5);
		gbc_moneyTF.gridwidth = 3;
		gbc_moneyTF.gridx = 0;
		gbc_moneyTF.gridy = 5;
		panel_2.add(moneyTF, gbc_moneyTF);
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.anchor = GridBagConstraints.NORTH;
		gbc_button_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 0;
		gbc_button_2.gridy = 6;
		panel_2.add(button_2, gbc_button_2);

		JButton btnNewButton_14 = new JButton("0.10");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc(btnNewButton_14, moneyTF);
			}
		});
		GridBagConstraints gbc_btnNewButton_14 = new GridBagConstraints();
		gbc_btnNewButton_14.gridwidth = 2;
		gbc_btnNewButton_14.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton_14.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_14.gridx = 1;
		gbc_btnNewButton_14.gridy = 6;
		panel_2.add(btnNewButton_14, gbc_btnNewButton_14);
		GridBagConstraints gbc_btnNewButton_13 = new GridBagConstraints();
		gbc_btnNewButton_13.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_13.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_13.gridx = 0;
		gbc_btnNewButton_13.gridy = 7;
		panel_2.add(btnNewButton_13, gbc_btnNewButton_13);

		JButton button_1 = new JButton("1.00");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc(button_1, moneyTF);
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.gridwidth = 2;
		gbc_button_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 7;
		panel_2.add(button_1, gbc_button_1);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.fill = GridBagConstraints.HORIZONTAL;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 8;
		panel_2.add(button, gbc_button);
		GridBagConstraints gbc_btnDone = new GridBagConstraints();
		gbc_btnDone.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnDone.insets = new Insets(0, 0, 5, 5);
		gbc_btnDone.gridx = 0;
		gbc_btnDone.gridy = 9;
		panel_2.add(btnDone, gbc_btnDone);

		textField = new JTextField();
		textField.setEnabled(false);
		textField.setText("Click Twice for details");
				textField.setFont(new Font("Times New Roman", Font.PLAIN, 10));
				textField.setColumns(10);
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.gridwidth = 3;
				gbc_textField.insets = new Insets(0, 0, 5, 0);
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.gridx = 1;
				gbc_textField.gridy = 9;
				panel_2.add(textField, gbc_textField);
				GridBagConstraints gbc_btnClear = new GridBagConstraints();
				gbc_btnClear.anchor = GridBagConstraints.NORTHWEST;
				gbc_btnClear.insets = new Insets(0, 0, 5, 5);
				gbc_btnClear.gridx = 0;
				gbc_btnClear.gridy = 10;
				panel_2.add(btnClear, gbc_btnClear);
				GridBagConstraints gbc_btnExit = new GridBagConstraints();
				gbc_btnExit.anchor = GridBagConstraints.NORTHWEST;
				gbc_btnExit.insets = new Insets(0, 0, 5, 5);
				gbc_btnExit.gridx = 0;
				gbc_btnExit.gridy = 11;
				panel_2.add(btnExit, gbc_btnExit);

				JLabel lblChange = new JLabel("CHANGE");
				GridBagConstraints gbc_lblChange = new GridBagConstraints();
				gbc_lblChange.gridwidth = 3;
				gbc_lblChange.insets = new Insets(0, 0, 5, 5);
				gbc_lblChange.gridx = 0;
				gbc_lblChange.gridy = 12;
				panel_2.add(lblChange, gbc_lblChange);

				change = new JTextField();
				change.setEditable(false);
				change.setColumns(10);
				GridBagConstraints gbc_change = new GridBagConstraints();
				gbc_change.insets = new Insets(0, 0, 5, 5);
				gbc_change.gridwidth = 3;
				gbc_change.gridx = 0;
				gbc_change.gridy = 13;
				panel_2.add(change, gbc_change);

				JLabel lblNewLabel = new JLabel("$5.00");
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel.gridx = 0;
				gbc_lblNewLabel.gridy = 14;
				panel_2.add(lblNewLabel, gbc_lblNewLabel);


				JButton btnNewButton_17 = new JButton("0");
				btnNewButton_17.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				mon[0] = btnNewButton_17;
				GridBagConstraints gbc_btnNewButton_17 = new GridBagConstraints();
				gbc_btnNewButton_17.anchor = GridBagConstraints.NORTH;
				gbc_btnNewButton_17.insets = new Insets(0, 0, 5, 5);
				gbc_btnNewButton_17.gridx = 1;
				gbc_btnNewButton_17.gridy = 14;
				panel_2.add(btnNewButton_17, gbc_btnNewButton_17);

				JLabel lblNewLabel_1 = new JLabel("$1.00");
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_1.gridx = 0;
				gbc_lblNewLabel_1.gridy = 15;
				panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);


				JButton btnNewButton_15 = new JButton("0");
				mon[1] = btnNewButton_15;
				GridBagConstraints gbc_btnNewButton_15 = new GridBagConstraints();
				gbc_btnNewButton_15.anchor = GridBagConstraints.NORTH;
				gbc_btnNewButton_15.insets = new Insets(0, 0, 5, 5);
				gbc_btnNewButton_15.gridx = 1;
				gbc_btnNewButton_15.gridy = 15;
				panel_2.add(btnNewButton_15, gbc_btnNewButton_15);

				JLabel lblNewLabel_2 = new JLabel("$0.25");
				GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
				gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_2.gridx = 0;
				gbc_lblNewLabel_2.gridy = 16;
				panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);

				JButton btnNewButton_16 = new JButton("0");
				mon[2] = btnNewButton_16;
				GridBagConstraints gbc_btnNewButton_16 = new GridBagConstraints();
				gbc_btnNewButton_16.anchor = GridBagConstraints.NORTH;
				gbc_btnNewButton_16.insets = new Insets(0, 0, 5, 5);
				gbc_btnNewButton_16.gridx = 1;
				gbc_btnNewButton_16.gridy = 16;
				panel_2.add(btnNewButton_16, gbc_btnNewButton_16);

				JLabel lblNewLabel_3 = new JLabel("$0.10");
				GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
				gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_3.gridx = 0;
				gbc_lblNewLabel_3.gridy = 17;
				panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);



				JButton btnNewButton_12 = new JButton("0");
				mon[3] = btnNewButton_12;
				GridBagConstraints gbc_btnNewButton_12 = new GridBagConstraints();
				gbc_btnNewButton_12.anchor = GridBagConstraints.NORTH;
				gbc_btnNewButton_12.insets = new Insets(0, 0, 5, 5);
				gbc_btnNewButton_12.gridx = 1;
				gbc_btnNewButton_12.gridy = 17;
				panel_2.add(btnNewButton_12, gbc_btnNewButton_12);

				JLabel lblNewLabel_4 = new JLabel("$0.05");
				GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
				gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
				gbc_lblNewLabel_4.gridx = 0;
				gbc_lblNewLabel_4.gridy = 18;
				panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);


				JButton btnNewButton_18 = new JButton("0");
				mon[4] = btnNewButton_18;
				GridBagConstraints gbc_btnNewButton_18 = new GridBagConstraints();
				gbc_btnNewButton_18.insets = new Insets(0, 0, 0, 5);
				gbc_btnNewButton_18.anchor = GridBagConstraints.NORTH;
				gbc_btnNewButton_18.gridx = 1;
				gbc_btnNewButton_18.gridy = 18;
				panel_2.add(btnNewButton_18, gbc_btnNewButton_18);



				btnDone.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double a = 0;
						String c = "0";
						if(change.getText().contains("$"))
							c= change.getText().replaceAll("\\$","");

						if(change.getText().isEmpty() ) {
							for(int i = 0; i > 5; i++) 
								mon[i].setText("0");
							c ="0";
						}


						double p = Double.parseDouble(c);

						if(p/5 >= 1) {
							DecimalFormat df2 = new DecimalFormat("#.##");
							a = Math.floor(p/5);
							String sum = df2.format(a);

							if(sum.length() == 3)
								sum = sum + "0";

							btnNewButton_17.setText(sum);
							p = p - a * 5;
						}
						if(p/1 >= 1) {
							DecimalFormat df2 = new DecimalFormat("#.##");
							a = Math.floor(p/1);
							String sum = df2.format(a);

							if(sum.length() == 3)
								sum = sum + "0";

							btnNewButton_15.setText(sum);
							p = p - a * 1;
						}
						if(p/0.25 >= 1) {
							DecimalFormat df2 = new DecimalFormat("#.##");
							a = Math.floor(p/0.25);
							String sum = df2.format(a);

							if(sum.length() == 3)
								sum = sum + "0";

							btnNewButton_16.setText(sum);
							p = p - a * 0.25;
						}

						if(p/0.10 >= 1) {
							DecimalFormat df2 = new DecimalFormat("#.##");
							a = Math.floor(p/0.10);
							String sum = df2.format(a);

							if(sum.length() == 3)
								sum = sum + "0";

							btnNewButton_12.setText(sum);
							p = p - a * 0.10;
						}

						if(p != 0 && p < 10) {
							DecimalFormat df2 = new DecimalFormat("#.##");
							a = p/0.05;
							String sum = df2.format(a);

							if(sum.length() == 3)
								sum = sum + "0";

							btnNewButton_18.setText(sum);
							p = p - a * 0.05;
						}






					}
				});

				btnClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						snack.setText("Waiting");
						change.setText("");
						clearEvery(moneyTF);
						mainScreen.setText("WELCOME!");
						for(int i = 0; i < 5; i++)
							mon[i].setText("0");

					}
				});

				JPanel panel_1 = new JPanel();
				panel_1.setBackground(new Color(105, 105, 105));
				GridBagConstraints gbc_panel_1 = new GridBagConstraints();
				gbc_panel_1.fill = GridBagConstraints.BOTH;
				gbc_panel_1.insets = new Insets(0, 0, 0, 5);
				gbc_panel_1.gridx = 0;
				gbc_panel_1.gridy = 2;
				contentPane.add(panel_1, gbc_panel_1);

				JButton btnPickup = new JButton("PICKUP");
				panel_1.add(btnPickup);
				btnPickup.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						clearEvery(moneyTF);
						snack.setText("Waiting");
					}
				});

				snack = new JTextField();
				snack.setEditable(false);
				snack.setText("Waiting");
				panel_1.add(snack);
				snack.setColumns(10);

				JPanel panel_3 = new JPanel();
				panel_3.setBackground(new Color(105, 105, 105));
				GridBagConstraints gbc_panel_3 = new GridBagConstraints();
				gbc_panel_3.fill = GridBagConstraints.BOTH;
				gbc_panel_3.gridx = 1;
				gbc_panel_3.gridy = 2;
				contentPane.add(panel_3, gbc_panel_3);

				JButton btnPickup_1 = new JButton("PICKUP");
				panel_3.add(btnPickup_1);
				btnPickup_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (!change.getText().contains("-"))
							change.setText("");
						mainScreen.setText("WELCOME");
						for(int i = 0; i < 5; i++)
							mon[i].setText("0");


					}
				});

	}




	public static void calc(JButton b, JTextField moneyTF) {
		if (moneyTF.getText().isEmpty()) {
			moneyTF.setText(b.getText());
			return;
		}
		double a = Double.parseDouble(moneyTF.getText());
		double d = Double.parseDouble(b.getText());
		double total = a + d;
		DecimalFormat df2 = new DecimalFormat("#.##");
		String sum = df2.format(total);

		moneyTF.setText(sum);

	}


	public static void clearEvery(JTextField moneyTF) {
		for (int i = 0; i < 12; i++)
			array[i].setSelected(false);
		moneyTF.setText("");

	}
}
