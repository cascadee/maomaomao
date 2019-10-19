package zte.com.zzJPA;

import javax.persistence.*;


@Entity
@Table(name = "cat_d")
public class Cat{

 
	@Id
	private Long id; // 主键ID
 
	private String name; // 部门名称
 
	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
}
