

public class myTimerLoggings {
  private static final Logger logger = Logger.getLogger(myTimerLoggings.class);
  private static final Logger infoLogger = Logger.getLogger("myTimerLoggings.Info");
  private static final Logger errorLogger = Logger.getLogger("myTimerLoggings.Error");

  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      logger.debug("Debug log: " + (20 + i) + ":27:0" + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    for (int i = 0; i < 3; i++) {
      infoLogger.info("Info log: " + (20 + i) + ":28:00");
      try {
        Thread.sleep(60000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    for (int i = 0; i < 3; i++) {
      errorLogger.error("Error log: " + (21 + i) + ":00:00");
      try {
        Thread.sleep(3600000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }
}