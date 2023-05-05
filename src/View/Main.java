package View;

import Biblioteca.ListaObject.Lista;
import Controller.OrdenaLista;

public class Main {
    public static void main(String[] args) {
        Lista listaL= new Lista();
        int vet[]= {10, 5, 8, 1, 9, 2, 4, 7, 3, 6};

        OrdenaLista op= new OrdenaLista();

        op.Ordena(listaL, vet);

    }
}
