/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolibreria;

/**
 *
 * @author Estudiante
 */
import becker.robots.*;
import java.awt.Color;
public class EjemploKarel {
    private City ciudad;
    private Robot robot;
    
    public EjemploKarel(){
        this.ciudad = new City();
        for (int i = 1; i <= 6; i++) {
            Wall pared = new Wall(ciudad, 1, i, Direction.NORTH);
        }
        for (int i = 1; i <= 6; i++) {
            Wall pared = new Wall(ciudad, i, 1, Direction.WEST);
        }
        for (int i = 1; i <= 6; i++) {
            Wall pared = new Wall(ciudad, i, 6, Direction.EAST);
        }
        for (int i = 1; i <= 6; i++) {
            Wall pared = new Wall(ciudad, 6, i, Direction.SOUTH);
        }
        
        Thing thing = new Thing(ciudad, 2, 2);
        thing.getIcon().setColor(Color.LIGHT_GRAY);
        thing.getIcon().setLabel("Placa");
        
        this.robot = new Robot(ciudad, 3, 3, Direction.EAST);
        this.robot.setLabel("Robot");
        this.robot.setColor(Color.ORANGE);
    }
    
    public void solucionarReto(){
        while(this.robot.getLabel().equals("Robot")){
            if(this.robot.frontIsClear()){
                this.robot.move();
            }else{
                this.robot.turnLeft();
            }
        }
    }
}
