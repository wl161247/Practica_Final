
package practica_final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wilson
 */
public final class Principal extends javax.swing.JFrame {


    Connection con;
    
    public Principal() {
        
     //llamamos el metodo que contiene la coneccion principal
        conexion();
      
     // llamamos este metodo para que desde que iniciemos con el programas muestre todos los participantes
        BuscarTodo();
        
    // Me permite posicionar en el centro el Programa
       this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GGenero = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        PPTable = new javax.swing.JTable();
        PPNuevo = new javax.swing.JButton();
        PPSalir = new javax.swing.JButton();
        PPCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CpBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        masculino = new javax.swing.JRadioButton();
        femenino = new javax.swing.JRadioButton();
        PPNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PPDireccion = new javax.swing.JTextArea();
        PPTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PPActualizar = new javax.swing.JButton();
        PPEliminar = new javax.swing.JButton();
        PPCancelar = new javax.swing.JButton();
        PPRegistrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        PPEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PPTable.setBackground(java.awt.SystemColor.activeCaption);
        PPTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Teléfono", "Género", "Dirección"
            }
        ));
        PPTable.setEnabled(false);
        PPTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PPTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(PPTable);

        PPNuevo.setBackground(java.awt.SystemColor.activeCaption);
        PPNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PPNuevo.setText("Nuevo");
        PPNuevo.setPreferredSize(new java.awt.Dimension(89, 23));
        PPNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPNuevoActionPerformed(evt);
            }
        });

        PPSalir.setBackground(java.awt.SystemColor.activeCaption);
        PPSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PPSalir.setText("Salir");
        PPSalir.setPreferredSize(new java.awt.Dimension(89, 23));
        PPSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPSalirActionPerformed(evt);
            }
        });

        PPCodigo.setToolTipText("Ej: 1");
        PPCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPCodigoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Código:");

        CpBuscar.setBackground(java.awt.SystemColor.activeCaption);
        CpBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CpBuscar.setText("Buscar");
        CpBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpBuscarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Teléfono:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Género:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Dirección:");

        GGenero.add(masculino);
        masculino.setText("Masculino");
        masculino.setEnabled(false);

        GGenero.add(femenino);
        femenino.setText("Femenino");
        femenino.setEnabled(false);

        PPNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PPNombre.setToolTipText("Ej: Wilson Luna Inoa");
        PPNombre.setEnabled(false);
        PPNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPNombreActionPerformed(evt);
            }
        });

        PPDireccion.setColumns(20);
        PPDireccion.setRows(5);
        PPDireccion.setToolTipText("Ej: C.Principal, #30, Don Fausto, La Vega");
        PPDireccion.setEnabled(false);
        jScrollPane1.setViewportView(PPDireccion);

        PPTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PPTelefono.setToolTipText("Ej: 809-000-0000");
        PPTelefono.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nombre:");

        PPActualizar.setBackground(new java.awt.Color(204, 204, 255));
        PPActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PPActualizar.setText("Guardar Modificación");
        PPActualizar.setEnabled(false);
        PPActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPActualizarActionPerformed(evt);
            }
        });

        PPEliminar.setBackground(new java.awt.Color(204, 204, 255));
        PPEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PPEliminar.setText("Eliminar");
        PPEliminar.setEnabled(false);
        PPEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPEliminarActionPerformed(evt);
            }
        });

        PPCancelar.setBackground(new java.awt.Color(204, 204, 255));
        PPCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PPCancelar.setText("Cancelar");
        PPCancelar.setEnabled(false);
        PPCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(masculino)
                        .addGap(18, 18, 18)
                        .addComponent(femenino))
                    .addComponent(PPTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PPCancelar)
                .addGap(18, 18, 18)
                .addComponent(PPEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PPActualizar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PPTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(masculino)
                    .addComponent(femenino))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PPActualizar)
                    .addComponent(PPEliminar)
                    .addComponent(PPCancelar))
                .addContainerGap())
        );

        PPRegistrar.setBackground(java.awt.SystemColor.activeCaption);
        PPRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PPRegistrar.setText("Guardar");
        PPRegistrar.setEnabled(false);
        PPRegistrar.setPreferredSize(new java.awt.Dimension(89, 23));
        PPRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPRegistrarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel8.setText("-----------------------> Participantes Registrados  <----------------------");

        PPEditar.setBackground(java.awt.SystemColor.activeCaption);
        PPEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PPEditar.setText("Modificar");
        PPEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPEditarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registo de Participante");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Practica Final");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("#QuedateEnCasa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(183, 183, 183))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PPNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(PPEditar)
                                .addGap(46, 46, 46)
                                .addComponent(PPRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(PPSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PPCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CpBuscar)
                                .addGap(181, 181, 181)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PPCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CpBuscar))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(PPRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PPNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PPSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PPEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PPNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPNuevoActionPerformed
        
         habilitaOp2();//Llamamos este metodo que para que nos habilite y deshabilite los botones que le indicamos
        PPRegistrar.setEnabled(true);
        PPActualizar.setEnabled(false);// Ademas le indicamos que nos habilite o deshabilite estos en especifico ya en que el metodo estan diferente
        PPEliminar.setEnabled(false);
        PPNuevo.setEnabled(false);
        
        JOptionPane.showMessageDialog(null,"SELECCIONÓ NUEVO PARTICIPANTE");
        limpiar();//Llamamos el metodo, nos permite limpiar las areas de los textos
 //----------------------------------------------------------------------
        
    }//GEN-LAST:event_PPNuevoActionPerformed

    private void PPEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPEditarActionPerformed
         
          habilitaOp2();//Llamamos este metodo que para que nos habilite y deshabilite los botones que le indicamos
          PPNuevo.setEnabled(false);// Ademas le decimo que nos deshabilite este ya que en el metodo que llamamos esta habilitado
          JOptionPane.showMessageDialog(null,"SELECCIONÓ MODIFICAR");//UN mensaje
      
    }//GEN-LAST:event_PPEditarActionPerformed

    
    
    private void PPSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPSalirActionPerformed
      
        JOptionPane.showMessageDialog(null,"Desea Salir?");//Un mensaje
        System.exit(0);//nos permite salir del programa completo
        
    }//GEN-LAST:event_PPSalirActionPerformed

    
    private void CpBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpBuscarActionPerformed
       

        try {
// En este bloque conectamos con la DB, y a la vez nos permite comuniarno meniante sentencias SQL
            DefaultTableModel modelo = (DefaultTableModel) PPTable.getModel();
            modelo.setRowCount(0);
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/finalwilson","root","");
            Statement stmt = con.createStatement();
//la sentencia SQL
            ResultSet rs=stmt.executeQuery("SELECT * FROM participante WHERE Pcodigo LIKE'"+PPCodigo.getText()+"%'" );

            rs.first();

            do{
                String[] fila = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
                modelo.addRow(fila);
            }while(rs.next());

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"NO EXISTE EN LA BASE DE DATOS");
        }

    }//GEN-LAST:event_CpBuscarActionPerformed

    private void PPCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PPCodigoActionPerformed

    @SuppressWarnings("empty-statement")
    private void PPRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPRegistrarActionPerformed
    habilitaOp1();
     //----------------------------------------------------
        String Pgenero="";// creamos un String lo utilizaremos para compara el genero
       
        if(masculino.isSelected()){
            Pgenero="M";                //Nos permite a controlar que a la hora de seleccionar solo permite la seleecio de uno
        }else{
            Pgenero="F";
        }
     //-------------------------------------------------------------
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/finalwilson","root","");
            Statement stmt = con.createStatement();// En este bloque conectamos con la DB, y a la vez nos permite comuniarno meniante sentencias SQL
            stmt.executeUpdate("INSERT INTO participante (Pnombre,Ptelefono,Pgenero,Pdireccion) VALUES('"+PPNombre.getText()+"','"+PPTelefono.getText()+"','"+Pgenero+"','"+PPDireccion.getText()+"')");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"NO SE PUEDE DEJAR CAMPOS VACIOS!");
        }
        
//------------------------------------------------------------------------------
        JOptionPane.showMessageDialog(null,"GUARDADO DE MANERA EXITOSA");// Un letrero que nos guardo de manera exitosa
      limpiar();//llamamos el metodo que cramos para vaciar todas las variable que almacen datos(Ojo debe estar al final par que no nos borre los datos)
      BuscarTodo();//Este metodo nos permite refrescar todos los datos de participante
          
        
    }//GEN-LAST:event_PPRegistrarActionPerformed

    private void PPNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PPNombreActionPerformed

    private void PPTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PPTableMouseClicked
  int modificar=PPTable.rowAtPoint(evt.getPoint());

  PPCodigo.setText(String.valueOf(PPTable.getValueAt(modificar,0)));
  PPNombre.setText(String.valueOf(PPTable.getValueAt(modificar, 1)));
  PPTelefono.setText(String.valueOf(PPTable.getValueAt(modificar, 2)));
  PPDireccion.setText(String.valueOf(PPTable.getValueAt(modificar, 4)));

// TODO add your handling code here:
    }//GEN-LAST:event_PPTableMouseClicked

    private void PPActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPActualizarActionPerformed
 habilitaOp1();    
   String Pgenero="";
       
        if(masculino.isSelected()){
            Pgenero="M";                //Nos permite a controlar que a la hora de seleccionar solo permite la seleecio de uno
        }else{
            Pgenero="F";
        }
//-------------------------------------------------------------
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/finalwilson","root","");
            Statement stmt = con.createStatement();// En este bloque conectamos con la DB, y a la vez nos permite comuniarno meniante sentencias SQL
             
            stmt.executeUpdate("UPDATE `participante` SET `Pnombre` = '"+PPNombre.getText()+"', `Ptelefono` = '"+PPTelefono.getText()+"', `Pgenero` = '"+Pgenero+"', `Pdireccion` = '"+PPDireccion.getText()+"' WHERE `participante`.`Pcodigo` = '"+PPCodigo.getText()+"'");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"NO SE PUEDE DEJAR CAMPOS VACIOS!");
        }
//------------------------------------------------------------------------------
        JOptionPane.showMessageDialog(null,"SE ACTUALIZÓ DE MANERA EXITOSA");// Un letrero que nos guardo de manera exitosa
    limpiar();//llamamos el metodo que cramos para vaciar todas las variable que almacen datos(Ojo debe estar al final par que no nos borre los datos)
    BuscarTodo();//Este metodo nos permite refrescar todos los datos de participante
            
    }//GEN-LAST:event_PPActualizarActionPerformed

    private void PPEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPEliminarActionPerformed
             habilitaOp1();
             
            // habilitaEliminar();   // para que nos habilite y deshabilite los botones indicado en el metodo
             
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/finalwilson","root","");
            Statement stmt = con.createStatement();// En este bloque conectamos con la DB, y a la vez nos permite comuniarno meniante sentencias SQL
             
            stmt.executeUpdate("DELETE FROM `participante` WHERE `participante`.`Pcodigo` = '"+PPCodigo.getText()+"'");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"NO SE PUEDE CONECTAR A LA BASE DE DATOS");
        }
//------------------------------------------------------------------------------
        JOptionPane.showMessageDialog(null,"SE ELIMINÓ DE MANERA EXITOSA");// Un letrero 
           
         limpiar();//llamamos el metodo que cramos para vaciar todas las variable que almacen datos(Ojo debe estar al final par que no nos borre los datos)
         BuscarTodo();//Este metodo nos permite refrescar todos los datos de participante
        
        
    }//GEN-LAST:event_PPEliminarActionPerformed

    private void PPCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPCancelarActionPerformed
        limpiar();//Este metodo nos limpia todos los datos en las cajas
        habilitaOp1();//nos habilita y deshabilitavlos botones indicado en este metodo
        JOptionPane.showMessageDialog(null,"SELECCIONÓ CANCELAR");//letrero
    }//GEN-LAST:event_PPCancelarActionPerformed

  
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    
       public void conexion(){
    initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"NO EXISTE LA LIBRERIA");
        }
       
    }
    
   //(habilitaOp1)Este metodo lo cree para que habilitara o deshabilitara lo indicado en el mismo
       public void habilitaOp1(){
    // Nos permite  habilitar(true) y deshabilitar (false)los botones indicado
        PPRegistrar.setEnabled(false);
        PPEliminar.setEnabled(false);
        PPActualizar.setEnabled(false);
        PPNombre.setEnabled(false);
        PPTelefono.setEnabled(false);
        masculino.setEnabled(false);   
        femenino.setEnabled(false);
        PPDireccion.setEnabled(false);  //false=10 true=2
        PPTable.setEnabled(false);
        PPCancelar.setEnabled(false);
        PPNuevo.setEnabled(true);
        PPEditar.setEnabled(true);
    }
    
   //(habilitaOp2)Este metodo lo cree para que habilitara o deshabilitara lo indicado en el mismo
       public void habilitaOp2(){
     // Nos permite  habilitar(true) y deshabilitar (false)los botones indicado
        PPEditar.setEnabled(false);
        PPRegistrar.setEnabled(false);
        PPEliminar.setEnabled(true);
        PPActualizar.setEnabled(true);   //fase=2 true=10
        PPNombre.setEnabled(true);
        PPTelefono.setEnabled(true);
        masculino.setEnabled(true);   
        femenino.setEnabled(true);
        PPDireccion.setEnabled(true);
        PPTable.setEnabled(true);
        PPNuevo.setEnabled(true);
        PPCancelar.setEnabled(true);
        
    }
    
    

    //(limpar)Este metodo lo cree para reutilizarlo para limpiar 
        public void limpiar(){
        
     PPNombre.setText(null);      //|Esto nos permite vaciar todo cada vez que presionemos el Boton 
     PPTelefono.setText(null);
     PPDireccion.setText(null);
        
    }
    
    
    
    //Este metodo lo cree para que refresque o que nos muestre todos los datos de la tabla
        public void BuscarTodo(){
    
     try {
             //en este bloque creamos una excepcion para que conecte con la DB, y a la vez le damos una instruccion SQL a ejecutar
             DefaultTableModel modelo = (DefaultTableModel) PPTable.getModel();
             modelo.setRowCount(0);
             @SuppressWarnings("LocalVariableHidesMemberVariable")
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/finalwilson","root","");
           Statement stmt = con.createStatement();
           
         ResultSet rs=stmt.executeQuery("SELECT * FROM participante" );
          rs.first(); // hacemos un ciclo para que recorra cada unas de las filas de la DB
           
           do{
           String[] fila = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
           modelo.addRow(fila);
           
           }while(rs.next());
        
        } catch (SQLException ex) {
            // si no logra conecctar o pasa algun error me arrojara este 
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,"NO SE PUEDE CONECTAR A LA BASE DE DATOS");
        }
    
    
    
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CpBuscar;
    private javax.swing.ButtonGroup GGenero;
    private javax.swing.JButton PPActualizar;
    private javax.swing.JButton PPCancelar;
    private javax.swing.JTextField PPCodigo;
    private javax.swing.JTextArea PPDireccion;
    private javax.swing.JButton PPEditar;
    private javax.swing.JButton PPEliminar;
    private javax.swing.JTextField PPNombre;
    private javax.swing.JButton PPNuevo;
    private javax.swing.JButton PPRegistrar;
    private javax.swing.JButton PPSalir;
    private javax.swing.JTable PPTable;
    private javax.swing.JTextField PPTelefono;
    private javax.swing.JRadioButton femenino;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton masculino;
    // End of variables declaration//GEN-END:variables
}
