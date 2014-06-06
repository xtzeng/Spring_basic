import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Test {

	// 定义一个全局的记录器，通过LoggerFactory获取

	private final static Logger log = LoggerFactory.getLogger(Test.class);
	public static void main(String[] args) {
		System.out.println("hello");
		log.info("日志内容");
	}
	

}
