/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventas.computers.impresion;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.table.DefaultTableModel;
import ventas.computers.igu.PANEL_HOME;

public class Hoja_de_impresion extends javax.swing.JPanel implements Printable {

    public Hoja_de_impresion() {
        initComponents();
    configurarPanel();

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlb_precioTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlb_pagofinal = new javax.swing.JLabel();
        jlb_vuelto = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_NombreProduct = new javax.swing.JTextArea();
        txt_PrecioProduct = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel1.setText("------------------------------------------------------------------");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NOMBRE DE LA EMPRESA: SUPERSYSTEM COMPUTER'S");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("CUIT: 24-55648545-7");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("COMPRA DE PRODUCTOS:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("TOTAL A PAGAR: ");

        jlb_precioTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlb_precioTotal.setText("$$$$");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("PAGO CON: ");

        jlb_pagofinal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlb_pagofinal.setText("$$$$");

        jlb_vuelto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlb_vuelto.setText("$$$$");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("VUELTO:");

        jLabel12.setText("******* GRACIAS POR SU COMPRA *******");

        txt_NombreProduct.setEditable(false);
        txt_NombreProduct.setColumns(20);
        txt_NombreProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_NombreProduct.setRows(5);
        txt_NombreProduct.setToolTipText("");
        txt_NombreProduct.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_NombreProduct.setFocusable(false);

        txt_PrecioProduct.setEditable(false);
        txt_PrecioProduct.setColumns(20);
        txt_PrecioProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_PrecioProduct.setRows(5);
        txt_PrecioProduct.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_PrecioProduct.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel7.setText("------------------------------------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_precioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_pagofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlb_vuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(155, 200, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_NombreProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_PrecioProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NombreProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_PrecioProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jlb_precioTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jlb_pagofinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_vuelto)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlb_pagofinal;
    private javax.swing.JLabel jlb_precioTotal;
    private javax.swing.JLabel jlb_vuelto;
    private javax.swing.JTextArea txt_NombreProduct;
    private javax.swing.JTextArea txt_PrecioProduct;
    // End of variables declaration//GEN-END:variables

    /* Metodo para obtener todos los datos necesarios desde PANEL_HOME  
    Para pasarlos a > Imprimir y generar el pdf */
    private void configurarPanel() {
    try {
        BigDecimal PriceF = new BigDecimal(PANEL_HOME.PrecioFinal);
        PriceF = PriceF.setScale(2, RoundingMode.UP);

        jlb_precioTotal.setText(PriceF.toString());
        jlb_pagofinal.setText(PANEL_HOME.PagoFinal.toString());

        Double vuelto = PANEL_HOME.PagoFinal - PANEL_HOME.PrecioFinal;
        BigDecimal redondear = new BigDecimal(vuelto).setScale(2, RoundingMode.UP);
        jlb_vuelto.setText(redondear.toString());

        DefaultTableModel model1 = (DefaultTableModel) PANEL_HOME.TablaProductosCompra.getModel();
        for (int i = 0; i < model1.getRowCount(); i++) {
            Object nombre = model1.getValueAt(i, 1);
            Object precio = model1.getValueAt(i, 2);
            txt_NombreProduct.append(" " + nombre.toString() + "\n");
            txt_PrecioProduct.append(" $" + precio.toString() + "\n");
        }
    } catch (NullPointerException | ClassCastException e) {
        System.err.println("Error al configurar el panel: " + e.getMessage());
    }
}
    
    
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
    if(pageIndex == 0){
 Graphics2D g2d = (Graphics2D) graphics;

        // Mover al área imprimible
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        // Escalar el contenido para ajustarlo al tamaño imprimible
        double scaleX = pageFormat.getImageableWidth() / this.getWidth();
        double scaleY = pageFormat.getImageableHeight() / this.getHeight();
        double scale = Math.min(scaleX, scaleY); // Mantener proporción

        g2d.scale(scale, scale);

        // Imprimir el panel
        this.printAll(g2d);
        
    return PAGE_EXISTS;
    }   else {
    
    return NO_SUCH_PAGE;
    }
    
    }
}
