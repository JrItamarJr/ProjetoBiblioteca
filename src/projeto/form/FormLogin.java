package projeto.form;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import projeto.classes.ClassSalvarTXT;

public final class FormLogin extends javax.swing.JFrame {

    public FormLogin() {
        initComponents();
        this.getRootPane().setDefaultButton(jButtonEntrar);
        inicializacao();
    }
//  ############ GENERATE ############# //
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordPass = new javax.swing.JPasswordField();
        jTextUser = new javax.swing.JTextField();
        jCheckLembrar = new javax.swing.JCheckBox();
        jLabelMinimizar = new javax.swing.JLabel();
        jLabelFechar = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordPass.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPasswordPass.setToolTipText("Senha");
        jPasswordPass.setBorder(null);
        jPasswordPass.setOpaque(false);
        getContentPane().add(jPasswordPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 173, 305, 34));

        jTextUser.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextUser.setToolTipText("Usuário");
        jTextUser.setBorder(null);
        jTextUser.setOpaque(false);
        getContentPane().add(jTextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 122, 305, 34));

        jCheckLembrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckLembrar.setSelected(true);
        jCheckLembrar.setText("Lembrar usuario.");
        jCheckLembrar.setContentAreaFilled(false);
        getContentPane().add(jCheckLembrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        jButtonEntrar.setToolTipText("Entrar no Sistema");
        jButtonEntrar.setBorderPainted(false);
        jButtonEntrar.setContentAreaFilled(false);
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.setFocusPainted(false);
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 273, 400, 39));

        jLabelMinimizar.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelMinimizar.setText("_");
        jLabelMinimizar.setToolTipText("Minimizar");
        jLabelMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseReleased(evt);
            }
        });
        getContentPane().add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, -20, 40, 60));

        jLabelFechar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelFechar.setText("X");
        jLabelFechar.setToolTipText("Fechar");
        jLabelFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelFecharMouseReleased(evt);
            }
        });
        getContentPane().add(jLabelFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 60));

        jLabelFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\itamar\\Documents\\NetBeansProjects\\ProjetoBiblioteca\\LoginBlioteca.png")); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 375));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//  ############ GENERATE ############# //
    private void jLabelFecharMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFecharMouseReleased
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair ?", "Atençao", JOptionPane.YES_NO_OPTION, 2);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabelFecharMouseReleased

    private void jLabelMinimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseReleased
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseReleased

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        usuarios();
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JButton jButtonEntrar = new javax.swing.JButton();
    private javax.swing.JCheckBox jCheckLembrar;
    private javax.swing.JLabel jLabelFechar;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JPasswordField jPasswordPass;
    private javax.swing.JTextField jTextUser;
    // End of variables declaration//GEN-END:variables
//################################################   CODIGOS DE PROGRAMAÇÃO   ############################################################//

    public void inicializacao() {
        focusRequest();
        maiuscula();  
        lerTxt();    
        setIcon();  
    }

    public void maiuscula() {
        jTextUser.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(final KeyEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JTextField campo = (JTextField) e.getSource();
                        int posicaoCursor = campo.getCaretPosition();
                        campo.setText(campo.getText().toUpperCase());
                        if (posicaoCursor != campo.getCaretPosition()) {
                            campo.setCaretPosition(posicaoCursor);
                        }
                    }
                }
                );
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }
        });
    }

    public void usuarios() {
        if (jTextUser.getText().equalsIgnoreCase("itamar") && jPasswordPass.getText().equals("123")) {
            if (jCheckLembrar.isSelected()) {
                ClassSalvarTXT salva = new ClassSalvarTXT();
                salva.setUser(jTextUser.getText());
                salva.Salvar();
            } else {
                ClassSalvarTXT salva = new ClassSalvarTXT();
                salva.setUser("");
                salva.Salvar();
            }
            FormPrincipal tela1 = new FormPrincipal(jTextUser.getText() + "   -   ADMINISTRADOR");
            tela1.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha Incorretos!");
            jTextUser.setText("");
            jPasswordPass.setText("");
            jTextUser.requestFocus();
        }
    }

    public void lerTxt() {
        Path caminho = Paths.get("src\\login.txt");
        try {
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            jTextUser.setText(leitura);
        } catch (Exception erro) {
        }
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/projeto/backgroud/if_Folder_132707.png")));
    }

    public void focusRequest(){
        if (jTextUser.equals("")) {
            jTextUser.requestFocus();
        } else {
            jPasswordPass.requestFocus();
        }
    }
}
