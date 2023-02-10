package TesteEnum;

import java.util.Date;

import TesteEnum.Entities.Order;
import TesteEnum.Entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
	

		Order o = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(o);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		Order o1 = new Order(1080, new Date(), os2);
		
		System.out.println(o1);
	}
}
