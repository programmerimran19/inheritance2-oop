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
public class Solution {
    
    
    void bark()
    {
        System.out.println("I can Bark");
    }
    
    
    void bark(int i)
    {
        System.out.println(i);
    }
    
    void bark(int i, int j)
    {
        System.out.println(i+j);
    }

    
    public static void main(String[] args) {
        
        /*Bird B = new Bird();
        //B.walk();
        B.eat();
        B.fly();
        B.sing();*/
        
        Dog d = new Dog();
        d.bark2();
        //d.eat();
        d.fly();
        d.sing();
        d.eat();
        //d.bark(10);
        //d.bark(10, 20);
        
        Solution s = new Solution();
        s.bark();
        s.bark(10);
        s.bark(10, 20);
    }
    
}
