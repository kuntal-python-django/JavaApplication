/**
 * 
 */
package run;

/**
 * @author kuntal
 *
 */
public interface AddData 
{
	public int addStudent(String fname, String lname, String email, String phone, String course_name, double fees, String batch_time);
	public int addTeacher(String fname, String lname, String email, String phone, String department, String qualification);
}
