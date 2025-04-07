// Nome: Gustavo do Bem Ferreira, Matricula: 202065036AC

import java.util.List;

// Classe genérica
public class Utilitaria {
    // Método genérico para imprimir elementos de qualquer lista
    public static <T> void imprimirLista(List<T> lista) {
        for (int i=0; i<lista.size(); i++){
            System.out.println((i+1) + " - " + lista.get(i).toString());
        }
    }
}
