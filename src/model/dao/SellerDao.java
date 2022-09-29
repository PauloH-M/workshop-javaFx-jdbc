package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);//responsavel por inseir no banco de dados o obj do comando de entrada
	void update(Seller obj);//responsavel por atualizar no banco de dados o obj do comando de entrada
	void deleteById(Integer id);//responsavel por deletar no banco de dados o obj do comando de entrada
	Seller findById(Integer id);//responsavel por consultar no banco de dados o obj e retornar do comando de entrada
	List<Seller> findAll();//responsavel por retornar todo o banco de dados
    List<Seller> findByDepartment(Department department);

}
