package Entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="teacher_details")
public class TeacherDetails {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="city")
	private String city;
	
	@Column(name="hobby")
	private String hobby;
	
	@Column(name="Special_hobby")
	private String Special_hobby;
	
	@OneToOne(mappedBy="teacherDetails")
	private TeaCher teacher;
	
		
	public TeacherDetails(){
		
	}


	public TeacherDetails(int id, String city, String hobby, String special_hobby, TeaCher teacher) {
		super();
		this.id = id;
		this.city = city;
		this.hobby = hobby;
		Special_hobby = special_hobby;
		this.teacher = teacher;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	public String getSpecial_hobby() {
		return Special_hobby;
	}


	public void setSpecial_hobby(String special_hobby) {
		Special_hobby = special_hobby;
	}


	public TeaCher getTeacher() {
		return teacher;
	}


	public void setTeacher(TeaCher teacher) {
		this.teacher = teacher;
	}


	@Override
	public String toString() {
		return "TeacherDetails [id=" + id + ", city=" + city + ", hobby=" + hobby + ", Special_hobby=" + Special_hobby
				+ ", teacher=" + teacher + "]";
	}

	


}
