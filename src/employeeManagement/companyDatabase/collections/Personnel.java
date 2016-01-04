package employeeManagement.companyDatabase.collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import employeeManagement.companyDatabase.classes.Employee;


/**
 * 
 * @author parkar_s
 * 
 * @param <T>A custom collection class that will store collection of Employees in
 *        the collection Type Personnel
 */
public class Personnel<T> extends AbstractList<Employee> {

	private ArrayList<Employee> list;

	public Personnel() {
		list = new ArrayList<Employee>();
	}

	public Personnel(Collection<Employee> collection) {
		list = new ArrayList<Employee>();
		Iterator<Employee> itor = collection.iterator();
		if (collection instanceof List) {
			while (itor.hasNext()) {
				list.add(itor.next());
			}
		} else {
			while (itor.hasNext()) {
				add((Employee) itor.next());
			}
		}
	}

	public Iterator<Employee> iterator() {
		return list.iterator();
	}

	public int size() {
		return list.size();
	}

	/**
	 * Inserts the specified element at the send of the list
	 * 
	 * @param element
	 * @return
	 */
	public boolean add(Employee element) {
		boolean modified;
		if (modified = !list.contains(element)) {
			list.add(element);
		}
		return modified;
	}

	/**
	 * Removes the element in this list.
	 */
	public boolean remove(Object element) {
		return list.remove(element);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	/**
	 * Returns true if this list contains the specified element
	 */
	public boolean contains(Object element) {
		return list.contains(element);
	}

	/**
	 * remove all elements from the list
	 */
	public void clear() {
		list.clear();
	}

	@Override
	public Employee get(int index) {
		return list.get(index);
	}

}
