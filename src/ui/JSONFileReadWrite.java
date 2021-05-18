package ui;

import static java.awt.image.ImageObserver.ERROR;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import utils.FilesReader;
import utils.FilesWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author said
 */
public class JSONFileReadWrite extends javax.swing.JFrame {

    String myJson;
    String filePathStudent = "json/student.json";
    String filePathCatalog = "json/catalog.json";
    JSONObject employee;
    JSONArray projects ;

    /**
     * Creates new form NewJFrame
     */
    public JSONFileReadWrite() {
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

        btnReadJsonFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnObjectStudent = new javax.swing.JButton();
        btnCatalogRead = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnGenerateContent = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReadJsonFile.setText("Lire Le Fichier JSon");
        btnReadJsonFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadJsonFileActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnObjectStudent.setText("ObjetJson Student");
        btnObjectStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjectStudentActionPerformed(evt);
            }
        });

        btnCatalogRead.setText("Lire Fichier Catalog");
        btnCatalogRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogReadActionPerformed(evt);
            }
        });

        jButton1.setText("ObjetJson Catalog");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnGenerateContent.setText("Générer le fichier JSON Employee");
        btnGenerateContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateContentActionPerformed(evt);
            }
        });

        jButton3.setText("Créer le fichier JSON");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Afficher Annee et Date Debut Employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Titre Projet Travailler plus nbr Heure");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Créer Fichier Liste des Projets/Titre");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnObjectStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReadJsonFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCatalogRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGenerateContent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReadJsonFile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnObjectStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCatalogRead, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerateContent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReadJsonFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadJsonFileActionPerformed
        loadFileJsonToJtextArea(filePathStudent);
    }//GEN-LAST:event_btnReadJsonFileActionPerformed

    private void loadFileJsonToJtextArea(String filePath) {
        try {
            // lire le fichier JSON
            myJson = FilesReader.loadFileIntoString(filePath);
            clearJtextArea(jTextArea1);
            jTextArea1.append(myJson);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(JSONFileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }

    private void clearJtextArea(JTextArea jTextArea1) {
        jTextArea1.selectAll();
        jTextArea1.replaceSelection("");
    }

    private void btnObjectStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjectStudentActionPerformed
        // effacer le contenu 
        clearJtextArea(jTextArea1);
        double mark, sum = 0;
        JSONArray coursList = null;
        try {
            // creer un objet student         
            JSONObject student = JSONObject.fromObject(myJson);
            // recuperer le contenu des propriete (cles)
            int student_id = student.getInt("student_id");
            String first_name = student.getString("first_name");
            String last_name = student.getString("last_name");
            String date_birth = student.getString("date_birth");
            boolean active = student.getBoolean("active");
            double GPA = student.getInt("GPA");

            jTextArea1.append((String.valueOf(student_id)) + " | " + first_name + " | " + last_name + " | " + date_birth + " | " + active + " | " + GPA + "\r\n" + "Liste des cours est:" + "\r\n");

// ===============Creer un objet Array ==========================================
            coursList = student.getJSONArray("results");

            String course_id, course_title;

            JSONObject signleCourse;
            for (int i = 0; i < coursList.size(); i++) {
                // recuperer chaque objet et le mettre dans signle cours
                signleCourse = coursList.getJSONObject(i);

                course_id = signleCourse.getString("course_id");
                course_title = signleCourse.getString("course_title");
                mark = signleCourse.getDouble("mark");

                sum += mark;

                System.out.println(course_id + "== " + course_title + "== " + mark);
                jTextArea1.append(course_id + "== " + course_title + "== " + mark + "\r\n");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "le fichier est vide ");
        }

        jTextArea1.append("\r\n La somme est: " + String.valueOf(sum) + "\r\n");
        jTextArea1.append("La moyenne  est: " + String.valueOf(sum / coursList.size()));


    }//GEN-LAST:event_btnObjectStudentActionPerformed

    private void btnCatalogReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogReadActionPerformed
        // charger le contenu du json dans text area 
        loadFileJsonToJtextArea(filePathCatalog);


    }//GEN-LAST:event_btnCatalogReadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clearJtextArea(jTextArea1);
        // creer  objet JsonArray 
        JSONArray catalog = JSONArray.fromObject(myJson);
        // le contenu du catalog un tableau avec une liste d'objet,
        // donc il faut creer une variable de type jsonObject
        JSONObject element;
        String id, title, author;
        boolean available;
        double price;
        int year;

        for (int i = 0; i < catalog.size(); i++) {

            element = catalog.getJSONObject(i);

            id = element.getString("id");
            title = element.getString("title");
            author = element.getString("author");
            available = element.getBoolean("available");
            price = element.getDouble("price");
            year = element.getInt("year");

            jTextArea1.append("Element  >>> " + id + " | " + title + " | " + author + " | " + available + " | " + price + " | " + year + "\r\n");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGenerateContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateContentActionPerformed
        // TODO add your handling code here:

        employee = new JSONObject();

        employee.accumulate("matricule", 123456);
        employee.accumulate("prenom", "Said");
        employee.accumulate("nom", "AZZI");
        employee.accumulate("retraite", false);
        employee.accumulate("salaire", 3500.00);
        employee.accumulate("age", 30);
        employee.accumulate("dateDebut", "1 janvier 2021");
// creer objet adresse 
        JSONObject adress = new JSONObject();
        adress.accumulate("numeroRue", 2125);
        adress.accumulate("nomeroRue", "21 avenue montreal est");
        adress.accumulate("codePostal", "H2W5G5");
// ajouter objet adresse a la structure employee
        employee.accumulate("adresse", adress);

// Liste des projets ========================================================
        JSONArray projects = new JSONArray();
// ============= chaque projet est un objet projet, donc creer objet
        JSONObject singleProject = new JSONObject();

        // creation du projet N1 =========================
        singleProject.accumulate("titre", "App mobile");
        singleProject.accumulate("nbrHeure", 55);

        // ajout du projet au tableau des projet 
        projects.add(singleProject);

        // vider le contenu de l'objet pour ne par fair la duplication
        singleProject.clear();

        // creation du projet N2 
        singleProject.accumulate("titre", "App web");
        singleProject.accumulate("nbrHeure", 33);

        // ajout du projet au tableau des projet 
        projects.add(singleProject);

        // vider le contenu de l'objet pour ne par fair la duplication
        singleProject.clear();

        // ajouter liste des projet a employee
        employee.accumulate("projects", projects);

        jTextArea1.append(employee.toString() + "\r\n");
        jTextArea1.append(projects.toString() + "\r\n");
        jTextArea1.append(singleProject.toString() + "\r\n");

    }//GEN-LAST:event_btnGenerateContentActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            FilesWriter.saveStringIntoFile("json/employee.json", employee.toString());
        } catch (IOException ex) {
            Logger.getLogger(JSONFileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

 
        String myJson = null;
        try {
            myJson = FilesReader.loadFileIntoString("json/employee.json");
            
            // System.out.println(myJson1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JSONFileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JSONObject employee = JSONObject.fromObject(myJson);
        // JSONArray catalog = JSONArray.fromObject(myJson);
        //JSONObject singleItem = null;
        String dateDebut;
         String  year = "";

        System.out.println(employee);
        dateDebut = employee.getString("dateDebut");
 
           // reuperation year 
        if (dateDebut.length() > 4) {
            year = dateDebut.substring(dateDebut.length() - 4);
        } 
        
        System.out.println("La date début employé: "+dateDebut +"L'année: "+ year);
        jTextArea1.append("La date début employé"+dateDebut +"\r\n"+"L'année: "+ year);

        // deuxieme methode 
        SimpleDateFormat df = new SimpleDateFormat("dd MMMMM yyyy",Locale.ENGLISH);
        Date date = null ;
        try {
             date = df.parse(dateDebut);
        } catch (ParseException ex) {
            Logger.getLogger(JSONFileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextArea1.append("\r\nLa date début employé: "+dateDebut +"\r\n"+"L'année: "+ year);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int years = cal.get(Calendar.YEAR); 
         jTextArea1.append("\r\nLa date début employé: "+dateDebut +"\r\n"+"L'année: "+ year);
        
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
        try {
            String myJson = null;
            myJson = FilesReader.loadFileIntoString("json/employee.json");
            
            employee = JSONObject.fromObject(myJson);
            projects = employee.getJSONArray("projects");
            JSONObject singleItemProject = null;
            System.out.println("Items: "+singleItemProject) ;
            String titre="";
            int   nbrHeure ;
            int max=0, index=0;
            for (int i = 0; i < projects.size(); i++) {
                singleItemProject = projects.getJSONObject(i) ;
                
                nbrHeure = singleItemProject.getInt("nbrHeure") ;
                titre = singleItemProject.getString("titre") ;
                if (nbrHeure>max){
                    max = nbrHeure;
                    index = i;
                }
                System.out.println("+++++"+ titre+"|"+nbrHeure);
            }   singleItemProject = projects.getJSONObject(index) ;
            titre = singleItemProject.getString("titre") ;
            nbrHeure = singleItemProject.getInt("nbrHeure") ;
            System.out.println("Le projet qui a plus de nbr d'heure est: "+titre);
            jTextArea1.append("Le projet qui a plus de nbr d'heure est: "+titre +"avec "+ nbrHeure+" heures travaillées ");
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JSONFileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {                                         
           
            
            String myJson = null;
            myJson = FilesReader.loadFileIntoString("json/employee.json");
            
            JSONObject empl  = JSONObject.fromObject(myJson);
            projects = empl.getJSONArray("projects");
            
            try {
                // TODO add your handling code here:
                FilesWriter.saveStringIntoFile("json/employeeListProject.json", projects.toString());
            } catch (IOException ex) {
                Logger.getLogger(JSONFileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             System.out.println(projects);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JSONFileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(JSONFileReadWrite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JSONFileReadWrite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JSONFileReadWrite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JSONFileReadWrite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JSONFileReadWrite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCatalogRead;
    private javax.swing.JButton btnGenerateContent;
    private javax.swing.JButton btnObjectStudent;
    private javax.swing.JButton btnReadJsonFile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}