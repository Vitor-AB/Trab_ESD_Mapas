/*
Desenvolva o algoritmo de Mapa com a linguagem Java. Inclua os testes unitários.

O mapa deve guardar quaisquer tipo de dados. Utilize genéricos.
O mapa deve guardar os elementos dentro de uma lista duplamente encadeada
Não utilize as estruturas prontas da plataforma java.
Inclua testes unitários
*/
public class Mapa {

    Object Chave;
    Object Valor;
    ListaDuplamenteEncadeada<Mapa> lista = new ListaDuplamenteEncadeada<>();

    public Mapa(Object chave, Object valor) {
        Chave = chave;
        Valor = valor;
    }
    public Mapa(){
    }

    public Object put(Object k,Object v){
        Object aux;
        for (int i = 0; i < lista.tamanho(); i++) {
            if (lista.recuperar(i).Chave == k){
                aux = lista.recuperar(i).Valor;
                lista.recuperar(i).Valor = v;
                return aux;
            }
        }
        lista.inserir(new Mapa(k,v));
        return null;
    }

    public Object get(Object k){
        if (!lista.estaVazia()){
            for (int i = 0; i < lista.tamanho(); i++) {
                if (lista.recuperar(i).Chave == k){
                    return lista.recuperar(i).Valor;
                }
            }
        }
        return null;
    }

    public Object remove(Object k){
        Object aux;
        if(!lista.estaVazia()){
            for (int i = 0; i < lista.tamanho(); i++) {
                if (lista.recuperar(i).Chave == k){
                    aux = lista.recuperar(i).Valor;
                    lista.remover(i);
                    return aux;
                }
            }
        }
        return null;
    }

    public int size(){
        return lista.tamanho();
    }

    public boolean isEmpty(){
        return lista.estaVazia();
    }

    public void printList(){
        System.out.println(lista);
    }


    @Override
    public String toString(){
        return Chave.toString() +"->"+ Valor.toString();
    }

}
