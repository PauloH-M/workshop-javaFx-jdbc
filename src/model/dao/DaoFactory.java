package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

// a minha clase vai expor um metodo que retorna o tipo da interface mas
// internamente ela vai estanciar uma implementa��o � para n�o precisar expor a implementa�ao

public class DaoFactory { 

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC (DB.getConnection());
	}
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
