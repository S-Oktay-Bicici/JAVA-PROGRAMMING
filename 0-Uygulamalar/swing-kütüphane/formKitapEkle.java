import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class formKitapEkle extends JFrame {

	private JPanel contentPane;
	private JTextField txtKitapAdi;
	private JTextField txtKitapIsbn;
	private JTextField txtAciklama;
	private DefaultComboBoxModel yazarModel,yayineviModel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formKitapEkle frame = new formKitapEkle();
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
	static ArrayList<Kitap> kitaplar=new ArrayList<Kitap>();
	public formKitapEkle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Kitap Ekle");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		txtKitapAdi = new JTextField();
		txtKitapAdi.setColumns(10);
		
		txtKitapIsbn = new JTextField();
		txtKitapIsbn.setColumns(10);
		
		txtAciklama = new JTextField();
		txtAciklama.setColumns(10);
		
		JComboBox cbYazar = new JComboBox();
		
		JComboBox cbYayinevi = new JComboBox();
		
		yazarModel=(DefaultComboBoxModel)cbYazar.getModel();
		
		yayineviModel=(DefaultComboBoxModel)cbYayinevi.getModel();
		
		
		for(Yazar yazar:formYazarEkle.yazarlar) {
			
			yazarModel.addElement(yazar.getYazarAdi());
		}
		
		for(Yayinevi yayinevi:formYayineviEkle.yayinevleri) {
			yayineviModel.addElement(yayinevi.getYayineviAdi());
			
		}
		
		
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String kitapAdi=txtKitapAdi.getText();
				String aciklama=txtAciklama.getText();
				String isbnNo=txtKitapIsbn.getText();
				String yazarAdi=(String) cbYazar.getSelectedItem();
				String yayineviAdi=(String) cbYayinevi.getSelectedItem();
				
				Yazar yazar=null;
				Yayinevi yayinevi=null;
				
				for(Yazar yazar2:formYazarEkle.yazarlar) {
					if(yazar2.getYazarAdi().equals(yazarAdi)) {
						yazar=yazar2;
					}
				}
				
				for(Yayinevi yayinevi2:formYayineviEkle.yayinevleri) {
					if(yayinevi2.getYayineviAdi().equals(yayineviAdi)) {
						yayinevi=yayinevi2;
					}
				}
				
				Kitap kitap=new Kitap(kitapAdi, isbnNo, yayinevi, yazar, aciklama);
				kitaplar.add(kitap);
				
				txtAciklama.setText("");
				txtKitapAdi.setText("");
				txtKitapIsbn.setText("");
				
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Kitap Ad\u0131");
		
		JLabel lblNewLabel_2 = new JLabel("ISBN NO");
		
		JLabel lblNewLabel_3 = new JLabel("A\u00E7\u0131klama");
		
		JLabel lblNewLabel_4 = new JLabel("Yazar");
		
		JLabel lblNewLabel_5 = new JLabel("Yay\u0131nevi");
		
		JButton btnNewButton = new JButton("\u00C7\u0131k\u0131\u015F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_1)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_3)
									.addComponent(lblNewLabel_2)
									.addComponent(lblNewLabel_4)
									.addComponent(lblNewLabel_5)))
							.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(cbYayinevi, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(txtAciklama, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
									.addComponent(txtKitapIsbn, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
									.addComponent(txtKitapAdi, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
									.addComponent(cbYazar, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(89, Short.MAX_VALUE)
							.addComponent(btnKaydet, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtKitapAdi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtKitapIsbn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtAciklama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbYazar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbYayinevi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5))
					.addGap(52)
					.addComponent(btnKaydet, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(38, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
