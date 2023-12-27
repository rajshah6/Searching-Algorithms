/*
 * Name: Raj Shah
 * Date: Aug 16, 2023
 * Course: ICS4UE
 * Description: This program will find the title of a book from the BookList.txt file 
 * according to the library reference number. The program will use a binary search and a linear search.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Book {
    // initialize private fields
    private int referenceNumber;
    private String bookTitle;
    
    // constructor method where all fields must be set in order to create the class
    public Book(int referenceNumber, String bookTitle) {
        // initialize all fields
        this.referenceNumber = referenceNumber;
        this.bookTitle = bookTitle;
    }
    
    // since fields are private, getters and setters are required for all fields
    
    // create getters to access fields outside of class
    public int getReferenceNumber() {
        return referenceNumber;
    }

    public String getBookTitle() {
        return bookTitle;
    }
    
    // create setters to change fields outside of class
    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    
    // override toString method, this will allow the array list to store the info
    @Override
    public String toString() {
        return "Reference #: " + referenceNumber + ", Book Title: " + bookTitle;
    } 
}

public class U3A3 extends javax.swing.JFrame {

    public U3A3() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userRefNum = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        outputLinear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        outputBinary = new javax.swing.JTextField();
        errorBox = new javax.swing.JTextField();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Children's Classics");

        jLabel1.setFont(new java.awt.Font("Hiragino Sans GB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Children's Classics");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("This program will find the title of a book according to the library reference number. ");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setText("The program will use a Binary Search and a Linear Search.");

        jLabel4.setFont(new java.awt.Font("Hiragino Sans", 1, 18)); // NOI18N
        jLabel4.setText("Enter the Reference Number:");

        userRefNum.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        searchBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        searchBtn.setText("Find it!");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Hiragino Sans", 1, 18)); // NOI18N
        jLabel5.setText("Linear Search:");

        outputLinear.setEditable(false);
        outputLinear.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        outputLinear.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Hiragino Sans", 1, 18)); // NOI18N
        jLabel6.setText("Binary Search:");

        outputBinary.setEditable(false);
        outputBinary.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        outputBinary.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        errorBox.setEditable(false);
        errorBox.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        errorBox.setForeground(new java.awt.Color(255, 0, 0));
        errorBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        exitBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outputBinary))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outputLinear))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userRefNum, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(272, 272, 272)
                                        .addComponent(exitBtn)))))
                        .addGap(116, 116, 116))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userRefNum, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputLinear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputBinary, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(errorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static ArrayList <Book> bookList = new ArrayList<>(); // initialize array list of type Book. It is declared as static to access it from the main method
    
    // method for linear searching
    public static String linearSearch(Book[] numbers, int target) { // searches an array of type Book
        for (Book number : numbers) {
            if (number.getReferenceNumber() == target) {
                return number.getBookTitle(); // item found, return the book
            }
        }
        return "Item not found"; // ref number not found
    }
    
    // method for sorted binary searching
     private static String binarySearch(Book[] numbers, int target, int low, int high) { // searches an array of type Book

        if (high >= low && low <= numbers.length - 1) { // check if index is in bounds
            // get middle number
            int middlePosition = low + (high - low) / 2; // get middle index
            int middleNumber = numbers[middlePosition].getReferenceNumber(); // get middle number

            if (target == middleNumber) {
                return numbers[middlePosition].getBookTitle(); // check to see if middle number is equal to the target number
            }
            
            else if (target < middleNumber) { 
                return binarySearch(numbers, target, low, middlePosition - 1); // recursively search to the left of middle number
            }
            
            else {
                return binarySearch(numbers, target, middlePosition + 1, high); // recursively search to the right of middle number
            }
          }
        
        return "Item not found"; // ref number not found
        
    }

    
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        
        // reset output fields
        errorBox.setText("");
        outputLinear.setText("");
        outputBinary.setText("");
        
         // get user input
        String userInput = userRefNum.getText();
        int refNum;
        
        try { // check for correct input
            refNum = Integer.parseInt(userInput);
            
        } catch (Exception e) {
            errorBox.setText("Incorrect input. Please enter an integer.");
            return; // exit the method
        }
        
        // check if ref number is positive
        if (refNum < 0) {
            errorBox.setText("Incorrect input. Please enter a positive integer.");
            return; // exit the method
        }
        
        // convert ArrayList to array
        Book [] BookList = new Book[bookList.size()];
        bookList.toArray(BookList);
        
        // perform linear search and display the book associated with it
        outputLinear.setText(linearSearch(BookList, refNum));
        
        // perform binary search and display the book associated with it
        outputBinary.setText(binarySearch(BookList, refNum, 0, BookList.length - 1));
        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0); // exit the program
    }//GEN-LAST:event_exitBtnActionPerformed

    
    public static void main(String args[]) {
        BufferedReader reader = null; // initialize reader object

        try {
            reader = new BufferedReader(new FileReader("BookList.txt")); // read the .txt file
            String line; 
            
            while ((line = reader.readLine()) != null ){ // iterate through .txt file
                String line2 = reader.readLine(); // get next input
                
                // store 2 lines into variables
                int refNum = Integer.parseInt(line);
                String bookName = line2;
                
                // create Book object and add to array
                bookList.add(new Book(refNum, bookName));
            }
            
        } catch (IOException e) {
            e.printStackTrace();
            
        } finally {
            // close the reader
            try {
                reader.close(); 
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U3A3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField errorBox;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField outputBinary;
    private javax.swing.JTextField outputLinear;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField userRefNum;
    // End of variables declaration//GEN-END:variables
}
