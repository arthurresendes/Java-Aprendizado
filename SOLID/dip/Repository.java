package dip;

import java.util.List;

public interface Repository<T> {
	
	public void create(T t);
	public List<T> retrieve();
	public T update(T t);
	public void delete(T t);
	
}
