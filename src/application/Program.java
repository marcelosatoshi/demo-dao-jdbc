package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

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
	}

}
