package jade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
import jade.gui.GuiEvent;
import jade.gui.GuiAgent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class VentanaInterfaz extends javax.swing.JFrame {

    private GuiAgent owner;
    private AgenteRecomendador myAgente;
    public final int SENT_TYPE = 0;

    /**
     * Creates new form VentanaInterfaz
     */
    public VentanaInterfaz() {

    }

    public VentanaInterfaz(GuiAgent a) {
        owner = a;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnumtristes1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtNombreArchivo = new javax.swing.JTextField();
        btncargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRecomendacion = new javax.swing.JTextField();
        txtnumNeutros = new javax.swing.JTextField();
        txtnumAlegres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtporcentajeTristes = new javax.swing.JTextField();
        txtporcentajeNeutros = new javax.swing.JTextField();
        txtporcentajeAlegres = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotalEstudiantes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPorcentajeTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtnumtristes = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPorcentajeDocumento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtnumvenganza = new javax.swing.JTextField();
        txtnumira = new javax.swing.JTextField();
        txtnumgratitud = new javax.swing.JTextField();
        txtnumsorpresa = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtporcentajevenganza = new javax.swing.JTextField();
        txtporcentajeira = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtporcentajegratitud = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtporcentajesorpresa = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        txtnumtristes1.setEditable(false);
        txtnumtristes1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnumtristes1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Analizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtNombreArchivo.setEditable(false);

        btncargar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncargar.setText("Cargar Archivo");
        btncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setText("GESTOR DE EMOCIONES");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/emociones2.PNG"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(585, 285));
        jLabel2.setMinimumSize(new java.awt.Dimension(585, 285));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Número de Estudiantes Tristes:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Número de Estudiantes Alegres:");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Número de Estudiantes Neutros:");

        txtRecomendacion.setEditable(false);
        txtRecomendacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRecomendacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtnumNeutros.setEditable(false);
        txtnumNeutros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnumNeutros.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtnumAlegres.setEditable(false);
        txtnumAlegres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnumAlegres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Porcentaje");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setText("Porcentaje");

        txtporcentajeTristes.setEditable(false);
        txtporcentajeTristes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtporcentajeTristes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtporcentajeNeutros.setEditable(false);
        txtporcentajeNeutros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtporcentajeNeutros.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtporcentajeAlegres.setEditable(false);
        txtporcentajeAlegres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtporcentajeAlegres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setText("Total de estudiantes:");

        txtTotalEstudiantes.setEditable(false);
        txtTotalEstudiantes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalEstudiantes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setText("Porcentaje Total:");

        txtPorcentajeTotal.setEditable(false);
        txtPorcentajeTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPorcentajeTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel11.setText("Recomendación");

        txtnumtristes.setEditable(false);
        txtnumtristes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnumtristes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setText("Porcentaje del documento:");

        txtPorcentajeDocumento.setEditable(false);
        txtPorcentajeDocumento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPorcentajeDocumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setText("Número de Estudiantes Ira:");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel14.setText("Número de Estudiantes Venganza:");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel16.setText("Número de Estudiantes Gratitud:");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel18.setText("Número de Estudiantes Sorpresa:");

        txtnumvenganza.setEditable(false);
        txtnumvenganza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnumvenganza.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtnumira.setEditable(false);
        txtnumira.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnumira.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtnumgratitud.setEditable(false);
        txtnumgratitud.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnumgratitud.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtnumsorpresa.setEditable(false);
        txtnumsorpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnumsorpresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel19.setText("Porcentaje");

        txtporcentajevenganza.setEditable(false);
        txtporcentajevenganza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtporcentajevenganza.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtporcentajeira.setEditable(false);
        txtporcentajeira.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtporcentajeira.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setText("Porcentaje");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel17.setText("Porcentaje");

        txtporcentajegratitud.setEditable(false);
        txtporcentajegratitud.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtporcentajegratitud.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel20.setText("Porcentaje");

        txtporcentajesorpresa.setEditable(false);
        txtporcentajesorpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtporcentajesorpresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel21.setText("Porcentaje");

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel22.setText("Porcentaje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(145, 145, 145)
                        .addComponent(txtRecomendacion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(txtPorcentajeDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncargar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTotalEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtnumAlegres, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtnumsorpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtnumNeutros, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtnumira, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtnumvenganza, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel3))
                                                .addGap(46, 46, 46)
                                                .addComponent(txtnumtristes, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addGap(40, 40, 40)
                                            .addComponent(txtnumgratitud, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22))
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtporcentajeTristes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtporcentajevenganza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtporcentajeira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtporcentajeNeutros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtporcentajegratitud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtporcentajesorpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtporcentajeAlegres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcentajeTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncargar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtRecomendacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtPorcentajeDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtnumtristes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addComponent(txtporcentajeTristes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtnumvenganza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtporcentajevenganza, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtnumira, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtporcentajeira, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(125, 125, 125)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtnumNeutros, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(txtporcentajeNeutros, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtnumgratitud, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(txtporcentajegratitud, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addComponent(jLabel15))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtnumsorpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtporcentajesorpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtnumAlegres, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtporcentajeAlegres, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcentajeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String v = "";
            ArrayList<atributosDocumento> v2 = null;
            File f = new File(txtNombreArchivo.getText());
            AgenteRecomendador ar = new AgenteRecomendador();
            if (f.exists()) {
                v = ar.leer(f);
                v2 = ar.leer_estudiantes(f);
            }
            int totalestudiantes = v2.get(0).getIntTristes() + v2.get(0).getIntVengaza() + v2.get(0).getIntIra()
                    + v2.get(0).getIntNeutro() + v2.get(0).getIntGratitud() + v2.get(0).getIntSorpresa()
                    + v2.get(0).getIntAlegre();
            double porcentajeTotal = v2.get(0).getDblporcentajeA() + v2.get(0).getDblporcentajeSor() + v2.get(0).getDblporcentajeGra()
                    + v2.get(0).getDblporcentajeN() + v2.get(0).getDblporcentajeIra() + v2.get(0).getDblporcentajeVeng()
                    + v2.get(0).getDblporcentajeT();
            txtnumtristes.setText(String.valueOf(v2.get(0).getIntTristes()));
            txtnumNeutros.setText(String.valueOf(v2.get(0).getIntNeutro()));
            txtnumAlegres.setText(String.valueOf(v2.get(0).getIntAlegre()));          
            txtnumsorpresa.setText(String.valueOf(v2.get(0).getIntSorpresa()));           
            txtnumvenganza.setText(String.valueOf(v2.get(0).getIntVengaza()));
            txtnumira.setText(String.valueOf(v2.get(0).getIntIra()));
            txtnumgratitud.setText(String.valueOf(v2.get(0).getIntGratitud()));
                    
            
            txtporcentajeTristes.setText(String.valueOf(v2.get(0).getDblporcentajeT()));
            txtporcentajevenganza.setText(String.valueOf(v2.get(0).getDblporcentajeVeng()));
            txtporcentajeira.setText(String.valueOf(v2.get(0).getDblporcentajeIra()));
            txtporcentajeNeutros.setText(String.valueOf(v2.get(0).getDblporcentajeN()));
            txtporcentajegratitud.setText(String.valueOf(v2.get(0).getDblporcentajeGra()));
            txtporcentajesorpresa.setText(String.valueOf(v2.get(0).getDblporcentajeSor()));
            txtporcentajeAlegres.setText(String.valueOf(v2.get(0).getDblporcentajeA()));
            
            
            
            txtTotalEstudiantes.setText(String.valueOf(totalestudiantes));
            txtPorcentajeTotal.setText(String.valueOf(porcentajeTotal * 100));
            txtRecomendacion.setText(v);
            txtPorcentajeDocumento.setText(String.valueOf(v2.get(0).getDblpromedio()));
            System.out.println(v);
            GuiEvent ge = new GuiEvent(this, SENT_TYPE);
            ge.addParameter(v);
            ge.addParameter(v);
            owner.postGuiEvent(ge);

        } catch (Exception e) {
            System.out.println("paso");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String fileName = f.getAbsolutePath();
        txtNombreArchivo.setText(fileName);
    }//GEN-LAST:event_btncargarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncargar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtNombreArchivo;
    private javax.swing.JTextField txtPorcentajeDocumento;
    private javax.swing.JTextField txtPorcentajeTotal;
    private javax.swing.JTextField txtRecomendacion;
    private javax.swing.JTextField txtTotalEstudiantes;
    private javax.swing.JTextField txtnumAlegres;
    private javax.swing.JTextField txtnumNeutros;
    private javax.swing.JTextField txtnumgratitud;
    private javax.swing.JTextField txtnumira;
    private javax.swing.JTextField txtnumsorpresa;
    private javax.swing.JTextField txtnumtristes;
    private javax.swing.JTextField txtnumtristes1;
    private javax.swing.JTextField txtnumvenganza;
    private javax.swing.JTextField txtporcentajeAlegres;
    private javax.swing.JTextField txtporcentajeNeutros;
    private javax.swing.JTextField txtporcentajeTristes;
    private javax.swing.JTextField txtporcentajegratitud;
    private javax.swing.JTextField txtporcentajeira;
    private javax.swing.JTextField txtporcentajesorpresa;
    private javax.swing.JTextField txtporcentajevenganza;
    // End of variables declaration//GEN-END:variables
}
