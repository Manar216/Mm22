/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm0;

import java.util.Scanner;

/**
 *
 * @author ADvisor
 */
public class ATM0 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

    double balance = 10000;// الرصيد
    String name = "noor alshehri";// مالك الحساب
    double x = 0;// رح نخزن فيه الراتب والتحويل بطريقه مؤقته
    String y = "";// لاختيار العمليت تحويل او ايداع او غيرها
    System.out.println("--------------------------------------------");// الواجهه
    System.out.println("                 ALNOOR BANK                ");// الواجهه
    System.out.println("--------------------------------------------");// الواجهه
    System.out.println("           Enter (W) to withdraw            ");// تريد عملية سحب مالي ادخل دبليو
    System.out.println("           Enter (D) to Deposit             ");// تريد عملية يداع مالي ادخل دي
    System.out.println("           Enter (T) to Transfer            ");// تريد عملية تحويل مالي ادخل تي
    System.out.println("         Enter (p) to Print information     ");// تريد عملية كشف رصيد ادخل بي
    System.out.println("              Enter (E) to Exsit            ");// تريدالخروج ادخل اي
    System.out.println();
    System.out.print("            Choose a function               ");// اختر عملية

    
    y = input.next(); //عشان نقدر ندخل القيم
    
    if (y.equalsIgnoreCase("W")) { //عشان يطلع لنا اذا صح او غلط
        
        System.out.print(" Enter the amount to withdraw ( up to 3000 )"); // يسال كم المبلغ المراد سحبه
        x = input.nextDouble(); // نستدعي الاكس ونقرا المبلغ المراد سحبه هنا المبلغ انحفظ في الاكس
        
        if (x > 3000){ // if جواif عشان نسوي شرط
          System.out.println(" You cannot withdraw more then 3000 ");  
        }
        
        balance -= x; //balance = balance - x; يخصم من الرصيد
        
    } else if (y.equalsIgnoreCase("D")) { 
        
    } else if (y.equalsIgnoreCase("T")) {
        
    } else if (y.equalsIgnoreCase("P")) {
        
        System.out.println(" Your balance is " + balance ); // ميثود طباعه balance اذا دخل حرف (P)
        
    } else if (y.equalsIgnoreCase("E")) {
        
    } else { // اذا دخل حروف غلط راح يطبع هذي الجمله
      System.out.println(" You entered false input! ") ; 
    }
   
    } 
}