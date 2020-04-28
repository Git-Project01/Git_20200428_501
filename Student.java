public class Student{

	private String name;			//edit by Git-Project02,Git-Project01

	private Integer age;			//edit by Git-Project02,Git-Project01

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;		//edit by Git-Project03 use SSH Login
	}

	public void setAge(Integer age){
		this.age = age;			//edit by Git-Project01
	}

	public Integer getAge(){
		return this.age;
	}

	public String toString(){
		return "Student [name = "+this.name+",age = "+this.age+"]";
	}
}
