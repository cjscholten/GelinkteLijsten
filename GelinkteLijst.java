package GelinkteLijsten;

public class GelinkteLijst {
	
	
	/**
	 * Alleen de gelinkte lijst heeft toegang tot de node
	 */
	private class Node {
		//Dit is de data die je opslaat
		Object data;
		
		// referenties/pijlen naar de volgende en vorige nodes
		Node next;
	}	
	
	
	private Node head;
	private int size;
	
	
	public GelinkteLijst() 
	{
	}
	
	
	Object getFirst() 
	{
		return head;
	}
	
	
	Object getLast() 
	{		
		Node last = head;
		while(last.Node != null)
		{
			last = last.node;
		}
		return last;
	}	
	
	/**
	 * Voeg toe aan de voorkant
	 */
	void insertFirst(Object n) 
	{
		Node nNew = new Node(n.data, head);
		head = nNew;
		size++;
	}

	/**
	 * Voeg toe aan de achterkant
	 */
	void insertLast(Object n) 
	{
		getLast().node = n;
	}
	
	/**
	 * Voeg toe voor een ander element
	 */
	void insertBefore(Object n, Object before) 
	{
		Node zoek = head;
		while(zoek.Node != before)
		{
			zoek = zoek.node;
		}
		n.node = zoek.node;
		zoek.node = n;
		size++;
	}
	
	/**
	 * Voeg toe na een ander element
	 */
	void insertAfter(Object n, Object after) 
	{
		n.node = after.node;
		after.node = n;
		size++;
	}

	
	/**
	 * Verwijder een element
	 * @param data
	 */
	void remove(Object data) 
	{
		Node zoek = head;
		while(zoek.Node != data)
		{
			zoek = zoek.node;
		}		
		zoek.node = data.node;
		size--;
	}
	
	/**
	 * 
	 * @param current
	 * @return
	 */
	boolean isFirst(Object current) 
	{
		return (current == head);
	}
	
	
	/**
	 * 
	 * @param current
	 * @return
	 */
	boolean isLast(Node current) 
	{
		return (current == getLast());	
	}
	
	
	/**
	 * Het aantal elementen in de gelinkte lijst
	 * @return
	 */
	int getSize() {
		return size;
	}
}
