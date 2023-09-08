/*
Desenvolva o algoritmo de Mapa com a linguagem Java. Inclua os testes unitários.

O mapa deve guardar quaisquer tipo de dados. Utilize genéricos.
O mapa deve guardar os elementos dentro de uma lista duplamente encadeada
Não utilize as estruturas prontas da plataforma java.
Inclua testes unitários
*/

import java.util.LinkedList;

public class Mapa {

    Object Chave;
    Object Valor;
    LinkedList<Mapa> list = new LinkedList<Mapa>();

    public Mapa(Object chave, Object valor) {
        Chave = chave;
        Valor = valor;
    }
    public Mapa(){
    }

    public Object put(Object k,Object v){
        Object aux;
        for (Mapa m: list) {
            if(m.Chave == k){
                aux = m.Valor;
                m.Valor = v;
                return aux;
            }
        }
        list.add(new Mapa(k,v));
        return null;

    }

    public Object get(Object k){
        if(!list.isEmpty()){
            for (Mapa m: list) {
                if(m.Chave == k){
                    return m.Valor;
                }
            }
        }
        return null;
    }

    public Object remove(Object k){
        Object aux;
        if(!list.isEmpty()){
            for (Mapa m: list) {
                if(m.Chave == k){
                    aux = m.Valor;
                    list.remove(m);
                    return aux;
                }
            }
        }
        return null;
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void printList(){
        System.out.println(list);
    }


    @Override
    public String toString(){
        return Chave.toString() +"->"+ Valor.toString();
    }

}
