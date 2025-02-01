/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package exshopping.view;

/**
 *
 * @author sanbid
 */
public class ProductFrame extends javax.swing.JPanel {

	/**
	 * Creates new form ProductFrame
	 */
	public ProductFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        logo_label = new javax.swing.JLabel();
        Home_btn = new javax.swing.JLabel();
        contact_btn = new javax.swing.JLabel();
        about_btn = new javax.swing.JLabel();
        search_input = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        addcart_btn1 = new javax.swing.JButton();
        profile_btn = new javax.swing.JButton();
        product_title = new javax.swing.JLabel();
        product_price = new javax.swing.JLabel();
        product_des = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Addcart_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_panel = new javax.swing.JPanel();
        product_frame = new javax.swing.JDesktopPane();
        product_image = new javax.swing.JLabel();
        product_name = new javax.swing.JLabel();
        product_prices = new javax.swing.JLabel();
        addcart_product_1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product.png"))); // NOI18N

        logo_label.setText("Ex Shopping");

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

        search_btn.setText("jButton1");

        addcart_btn1.setText("A");

        profile_btn.setText("P");

        product_title.setFont(new java.awt.Font("SansSerif.plain", 1, 36)); // NOI18N
        product_title.setText("Harvic 2938 de");

        product_price.setFont(new java.awt.Font("SansSerif.plain", 0, 36)); // NOI18N
        product_price.setText("$198");

        product_des.setText("describition .........");

        quantity.setText("xx");
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        jLabel2.setText("quantity");

        Addcart_btn.setText("Add Cart");

        product_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product.png"))); // NOI18N
        product_image.setText("jLabel2");

        product_name.setText("product name");

        product_prices.setText("prices");

        addcart_product_1.setText("Add Cart");
        addcart_product_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcart_product_1ActionPerformed(evt);
            }
        });

        product_frame.setLayer(product_image, javax.swing.JLayeredPane.DEFAULT_LAYER);
        product_frame.setLayer(product_name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        product_frame.setLayer(product_prices, javax.swing.JLayeredPane.DEFAULT_LAYER);
        product_frame.setLayer(addcart_product_1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout product_frameLayout = new javax.swing.GroupLayout(product_frame);
        product_frame.setLayout(product_frameLayout);
        product_frameLayout.setHorizontalGroup(
            product_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product_frameLayout.createSequentialGroup()
                .addGroup(product_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(product_frameLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(product_image, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(product_frameLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(product_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product_prices)
                            .addComponent(product_name)
                            .addComponent(addcart_product_1))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        product_frameLayout.setVerticalGroup(
            product_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product_frameLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(product_image, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(product_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(product_prices)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addcart_product_1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout product_panelLayout = new javax.swing.GroupLayout(product_panel);
        product_panel.setLayout(product_panelLayout);
        product_panelLayout.setHorizontalGroup(
            product_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product_panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(product_frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1005, Short.MAX_VALUE))
        );
        product_panelLayout.setVerticalGroup(
            product_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product_panelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(product_frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(product_panel);

        jLabel3.setFont(new java.awt.Font("SansSerif.plain", 1, 36)); // NOI18N
        jLabel3.setText("Sales");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(logo_label)
                        .addGap(298, 298, 298)
                        .addComponent(Home_btn)
                        .addGap(89, 89, 89)
                        .addComponent(contact_btn)
                        .addGap(91, 91, 91)
                        .addComponent(about_btn)
                        .addGap(88, 88, 88)
                        .addComponent(search_input, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addcart_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(profile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(product_title)
                                    .addComponent(product_price)
                                    .addComponent(product_des)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(50, 50, 50)
                                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Addcart_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel3)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logo_label)
                            .addComponent(Home_btn)
                            .addComponent(contact_btn)
                            .addComponent(about_btn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_btn)
                            .addComponent(addcart_btn1)
                            .addComponent(profile_btn))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(product_title)
                        .addGap(18, 18, 18)
                        .addComponent(product_price)
                        .addGap(35, 35, 35)
                        .addComponent(product_des)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addComponent(Addcart_btn)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void search_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_inputActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void addcart_product_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcart_product_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addcart_product_1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Addcart_btn;
    public javax.swing.JLabel Home_btn;
    public javax.swing.JLabel about_btn;
    public javax.swing.JButton addcart_btn1;
    private javax.swing.JButton addcart_product_1;
    public javax.swing.JLabel contact_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo_label;
    private javax.swing.JLabel product_des;
    private javax.swing.JDesktopPane product_frame;
    public javax.swing.JLabel product_image;
    public javax.swing.JLabel product_name;
    private javax.swing.JPanel product_panel;
    public javax.swing.JLabel product_price;
    public javax.swing.JLabel product_prices;
    public javax.swing.JLabel product_title;
    public javax.swing.JButton profile_btn;
    public javax.swing.JTextField quantity;
    public javax.swing.JButton search_btn;
    public javax.swing.JTextField search_input;
    // End of variables declaration//GEN-END:variables
}
