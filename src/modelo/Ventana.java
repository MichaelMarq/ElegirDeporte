
package modelo;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class Ventana extends JFrame{
    
    //Atributos
    
    private JPanel panel;
    private JRadioButton radioBoton;
    private JRadioButton radioBoton2;
    private JRadioButton radioBoton3;
    private JRadioButton radioBoton4;
    private JLabel etiqueta2;
  

    
    
    //Constructor
    public Ventana(){
        //Dimension de la ventana
        this.setSize(700, 400);
        //Establecer en el centro
        this.setLocationRelativeTo(null);
        //Titulo a la ventana
        this.setTitle("Escoja su deporte favorito");
        
        //Llamar a los componentes
        inicializarComponentes();        
        //Cerrar la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    //Iniciar Componentes
    private void inicializarComponentes(){
        agregarPanel();
        agregarEtiqueta();
        agregarRadioButton();
        agregarEtiquetaFoto();
    }
    
    
    
    //Agregar el panel
    
    private void agregarPanel(){
        //Instanciacion panel
        panel = new JPanel();
        //Quitar el diseño prestablecido
        panel.setLayout(null);
        
        //Agregar a la ventana
        this.add(panel);
        
    }
    
    //Agregara la etiqueta del titulo
    
    private void agregarEtiqueta(){
        //Instanciacion de la etiqueta
        JLabel etiqueta = new JLabel();
        //Posicionamos la etiqueta
        etiqueta.setBounds(20, 30, 200, 40);
        etiqueta.setText("Escoja su deporte favorito");
        //Estilo de la letra
        etiqueta.setFont(new Font("arial", 1, 16));
        
        //Agregamos al panel
        panel.add(etiqueta);
    }
    
    //Agrego los radio botones
    
    private void agregarRadioButton(){
        //Instanciamos los botones 1,2,3,4
        radioBoton = new JRadioButton();
        radioBoton.setText("Futbol");
        radioBoton.setBounds(20, 90, 90, 30);
        radioBoton.setFont(new Font("arial", 1, 14));
        panel.add(radioBoton);
        
        radioBoton2 = new JRadioButton();
        radioBoton2.setText("Baloncesto");
        radioBoton2.setBounds(20, 146, 120, 30);
        radioBoton2.setFont(new Font("arial", 1, 14));
        panel.add(radioBoton2);
        
        radioBoton3 = new JRadioButton();
        radioBoton3.setText("Tenis");
        radioBoton3.setBounds(20, 202, 90, 30);
        radioBoton3.setFont(new Font("arial", 1, 14));
        panel.add(radioBoton3);
        
        radioBoton4 = new JRadioButton();
        radioBoton4.setText("Natacion");
        radioBoton4.setBounds(20, 260, 90, 30);
        radioBoton4.setFont(new Font("arial", 1, 14));
        panel.add(radioBoton4);
        
        
        //Agrupar los radio Button
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioBoton);
        grupo.add(radioBoton2);
        grupo.add(radioBoton3);
        grupo.add(radioBoton4);
        
        //Llamar a los eventos
        
        eventoClickFutbol();
        eventoClickBaloncesto();
        eventoClickTenis();
        eventoClickNatacion();
                
    }
    
    //Etiqueta de la foto del deporte
    private void agregarEtiquetaFoto(){
        //Instanciamos la etiqueta de la foto y luego su dimension
        etiqueta2 = new JLabel();
        etiqueta2.setBounds(200, 90, 400, 200);
        
        //Agregamos al panel
        panel.add(etiqueta2);
    }
    
    
    //Evento para el radio boton futbol
    private void eventoClickFutbol(){

        ActionListener evento = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                //Creamos una imagen y despues la redimensionamos para que se adapte a la etiqueta
                ImageIcon imagen = new ImageIcon(getClass().getResource("/img/futbol.jpg"));
                etiqueta2.setIcon( new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
            }
                
        };
             
        radioBoton.addActionListener(evento);
        
    }
    
    //Evento para el radio boton baloncesto
    private void eventoClickBaloncesto(){

        ActionListener evento = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                //Creamos una imagen y despues la redimensionamos para que se adapte a la etiqueta
                ImageIcon imagen = new ImageIcon(getClass().getResource("/img/baloncesto.jpg"));
                etiqueta2.setIcon( new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
            }
              
        };
             
        radioBoton2.addActionListener(evento);
        
    }
    
    //Evento para el radio boton Tenis
    private void eventoClickTenis(){

        ActionListener evento = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                //Creamos una imagen y despues la redimensionamos para que se adapte a la etiqueta
                ImageIcon imagen = new ImageIcon(getClass().getResource("/img/tenis.jpg"));
                etiqueta2.setIcon( new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
            }
             
        };
             
        radioBoton3.addActionListener(evento);
        
    }
    
    
    //Evento para el radio boton Natacion
    private void eventoClickNatacion(){

        ActionListener evento = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                //Creamos una imagen y despues la redimensionamos para que se adapte a la etiqueta
                ImageIcon imagen = new ImageIcon(getClass().getResource("/img/natacion.jpg"));
                etiqueta2.setIcon( new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
            }
                
        };
             
        radioBoton4.addActionListener(evento);
        
    }
    
    
}
