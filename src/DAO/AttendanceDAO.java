
package DAO;
import model.AttendanceModel;


public interface AttendanceDAO {
    public abstract boolean create(AttendanceModel sm);
    public abstract boolean view(AttendanceModel sm);
    public abstract boolean select(AttendanceModel sm);
    public abstract boolean delete(AttendanceModel sm);
    public abstract boolean update(AttendanceModel sm);
    public abstract boolean edit(AttendanceModel sm);
}
