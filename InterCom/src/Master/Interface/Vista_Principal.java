/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Master.Interface;

import Conexion.conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asistentedirprod
 */
public class Vista_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Principal
     */
    public Vista_Principal() {
        initComponents();
        cargarEx();
        Switch();
        jsp3.setVisible(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);//maximizado
        this.toFront();
        this.getContentPane().setBackground(Color.white);
    }
    DefaultTableModel model;
    DefaultTableModel model2;
    DefaultTableModel model3;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Statement st;
    Date date = new Date();
    DateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        Principal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabPedidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabDetalles = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        dato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jsp3 = new javax.swing.JScrollPane();
        TabEx = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        garantia = new javax.swing.JCheckBox();
        pendiente = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        Clientes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Pendientes = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InvSoft");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setFocusable(false);
        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Folio", "Fecha", "Cliente", "Numero", "Equipo", "Marca", "Modelo"
            }
        ));
        TabPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabPedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabPedidos);
        if (TabPedidos.getColumnModel().getColumnCount() > 0) {
            TabPedidos.getColumnModel().getColumn(0).setMinWidth(40);
            TabPedidos.getColumnModel().getColumn(0).setMaxWidth(60);
            TabPedidos.getColumnModel().getColumn(1).setMinWidth(120);
            TabPedidos.getColumnModel().getColumn(1).setMaxWidth(150);
            TabPedidos.getColumnModel().getColumn(2).setMinWidth(120);
            TabPedidos.getColumnModel().getColumn(2).setPreferredWidth(120);
            TabPedidos.getColumnModel().getColumn(3).setMinWidth(200);
            TabPedidos.getColumnModel().getColumn(3).setPreferredWidth(200);
            TabPedidos.getColumnModel().getColumn(4).setMinWidth(150);
            TabPedidos.getColumnModel().getColumn(4).setPreferredWidth(150);
            TabPedidos.getColumnModel().getColumn(5).setMinWidth(150);
            TabPedidos.getColumnModel().getColumn(5).setMaxWidth(180);
        }

        Principal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 980, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N
        Principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jButton1.setText("Refrescar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Principal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 120, 30));

        TabDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estatus", "Garantia", "Servicio", "Descripcion de falla", "Observaciones"
            }
        ));
        jScrollPane2.setViewportView(TabDetalles);
        if (TabDetalles.getColumnModel().getColumnCount() > 0) {
            TabDetalles.getColumnModel().getColumn(0).setMinWidth(80);
            TabDetalles.getColumnModel().getColumn(0).setMaxWidth(100);
            TabDetalles.getColumnModel().getColumn(1).setMinWidth(80);
            TabDetalles.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        Principal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 980, 170));

        jButton2.setText("Marcar como entregado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Principal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        dato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoActionPerformed(evt);
            }
        });
        dato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                datoKeyTyped(evt);
            }
        });
        Principal.add(dato, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 220, -1));

        jLabel3.setText("BUSCAR POR NOMBRE O NUMERO:");
        Principal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, -1));

        TabEx.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "Folio", "Fecha", "Cliente", "Numero", "Equipo", "Marca", "Modelo", "Estatus", "Garantia", "Servicio", "Descripcion de falla", "Observaciones"
            }
        ));
        jsp3.setViewportView(TabEx);

        Principal.add(jsp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, 80, 30));

        jButton3.setText("Finalizar Garantia");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Principal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setText("Limpiar Registros");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Principal.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 153, 51));
        jButton5.setText("Exportar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Principal.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 204, 0));
        jButton6.setText("Cambiar Folio");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Principal.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, -1, -1));

        jLabel2.setText("FILTRO:");
        Principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 40, 20));

        garantia.setText("Garantia Vigente");
        garantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                garantiaActionPerformed(evt);
            }
        });
        Principal.add(garantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        pendiente.setSelected(true);
        pendiente.setText("Pendiente de Entrega");
        pendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendienteActionPerformed(evt);
            }
        });
        Principal.add(pendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 110;
        gridBagConstraints.ipady = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(Principal, gridBagConstraints);

        getContentPane().add(jPanel2);

        Clientes.setText("Clientes");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Agregar Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Clientes.add(jMenuItem1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem4.setText("Modificar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Clientes.add(jMenuItem4);

        jMenuBar1.add(Clientes);

        Pendientes.setText("Pedidos");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem2.setText("Agregar Nuevo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Pendientes.add(jMenuItem2);

        jMenuBar1.add(Pendientes);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new VnCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new VnPedido().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new VmCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TabPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabPedidosMouseClicked
        int fil = TabPedidos.getSelectedRow();
        if (fil >= 0) {
            JOptionPane.showMessageDialog(null, TabPedidos.getValueAt(fil, 3).toString() + " seleccionado");
            cargar2(Integer.parseInt(TabPedidos.getValueAt(fil, 0).toString()));
        }
    }//GEN-LAST:event_TabPedidosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fil = TabPedidos.getSelectedRow();
        if (fil >= 0) {
            Entregar(Integer.parseInt(TabPedidos.getValueAt(fil, 0).toString()));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void datoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoActionPerformed

    }//GEN-LAST:event_datoActionPerformed

    private void datoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datoKeyTyped
        cargar3();
    }//GEN-LAST:event_datoKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fil = TabPedidos.getSelectedRow();
        if (fil >= 0) {
            Garantia(Integer.parseInt(TabPedidos.getValueAt(fil, 0).toString()));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Master.Interface.ToExcel.Exportar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "El folio actual es: " + (GetFolio()-1) + " ¿Desea Cambiarlo?\n"
                + "esta accion eliminara todas las ordenes\n"
                + "posteriores al folio actual", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            String nuevofolio = JOptionPane.showInputDialog("Escribe el nuevo folio");
            if (isNumeric(nuevofolio) == true) {
                int f = Integer.parseInt(nuevofolio);
                setFolio(f);
            } else {
            JOptionPane.showMessageDialog(null, "Operacion Cancelada, debe digitar un numero");
        }
        } else {
            JOptionPane.showMessageDialog(null, "Operacion Cancelada");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void garantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_garantiaActionPerformed
        cargar();
        Switch();
    }//GEN-LAST:event_garantiaActionPerformed

    private void pendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendienteActionPerformed
        cargar();
        Switch();
    }//GEN-LAST:event_pendienteActionPerformed

    void Switch(){
        if(pendiente.isSelected()){
            jButton2.setEnabled(true);
        } else{jButton2.setEnabled(false);}
        if(garantia.isSelected()){
            jButton3.setEnabled(true);
        } else{jButton3.setEnabled(false);}
}
    
    void cargar() {
        clean();
        String[] registros = new String[8];
        int pen = 0;
        String Gar = "Sin Garantia";
        String sql = "";
        if (!pendiente.isSelected()) {
            pen = 1;
        }
        if (!garantia.isSelected()) {
            sql = "SELECT Id_Pedido,NumFolio, Fecha_de_Recibo,clientes.Nombre,clientes.Telefono,Producto,Marca, Modelo FROM pendientes "
                    + "INNER JOIN clientes ON clientes.id_Cliente=pendientes.Cliente "
                    + "WHERE pendientes.Estatus='" + pen + "'";
        } else {
            sql = "SELECT Id_Pedido,NumFolio, Fecha_de_Recibo,clientes.Nombre,clientes.Telefono,Producto,Marca, Modelo FROM pendientes "
                    + "INNER JOIN clientes ON clientes.id_Cliente=pendientes.Cliente "
                    + "WHERE pendientes.Estatus='" + pen + "' AND Garantia!='" + Gar + "'";
        }
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idp = rs.getString("Id_Pedido");
                String nf = rs.getString("NumFolio");
                String fr = rs.getString("Fecha_de_Recibo");
                String nm = rs.getString("clientes.Nombre");
                String tel = rs.getString("clientes.Telefono");
                String pd = rs.getString("Producto");
                String mr = rs.getString("Marca");
                String md = rs.getString("Modelo");
                registros[0] = idp;
                registros[1] = nf;
                registros[2] = fr;
                registros[3] = nm;
                registros[4] = tel;
                registros[5] = pd;
                registros[6] = mr;
                registros[7] = md;
                model.addRow(registros);
            }
            TabPedidos.setModel(model);
            clean2();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    void cargar2(int idp) {
        clean2();
        String[] registros = new String[5];
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement("SELECT * FROM pendientes where Id_Pedido='" + idp + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                String dt = rs.getString("Detalles");
                String ob = rs.getString("Observaciones");
                String es = "";
                if (rs.getInt("Estatus") == 0) {
                    es = "No Entregado";
                } else {
                    es = "Entregado";
                }
                String sv = rs.getString("Servicio");
                String gr = rs.getString("Garantia");
                registros[0] = es;
                registros[1] = gr;
                registros[2] = sv;
                registros[3] = dt;
                registros[4] = ob;
                model2.addRow(registros);
            }
            TabDetalles.setModel(model2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    void cargar3() {
        clean();
        String[] registros = new String[8];
        int pen = 0;
        String Gar = "Sin Garantia";
        String sql = "";
        if (!pendiente.isSelected()) {
            pen = 1;
        }
        if (!garantia.isSelected()) {
            sql = "SELECT Id_Pedido,NumFolio, Fecha_de_Recibo,clientes.Nombre,clientes.Telefono,Producto,Marca, Modelo FROM pendientes "
                    + "INNER JOIN clientes ON clientes.id_Cliente=pendientes.Cliente "
                    + "WHERE pendientes.Estatus='" + pen + "' AND (clientes.Nombre LIKE '" + "%" + dato.getText() + "%" + "' "
                    + "OR clientes.Telefono LIKE '" + "%" + dato.getText() + "%" + "')";
        } else {
            sql = "SELECT Id_Pedido,NumFolio, Fecha_de_Recibo,clientes.Nombre,clientes.Telefono,Producto,Marca, Modelo FROM pendientes "
                    + "INNER JOIN clientes ON clientes.id_Cliente=pendientes.Cliente "
                    + "WHERE pendientes.Estatus='" + pen + "' AND Garantia!='" + Gar + "'AND (clientes.Nombre LIKE '" + "%" + dato.getText() + "%" + "' "
                    + "OR clientes.Telefono LIKE '" + "%" + dato.getText() + "%" + "')";
        }
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idp = rs.getString("Id_Pedido");
                String nf = rs.getString("NumFolio");
                String fr = rs.getString("Fecha_de_Recibo");
                String nm = rs.getString("clientes.Nombre");
                String tel = rs.getString("clientes.Telefono");
                String pd = rs.getString("Producto");
                String mr = rs.getString("Marca");
                String md = rs.getString("Modelo");
                registros[0] = idp;
                registros[1] = nf;
                registros[2] = fr;
                registros[3] = nm;
                registros[4] = tel;
                registros[5] = pd;
                registros[6] = mr;
                registros[7] = md;
                model.addRow(registros);
            }
            TabPedidos.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    void cargarEx() {
        clean3();
        String[] registros = new String[13];
        registros[0] = "-";
        registros[1] = "-";
        registros[2] = "-";
        registros[3] = "-";
        registros[4] = "-";
        registros[5] = "-";
        registros[6] = "-";
        registros[7] = "-";
        registros[8] = "-";
        registros[9] = "-";
        registros[10] = "-";
        registros[11] = "-";
        registros[12] = "-";
        model3.addRow(registros);
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement("SELECT `id_Pedido`, `NumFolio`, `Fecha_de_Recibo`, `Detalles`, `Observaciones`,clientes.Nombre,clientes.Telefono,"
                    + "`Estatus`, `Producto`, `Marca`, `Modelo`, `Serie`, `Servicio`, `Garantia` FROM pendientes "
                    + "INNER JOIN clientes ON clientes.id_Cliente=pendientes.Cliente");
            rs = ps.executeQuery();
            while (rs.next()) {
                String idp = rs.getString("Id_Pedido");
                String nf = rs.getString("NumFolio");
                String fr = rs.getString("Fecha_de_Recibo");
                String dt = rs.getString("Detalles");
                String ob = rs.getString("Observaciones");
                String nm = rs.getString("clientes.Nombre");
                String tel = rs.getString("clientes.Telefono");
                String es = "";
                if (rs.getInt("Estatus") == 0) {
                    es = "No Entregado";
                } else {
                    es = "Entregado";
                }
                String pd = rs.getString("Producto");
                String mr = rs.getString("Marca");
                String md = rs.getString("Modelo");
                String sv = rs.getString("Servicio");
                String gr = rs.getString("Garantia");
                registros[0] = idp;
                registros[1] = nf;
                registros[2] = fr;
                registros[3] = nm;
                registros[4] = tel;
                registros[5] = pd;
                registros[6] = mr;
                registros[7] = md;
                registros[8] = es;
                registros[9] = gr;
                registros[10] = sv;
                registros[11] = dt;
                registros[12] = ob;
                
                model3.addRow(registros);
            }
            TabEx.setModel(model3);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void clean() {
        model = ((DefaultTableModel) TabPedidos.getModel());
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    private void clean2() {
        model2 = ((DefaultTableModel) TabDetalles.getModel());
        while (model2.getRowCount() > 0) {
            model2.removeRow(0);
        }
    }

    private void clean3() {
        model3 = ((DefaultTableModel) TabEx.getModel());
        while (model3.getRowCount() > 0) {
            model3.removeRow(0);
        }
    }

    public void Entregar(int id) {
        try {
            con = conexion.getConnection();
            String Sql = "UPDATE `pendientes` SET `Estatus`='" + "1" + "' WHERE `id_Pedido`='" + id + "'";
            ps = con.prepareStatement(Sql);
            int res = ps.executeUpdate(); //si vas a usar un dato que no sea un valor escrito y sea pedido de una variable se usan '"+varible+"'
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "El pendiente se entrego con Exito");
                cargar();
                clean2();
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void Garantia(int id) {
        try {
            con = conexion.getConnection();
            String Sql = "UPDATE `pendientes` SET `Garantia`='Sin Garantia' WHERE `id_Pedido`='" + id + "'";
            ps = con.prepareStatement(Sql);
            int res = ps.executeUpdate(); //si vas a usar un dato que no sea un valor escrito y sea pedido de una variable se usan '"+varible+"'
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "La Garantia ha finalizado");
                cargar();
                clean2();
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void Limpiar() {
        try {
            int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Alerta!", JOptionPane.ERROR_MESSAGE);
            if (resp == 0) {
                con = conexion.getConnection();
                String Sql = "TRUNCATE `invmaster`.`pendientes`";
                ps = con.prepareStatement(Sql);
                int res = ps.executeUpdate(); //si vas a usar un dato que no sea un valor escrito y sea pedido de una variable se usan '"+varible+"'
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "La Garantia ha finalizado");
                    cargar();
                    clean2();
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Operacion Cancelada");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private int GetFolio() {
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement("SELECT Folio FROM folio where id =1");
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("Folio") + 1;
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return 0;
    }

    private void setFolio(int folio) {
        try {
            con = conexion.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE folio SET Folio=" + folio + " WHERE Id=1");
            int res = ps.executeUpdate();
            if (res > 0) {
                con = conexion.getConnection();
                PreparedStatement ps2 = con.prepareStatement("Delete FROM pendientes WHERE NumFolio>'" + folio + "'");
                int res2 = ps2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Folio Modificado");
                cargar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
            }
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Clientes;
    private javax.swing.JMenu Pendientes;
    private javax.swing.JPanel Principal;
    private javax.swing.JTable TabDetalles;
    public static javax.swing.JTable TabEx;
    private javax.swing.JTable TabPedidos;
    private javax.swing.JTextField dato;
    private javax.swing.JCheckBox garantia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jsp3;
    private javax.swing.JCheckBox pendiente;
    // End of variables declaration//GEN-END:variables
}