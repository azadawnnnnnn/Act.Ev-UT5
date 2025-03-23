package src.notasgestionusuarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Azael
 */
public class Login extends javax.swing.JFrame {

    // Declaramos las variables necesarias                    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    static javax.swing.JTextField jTextField1;

    public Login() {
        initComponents();
        setSize(400, 300); 
        setLocationRelativeTo(null);
    }
                      
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Iniciar Sesión");

        jLabel2.setText("Correo electrónico");

        jLabel3.setText("Contraseña");

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Iniciar Sesión");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("¿No está registrad@? Pulse abajo para registrarse.");
        jLabel4.setVisible(false);

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrarse");
        jButton2.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jTextField1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();

        jButton1.addActionListener(e -> verificarLogin());
        jButton2.addActionListener(e -> abrirRegistro());
    }                         

    // Metodo para verificar si existe el usuario y contraseña
    private void verificarLogin() {
        String correo = jTextField1.getText();
        String contrasena = new String(jPasswordField1.getPassword());

        // Comprobamos que los campos no estas vacios
        if (correo.isEmpty() || contrasena.isEmpty()) {
            jLabel4.setVisible(true);
            jLabel4.setText("Por favor, complete ambos campos.");
            return;
        }

        // Verificamos si el usuario está registrado y si la contraseña es correcta
        if (!verificarUsuario(correo, contrasena)) {
            jLabel4.setVisible(true);
            jButton2.setVisible(true);
            jLabel4.setText("Correo o contraseña incorrectos o usuario no registrado.");
            jLabel4.setForeground(new java.awt.Color(255, 0, 0));

            jButton2.setVisible(true); // Ocultar el botón al inicio

        } else {
            jLabel4.setVisible(false);
            jButton2.setVisible(false);

            Notas notas = new Notas(correo);
            notas.setVisible(true);
            this.dispose(); // 
        }
    }

    // Metodo para verificar que existe usuario y contraseña y que sean iguales
    private boolean verificarUsuario(String correo, String contrasena) {
        // Bloque para leer fichero linea por linea
        try (BufferedReader leer = new BufferedReader(new FileReader("src/data/users.txt"))) {
            String linea;
            while ((linea = leer.readLine()) != null) {
                String[] partes = linea.split(":");
                String correoGuardado = partes[0];
                String contrasenaGuardada = partes[1];

                String contrasenaHash = Registro.hasheoPasswd(contrasena);
                
                // Comparamos lo escrito por el usuario y los valores que existen en el fichero
                if (correo.equals(correoGuardado) && contrasenaHash.equals(contrasenaGuardada)) {
                    return true; 
                }
            }
        } catch (IOException e) {
            jLabel4.setText("Error al leer el archivo.");
            jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        }
        return false; // Usuario no encontrado o contraseña incorrecta
    }

    // Método para iniciar la ventana de Registro y mostrarla
    private void abrirRegistro() {
        Registro registro = new Registro();
        registro.setVisible(true);
        this.dispose(); // 
    }

    // Método Principal
    public static void main(String args[]) {

        // Agregamos el modelo de diseño "Nimbus" y tenemos en cuenta las excepciones
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
