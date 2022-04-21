package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createrSellerDao();

		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

		System.out.println();

		List<Seller> list = sellerDao.findAllDepartment(new Department(2, null));
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println();

		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		Seller newSeller = new Seller(null,"Greg", "greg@gmail.com" , new Date(), 4000.0 , new Department(2,null));
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());
		
		
		System.out.println();
		
		seller = sellerDao.findById(1);
		seller.setName("Corolla");
		seller.setBaseSalary(9000.0);
		sellerDao.update(seller);
		System.out.println("Update complete!");
		
		System.out.println();
		
		System.out.println("Enter id for delete test");
		int id  = sc.nextInt();
		sellerDao.deletedById(id);
		System.out.println("Deleted!!");
		
		sc.close();
		
	}

}
