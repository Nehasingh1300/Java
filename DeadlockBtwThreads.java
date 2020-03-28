/*What is Deadlock ?
According to Deadlock Oracle docs,

Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.
When synchronized keyword in java causes the executing thread to block while waiting for the monitor(lock) associated with the specified object,then Deadlock may occur. Since the executing thread might already holds the object which is required by another thread (also in waiting state). In such a case, two threads end up waiting forever for each other object lock.
*/
public class DeadLockProgram {
    // Creating Object Locks
    static Object ObjectLock1 = new Object();
    static Object ObjectLock2 = new Object();
   
    private static class ThreadName1 extends Thread {
      public void run() {
         synchronized (ObjectLock1) {
            System.out.println("Thread 1: Has  ObjectLock1");
            /* Adding sleep() method so that
               Thread 2 can lock ObjectLock2 */
            try { 
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1: Waiting for ObjectLock 2");
            /*Thread 1 has ObjectLock1 
              but waiting for ObjectLock2*/
            synchronized (ObjectLock2) {
               System.out.println("Thread 1: No DeadLock");
            }
         }
      }
   }
   private static class ThreadName2 extends Thread {
      public void run() {
         synchronized (ObjectLock2) {
            System.out.println("Thread 2: Has  ObjectLock2");
            /* Adding sleep() method so that
               Thread 1 can lock ObjectLock1 */
            try { 
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2: Waiting for ObjectLock 1");
            /*Thread 2 has ObjectLock2 
              but waiting for ObjectLock1*/
            synchronized (ObjectLock1) {
               System.out.println("Thread 2: No DeadLock");
            }
         }
      }
   }
   
   public static void main(String args[]) {
      ThreadName1 thread1 = new ThreadName1();
      ThreadName2 thread2 = new ThreadName2();
      thread1.start();
      thread2.start();
   }
}
/*
Thread 1: Has  ObjectLock1
Thread 2: Has  ObjectLock2
Thread 1: Waiting for ObjectLock 2
Thread 2: Waiting for ObjectLock 1
*/

