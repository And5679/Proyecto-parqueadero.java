
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class PanelListarVehiculos extends javax.swing.JPanel {

    public PanelListarVehiculos() {
        initComponents();
        rbFueraParq.setSelected(true);
        TableColumnModel columnModel = tblVehiculos.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(70);
        columnModel.getColumn(5).setPreferredWidth(70);
        columnModel.getColumn(6).setPreferredWidth(100);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        cbMoto = new javax.swing.JCheckBox();
        cbAuto = new javax.swing.JCheckBox();
        rbEnParq = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        rbFueraParq = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        tfPropietario = new javax.swing.JTextField();
        dcFechaBusqueda = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo Vehiculo");

        jButton2.setText("Cierre");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cbMoto.setText("Moto");

        cbAuto.setText("Carro");
        cbAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAutoActionPerformed(evt);
            }
        });

        rbEnParq.setText("En parqueadero");
        rbEnParq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnParqActionPerformed(evt);
            }
        });

        jLabel2.setText("Placa");
        jLabel2.setFocusTraversalPolicyProvider(true);

        rbFueraParq.setText("Fuera de Parqueadero");
        rbFueraParq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFueraParqActionPerformed(evt);
            }
        });

        jLabel3.setText("Propietario");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("Buscar Vehiculos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel4.setText("Fecha");

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Placa", "Propietario", "Tipo de Vehiculo", "Hora Entrada", "Hora Salida", "Pago"
            }
        ));
        jScrollPane3.setViewportView(tblVehiculos);

        jLabel7.setText("Ubicacion del vehiculo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnBuscar)
                        .addGap(101, 101, 101)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5)
                                .addGap(205, 205, 205)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel2)
                                                .addGap(129, 129, 129)
                                                .addComponent(jLabel3))
                                            .addComponent(cbAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(dcFechaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(jLabel4))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(cbMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(rbEnParq)
                        .addGap(18, 18, 18)
                        .addComponent(rbFueraParq)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcFechaBusqueda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPropietario)
                        .addComponent(tfPlaca)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFueraParq)
                    .addComponent(rbEnParq)
                    .addComponent(cbAuto)
                    .addComponent(cbMoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jButton2))
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    String consulta;
    String tipoVehiculo = "otro", estado = "", fecha = "";

    private void rbEnParqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnParqActionPerformed

    }//GEN-LAST:event_rbEnParqActionPerformed

    private void rbFueraParqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFueraParqActionPerformed

    }//GEN-LAST:event_rbFueraParqActionPerformed

    private void cbAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAutoActionPerformed

    }//GEN-LAST:event_cbAutoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) tblVehiculos.getModel();
        modelo.setRowCount(0);

        if (cbAuto.isSelected()) {
            if (cbMoto.isSelected()) {
                tipoVehiculo = "";
            } else {
                tipoVehiculo = "Automovil";
            }
        } else if (cbMoto.isSelected()) {

            tipoVehiculo = "Motocicleta";
        }

        if (rbFueraParq.isSelected()) {
            estado = "No disponible";
        }
        if (rbEnParq.isSelected()) {
            estado = "Disponible";
        }

        if (dcFechaBusqueda.getDate() != null) {

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dcFechaBusqueda.getDate();
            fecha = dateFormat.format(date);

        }

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/parqueadero", "root", "");
            Statement stat = con.createStatement();

            consulta = "SELECT * FROM vehiculos WHERE estado='" + estado + "' AND tipovehiculo LIKE'%" + tipoVehiculo + "%'AND placa LIKE '%" + tfPlaca.getText() + "%'AND propietario LIKE '%" + tfPropietario.getText() + "%' AND horaentrada LIKE '" + fecha + "%'";
            System.out.println(consulta);
            ResultSet rs = stat.executeQuery(consulta);
            rs.first();

            do {
                String horasalida = rs.getString(6);
                String pago = rs.getString(7);
                if (horasalida == null) {
                    horasalida = "No ah salido";
                    pago = "0";
                } else {
                    horasalida = rs.getString(6).substring(10).substring(0, 6);
                    pago = rs.getString(7);
                }

                String[] fila = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5).substring(10).substring(0, 6), horasalida, "$" + pago};
                modelo.addRow(fila);
            } while (rs.next());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PanelListarVehiculos.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(PanelListarVehiculos.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/parqueadero", "root", "");
            Statement stat =con.createStatement();
            consulta="SELECT SUM(valorpagado)FROM vehiculos WHERE estado='" + estado + "' AND tipovehiculo LIKE'%" + tipoVehiculo + "%' AND placa LIKE '%" + tfPlaca.getText() + "%' AND propietario LIKE '%" + tfPropietario.getText() + "%' AND horasalida LIKE '" + fecha + "%'";
            ResultSet rs=stat.executeQuery(consulta);
            rs.first();
            
            DecimalFormat df=new DecimalFormat("#.00");
            Double IngresosTotales = Double.parseDouble(rs.getString(1));
            JOptionPane.showMessageDialog(null, "El ingreso total del dia seleccionado es de : $ " + df.format(IngresosTotales) + " Pesos");

        } catch (ClassNotFoundException ex) {
        Logger.getLogger(PanelListarVehiculos.class.getName()).log(Level.SEVERE, null, ex);

        }catch (SQLException ex) {
            Logger.getLogger(PanelListarVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JCheckBox cbAuto;
    private javax.swing.JCheckBox cbMoto;
    private com.toedter.calendar.JDateChooser dcFechaBusqueda;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rbEnParq;
    private javax.swing.JRadioButton rbFueraParq;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfPropietario;
    // End of variables declaration//GEN-END:variables
}
