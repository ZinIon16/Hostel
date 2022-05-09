/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intihotel;

import javax.swing.JOptionPane;

/**
 *
 * @author osman
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        probtn = new javax.swing.JButton();
        roomtbrtn = new javax.swing.JButton();
        infoBtn = new javax.swing.JButton();
        checkinBtn = new javax.swing.JButton();
        checkoutbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        probtn.setText("Promotions");
        probtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                probtnActionPerformed(evt);
            }
        });
        getContentPane().add(probtn);
        probtn.setBounds(220, 200, 130, 60);

        roomtbrtn.setText("Rooms Types");
        roomtbrtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomtbrtnActionPerformed(evt);
            }
        });
        getContentPane().add(roomtbrtn);
        roomtbrtn.setBounds(70, 200, 130, 60);

        infoBtn.setText("Booking Info");
        infoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(infoBtn);
        infoBtn.setBounds(70, 350, 128, 60);

        checkinBtn.setText("Check In");
        checkinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinBtnActionPerformed(evt);
            }
        });
        getContentPane().add(checkinBtn);
        checkinBtn.setBounds(70, 280, 128, 60);

        checkoutbtn.setText("Assign Room");
        checkoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(checkoutbtn);
        checkoutbtn.setBounds(220, 280, 128, 60);

        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitbtn);
        exitbtn.setBounds(220, 352, 128, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intihotel/logo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 30, 150, 200);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel4.setText("WELCOME TO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 50, 270, 43);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel5.setText("INTI HOTEL");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 100, 230, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intihotel/whiteBG.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -4, 550, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
       
    
    }                                   
    private void infoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoBtnActionPerformed
        
        
        String bookingList = "";
        
        for (int x= 0; x < RestTimeHotel.bookingCount; x++) {
          
              
          bookingList = bookingList + "Booking " + (x+1) +
                  
                  
         "\nName: " + RestTimeHotel.bookDB[x].getName() +
         "\nBooking ID: " + RestTimeHotel.bookDB[x].getBookingID() +
         "\nPassport: " +  RestTimeHotel.bookDB[x].getPass() +
          "\nAddress: " +  RestTimeHotel.bookDB[x].getAddress() +
          "\nPhone Number: " +  RestTimeHotel.bookDB[x].getPNumber() +
           "\nRoom Booked: " +  RestTimeHotel.bookDB[x].getRoom() +
          "\nNumber of Days Booked: " +  RestTimeHotel.bookDB[x].getNumOfNights() +
                  

       "\n*********************************************************************\n";   
        }
        JOptionPane.showMessageDialog(null,bookingList);
    }//GEN-LAST:event_infoBtnActionPerformed

    private void checkinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinBtnActionPerformed
                                          
        setVisible(false); 
        new CheckIn().setVisible(true);                                            
    }//GEN-LAST:event_checkinBtnActionPerformed

    private void checkoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutbtnActionPerformed
            setVisible(false);
            new AssignRoom().setVisible(true);
    }//GEN-LAST:event_checkoutbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
          System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void roomtbrtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomtbrtnActionPerformed

         setVisible(false); 
        new RoomTypes().setVisible(true);                                            
        // TODO add your handling code here:
    }//GEN-LAST:event_roomtbrtnActionPerformed

    private void probtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probtnActionPerformed
           setVisible (false);
        new Promotions().setVisible(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_probtnActionPerformed

    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkinBtn;
    private javax.swing.JButton checkoutbtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton infoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton probtn;
    private javax.swing.JButton roomtbrtn;
    // End of variables declaration//GEN-END:variables
}