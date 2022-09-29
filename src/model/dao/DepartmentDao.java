package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);//responsavel por inseir no banco de dados o obj do comando de entrada
	void update(Department obj);//responsavel por atualizar no banco de dados o obj do comando de entrada
	void deleteById(Integer id);//responsavel por deletar no banco de dados o obj do comando de entrada
	Department findById(Integer id);//responsavel por consultar no banco de dados o obj e retornar do comando de entrada
	List<Department> findAll();//responsavel por retornar todo o banco de dados
}