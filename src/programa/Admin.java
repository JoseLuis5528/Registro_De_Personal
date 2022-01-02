
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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;


public final class Admin extends javax.swing.JInternalFrame {

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
    
  
  
    public Admin() throws SQLException {
        initComponents();
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
        
        modelo.addColumn("id");
        modelo.addColumn("Nomina");
        modelo.addColumn("Nombre");
        modelo.addColumn("ApellidoPaterno");
        modelo.addColumn("ApellidoMaterno");
        modelo.addColumn("Turno");
        modelo.addColumn("Imagen");
        modelo.addColumn("Ruta");

        
        jTable1.setModel(modelo);
        jTable1.setAutoCreateRowSorter(true);
        sorter = new TableRowSorter<>(modelo);
        jTable1.setRowSorter(sorter);
        String[] dato = new String[8];
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
               dato[6]=result.getString(7);//7 Imagen
               dato[7]=result.getString(8);//8 Ruta
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
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        mostrar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRO DE PERSONAL CUENTA DE ADMINISTRADOR ");

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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nomina", "Nombre", "Apellido Paterno", "Apellido Materno", "Turno", "Imagen", "Ruta"
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

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Admin");

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
        jLabel10.setText("Buscador Manual ");

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 102));

        jMenu3.setText("Registrar");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Registrar Personal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel7))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtapellidopaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtapellidomaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtturno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtnomina, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(130, 130, 130))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(33, 33, 33)
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
                                .addGap(26, 26, 26)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4)
                            .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
      
    }//GEN-LAST:event_jMenu3ActionPerformed

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
             
           } 
        
             
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar nomina"+con);
        } catch (SQLException | FileNotFoundException ex) {
              Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
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


        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   // mostrar datos al seleccionar la tabla
   



   
   
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  
        try {
             String sql="UPDATE personal SET id=?,"+"Nombre=?,"
             +"Nomina=?,"
             +"ApellidoPaterno=?,"
             +"ApellidoMaterno=?,"
             +"Turno=?,"
             +"Imagen=?,"
             +"Ruta=?,"
             +"WHERE Nomina='"+txtnomina.getText()+"'";
     
     PreparedStatement pst= con.prepareStatement(sql);
     pst.setString(1, txtnomina.getText());
     pst.setString(2, txtnombre.getText());
     pst.setString(3, txtapellidopaterno.getText());
     pst.setString(4,txtapellidomaterno.getText());
     pst.setString(5, txtturno.getText());
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
    private void filtrardatos(){
        try {
            sorter.setRowFilter(RowFilter.regexFilter(mostrar.getText()));
            
        } catch (Exception e) {
        }
    }

   
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mostrar;
    private javax.swing.JTextField txtapellidomaterno;
    private javax.swing.JTextField txtapellidopaterno;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnomina;
    private javax.swing.JTextField txtturno;
    // End of variables declaration//GEN-END:variables
}
