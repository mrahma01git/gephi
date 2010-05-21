/*
 * Author: Patrick J. McSweeney
 * Syracuse University
 */

/*
 * ConnectedComponentPanel.java
 *
 * Created on May 21, 2010, 2:18:27 PM
 */

package org.gephi.ui.statistics.plugin;

/**
 *
 * @author pjmcswee
 */
public class ConnectedComponentPanel extends javax.swing.JPanel {

    /** Creates new form ConnectedComponentPanel */
    public ConnectedComponentPanel() {
        initComponents();
    }

   public boolean isDirected() {
        return directedRadioButton.isSelected();       
    }



    public void setDirected(boolean directed) {
         buttonGroup1.setSelected(directed ? directedRadioButton.getModel() : undirectedRadioButton.getModel(), true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        header = new org.jdesktop.swingx.JXHeader();
        directedRadioButton = new javax.swing.JRadioButton();
        undirectedRadioButton = new javax.swing.JRadioButton();

        header.setDescription(org.openide.util.NbBundle.getMessage(ConnectedComponentPanel.class, "ConnectedComponentPanel.header.description")); // NOI18N
        header.setTitle(org.openide.util.NbBundle.getMessage(ConnectedComponentPanel.class, "ConnectedComponentPanel.header.title")); // NOI18N

        buttonGroup1.add(directedRadioButton);
        directedRadioButton.setText(org.openide.util.NbBundle.getMessage(ConnectedComponentPanel.class, "ConnectedComponentPanel.directedRadioButton.text")); // NOI18N

        buttonGroup1.add(undirectedRadioButton);
        undirectedRadioButton.setText(org.openide.util.NbBundle.getMessage(ConnectedComponentPanel.class, "ConnectedComponentPanel.undirectedRadioButton.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(undirectedRadioButton)
                        .addGap(180, 180, 180))
                    .addComponent(directedRadioButton))
                .addGap(241, 241, 241))
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(directedRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(undirectedRadioButton)
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton directedRadioButton;
    private org.jdesktop.swingx.JXHeader header;
    private javax.swing.JRadioButton undirectedRadioButton;
    // End of variables declaration//GEN-END:variables

}
