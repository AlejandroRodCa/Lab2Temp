package una.Lab2;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class Lab2 extends  JFrame{




   private Label lblFirstName;
    private Label lblLastName;
    private Label lblFullName;
    private  Label lblPhone;
    private Label lblGender;
    private Label lblResult;
    private Label ok;
    private Label clean;

    public Lab2(){
        super("Form");
        setSize(250, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();

        createLabel();
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(lblFirstName);

        pack();

        setVisible(true);



    }

    private static void setLookAndFeel(){

        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }

    }

 private void createLabel(){

     this.lblFirstName =  new Label("Nombre: ");
     this.lblLastName =  new Label("Apellido: ");
     this.lblFullName = new Label("Nombre Completo: ");
     this.lblPhone = new Label("Telefono: ");
     this.lblGender = new Label("Genero: ");
     this.lblResult = new Label(" ");
     this.ok= new Label("OK");
     this.clean = new Label("Limpiar");
}


    public static void main(String[] arguments) {
        setLookAndFeel();
        Lab2 sf = new Lab2();
    }
}
