/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intihotel;

import java.util.Queue;
import java.util.LinkedList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
/**
 *
 * @author zayn
 */
public class WaitingList extends CheckIn {
    
    //adding queue
    Queue<Customer> customerQueue = new LinkedList<Customer>();
    
    //adding enqueue, dequeue, isEmpty methods
    public boolean enqueue(Customer customer) {
        return customerQueue.add(customer);
    }
    
    public boolean dequeue(Customer customer) {
        return customerQueue.remove(customer);
    }
    
    public boolean isEmpty() {
        return customerQueue.isEmpty();
    }
    
    
}
