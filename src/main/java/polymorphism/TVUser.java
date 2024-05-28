package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {

		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		TV tv = (TV) factory.getBean("tv");

		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		/*
		 * TV tv1 = (TV) factory.getBean("tv"); TV tv2 = (TV) factory.getBean("tv"); TV
		 * tv3 = (TV) factory.getBean("tv"); System.out.println(tv1);
		 * System.out.println(tv2); System.out.println(tv3);
		 */
		factory.close();

		/*
		 * BeanFactory factory = new BeanFactory();
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("TV제조사를 입력하세요. =>");
		 * String tvname = sc.next();
		 * 
		 * 
		 * TV tv = (TV) factory.getBean(tvname); tv.powerOn(); tv.volumeUp();
		 * tv.volumeDown(); tv.powerOff();
		 */

		/*
		 * SamsungTV tv = new SamsungTV(); tv.powerOn(); tv.volumeUp(); tv.volumeDown();
		 * tv.powerOff();
		 */

//		/* LgTV lgtv = new LgTV(); */
		/*
		 * lgtv.turnOn(); lgtv.soundUp(); lgtv.soundDown(); lgtv.turnOff();
		 * 
		 * 
		 * TV tv = (TV)new LgTV(); lgtv.powerOn(); lgtv.volumeUp(); lgtv.volumeDown();
		 * lgtv.powerOff();
		 */
		/*
		 * 
		 *
		 */

	}

}
