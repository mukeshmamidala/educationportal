package sunspot.com.entity;

import javax.persistence.*;

@Entity
@Table(name = "teacherApproved")
public class TeacherApproved {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;
	
	@Column(name = "studentId",nullable = false)
	private long studentId;

	@Column(name = "teacherId",nullable = false)
	private long teacherId;
	
	@Column(name = "course",nullable = false)
	private int course;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}
	
}