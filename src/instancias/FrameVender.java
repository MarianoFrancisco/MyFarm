package instancias;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jugador.*;
import static manejadorDatos.AlmacenamientoUsuarioAlimentos.almacenamientoUsuarioAlimentos;
import manejadorDatos.AlmacenamientoUsuarioPlantas;
import static manejadorDatos.AlmacenamientoUsuarioProductos.almacenamientoUsuarioProductos;
import static manejadorDatos.EstablecerReportes.establecerReportes;
import static proyecto1.CrearAnimalesPlantas.plantas;

/**
 *
 * @author Mariano
 */
public class FrameVender extends javax.swing.JFrame {

    /**
     * Creates new form FrameVender
     */
    FondoInicio fondoVender = new FondoInicio();
    public FrameVender() {
        this.setContentPane(fondoVender);
        initComponents();
        AlmacenamientoUsuarioPlantas.visibilidadVender();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AlimentosjLabel2 = new javax.swing.JLabel();
        MateriaPrimajLabel1 = new javax.swing.JLabel();
        LogojLabel1 = new javax.swing.JLabel();
        FinalizarJuegojButton2 = new javax.swing.JButton();
        RegresarMenuMercadojButton2 = new javax.swing.JButton();
        VFrijoljSembrarButton2 = new javax.swing.JButton();
        VFrijolSembrarjLabel3 = new javax.swing.JLabel();
        VArrozSembrarjButton1 = new javax.swing.JButton();
        VArrozSembrarjLabel1 = new javax.swing.JLabel();
        VManzanoSembrarjButton3 = new javax.swing.JButton();
        VManzanoSembrarjLabel5 = new javax.swing.JLabel();
        VMaizSembrarjLabel2 = new javax.swing.JLabel();
        VMaizSembrarjButton2 = new javax.swing.JButton();
        VBananoSembrarjButton4 = new javax.swing.JButton();
        VBananoSembrarjLabel6 = new javax.swing.JLabel();
        VNaranjoSembrarjButton3 = new javax.swing.JButton();
        VNaranjoSembrarjLabel3 = new javax.swing.JLabel();
        FondojLabel3 = new javax.swing.JLabel();
        FondojLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AlimentosjLabel2.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        AlimentosjLabel2.setForeground(new java.awt.Color(0, 0, 0));
        AlimentosjLabel2.setText("Vender Alimentos");
        jPanel1.add(AlimentosjLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        MateriaPrimajLabel1.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        MateriaPrimajLabel1.setForeground(new java.awt.Color(0, 0, 0));
        MateriaPrimajLabel1.setText("Vender Productos");
        jPanel1.add(MateriaPrimajLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 270, 20));

        LogojLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Logo.PNG"))); // NOI18N
        jPanel1.add(LogojLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 600, -1, -1));

        FinalizarJuegojButton2.setBackground(new java.awt.Color(255, 0, 0));
        FinalizarJuegojButton2.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        FinalizarJuegojButton2.setForeground(new java.awt.Color(0, 0, 0));
        FinalizarJuegojButton2.setText("Finalizar juego");
        FinalizarJuegojButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarJuegojButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(FinalizarJuegojButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, -1, -1));

        RegresarMenuMercadojButton2.setBackground(new java.awt.Color(0, 204, 204));
        RegresarMenuMercadojButton2.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        RegresarMenuMercadojButton2.setForeground(new java.awt.Color(0, 0, 0));
        RegresarMenuMercadojButton2.setText("Regresar a menu Mercado");
        RegresarMenuMercadojButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarMenuMercadojButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarMenuMercadojButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 595, -1, -1));

        VFrijoljSembrarButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Frijol.PNG"))); // NOI18N
        VFrijoljSembrarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VFrijoljSembrarButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(VFrijoljSembrarButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 50, 60));

        VFrijolSembrarjLabel3.setForeground(new java.awt.Color(0, 0, 0));
        VFrijolSembrarjLabel3.setText("Libras Frijol");
        jPanel1.add(VFrijolSembrarjLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, -1, -1));

        VArrozSembrarjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Arroz.PNG"))); // NOI18N
        VArrozSembrarjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VArrozSembrarjButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(VArrozSembrarjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 70, 60));

        VArrozSembrarjLabel1.setForeground(new java.awt.Color(0, 0, 0));
        VArrozSembrarjLabel1.setText("Libras Arroz");
        jPanel1.add(VArrozSembrarjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        VManzanoSembrarjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Manzano.PNG"))); // NOI18N
        VManzanoSembrarjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VManzanoSembrarjButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(VManzanoSembrarjButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 70, 60));

        VManzanoSembrarjLabel5.setForeground(new java.awt.Color(0, 0, 0));
        VManzanoSembrarjLabel5.setText("Frutas Manzano");
        jPanel1.add(VManzanoSembrarjLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        VMaizSembrarjLabel2.setForeground(new java.awt.Color(0, 0, 0));
        VMaizSembrarjLabel2.setText("Libras Maiz");
        jPanel1.add(VMaizSembrarjLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, -1, -1));

        VMaizSembrarjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Maiz.PNG"))); // NOI18N
        VMaizSembrarjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VMaizSembrarjButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(VMaizSembrarjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 70, 60));

        VBananoSembrarjButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Banano.PNG"))); // NOI18N
        VBananoSembrarjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VBananoSembrarjButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(VBananoSembrarjButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 70, 60));

        VBananoSembrarjLabel6.setForeground(new java.awt.Color(0, 0, 0));
        VBananoSembrarjLabel6.setText("Frutas Banano");
        jPanel1.add(VBananoSembrarjLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        VNaranjoSembrarjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Naranjo.PNG"))); // NOI18N
        VNaranjoSembrarjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VNaranjoSembrarjButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(VNaranjoSembrarjButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 70, 60));

        VNaranjoSembrarjLabel3.setForeground(new java.awt.Color(0, 0, 0));
        VNaranjoSembrarjLabel3.setText("Frutas Naranjo");
        jPanel1.add(VNaranjoSembrarjLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        FondojLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/FondoMercado.jpg"))); // NOI18N
        jPanel1.add(FondojLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 540, -1));

        FondojLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/FondoMercado.jpg"))); // NOI18N
        jPanel1.add(FondojLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 540, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FinalizarJuegojButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarJuegojButton2ActionPerformed
        JOptionPane.showMessageDialog(FrameVender.this, "Fin del juego, vuelve pronto "+Jugador.jugador1.getNick());
        System.exit(0);
    }//GEN-LAST:event_FinalizarJuegojButton2ActionPerformed

    private void RegresarMenuMercadojButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenuMercadojButton2ActionPerformed
        this.dispose();
        LlamadoInstancias.mercado();
    }//GEN-LAST:event_RegresarMenuMercadojButton2ActionPerformed

    private void VFrijoljSembrarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VFrijoljSembrarButton2ActionPerformed
        Jugador.jugador1.setMonedas(Jugador.jugador1.getMonedas()+(almacenamientoUsuarioProductos.getUsuarioFrijol()*plantas[1].getPrecioVentaProducto()));
        JOptionPane.showMessageDialog(null, "Al vender libras de frijol conseguiste "+almacenamientoUsuarioProductos.getUsuarioFrijol()*plantas[1].getPrecioVentaProducto()+" de dinero "+Jugador.jugador1.getNick());
        establecerReportes.setOroGenerado(establecerReportes.getOroGenerado()+(almacenamientoUsuarioProductos.getUsuarioFrijol()*plantas[1].getPrecioVentaProducto()));
        almacenamientoUsuarioProductos.setUsuarioFrijol(0);
    }//GEN-LAST:event_VFrijoljSembrarButton2ActionPerformed

    private void VArrozSembrarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VArrozSembrarjButton1ActionPerformed
        Jugador.jugador1.setMonedas(Jugador.jugador1.getMonedas()+(almacenamientoUsuarioProductos.getUsuarioArroz()*plantas[2].getPrecioVentaProducto()));
        JOptionPane.showMessageDialog(null, "Al vender libras de arroz conseguiste "+almacenamientoUsuarioProductos.getUsuarioArroz()*plantas[2].getPrecioVentaProducto()+" de dinero "+Jugador.jugador1.getNick());
        establecerReportes.setOroGenerado(establecerReportes.getOroGenerado()+(almacenamientoUsuarioProductos.getUsuarioArroz()*plantas[2].getPrecioVentaProducto()));
        almacenamientoUsuarioProductos.setUsuarioArroz(0);
    }//GEN-LAST:event_VArrozSembrarjButton1ActionPerformed

    private void VManzanoSembrarjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VManzanoSembrarjButton3ActionPerformed
        Jugador.jugador1.setMonedas(Jugador.jugador1.getMonedas()+(almacenamientoUsuarioAlimentos.getUsuarioManzano()*plantas[3].getPrecioVentaProducto()));
        JOptionPane.showMessageDialog(null, "Al vender fruta de manzano conseguiste "+almacenamientoUsuarioAlimentos.getUsuarioManzano()*plantas[3].getPrecioVentaProducto()+" de dinero "+Jugador.jugador1.getNick());
        establecerReportes.setOroGenerado(establecerReportes.getOroGenerado()+(almacenamientoUsuarioAlimentos.getUsuarioManzano()*plantas[3].getPrecioVentaProducto()));
        almacenamientoUsuarioAlimentos.setUsuarioManzano(0);
    }//GEN-LAST:event_VManzanoSembrarjButton3ActionPerformed

    private void VMaizSembrarjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VMaizSembrarjButton2ActionPerformed
        Jugador.jugador1.setMonedas(Jugador.jugador1.getMonedas()+(almacenamientoUsuarioProductos.getUsuarioMaiz()*plantas[0].getPrecioVentaProducto()));
        JOptionPane.showMessageDialog(null, "Al vender libras de maiz conseguiste "+almacenamientoUsuarioProductos.getUsuarioMaiz()*plantas[0].getPrecioVentaProducto()+" de dinero "+Jugador.jugador1.getNick());
        establecerReportes.setOroGenerado(establecerReportes.getOroGenerado()+(almacenamientoUsuarioProductos.getUsuarioMaiz()*plantas[0].getPrecioVentaProducto()));
        almacenamientoUsuarioProductos.setUsuarioMaiz(0);
    }//GEN-LAST:event_VMaizSembrarjButton2ActionPerformed

    private void VBananoSembrarjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VBananoSembrarjButton4ActionPerformed
        Jugador.jugador1.setMonedas(Jugador.jugador1.getMonedas()+(almacenamientoUsuarioAlimentos.getUsuarioBanano()*plantas[5].getPrecioVentaProducto()));
        JOptionPane.showMessageDialog(null, "Al vender fruta de banano conseguiste "+almacenamientoUsuarioAlimentos.getUsuarioBanano()*plantas[5].getPrecioVentaProducto()+" de dinero "+Jugador.jugador1.getNick());
        establecerReportes.setOroGenerado(establecerReportes.getOroGenerado()+(almacenamientoUsuarioAlimentos.getUsuarioBanano()*plantas[5].getPrecioVentaProducto()));
        almacenamientoUsuarioAlimentos.setUsuarioBanano(0);
        
    }//GEN-LAST:event_VBananoSembrarjButton4ActionPerformed

    private void VNaranjoSembrarjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VNaranjoSembrarjButton3ActionPerformed
        Jugador.jugador1.setMonedas(Jugador.jugador1.getMonedas()+(almacenamientoUsuarioAlimentos.getUsuarioNaranjo()*plantas[4].getPrecioVentaProducto()));
        JOptionPane.showMessageDialog(null, "Al vender fruta de naranjo conseguiste "+almacenamientoUsuarioAlimentos.getUsuarioNaranjo()*plantas[4].getPrecioVentaProducto()+" de dinero "+Jugador.jugador1.getNick());
        establecerReportes.setOroGenerado(establecerReportes.getOroGenerado()+(almacenamientoUsuarioAlimentos.getUsuarioNaranjo()*plantas[4].getPrecioVentaProducto()));
        almacenamientoUsuarioAlimentos.setUsuarioNaranjo(0);
    }//GEN-LAST:event_VNaranjoSembrarjButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    class FondoInicio extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){ 
            imagen = new ImageIcon(getClass().getResource("/decoracion/IrMercado.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlimentosjLabel2;
    private javax.swing.JButton FinalizarJuegojButton2;
    private javax.swing.JLabel FondojLabel3;
    private javax.swing.JLabel FondojLabel4;
    private javax.swing.JLabel LogojLabel1;
    private javax.swing.JLabel MateriaPrimajLabel1;
    private javax.swing.JButton RegresarMenuMercadojButton2;
    public static javax.swing.JButton VArrozSembrarjButton1;
    public static javax.swing.JLabel VArrozSembrarjLabel1;
    public static javax.swing.JButton VBananoSembrarjButton4;
    public static javax.swing.JLabel VBananoSembrarjLabel6;
    public static javax.swing.JLabel VFrijolSembrarjLabel3;
    public static javax.swing.JButton VFrijoljSembrarButton2;
    public static javax.swing.JButton VMaizSembrarjButton2;
    public static javax.swing.JLabel VMaizSembrarjLabel2;
    public static javax.swing.JButton VManzanoSembrarjButton3;
    public static javax.swing.JLabel VManzanoSembrarjLabel5;
    public static javax.swing.JButton VNaranjoSembrarjButton3;
    public static javax.swing.JLabel VNaranjoSembrarjLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
