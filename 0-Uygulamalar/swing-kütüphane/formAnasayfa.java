import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formAnasayfa extends JFrame {

	private JPanel contentPane;
	private JTable tblKitap;
	private DefaultTableModel kitapModel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formAnasayfa frame = new formAnasayfa();
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
	public formAnasayfa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 976, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		JButton btnKitapEkle = new JButton("Kitap Ekle");
		btnKitapEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				formKitapEkle kitapEkle=new formKitapEkle();
				kitapEkle.setVisible(true);
				
			}
		});
		
		JButton btnYazarEkle = new JButton("Yazar Ekle");
		btnYazarEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				formYazarEkle yazarEkle=new formYazarEkle();
				yazarEkle.setVisible(true);
			}
		});
		tblKitap = new JTable();
		tblKitap.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"A\u00E7\u0131klama", "Yay\u0131nevi", "Yazar", "Kitap ISBN", "Kitap Ad\u0131"
			}
		));
		kitapModel=(DefaultTableModel)tblKitap.getModel();
		JButton btnYayineviEkle = new JButton("Yay\u0131nevi Ekle");
		btnYayineviEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				formYayineviEkle yayineviEkle=new formYayineviEkle();
				yayineviEkle.setVisible(true);
				
			}
		});
		
		JButton btnTumKitaplar = new JButton("T\u00FCm Kitaplar");
		btnTumKitaplar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(Kitap kitap:formKitapEkle.kitaplar) {
					Object[] kitapDizi= {kitap.getKitapAdi(),kitap.getIsbnNo(),kitap.getYazar().getYazarAdi(),
							kitap.getYayinevi().getYayineviAdi(),kitap.getAciklama()};
					kitapModel.addRow(kitapDizi);
				}
				
			}
		});
		
		JButton btnNewButton = new JButton("Detay");
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(tblKitap, GroupLayout.PREFERRED_SIZE, 764, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnKitapEkle, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(btnYazarEkle, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnYayineviEkle, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(btnTumKitaplar, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnTumKitaplar, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
						.addComponent(btnYayineviEkle, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
						.addComponent(btnYazarEkle, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
						.addComponent(btnKitapEkle, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
					.addComponent(tblKitap, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
					.addGap(31))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
