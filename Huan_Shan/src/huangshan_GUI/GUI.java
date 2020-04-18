/**
 * 
 */
package huangshan_GUI;

import java.util.Scanner;

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
		
		
		key.close();
	}

}
