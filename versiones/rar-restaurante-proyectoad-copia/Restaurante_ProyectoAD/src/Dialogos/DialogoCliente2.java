
package Dialogos;

import Clases.Cliente;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
public class DialogoCliente2 extends javax.swing.JDialog {
     private String nombreArchivo = "clientes.txt";
    
    public DialogoCliente2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalDialogoCliente = new javax.swing.JPanel();
        etReservacion = new javax.swing.JLabel();
        panelTituloCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etNombreCliente = new javax.swing.JLabel();
        etNumeroCliente = new javax.swing.JLabel();
        textNumeroReservacion = new javax.swing.JTextField();
        textNombreCliente = new javax.swing.JTextField();
        textNumeroCliente = new javax.swing.JTextField();
        btnRegresarCliente = new javax.swing.JButton();
        btnIngresarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");

        panelPrincipalDialogoCliente.setBackground(new java.awt.Color(200, 173, 127));

        etReservacion.setBackground(new java.awt.Color(204, 204, 204));
        etReservacion.setText("Ingrese el numero de reservacion: ");
        etReservacion.setOpaque(true);

        panelTituloCliente.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO CLIENTE");

        javax.swing.GroupLayout panelTituloClienteLayout = new javax.swing.GroupLayout(panelTituloCliente);
        panelTituloCliente.setLayout(panelTituloClienteLayout);
        panelTituloClienteLayout.setHorizontalGroup(
            panelTituloClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        panelTituloClienteLayout.setVerticalGroup(
            panelTituloClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloClienteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        etNombreCliente.setBackground(new java.awt.Color(204, 204, 204));
        etNombreCliente.setText("Ingrese su nombre:");
        etNombreCliente.setOpaque(true);

        etNumeroCliente.setBackground(new java.awt.Color(204, 204, 204));
        etNumeroCliente.setText("Ingrese su numero:");
        etNumeroCliente.setOpaque(true);

        textNumeroReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumeroReservacionActionPerformed(evt);
            }
        });

        textNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreClienteActionPerformed(evt);
            }
        });

        textNumeroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumeroClienteActionPerformed(evt);
            }
        });

        btnRegresarCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresarCliente.setText("Regresar");
        btnRegresarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarClienteMouseClicked(evt);
            }
        });
        btnRegresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarClienteActionPerformed(evt);
            }
        });

        btnIngresarDatos.setBackground(new java.awt.Color(204, 204, 204));
        btnIngresarDatos.setText("Ingresar Datos");
        btnIngresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalDialogoClienteLayout = new javax.swing.GroupLayout(panelPrincipalDialogoCliente);
        panelPrincipalDialogoCliente.setLayout(panelPrincipalDialogoClienteLayout);
        panelPrincipalDialogoClienteLayout.setHorizontalGroup(
            panelPrincipalDialogoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTituloCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalDialogoClienteLayout.createSequentialGroup()
                .addGroup(panelPrincipalDialogoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalDialogoClienteLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(panelPrincipalDialogoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalDialogoClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPrincipalDialogoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGroup(panelPrincipalDialogoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalDialogoClienteLayout.createSequentialGroup()
                        .addGroup(panelPrincipalDialogoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalDialogoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textNumeroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(textNombreCliente))
                            .addComponent(textNumeroReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalDialogoClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(btnIngresarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        panelPrincipalDialogoClienteLayout.setVerticalGroup(
            panelPrincipalDialogoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalDialogoClienteLayout.createSequentialGroup()
                .addComponent(panelTituloCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(panelPrincipalDialogoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelPrincipalDialogoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panelPrincipalDialogoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNumeroReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(panelPrincipalDialogoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipalDialogoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalDialogoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNumeroReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumeroReservacionActionPerformed
        
    }//GEN-LAST:event_textNumeroReservacionActionPerformed

    private void textNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreClienteActionPerformed
        
    }//GEN-LAST:event_textNombreClienteActionPerformed

    private void textNumeroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumeroClienteActionPerformed
        
    }//GEN-LAST:event_textNumeroClienteActionPerformed

    private void btnIngresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarDatosActionPerformed
    
    String nombreCliente = textNombreCliente.getText();
    String numeroCliente = textNumeroCliente.getText();
    String numReservacionText = textNumeroReservacion.getText();
    
        if (nombreCliente.isEmpty() || numeroCliente.isEmpty() || numReservacionText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Error: Todos los campos son obligatorios");
        return; // Salir del método sin guardar los datos
    }

    try{
//    String nombreCliente = textNombreCliente.getText();
//    String numeroCliente = textNumeroCliente.getText();
    int numReservacion = Integer.parseInt(textNumeroReservacion.getText());
    
    Cliente cliente = new Cliente(nombreCliente,numeroCliente, numReservacion);
    
    FileWriter fileWriter = null;
    BufferedWriter bufferedWriter = null;
    try {
        // Crear el FileWriter y BufferedWriter con el nombre del archivo en modo append (agregar al final)
        fileWriter = new FileWriter(nombreArchivo, true);
        bufferedWriter = new BufferedWriter(fileWriter);

        // Escribir los datos del cliente en el archivo
        bufferedWriter.write(cliente.toString());
        bufferedWriter.newLine();

        // Mostrar un mensaje de éxito en la interfaz gráfica
        JOptionPane.showMessageDialog(this, "Los datos han sido registrados correctamente");

    } catch (IOException e) {
        // Manejar cualquier error que pueda ocurrir al escribir en el archivo
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Ha ocurrido un error al guardar los datos del cliente.");
    } finally {
        // Cerrar el BufferedWriter y FileWriter al finalizar
        if (bufferedWriter != null) {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (fileWriter != null) {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    limpiarDatos();
     } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error: ingresa un número válido en el campo 'Número de Reservación'");
    }
    }//GEN-LAST:event_btnIngresarDatosActionPerformed

    private void limpiarDatos(){
        textNombreCliente.setText("");
        textNumeroCliente.setText("");
        textNumeroReservacion.setText("");
    }
    private void btnRegresarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarClienteMouseClicked
        
    }//GEN-LAST:event_btnRegresarClienteMouseClicked

    private void btnRegresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarClienteActionPerformed
       dispose();
    }//GEN-LAST:event_btnRegresarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarDatos;
    private javax.swing.JButton btnRegresarCliente;
    private javax.swing.JLabel etNombreCliente;
    private javax.swing.JLabel etNumeroCliente;
    private javax.swing.JLabel etReservacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelPrincipalDialogoCliente;
    private javax.swing.JPanel panelTituloCliente;
    private javax.swing.JTextField textNombreCliente;
    private javax.swing.JTextField textNumeroCliente;
    private javax.swing.JTextField textNumeroReservacion;
    // End of variables declaration//GEN-END:variables
}
