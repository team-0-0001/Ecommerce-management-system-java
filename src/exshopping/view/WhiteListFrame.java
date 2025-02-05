/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exshopping.view;

/**
 *
 * @author sanbid
 */
public class WhiteListFrame extends javax.swing.JFrame {

	/**
	 * Creates new form WhiteListFrame
	 */
	public WhiteListFrame() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_btn = new javax.swing.JLabel();
        Home_btn = new javax.swing.JLabel();
        contact_btn = new javax.swing.JLabel();
        about_btn = new javax.swing.JLabel();
        search_input = new javax.swing.JTextField();
        search_btn1 = new javax.swing.JButton();
        addcart_btn1 = new javax.swing.JButton();
        profile_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_frame = new javax.swing.JDesktopPane();
        product_frame1 = new javax.swing.JDesktopPane();
        product_image = new javax.swing.JLabel();
        product_name = new javax.swing.JLabel();
        product_prices = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login_btn.setFont(new java.awt.Font("SansSerif.plain", 1, 24)); // NOI18N
        login_btn.setText("Ex Shopping");

        Home_btn.setText("Home");

        contact_btn.setText("Contact");

        about_btn.setText("About");

        search_input.setFont(new java.awt.Font("SansSerif.plain", 0, 18)); // NOI18N
        search_input.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        search_input.setText("what are you looking for ?");
        search_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_inputActionPerformed(evt);
            }
        });

        search_btn1.setText("jButton1");

        addcart_btn1.setText("A");

        profile_btn.setText("P");

        jLabel1.setFont(new java.awt.Font("SansSerif.plain", 1, 24)); // NOI18N
        jLabel1.setText("whitelists");

        product_frame1.setBackground(new java.awt.Color(153, 102, 255));

        product_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product.png"))); // NOI18N
        product_image.setText("jLabel2");

        product_name.setText("product name");

        product_prices.setText("prices");

        product_frame1.setLayer(product_image, javax.swing.JLayeredPane.DEFAULT_LAYER);
        product_frame1.setLayer(product_name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        product_frame1.setLayer(product_prices, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout product_frame1Layout = new javax.swing.GroupLayout(product_frame1);
        product_frame1.setLayout(product_frame1Layout);
        product_frame1Layout.setHorizontalGroup(
            product_frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product_frame1Layout.createSequentialGroup()
                .addGroup(product_frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(product_frame1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(product_image, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(product_frame1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(product_frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product_prices)
                            .addComponent(product_name))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        product_frame1Layout.setVerticalGroup(
            product_frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product_frame1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(product_image, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(product_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(product_prices)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        product_frame.setLayer(product_frame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout product_frameLayout = new javax.swing.GroupLayout(product_frame);
        product_frame.setLayout(product_frameLayout);
        product_frameLayout.setHorizontalGroup(
            product_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product_frameLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(product_frame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1103, Short.MAX_VALUE))
        );
        product_frameLayout.setVerticalGroup(
            product_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product_frameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(product_frame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(574, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(product_frame);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(login_btn)
                                .addGap(254, 254, 254)
                                .addComponent(Home_btn)
                                .addGap(91, 91, 91)
                                .addComponent(contact_btn)
                                .addGap(83, 83, 83)
                                .addComponent(about_btn)
                                .addGap(153, 153, 153)
                                .addComponent(search_input, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(search_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addcart_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(profile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(login_btn)
                            .addComponent(Home_btn)
                            .addComponent(contact_btn)
                            .addComponent(about_btn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(search_btn1)
                                .addComponent(addcart_btn1)
                                .addComponent(profile_btn))
                            .addComponent(search_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_inputActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(WhiteListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(WhiteListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(WhiteListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(WhiteListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new WhiteListFrame().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Home_btn;
    public javax.swing.JLabel about_btn;
    public javax.swing.JButton addcart_btn1;
    public javax.swing.JLabel contact_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel login_btn;
    private javax.swing.JDesktopPane product_frame;
    private javax.swing.JDesktopPane product_frame1;
    public javax.swing.JLabel product_image;
    public javax.swing.JLabel product_name;
    public javax.swing.JLabel product_prices;
    public javax.swing.JButton profile_btn;
    public javax.swing.JButton search_btn1;
    public javax.swing.JTextField search_input;
    // End of variables declaration//GEN-END:variables
}
