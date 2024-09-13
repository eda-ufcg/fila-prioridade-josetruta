import java.util.ArrayList;

public class InsereFinalFilaPrioridade implements FilaPrioridade {

	private ArrayList<Pair> fila;

	public InsereFinalFilaPrioridade(int capacidade) {
		this.fila = new ArrayList<Pair>(capacidade);
	}
	
	// criar um Pair e adicionar no fim da fila
	public void add(String elemento, int prioridade) {
		Pair p = new Pair(elemento, prioridade);
		this.fila.add(p);
	}


	// buscar pelo elemento de maior prioridade na fila.
	public String removeNext() {
		int j = 0;

		for (int i = 1; i < this.fila.size(); i++) {
			if (this.fila.get(i).getPrioridade() > this.fila.get(j).getPrioridade()) j = i;
		}

		return this.fila.remove(j).getElemento();
	}

}
