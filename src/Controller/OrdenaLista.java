package Controller;

import Biblioteca.ListaObject.Lista;
import Biblioteca.QuickSort.Ordenacao;

public class OrdenaLista {

    public OrdenaLista(){
        super();
    }

    public void Ordena(Lista listaL, int[] vet){
        Ordenacao quicksort= new Ordenacao();
        quicksort.QuickSort(vet, 0, vet.length - 1);
        int tamanho= vet.length;
        for (int i=tamanho-1; i >= 0; i--){
            listaL.addFirst(vet[i]);
        }
        while (!listaL.isEmpty()){
            try {
                System.out.println(listaL.removeFirst());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
