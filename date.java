  import java.util.*;

  public class JavaGetTodaysDateNow
  {

    public static void main(String[] args)
    {
      // create a calendar instance, and get the date from that
      // instance; it defaults to "today", or more accurately,
      // "now".
      Date today = Calendar.getInstance().getTime();

      // print out today's date
      System.out.println(today);
    }

  }
