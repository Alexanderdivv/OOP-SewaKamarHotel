import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DatapenyewaCO extends javax.swing.JFrame {
    boolean cekdata;
    koneksi koneksi = new koneksi();
    public DatapenyewaCO() {
        initComponents();
        tampildata();
        tampilcombo();
//        setdate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Pilih ID Penyewa :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Pilih ID Penyewa -" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Penyewa :");

        jLabel4.setText("No Telp");

        jLabel5.setText("Pekerjaan :");

        jLabel6.setText("No. Transaksi :");

        jLabel7.setText("Tgl Check in");

        jLabel14.setText("Total Pembayaran");

        jLabel15.setText("Harga Permalam");

        jLabel16.setText("lama");

        jLabel17.setText("total bayar");

        jTextField7.setText("0");

        jTextField8.setText("0");
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });

        jLabel20.setText("-");

        jLabel21.setText("-");

        jLabel22.setText("-");

        jLabel23.setText("-");

        jLabel25.setText("0");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Transaksi", "Harga", "Total bayar", "Waktu menginap", "ID Penyewa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("TAMBAH DATA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EDIT DATA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HAPUS DATA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("SIMPAN DATA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Log Out");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("FORM CHECK-OUT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(jLabel26)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 454, Short.MAX_VALUE)
                                .addComponent(jButton5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox1, 0, 1, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22))
                                .addGap(138, 138, 138)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel17))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                        .addComponent(jTextField8)))
                                .addGap(151, 151, 151)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addGap(7, 7, 7)
                .addComponent(jLabel26)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel23))
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel25))))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        munculotomatis();
//        set();
//        setdate();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        insertdata();
        tampildata();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        hapusdata();
        tampildata();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        editdata();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        simpandata();
        tampildata();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MasterCheckin masterkaryawan = new MasterCheckin();
        masterkaryawan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        login login = new login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
        
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        int totalbyr=Integer.parseInt(jTextField7.getText())*Integer.parseInt(jTextField8.getText());
        jLabel25.setText(Integer.toString(totalbyr));
    }//GEN-LAST:event_jTextField8KeyReleased
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatapenyewaCO().setVisible(true);
            }
        });
    }
    
    public void tampildata(){
        DefaultTableModel data = (DefaultTableModel) jTable1.getModel();
        data.getDataVector().removeAllElements();
        try {
            String sql = "select * from sewa";
            Statement st = koneksi.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String kolom[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                data.addRow(kolom);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(MasterCheckin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilcombo(){
        try {
            String sql = "select idPenyewa from ckin";
            Statement st = koneksi.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                jComboBox1.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterCheckin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void munculotomatis(){
        try {
            String sql = "select namaPenyewa,no_telp,pekerjaan, tgl_ckin from ckin where idPenyewa='"+jComboBox1.getSelectedItem().toString()+"'";
            Statement st = koneksi.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                jLabel20.setText(rs.getString(1));
                jLabel21.setText(rs.getString(2));
                jLabel22.setText(rs.getString(3));
                jLabel23.setText(rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterCheckin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertdata(){
        try {
            int totalbyr=Integer.parseInt(jTextField7.getText())*Integer.parseInt(jTextField8.getText());
            String sql = "insert into sewa value ('"+jTextField1.getText()+"','"+jTextField7.getText()+"','"+totalbyr+"','"+jTextField8.getText()+"','"+jComboBox1.getSelectedItem().toString()+"')";
            Statement st = koneksi.con.createStatement();
            int rs = st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MasterCheckin.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
//    public void setdate(){
//        Date date = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        jLabel23.setText(formatter.format(date));
//    }
    
//    public void set(){
//        int bpjs;
//        int gajikotor;
//        int gajibersih;
//        int jumlahtidakhadir=(Integer.parseInt(jTextField3.getText())+Integer.parseInt(jTextField4.getText())+Integer.parseInt(jTextField5.getText()))*50000;
//        jTextField6.setText(Integer.toString(jumlahtidakhadir));
//        if(jLabel21.getText().equals("Junior associate")){
//            jLabel25.setText("200000");
//        }
//        else if(jLabel21.getText().equals("Middle associate")){
//            jLabel25.setText("300000");
//        }
//        else if(jLabel21.getText().equals("Senior associate")){
//            jLabel25.setText("400000");
//        }
//        try {
//            String sql = "select jabatan, rate_gaji from tb_karyawan where id_karyawan='"+jComboBox1.getSelectedItem().toString()+"'";
//            Statement st = koneksi.con.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while(rs.next()){
//                bpjs=(rs.getInt(2)/100)*3;
//                gajikotor=rs.getInt(2)+Integer.parseInt(jTextField7.getText())+Integer.parseInt(jTextField8.getText())+Integer.parseInt(jLabel25.getText());
//                jLabel24.setText(Integer.toString(bpjs));
//                jTextField9.setText(Integer.toString(gajikotor));
//                gajibersih=gajikotor-Integer.parseInt(jTextField6.getText())-Integer.parseInt(jLabel24.getText());
//                jTextField10.setText(Integer.toString(gajibersih));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(MasterCheckin.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    public void hapusdata(){
        if(jTable1.getSelectedColumn()<0){
            JOptionPane.showMessageDialog(null, "Harap Pilih Data Yang Akan Dihapus Pada Table");
        }
        else if(jTable1.getSelectedColumn()==4){
            try {
                String sql = "DELETE FROM sewa WHERE noTransaksi='"+jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn())+"'";
                Statement st = koneksi.con.createStatement();
                int rs = st.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(MasterCheckin.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        }
        else{
            JOptionPane.showMessageDialog(null, "Harap Pilih Pada Kolom No Transaksi");
        }
    }
    
    public void editdata(){
        if(jTable1.getSelectedColumn()<0){
            JOptionPane.showMessageDialog(null, "Harap Pilih Kolom No Transaksi Pada Table");
        }
        else if(jTable1.getSelectedColumn()==4){
                DefaultTableModel data1 = (DefaultTableModel) jTable1.getModel();
            try {
                String sql = "Select * from sewa where noTransaksi='"+jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn()).toString()+"'";
                Statement st = koneksi.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    jTextField1.setText(rs.getString(2));
                    jTextField7.setText(rs.getString(4));
                    jTextField8.setText(rs.getString(6));
                    jLabel25.setText(rs.getString(7));
                    cekdata=true;
                }
                rs.close();
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(MasterCheckin.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Silakan Tekan Tombol Simpan Untuk Menyimpan");
        }
        else{
            JOptionPane.showMessageDialog(null, "Harap Pilih Kolom No Transaksi Pada Table");
        }
    }
    
    public void simpandata(){
        int totalbyr=Integer.parseInt(jTextField8.getText())*Integer.parseInt(jTextField7.getText());
        if(cekdata==true){
                try {
                String sql = "update sewa set harga='"+jTextField7.getText()+"',totalbayar='"+Integer.toString(totalbyr)+"',lamanginap='"+jTextField8.getText()+"',idPenyewa='"+jComboBox1.getSelectedItem().toString()+"' where noTransaksi='"+jTextField1.getText()+"'";
                Statement st = koneksi.con.createStatement();
                int rs = st.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(MasterCheckin.class.getName()).log(Level.SEVERE, null, ex);
            }
                cekdata=false;
                JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
        }
        else{
            JOptionPane.showMessageDialog(null, "Harap Tekan Tombol Edit Terlebih Dahulu");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
