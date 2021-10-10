/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author Programmer Imran
 */
public class Bird extends Animal{
    
    @Override
    void eat()
    {
        super.eat();
        System.out.println("I can dog food");
    }
    
    
    void fly() 
    {
        System.out.println("I am flying");
    }
    
    void sing()
    {
        System.out.println("I am Singing");
    }
    
}
