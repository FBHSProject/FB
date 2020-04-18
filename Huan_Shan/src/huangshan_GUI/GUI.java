/**
 * 
 */
package huangshan_GUI;

import java.util.Scanner;

import chejian.Date;
import chejian.Sale.SaleOrder;
import manager.Huangshanmanager;

/**
 * @author zhongheyao
 *
 */
public class GUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.println("订单类型");
		System.out.println("1. "+ "增加生产订单");
		System.out.println("2. "+ "增加销售订单");
		System.out.print("请输入你要选择的订单类型");
		int choice = key.nextInt();
		Huangshanmanager manager = new Huangshanmanager();
		if (choice == 1) {
			System.out.println("1. "+ "新增加订单");
			System.out.println("2. "+ "临时增加订单");
			System.out.print("请输入你的选项：");
		}
		int number = key.nextInt();
		if (choice == 1) {
			System.out.println("输入今天的日期");
			System.out.println("输入年： ");
			int thisyear = key.nextInt();
			System.out.print("输入月： ");
			int thismonth = key.nextInt();
			System.out.print("输入日： ");
			int thisday = key.nextInt();
			Date today = new Date(thisyear, thismonth, thisday);
			System.out.println("输入订单的日期");
			System.out.println("输入年： ");
			int orderyear = key.nextInt();
			System.out.print("输入月： ");
			int ordermonth = key.nextInt();
			System.out.print("输入日： ");
			int orderday = key.nextInt();
			Date orderdate = new Date(orderyear, ordermonth, orderday);
			int diff_Day = orderdate.daysTo(today);
			SaleOrder order = new SaleOrder(//add information inside);
		}
		
		
		key.close();
	}

}
