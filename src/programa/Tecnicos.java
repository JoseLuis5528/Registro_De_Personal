
//Jose Luis Roderiguez Elicerio
//Proyecto independiente practica
//29/12/2021




package programa;


import ConexionSQL.Conexion;

import Datos.Personal2;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;



public final class Tecnicos extends javax.swing.JInternalFrame {

    // conexion con netbeans  y base de datos msyql xampp
      Conexion conecta = new Conexion(); 
      Connection con = conecta.conexion(); 
    Personal2 per = new Personal2();
     int clic_tabla;
     
     String filtro="id";
    // DefaultTableModel model;
     TableRowSorter<DefaultTableModel> sorter;
     
    private Object escritorio;
   //se activan cuando inicia el programa
    //respaldo en notepad
    private Object seleccionar;
   
 
  
  
    public Tecnicos() throws SQLException {
        initComponents();
  
        jTextField1.setVisible(false);
        
      mostrardatos();// cuando se agrega un valor String en public void se coloca ""
    //  tabladatos("");
    }

       
    
    
    
/*
    //visualizar la tabla y el filtro de combo box
    void tabladatos(String valor){
       DefaultTableModel model = new DefaultTableModel();
        String sql ="SELECT *FROM personal WHERE "+filtro+"LIKE '%"+valor+"%'";
        String [] titulos= {"id","Nombre","Apellido Paterno","Apellido Materno","Turno"};
        String [] datos= new String[5];  
       model= new DefaultTableModel (null, titulos); 
        if(combo.getSelectedItem()=="Nomina"){
            filtro="id";
        }
        if(combo.getSelectedItem()=="Nomnina"){
            filtro="Nomina";
        }
        if(combo.getSelectedItem()=="Nombre"){
            filtro="Nombre";
        }
        if(combo.getSelectedItem()=="ApellidoPaterno"){
            filtro="ApellidoPaterno";
            
        }
        if(combo.getSelectedItem()=="ApellidoMaterno"){
            filtro="ApellidoMaterno";
        }
         if(combo.getSelectedItem()=="Turno"){
            filtro="Turno";
        }
        try {
            
           Statement st = con.createStatement();
           ResultSet rs=st.executeQuery(sql); //se cambia por la sentencia de combobox
           while(rs.next()){
               datos[0]=rs.getString("id");
               datos[1]=rs.getString("Nombre");
               datos[2]=rs.getString("ApellidoPaterno");
               datos[3]=rs.getString("ApellidoMaterno");
               datos[4]=rs.getString("Turno");
            
               model.addRow(datos);
         
           } 
            
           jTable1.setModel(model);
            
        } catch (SQLException e) {
        }
        
        
        
        
    }
 */
  // Traer los datos desde mysql Xampp en una tabla Jtable
    public void mostrardatos(){
       
        String SQL= "SELECT *FROM personal";
        Statement st;
      DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("id");//1
        modelo.addColumn("Nomina");//2
        modelo.addColumn("Nombre");//3
        modelo.addColumn("ApellidoPaterno");//4
        modelo.addColumn("ApellidoMaterno");//5
        modelo.addColumn("Turno");//6
        modelo.addColumn("Fecha de Alta");//7
        modelo.addColumn("Imagen");//8
        modelo.addColumn("Ruta");//9

        
        jTable1.setModel(modelo);
        jTable1.setAutoCreateRowSorter(true);
        sorter = new TableRowSorter<>(modelo);
        jTable1.setRowSorter(sorter);
        String[] dato = new String[9];
        try {
            st =con.createStatement();
            ResultSet result = st.executeQuery(SQL);
            while(result.next()){
               dato[0]=result.getString(1);//1 id
               dato[1]=result.getString(2);//2 Nomina
               dato[2]=result.getString(3);//3 Nombre
               dato[3]=result.getString(4);//4 ApellidoPaterno
               dato[4]=result.getString(5);//5 ApellidoMaterno
               dato[5]=result.getString(6);//6 Turno
               dato[6]=result.getString(7);//8 Fecha de Alta
               dato[7]=result.getString(8);//7 Imagen
               dato[8]=result.getString(9);//8 Ruta
               modelo.addRow(dato);
               
            }
            
            
        } catch (SQLException e) {
        }
        
    }
   
   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        txtnomina = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtnombre = new javax.swing.JTextField();
        txtapellidopaterno = new javax.swing.JTextField();
        txtapellidomaterno = new javax.swing.JTextField();
        txtturno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        mostrar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("REGISTRO DE PERSONAL CUENTA DE TÉCNICOS ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nomina");

        txtnomina.setText(" ");
        txtnomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnominaActionPerformed(evt);
            }
        });
        txtnomina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnominaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Ruta");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Apellido Paterno");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Apellido Materno");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Turno");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nomina", "Nombre", "Apellido Paterno", "Apellido Materno", "Turno", "Fecha de Regisgro", "Imagen", "Ruta"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("Registros", jScrollPane1);

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtapellidopaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidopaternoKeyTyped(evt);
            }
        });

        txtapellidomaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidomaternoKeyTyped(evt);
            }
        });

        txtturno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtturnoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Gdl Software Development Engineering Team");

        jPanel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconos/registro.png"))); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField1.setEnabled(false);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconos/editar.png"))); // NOI18N
        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        mostrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mostrarKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconos/buscar.png"))); // NOI18N
        jLabel10.setText("Buscador Manual ");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconos/registro-en-linea.png"))); // NOI18N
        jButton3.setText("Nuevo Registro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("d/MM/yyyy HH:mm:ss");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Fecha de Alta");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconos/pdf.png"))); // NOI18N
        jButton2.setText("PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconos/impresora.png"))); // NOI18N
        jButton5.setText("IMPRIMIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconos/boton-eliminar.png"))); // NOI18N
        jButton6.setText("Eliminar");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconos/sheets.png"))); // NOI18N
        jButton7.setText("EXCEL");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconos/desarrollo-de-software (1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(432, 432, 432)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnomina, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(77, 77, 77)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(278, 278, 278)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtturno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtapellidopaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(txtapellidomaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(85, 85, 85)))
                                .addGap(38, 38, 38))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jButton3))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtapellidopaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtapellidomaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton7))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    //Validando Conexion Con Panel Semaforo Verde y Rojo

    private void jPanel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel2AncestorAdded
     
       // Condicion  para validar conectividad en mysql
        if(con==null){
            this.jPanel2.setBackground(Color.red);
            this.jLabel8.setText("Fuera de Linea");
        }else if(isEnabled()){
            this.jPanel2.setBackground(Color.green);
            this.jLabel8.setText("Conectado");
        }
       
        
    }//GEN-LAST:event_jPanel2AncestorAdded
         
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Registrando Datos
     
    
              try {
         if(txtnomina.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Sin Dato, Favor de verificar los datos esten correctos");
         }
         if(txtnombre.getText().equals("")){
             
         }
         if(txtapellidopaterno.getText().equals("")){
         }
         
         if(txtapellidomaterno.getText().equals("")){
         }  
         
         if(txtturno.getText().equals("")){
         } 
         
         
          if(txtturno.getText().equals("")){
             
          }
           if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Sin Dato, Favor de verificar los datos esten correctos");
         }else{
         
         
         
            PreparedStatement stmt;
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO personal(Nomina,Nombre,ApellidoPaterno,ApellidoMaterno,Turno,Imagen,Ruta)VALUES(?,?,?,?,?,?,?)");
            FileInputStream archivofoto; // foto
            stmt.setString(1, txtnomina.getText());
            stmt.setString(2, txtnombre.getText());
            stmt.setString(3, txtapellidopaterno.getText());
            stmt.setString(4, txtapellidomaterno.getText());
            stmt.setString(5, txtturno.getText());
            archivofoto = new FileInputStream(jTextField1.getText());
            stmt.setBinaryStream(6,archivofoto);
            stmt.setString(7,jTextField1.getText());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Personal Ingresado Correctamente");
mostrardatos();
            // tabladatos("");
             //limpiar txt
             txtnomina.setText("");
             txtnombre.setText("");
             txtapellidopaterno.setText("");
             txtapellidomaterno.setText("");
             txtturno.setText("");
             jTextField1.setText("");
             jLabel9.setIcon(null); //SetIcon null se utiliza para refrescar un Label
             jDateChooser1.setCalendar(null);
            
           } 
        
             
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar nomina"+con);
        } catch (SQLException | FileNotFoundException ex) {
              Logger.getLogger(Tecnicos.class.getName()).log(Level.SEVERE, null, ex);
          } 
         
              
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
     
        
        
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
     JFileChooser archivo = new JFileChooser();
int ventana = archivo.showOpenDialog(null);

if(ventana==JFileChooser.APPROVE_OPTION){
File file=archivo.getSelectedFile();
jTextField1.setText(String.valueOf(file));
Image foto=getToolkit().getImage(jTextField1.getText());
jLabel9.setIcon(new ImageIcon(foto));
} 
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
int seleccionar =jTable1.rowAtPoint(evt.getPoint());
txtnomina.setText(String.valueOf(jTable1.getValueAt(seleccionar, 1)));
txtnombre.setText(String.valueOf(jTable1.getValueAt(seleccionar, 2)));
txtapellidopaterno.setText(String.valueOf(jTable1.getValueAt(seleccionar, 3)));
txtapellidomaterno.setText(String.valueOf(jTable1.getValueAt(seleccionar, 4)));
txtturno.setText(String.valueOf(jTable1.getValueAt(seleccionar, 5)));


// si se cumple no se editan las cajas de texto
if(jTable1.isEnabled()){
    txtnomina.setEditable(false);
    txtnombre.setEditable(false);
    txtapellidopaterno .setEditable(false);
    txtapellidomaterno .setEditable(false);
    txtturno .setEditable(false);
    jDateChooser1.setEnabled(false);
}



        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  
        try {
             String sql="UPDATE personal SET id=?,"+"Nombre=?,"
             +"Nomina=?,"
             +"ApellidoPaterno=?,"
             +"ApellidoMaterno=?,"
             +"Turno=?,"
             +"Fecha_De_Alta=?,"        
             +"Imagen=?,"
             +"Ruta=?,"
             +"WHERE Nomina='"+txtnomina.getText()+"'";
     
     PreparedStatement pst= con.prepareStatement(sql);
     pst.setString(1, txtnomina.getText());
     pst.setString(2, txtnombre.getText());
     pst.setString(3, txtapellidopaterno.getText());
     pst.setString(4,txtapellidomaterno.getText());
     pst.setString(5, txtturno.getText());
     pst.setString(6,((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
     FileInputStream archivoFoto;
     archivoFoto = new FileInputStream (jTextField1.getText());
     pst.setBinaryStream(6, archivoFoto);
     pst.setString(7,jTextField1.getText());
     int n=pst.executeUpdate();
     if(n>0){
         JOptionPane.showMessageDialog(null, "Los datos se han Modificado Correctamente");
     }else{
            JOptionPane.showMessageDialog(null, "error al modificar los datos verifica nuevamente ");
     }
     
     
     
     
        } catch (HeadlessException | FileNotFoundException | SQLException e) {
        }
     
     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void mostrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mostrarKeyReleased
         // filtrar en tabla 
         
         filtrardatos();
    }//GEN-LAST:event_mostrarKeyReleased

    private void txtnominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnominaActionPerformed

        
    }//GEN-LAST:event_txtnominaActionPerformed

    private void txtnominaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnominaKeyTyped
// limitando numeros 
if(txtnomina.getText().length()>6){
    evt.consume();
}
    }//GEN-LAST:event_txtnominaKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
 //limitando caracteres
 if(txtnombre.getText().length()>20){
    evt.consume();
}
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidopaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidopaternoKeyTyped
 //limitando caracteres
 if(txtapellidopaterno.getText().length()>20){
    evt.consume();
}
    }//GEN-LAST:event_txtapellidopaternoKeyTyped

    private void txtapellidomaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidomaternoKeyTyped
 //limitando caracteres
 if(txtapellidomaterno.getText().length()>20){
    evt.consume();
}
    }//GEN-LAST:event_txtapellidomaternoKeyTyped

    private void txtturnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtturnoKeyTyped
  //limitando numeros
 if(txtturno.getText().length()>20){
    evt.consume();
}
    }//GEN-LAST:event_txtturnoKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  //limpiar cajas de texto para nuevo registro
  
     //limpiar txt
    txtnomina.setText("");
    txtnombre.setText("");
    txtapellidopaterno.setText("");
    txtapellidomaterno.setText("");
    txtturno.setText("");
    jTextField1.setText("");
    jDateChooser1.setCalendar(null);
  
   jLabel9.setIcon(null); //SetIcon null se utiliza para refrescar un Label
             
      // si la se cumple se vuelve habilitar las cajas de texto        
    if(jButton3.isEnabled()){
    txtnomina.setEditable(true);
    txtnombre.setEditable(true);
    txtapellidomaterno.setEditable(true);
    txtapellidopaterno.setEditable(true);
    txtturno.setEditable(true);
    jTextField1.setEditable(true);
    jDateChooser1.setEnabled(true);
}
             
             
    }//GEN-LAST:event_jButton3ActionPerformed

    //imprimir  
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  //Imprimir   
 MessageFormat header = new MessageFormat("Lista de Nombres");
 MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer); 
            // normal imprime 2 hojas en tamaño 12  
            // fit_width imprime en tamaño 10 a 9 imprime todas las celdas de JTable
        } catch (java.awt.print.PrinterException e) {
            JOptionPane.showMessageDialog(null, "Error al Imprimir");
        }
        
 
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed
   // filtrado de datos al buscar manual 
    private void filtrardatos(){
        try {
            sorter.setRowFilter(RowFilter.regexFilter(mostrar.getText()));
            
        } catch (Exception e) {
        }
    }

   
  
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    public static com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField mostrar;
    public static javax.swing.JTextField txtapellidomaterno;
    public static javax.swing.JTextField txtapellidopaterno;
    public static javax.swing.JTextField txtnombre;
    public static javax.swing.JTextField txtnomina;
    public static javax.swing.JTextField txtturno;
    // End of variables declaration//GEN-END:variables
 }
