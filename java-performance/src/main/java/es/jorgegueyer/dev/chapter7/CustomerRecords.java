package es.jorgegueyer.dev.chapter7;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

public class CustomerRecords implements Iterator<Customer> {
	private Map<String, Customer> records;
	
	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}
		
	@Override
	public boolean hasNext() {
		return records.values().iterator().hasNext();
	}

	@Override
	public Customer next() {
		return records.values().iterator().next();
	}

	public Map<String, Customer> getCustomers() {
		return new HashMap<>(this.records);
	}
}
