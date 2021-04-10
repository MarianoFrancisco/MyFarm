/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

import proyecto1.LlamarTiempo;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jugador.*;
import proyecto1.*;
import manejadorDatos.*;
/**
 *
 * @author Mariano
 */
public class FrameReportes extends javax.swing.JFrame {

    /**
     * Creates new form FrameReportes
     */
    FondoInicio fondoInicioReportes = new FondoInicio();
    public FrameReportes() {
        this.setContentPane(fondoInicioReportes);
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        ReporteAnimalesjLabel1 = new javax.swing.JLabel();
        CeldasCompradasjLabel1 = new javax.swing.JLabel();
        ReportePlantasjLabel2 = new javax.swing.JLabel();
        ResumenPartidajLabel3 = new javax.swing.JLabel();
        LogojLabel1 = new javax.swing.JLabel();
        NombreGranjerojLabel2 = new javax.swing.JLabel();
        DuracionPartidajLabel2 = new javax.swing.JLabel();
        OroGeneradojLabel3 = new javax.swing.JLabel();
        AlimentoGeneradojLabel4 = new javax.swing.JLabel();
        AlimentoConsumidojLabel5 = new javax.swing.JLabel();
        CriasCompradasjLabel3 = new javax.swing.JLabel();
        UnidadesDestazadasjLabel3 = new javax.swing.JLabel();
        ColumnaReportejLabel3 = new javax.swing.JLabel();
        SemllasAdquiridasjLabel4 = new javax.swing.JLabel();
        CeldasSembradasjLabel4 = new javax.swing.JLabel();
        ColumnaReportejLabel2 = new javax.swing.JLabel();
        ColumnaReportejLabel4 = new javax.swing.JLabel();
        FinalizarJuegojButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reportes");

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Regresar a Granja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        ReporteAnimalesjLabel1.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        ReporteAnimalesjLabel1.setForeground(new java.awt.Color(0, 0, 0));
        ReporteAnimalesjLabel1.setText("Reporte de animales");
        jPanel1.add(ReporteAnimalesjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, 30));

        CeldasCompradasjLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CeldasCompradasjLabel1.setForeground(new java.awt.Color(0, 0, 0));
        CeldasCompradasjLabel1.setText("Cantidad de celdas de terreno compradas: "+EstablecerReportes.establecerReportes.getCeldasCompradas());
        jPanel1.add(CeldasCompradasjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        ReportePlantasjLabel2.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        ReportePlantasjLabel2.setForeground(new java.awt.Color(0, 0, 0));
        ReportePlantasjLabel2.setText("Reporte de plantas");
        jPanel1.add(ReportePlantasjLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, -1, -1));

        ResumenPartidajLabel3.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        ResumenPartidajLabel3.setForeground(new java.awt.Color(0, 0, 0));
        ResumenPartidajLabel3.setText("Resumen de partida");
        jPanel1.add(ResumenPartidajLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 25, -1, -1));

        LogojLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Logo.PNG"))); // NOI18N
        jPanel1.add(LogojLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 600, -1, -1));

        NombreGranjerojLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        NombreGranjerojLabel2.setForeground(new java.awt.Color(0, 0, 0));
        NombreGranjerojLabel2.setText("Nombre del granjero: "+Jugador.jugador1.getNombre());
        jPanel1.add(NombreGranjerojLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        DuracionPartidajLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DuracionPartidajLabel2.setForeground(new java.awt.Color(0, 0, 0));
        DuracionPartidajLabel2.setText("Duracion de la partida: minutos: "+LlamarTiempo.llamarTiempo.getLlamarMinutos()+", segundos: "+ LlamarTiempo.llamarTiempo.getLlamarSegundos());
        jPanel1.add(DuracionPartidajLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        OroGeneradojLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        OroGeneradojLabel3.setForeground(new java.awt.Color(0, 0, 0));
        OroGeneradojLabel3.setText("Oro generado por la granja: "+EstablecerReportes.establecerReportes.getOroGenerado());
        jPanel1.add(OroGeneradojLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        AlimentoGeneradojLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        AlimentoGeneradojLabel4.setForeground(new java.awt.Color(0, 0, 0));
        AlimentoGeneradojLabel4.setText("Alimento generado por la granja: "+EstablecerReportes.establecerReportes.getAlimentoGenerado());
        jPanel1.add(AlimentoGeneradojLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        AlimentoConsumidojLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        AlimentoConsumidojLabel5.setForeground(new java.awt.Color(0, 0, 0));
        AlimentoConsumidojLabel5.setText("Alimento consumido por el granjero: "+EstablecerReportes.establecerReportes.getAlimentoConsumido());
        jPanel1.add(AlimentoConsumidojLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        CriasCompradasjLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CriasCompradasjLabel3.setForeground(new java.awt.Color(0, 0, 0));
        CriasCompradasjLabel3.setText("Cantidad de crias compradas: "+EstablecerReportes.establecerReportes.getCriasCompradas());
        jPanel1.add(CriasCompradasjLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        UnidadesDestazadasjLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        UnidadesDestazadasjLabel3.setForeground(new java.awt.Color(0, 0, 0));
        UnidadesDestazadasjLabel3.setText("Cantidad de unidades destazadas: "+EstablecerReportes.establecerReportes.getUnidadesDestazadas());
        jPanel1.add(UnidadesDestazadasjLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        ColumnaReportejLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/ColumnaReporte.jpg"))); // NOI18N
        jPanel1.add(ColumnaReportejLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        SemllasAdquiridasjLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        SemllasAdquiridasjLabel4.setForeground(new java.awt.Color(0, 0, 0));
        SemllasAdquiridasjLabel4.setText("Cantidad de semillas compradas: "+EstablecerReportes.establecerReportes.getSemillasCompradas());
        jPanel1.add(SemllasAdquiridasjLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 80, -1, -1));

        CeldasSembradasjLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CeldasSembradasjLabel4.setForeground(new java.awt.Color(0, 0, 0));
        CeldasSembradasjLabel4.setText("Cantidad de celdas de terreno sembradas: "+EstablecerReportes.establecerReportes.getCeldasSembradas());
        jPanel1.add(CeldasSembradasjLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, -1, -1));

        ColumnaReportejLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/ColumnaReporte.jpg"))); // NOI18N
        jPanel1.add(ColumnaReportejLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        ColumnaReportejLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/ColumnaReporte.jpg"))); // NOI18N
        jPanel1.add(ColumnaReportejLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        FinalizarJuegojButton2.setBackground(new java.awt.Color(255, 0, 0));
        FinalizarJuegojButton2.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        FinalizarJuegojButton2.setForeground(new java.awt.Color(0, 0, 0));
        FinalizarJuegojButton2.setText("Finalizar Juego");
        FinalizarJuegojButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarJuegojButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(FinalizarJuegojButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        FrameGranja.visible();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FinalizarJuegojButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarJuegojButton2ActionPerformed
        JOptionPane.showMessageDialog(FrameReportes.this, "Fin del juego, vuelve pronto "+Jugador.jugador1.getNick());
        System.exit(0);
    }//GEN-LAST:event_FinalizarJuegojButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    class FondoInicio extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){ 
            imagen = new ImageIcon(getClass().getResource("/decoracion/IrReportes.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlimentoConsumidojLabel5;
    private javax.swing.JLabel AlimentoGeneradojLabel4;
    private javax.swing.JLabel CeldasCompradasjLabel1;
    private javax.swing.JLabel CeldasSembradasjLabel4;
    private javax.swing.JLabel ColumnaReportejLabel2;
    private javax.swing.JLabel ColumnaReportejLabel3;
    private javax.swing.JLabel ColumnaReportejLabel4;
    private javax.swing.JLabel CriasCompradasjLabel3;
    private javax.swing.JLabel DuracionPartidajLabel2;
    private javax.swing.JButton FinalizarJuegojButton2;
    private javax.swing.JLabel LogojLabel1;
    private javax.swing.JLabel NombreGranjerojLabel2;
    private javax.swing.JLabel OroGeneradojLabel3;
    private javax.swing.JLabel ReporteAnimalesjLabel1;
    private javax.swing.JLabel ReportePlantasjLabel2;
    private javax.swing.JLabel ResumenPartidajLabel3;
    private javax.swing.JLabel SemllasAdquiridasjLabel4;
    private javax.swing.JLabel UnidadesDestazadasjLabel3;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
