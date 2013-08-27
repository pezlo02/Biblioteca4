package co.edu.um.Biblioteca.vista;

/**
 * Created with IntelliJ IDEA.
 * User: OSCAR
 * Date: 26/08/13
 * Time: 10:05 PM
 * To change this template use File | Settings | File Templates.
 */

import co.edu.um.Biblioteca.modelo.Listas;
import co.edu.um.Biblioteca.modelo.Nodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: OSCAR
 * Date: 20/08/13
 * Time: 10:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class ventana extends JFrame implements ActionListener {


    public Listas milisti = new Listas();
    public Nodo nuevo2 = new Nodo("Matematicas");
    public Nodo nuevo3 = new Nodo("Fisica");
    public  String dato = "";
    private JLabel texto0, texto1, texto2, texto3, texto4, texto5, texto6;
    private JTextField campo1, campo2, campo3, campo4, campo5;
    private JButton boton1, boton2, boton3,boton4, boton5;
    private JScrollPane scrollpane1;
    private JTextArea textArea1;

    public  ventana(){



            // propiedades de la ventana
            setTitle("                                                                           biblioteca electronica ");
            setResizable(false);
            setSize(600, 600);
            setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            getContentPane().setBackground(new java.awt.Color(0, 128, 128 ));


            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //texto0= new JLabel("");
        //texto1= new JLabel("") ;

        setLayout(null);
        boton1 = new JButton("Acceder al sistema");
        boton1.setBounds(150,20,150,50);
        add(boton1);
        boton1.addActionListener(this);

        texto0 = new JLabel ("-");
        texto0.setBounds(150,70,300,100);
        add(texto0);
        texto0.setVisible(true);
        texto0.setBackground(Color.GREEN);
        texto0.setForeground(Color.BLUE);


        texto1 = new JLabel ("ingrese un libro antes: ");
        texto1.setBounds(20,150,200,100);
        add(texto1);
        texto1.setVisible(true);

        campo1 = new JTextField();
        campo1.setBounds(280,180,30,30);
        add(campo1);
        campo1.setVisible(true);

        boton2 = new JButton("Siguiente");
        boton2.setBounds(380,180,100,30);
        add(boton2);
        boton2.addActionListener(this);
        boton2.setVisible(true);

        texto2 = new JLabel ("Ingrese libro despues");
        texto2.setBounds(20,230,200,100);
        add(texto2);
        texto2.setVisible(true);

        campo2 = new JTextField();
        campo2.setBounds(280,260,30,30);
        add(campo2);
        campo2.setVisible(true);

        boton3 = new JButton("Siguiente");
        boton3.setBounds(380,260,100,30);
        add(boton3);
        boton3.addActionListener(this);
        boton3.setVisible(true);

        texto3 = new JLabel ("Inserte el primero libro");
        texto3.setBounds(20,310,200,100);
        add(texto3);
        texto3.setVisible(true);

        campo3 = new JTextField();
        campo3.setBounds(280,340,30,30);
        add(campo3);
        campo3.setVisible(true);

        boton4 = new JButton("Siguiente");
        boton4.setBounds(380,340,100,30);
        add(boton4);
        boton4.addActionListener(this);
        boton4.setVisible(true);

        texto4 = new JLabel ("¿Qué libro desea elminar?");
        texto4.setBounds(20,390,200,100);
        add(texto4);
        texto4.setVisible(true);

        campo4 = new JTextField();
        campo4.setBounds(280,420,30,30);
        add(campo4);
        campo4.setVisible(true);

        boton5 = new JButton("Siguiente");
        boton5.setBounds(380,420,100,30);
        add(boton5);
        boton5.addActionListener(this);
        boton5.setVisible(true);


        textArea1=new JTextArea();
        scrollpane1=new JScrollPane(textArea1);
        add(scrollpane1);
        scrollpane1.setBounds(120,100,350,60);
        scrollpane1.setVisible(true);
    }


    public void actionPerformed(ActionEvent e){

        if(e.getSource() == boton1){

            milisti.cab.sig = nuevo2;
            milisti.cab.sig.sig = nuevo3;
            dato = milisti.recorrido(milisti.cab);
            texto0.setText(dato);
            texto0.setVisible(true);
            texto1.setVisible(true);
            campo1.setVisible(true);
            boton2.setVisible(true);
        }
        if(e.getSource() == boton2){
            if((campo1.getText().compareTo("fisica") == 1) ||(campo1.getText().compareTo("programacion") == 2 || (campo1.getText().compareTo("matematicas") == 3)))
                if (campo1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Es necesario ingresar un libro");
                }
                else
                {
                    texto2.setVisible(true);
                    campo2.setVisible(true);
                    boton3.setVisible(true);
                    campo1.setEnabled(false);
                }
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay ningun libro existente");
            return;
        }


        if(e.getSource() == boton3){
            if (campo1.getText().compareTo("programacion")==1)
            {
                milisti.AdicionarNodoDespues(milisti.cab, campo2.getText());
            }
            else if ((campo1.getText().compareTo("matematicas"))==2)
            {
                milisti.AdicionarNodoDespues(nuevo2, campo2.getText());
            }
            else if ((campo1.getText().compareTo("fisica"))==3)
            {
                milisti.AdicionarNodoDespues(nuevo3, campo2.getText());
            }
            dato = milisti.recorrido(milisti.cab);
            texto0.setText(dato);

            texto3.setVisible(true);
            campo3.setVisible(true);
            boton4.setVisible(true);

        }


        if(e.getSource() == boton4)
        {
            if (campo1.getText().compareTo("programacion")==1)
            {
                milisti.AdicionarNodoAntes(milisti.cab, campo3.getText());
            }

            else if (campo1.getText().compareTo("matematicas")==2)
            {
                milisti.AdicionarNodoAntes(nuevo2, campo3.getText());
            }
            else if (campo1.getText().compareTo("fisica")==3)
            {
                milisti.AdicionarNodoAntes(nuevo3, campo3.getText());
            }
            dato = milisti.recorrido(milisti.cab);
            texto0.setText(dato);

            texto4.setVisible(true);
            campo4.setVisible(true);
            boton5.setVisible(true);

        }
        if(e.getSource() == boton5)
        {
            String dato_mod = "";
            dato_mod = dato.replace(campo4.getText(), "");
            texto0.setText(dato_mod);

        }


    }






    public static void main(String[] args) {

        ventana ventanita = new ventana();
        ventanita.setVisible(true);
        ventanita.setResizable(false);


    }


}



