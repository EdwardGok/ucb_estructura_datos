package bo.edu.ucb.est.listaV2;

public class SimpleList <T> {
    private Node first;
    private int size;

    public SimpleList() {
        first = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(T data) {
        Node node = new Node(data, null);
        size++;
        if (first == null) {
            first = node;
        } else {
            for (Node current = first ; current != null; current = current.getNext() ) {
                if (current.getNext() == null ) { // es el ultimo nodo
                    current.setNext(node); // Enlazo el ultimo nodo.
                    break;
                }
            }
        }
    }

    public void print() {
       for (Node current = first; current != null ; current = current.getNext()) {
           System.out.print( current.getData() + " -> ");
       } 
       System.out.println(" |. ");
    }
    
    public String getData(int i){
        int aux=0;
        Node Data=null;
        for (Node current = first;current != null; current = current.getNext() ) {
                if (aux == i) {
                    Data=current;
                    break;
                }
                aux++;
            }
        return Data.getData().toString();
    }
    public boolean contains(T data){
        boolean ComeBack=false;
        for (Node current = first;current != null; current = current.getNext() ) {
            if (  data== current.getData()) {
                ComeBack=true;
                break;
            }
        }
        return ComeBack;
    }
    public void remove (T data){
        Node PreviousNode=null;
        if(first.getData()==data)
        {
            first=first.getNext();
        }
        else
        {
            for(Node current=first; current!=null; current=current.getNext())
            {
                if(current.getData()==data)
                {
                    PreviousNode.setNext(current.getNext());
                    break;
                }
                PreviousNode=current;
            }
        }
    }
    public void remove (int i)
    {
        int aux=0;
        Node PreviousNode=null;
        if(i==aux)
        {
            first=first.getNext();
        }
        else
        {
            for(Node current=first; current!=null; current=current.getNext())
            {
                if(aux==i)
                {
                    PreviousNode.setNext(current.getNext());
                    break;
                }
                aux++;
                PreviousNode=current;
            }
        }
    }
    
    // public getData(int i) //obtener un elemento
    // public contains(T data) // Retorna true si la lista contiene el elemento.
    // public remove(T data) // Remueve el elemento
    // public remove(int i) // Remueve el elemento de la posicion i especifgicada.

    
}
