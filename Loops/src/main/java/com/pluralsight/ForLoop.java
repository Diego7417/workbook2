package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) {
      for (int count = 10; count > 0; count--){
          System.out.println(count);
      }
      try {
          Thread.sleep(1000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

    }
}
