/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventory_sales.ui;

public class MainApp {
    public static void main(String[] args) {
        // Optional: Set look and feel to Nimbus for modern UI
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, fall back to default
        }

        // Launch the Login Page (or change to DashboardPage or ProductPage)
        javax.swing.SwingUtilities.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }
}

