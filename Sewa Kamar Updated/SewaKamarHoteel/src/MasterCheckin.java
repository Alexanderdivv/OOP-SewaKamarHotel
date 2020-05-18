import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
public class MasterCheckin extends javax.swing.JFrame {
    koneksi koneksi = new koneksi();
    DatapenyewaCO datapenyewaCo = new DatapenyewaCO();
    boolean cekdata;
    public MasterCheckin() {
        initComponents();
        tampildata();
        tampilidpenyewa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txidPenyewa = new javax.swing.JTextField();
        txnamaPenyewa = new javax.swing.JTextField();
        txnotelp = new javax.swing.JTextField();
        txpekerjaan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txidPegawai = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txareaalamat = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txckin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txckout = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        combojenkel = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("ID Penyewa :");

        jLabel3.setText("Nama Penyewa :");

        jLabel4.setText("No Telepon :");

        jLabel5.setText("Pekerjaan :");

        jLabel6.setText("Jenis Kelamin");

        jLabel7.setText("ID Pegawai  :");

        txidPegawai.setEditable(false);

        jLabel8.setText("Alamat :");

        txareaalamat.setColumns(20);
        txareaalamat.setRows(5);
        jScrollPane1.setViewportView(txareaalamat);

        jLabel9.setText("Tgl check-in");

        txckin.setText("dd-mm-yyyy");
        txckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txckinActionPerformed(evt);
            }
        });

        jLabel10.setText("Tgl check-out");

        txckout.setText("dd-mm-yyyy");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Penyewa", "Nama Penyewa", "No Telepon", "Pekerjaan", "Jenis Kelamin", "Id Pegawai", "Alamat", "Tgl Check-in", "Tgl Check-out"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(jTable1);

        jButton1.setText("TAMBAH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SIMPAN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("EDIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("HAPUS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("CHECK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Form Check-in");

        combojenkel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Jenis Kelamin -", "Laki Laki", "Perempuan" }));

        jButton6.setText("Log Out");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txnamaPenyewa)
                                    .addComponent(txnotelp)
                                    .addComponent(txpekerjaan)
                                    .addComponent(combojenkel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txidPenyewa))
                                .addGap(139, 139, 139)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(txckout)
                            .addComponent(txckin)
                            .addComponent(txidPegawai))
                        .addGap(0, 203, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txidPenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txidPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txnamaPenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txpekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txckin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(txckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combojenkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        insertdata();
        tampildata();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        hapusdata();
        if(jTable1.getSelectedColumn()==0){
            tampildata();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        editdata();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        simpandata();
        tampildata();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        datapenyewaCo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        login login = new login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txckinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txckinActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterCheckin().setVisible(true);
            }
        });
    }
    
    public void tampildata(){
        DefaultTableModel data = (DefaultTableModel) jTable1.getModel();
        data.getDataVector().removeAllElements();
        try {
            String sql = "Select * from ckin";
            Statement st = koneksi.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String kolom[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9)};
                data.addRow(kolom);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(MasterCheckin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilidpenyewa(){
        try {
            String sql = "select idPegawai from user";
            Statement st = koneksi.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                txidPegawai.setText(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterCheckin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertdata(){
        try {
            String sql = "INSERT INTO ckin VALUES ('"+txidPenyewa.getText().toString()+"','"+txnamaPenyewa.getText().toString()+"','"+txnotelp.getText().toString()+"','"+txpekerjaan.getText().toString()+"','"+combojenkel.getSelectedItem().toString()+"','"+txidPegawai.getText().toString()+"','"+txareaalamat.getText().toString()+"','"+txckin.getText().toString()+"','"+txckout.getText().toString()+"')";
            Statement st = koneksi.con.createStatement();
            int rs = st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MasterCheckin.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void hapusdata(){
        if(jTable1.getSelectedColumn()<0){
            JOptionPane.showMessageDialog(null, "Harap Pilih Data Yang Akan Dihapus Pada Table");
        }
        else if(jTable1.getSelectedColumn()==0){
            try {
                String sql = "DELETE FROM ckin WHERE idPenyewa='"+jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn())+"'";
                Statement st = koneksi.con.createStatement();
                int rs = st.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(MasterCheckin.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        }
        else{
            JOptionPane.showMessageDialog(null, "Harap Pilih Pada Kolom ID Karyawan");
        }
    }
    
    public void editdata(){
        if(jTable1.getSelectedColumn()<0){
            JOptionPane.showMessageDialog(null, "Harap Pilih Data Yang Akan Diedit Pada Table");
        }
        else if(jTable1.getSelectedColumn()==0){
                DefaultTableModel data1 = (DefaultTableModel) jTable1.getModel();
            try {
                String sql = "Select * from ckin where idPenyewa='"+jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn()).toString()+"'";
                Statement st = koneksi.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    txidPenyewa.setText(rs.getString(1));
                    txnamaPenyewa.setText(rs.getString(2));
                    txnotelp.setText(rs.getString(3));
                    txpekerjaan.setText(rs.getString(4));
                    txidPegawai.setText(rs.getString(5));
                    txareaalamat.setText(rs.getString(6));
                    txckin.setText(rs.getString(7));
                    txckout.setText(rs.getString(8));
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
            JOptionPane.showMessageDialog(null, "Harap Pilih Pada Kolom ID Karyawan");
        }
    }
    
    public void simpandata(){
        String a=txidPenyewa.getText();
        if(cekdata==true){
                try {
                String sql = "update ckin set namaPenyewa='"+txnamaPenyewa.getText()+"',no_telp='"+txnotelp.getText()+"',pekerjaan='"+txpekerjaan.getText()+"',idPegawai='"+txidPegawai.getText()+"',alamat='"+txareaalamat.getText()+"',tgl_ckin='"+txckin.getText()+"',tgl_ckout='"+txckout.getText()+"' where idPenyewa='"+txidPenyewa.getText()+"'";
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
    private javax.swing.JComboBox<String> combojenkel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txareaalamat;
    private javax.swing.JTextField txckin;
    private javax.swing.JTextField txckout;
    private javax.swing.JTextField txidPegawai;
    private javax.swing.JTextField txidPenyewa;
    private javax.swing.JTextField txnamaPenyewa;
    private javax.swing.JTextField txnotelp;
    private javax.swing.JTextField txpekerjaan;
    // End of variables declaration//GEN-END:variables
}
