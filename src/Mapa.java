/*
Desenvolva o algoritmo de Mapa com a linguagem Java. Inclua os testes unitários.

O mapa deve guardar quaisquer tipo de dados. Utilize genéricos.
O mapa deve guardar os elementos dentro de uma lista duplamente encadeada
Não utilize as estruturas prontas da plataforma java.
Inclua testes unitários
*/

import java.util.ArrayList;


public class Mapa {

    Object Chave;
    Object Valor;
    ArrayList<Object> listaChaves = new ArrayList<Object>();
    ArrayList<Object> listaValores = new ArrayList<Object>();

    public Mapa(Object chave, Object valor) {
        Chave = chave;
        Valor = valor;
        listaChaves.add(Chave);
        listaValores.add(valor);
    }

    public void add(){

    }

}
