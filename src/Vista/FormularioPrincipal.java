package Vista;
import Controlador.ControladorFrPrincipal;
import Metodos.ConectarSQL;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FormularioPrincipal extends javax.swing.JFrame {
    
    ButtonGroup btnGr;
    
    public FormularioPrincipal() {
        initComponents();
        TXTid.setVisible(false);
        btnGr = new ButtonGroup();
        btnGr.add(RBemision);
        btnGr.add(RBfinalizado);
        cargarTabla();
        this.setLocationRelativeTo(null);
    }
    ControladorFrPrincipal FrPrin = new ControladorFrPrincipal(); 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBanimes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TXTnameAnime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RBemision = new javax.swing.JRadioButton();
        RBfinalizado = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        TXTtemAnime = new javax.swing.JTextField();
        Bguardar = new javax.swing.JButton();
        Bmodificar = new javax.swing.JButton();
        Beliminar = new javax.swing.JButton();
        TXTid = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuarioEnInterfaz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista Animes");
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBanimes.setBackground(new java.awt.Color(51, 51, 51));
        TBanimes.setForeground(new java.awt.Color(255, 255, 255));
        TBanimes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id ", "Anime", "Temporadas", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBanimes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBanimesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBanimes);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 478, 259));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Animes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Anime:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        TXTnameAnime.setBackground(new java.awt.Color(51, 51, 51));
        TXTnameAnime.setForeground(new java.awt.Color(255, 255, 255));
        TXTnameAnime.setBorder(null);
        TXTnameAnime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTnameAnimeActionPerformed(evt);
            }
        });
        jPanel1.add(TXTnameAnime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        RBemision.setBackground(new java.awt.Color(51, 51, 51));
        RBemision.setForeground(new java.awt.Color(255, 255, 255));
        RBemision.setText("Emision");
        RBemision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBemisionActionPerformed(evt);
            }
        });
        jPanel1.add(RBemision, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        RBfinalizado.setBackground(new java.awt.Color(51, 51, 51));
        RBfinalizado.setForeground(new java.awt.Color(255, 255, 255));
        RBfinalizado.setText("Finalizado");
        jPanel1.add(RBfinalizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Temporadas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        TXTtemAnime.setBackground(new java.awt.Color(51, 51, 51));
        TXTtemAnime.setForeground(new java.awt.Color(255, 255, 255));
        TXTtemAnime.setBorder(null);
        TXTtemAnime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTtemAnimeActionPerformed(evt);
            }
        });
        jPanel1.add(TXTtemAnime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, -1));

        Bguardar.setBackground(new java.awt.Color(51, 51, 51));
        Bguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/GUARDAR 32PX.png"))); // NOI18N
        Bguardar.setBorder(null);
        Bguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });
        jPanel1.add(Bguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        Bmodificar.setBackground(new java.awt.Color(51, 51, 51));
        Bmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/MODIFICAR 32PX.png"))); // NOI18N
        Bmodificar.setBorder(null);
        Bmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(Bmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        Beliminar.setBackground(new java.awt.Color(51, 51, 51));
        Beliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ELIMINAR 32PX.png"))); // NOI18N
        Beliminar.setBorder(null);
        Beliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Beliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));
        jPanel1.add(TXTid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 26, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 68, 150, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, 10));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 200, 259));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CERRAR 32PX.png"))); // NOI18N
        jLabel5.setText("Cerrar Sesion");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rias-gremory-png-clipart.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lista De Animes");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtUsuarioEnInterfaz.setBackground(new java.awt.Color(51, 51, 51));
        txtUsuarioEnInterfaz.setFont(new java.awt.Font("Forte", 1, 18)); // NOI18N
        txtUsuarioEnInterfaz.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarioEnInterfaz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(txtUsuarioEnInterfaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 190, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTnameAnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTnameAnimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTnameAnimeActionPerformed

    private void RBemisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBemisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBemisionActionPerformed

    private void TXTtemAnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTtemAnimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTtemAnimeActionPerformed

    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed
        String Anime = TXTnameAnime.getText();
        int Temporadas = Integer.parseInt(TXTtemAnime.getText());
        String Estado;
        if(RBemision.isSelected() == true)
        {
            Estado = "Emision";
        }
        else if(RBfinalizado.isSelected() == true)
        {
            Estado = "Finalizado";
        } 
        else
        {
            Estado = "Finalizado";
        } 
        
        try
        {
            Connection con = ConectarSQL.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Animes (Animes, Temporadas , Estado, Activo, Usuario) VALUES (?,?,?,?,?)");
            ps.setString(1, Anime);
            ps.setInt(2, Temporadas);
            ps.setString(3, Estado); 
            ps.setInt(4, 1);
            ps.setString(5, txtUsuarioEnInterfaz.getText());
            System.out.print(txtUsuarioEnInterfaz.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Anime Guardado");
            Limpiar();
            cargarTabla();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }        
        
    }//GEN-LAST:event_BguardarActionPerformed

    
    private void TBanimesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBanimesMouseClicked
        try
        {
            int fila = TBanimes.getSelectedRow();
            int id = Integer.parseInt(TBanimes.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = ConectarSQL.getConexion();
            ps = con.prepareStatement("SELECT Animes, Temporadas , Estado FROM Animes WHERE Usuario =?");
            ps.setString(1, txtUsuarioEnInterfaz.getText());
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                TXTid.setText(String.valueOf(id));
                TXTnameAnime.setText(rs.getString("Animes"));
                TXTtemAnime.setText(rs.getString("Temporadas")); 
                if(rs.getString("Estado").equals("Finalizado"))
                {
                    RBfinalizado.setSelected(true);
                } 
                else if(rs.getString("Estado").equals("Emision"))
                {
                    RBemision.setSelected(true);
                }    
            }    
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }        
    }//GEN-LAST:event_TBanimesMouseClicked

    private void BmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmodificarActionPerformed
        int Id = Integer.parseInt(TXTid.getText());
        String Anime = TXTnameAnime.getText();
        int Temporadas = Integer.parseInt(TXTtemAnime.getText());
        String Estado;
        if(RBemision.isSelected() == true)
        {
            Estado = "Emision";
        }
        else if(RBfinalizado.isSelected() == true)
        {
            Estado = "Finalizado";
        } 
        else
        {
            Estado = "Finalizado";
        } 
        
        try
        {
            Connection con = ConectarSQL.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE Animes SET Animes=?, Temporadas=? , Estado=? WHERE Id=?");
            ps.setString(1, Anime);
            ps.setInt(2, Temporadas);
            ps.setString(3, Estado);
            ps.setInt(4, Id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Anime Modificado");
            Limpiar();
            cargarTabla();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }        
        
    }//GEN-LAST:event_BmodificarActionPerformed

    private void BeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminarActionPerformed
        int cog = Integer.parseInt(TXTid.getText());
        FrPrin.eliminar(cog);
        Limpiar();
        cargarTabla();
    }//GEN-LAST:event_BeliminarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Login a = new Login();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked
    
    private void Limpiar()
    {
        TXTid.setText("");
        TXTnameAnime.setText("");
        TXTtemAnime.setText("");
        btnGr.clearSelection();
    } 
    
    private void cargarTabla()
    {
        DefaultTableModel modeloTabla = (DefaultTableModel) TBanimes.getModel();
        modeloTabla.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
      
        try
        {
            Connection con = ConectarSQL.getConexion();
            ps = con.prepareStatement("SELECT Id, Animes, Temporadas , Estado FROM Animes WHERE Usuario = 'ricanibal' ");
            //ps.setString(1, txtUsuarioEnInterfaz.getText());
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while(rs.next())
            {
                Object[] fila = new Object[columnas];
                for (int indice=0; indice < columnas; indice++){
                   fila[indice] = rs.getObject(indice + 1);
                }
                 modeloTabla.addRow(fila);
            }   
           
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }         
    }        
 
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
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Beliminar;
    private javax.swing.JButton Bguardar;
    private javax.swing.JButton Bmodificar;
    private javax.swing.JRadioButton RBemision;
    private javax.swing.JRadioButton RBfinalizado;
    private javax.swing.JTable TBanimes;
    private javax.swing.JTextField TXTid;
    private javax.swing.JTextField TXTnameAnime;
    private javax.swing.JTextField TXTtemAnime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel txtUsuarioEnInterfaz;
    // End of variables declaration//GEN-END:variables
}
