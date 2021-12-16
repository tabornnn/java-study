package test1;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LogTest {
    public static void main(String[] args){
        // ロガーを呼び出します
        Logger logger = LogManager.getLogger("Logger");

		logger.trace("Start"); // 2017/01/21 06:02:17.154 [main] TRACE test1.Sample Start
		
		int a = 1;
		int b = 2;
		String c = null;
		
		logger.debug("debug"); // 2017/01/21 06:02:17.157 [main] DEBUG test1.Sample debug
		logger.info("info={}", a); // 2017/01/21 06:02:17.159 [main] INFO test1.Sample info=1
		logger.warn("warn={},={}", a, b); // 2017/01/21 06:02:17.159 [main] WARN test1.Sample warn=1,=2
		logger.error("error={}", c); // 2017/01/21 06:02:17.171 [main] ERROR test1.Sample error=null
		logger.trace("End"); // 2017/01/21 06:02:17.172 [main] TRACE test1.Sample End
    }
}