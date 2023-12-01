
import com.itextpdf.io.IOException;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Paragraph;
import com.sun.istack.internal.logging.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Runtime.getRuntime;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JOptionPane;

public class PanelIngresarVehiculo extends javax.swing.JPanel {

    public PanelIngresarVehiculo() {
        initComponents();

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {

            java.util.logging.Logger.getLogger(PanelIngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbMoto = new javax.swing.JRadioButton();
        rbAuto = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfPropietario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(416, 573));

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jLabel4.setText("Tipo De vehiculo");

        rbMoto.setText("Moto");
        rbMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMotoActionPerformed(evt);
            }
        });

        rbAuto.setText("Carro");
        rbAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAutoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("INGRESO VEHICULOS");

        tfPlaca.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        tfPlaca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPlacaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nombre propietario");

        tfPropietario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfPropietario.setAutoscrolls(false);
        tfPropietario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPropietarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Placa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(tfPlaca))))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbMoto)
                                .addGap(18, 18, 18)
                                .addComponent(rbAuto)))
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAuto)
                    .addComponent(rbMoto))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
        String fechaHora = "";
    private void rbMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMotoActionPerformed

    private void rbAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String clasevehiculo = "";
        if (rbAuto.isSelected()) {
            clasevehiculo = "Automovil";

        }
        if (rbMoto.isSelected()) {
            clasevehiculo = "Motocicleta";
        }

        // Conexion a la base de datos.
        try {

            Connection conexionBD = DriverManager.getConnection("jdbc:mysql://localhost/parqueadero", "root", "");
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar cal = Calendar.getInstance(); // Tomo la fecha y hora  actual.
            Date date = cal.getTime();  //Llamo a la hora.
            fechaHora = dateFormat.format(date);
            System.out.println(dateFormat.format(date));
            Statement stat = conexionBD.createStatement();
            String sql = "INSERT INTO vehiculos (placa,propietario,tipovehiculo,horaentrada,estado) VALUES ('" + tfPlaca.getText() + "','" + tfPropietario.getText() + "','" + clasevehiculo + "','" + fechaHora + "','Disponible')";
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, " Vehiculo registrado correctamente");

        } catch (SQLException ex) {

            java.util.logging.Logger.getLogger(PanelIngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);

        }
 
        String dest = "MiPrimerPdf.pdf";
        try {

            PdfWriter writer = new PdfWriter(dest); //Encarga de escribir el contenido en el archivo Pdf.
            PdfDocument pdfDoc = new PdfDocument(writer); //Gestionar el contenido del PDF
            Document document = new Document(pdfDoc, PageSize.A5); //Facilita la creación y manipulación de contenido en un documento PDF.
            pdfDoc.addNewPage();

            Paragraph para = new Paragraph("Recibo parqueadero La malla");

            para.setBorder(Border.NO_BORDER);
            para.setBold();

            Paragraph para1 = new Paragraph("Placa vehiculo:" + tfPlaca.getText());
            Paragraph para2 = new Paragraph("Nombre del propietario: " + tfPropietario.getText());
            Paragraph para3 = new Paragraph("Hora de ingreso: " + fechaHora);

            document.add(para);
            document.add(para1);
            document.add(para2);
            document.add(para3);
            document.close();
            System.out.println("PDF Creado.");

        } catch (FileNotFoundException | IOException ex) {

            java.util.logging.Logger.getLogger(PanelIngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);

        }

        
        try{
            
           if   ((new File("MiPrimerPdf.pdf")).exists()){
           
           Process p=Runtime
           .getRuntime()
           .exec("rundll32 url.dll,FileProtocolHandler MiPrimerPdf.pdf ");
           p.waitFor();
           
           }else{
           
               System.out.println("File is not exists");
           } 
            
           
            System.out.println("Done");
            
        
        }catch(Exception ex){
        
        ex.printStackTrace();
        
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlacaActionPerformed

    private void tfPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPropietarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton rbAuto;
    private javax.swing.JRadioButton rbMoto;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfPropietario;
    // End of variables declaration//GEN-END:variables
}
