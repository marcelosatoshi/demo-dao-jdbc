package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao depdao = DaoFactory.createDepartmentDao();

		Department dep = depdao.findById(3);
		System.out.println(dep);

		System.out.println();

		Department dep1 = new Department(null, "Civic");

		depdao.insert(dep1);
		System.out.println(dep1.getId());

		System.out.println();

		List<Department> list = depdao.findAll();
		for (Department obj : list) {
			System.out.println(obj);

		}

		depdao.deletedById(6);
		
		dep = depdao.findById(8);
		dep.setName("Jetta");
		depdao.update(dep);
		
	}

}
