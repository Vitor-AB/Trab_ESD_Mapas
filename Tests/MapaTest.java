import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapaTest {

    Mapa mapa = new Mapa();

    @Test
    void putInserirVariosParesChaveValor() {
        mapa.put(5,10);
        mapa.put(10,50);
        mapa.put("soup","fdfa");
        mapa.put("asd",50);

        mapa.printList();

        assertEquals(4,mapa.size());
    }

    @Test
    void putInserirChaveNulo() {
        mapa.put(null,10);

        assertEquals(10,mapa.get(null));
    }

    @Test
    void putInserirValorNulo() {
        mapa.put("nu",null);

        assertNull(mapa.get("nu"));
    }

    @Test
    void substituirUmValorExistente() {
        mapa.put(5,10);
        mapa.put(10,50);
        mapa.printList();

        mapa.put(10,60);
        mapa.put(5,"f");
        mapa.printList();
    }

    @Test
    void get() {
        mapa.put(5,10);
        mapa.put(10,50);

        mapa.printList();

        assertEquals(10, mapa.get(5));
        assertEquals(50, mapa.get(10));
    }

    @Test
    public void getInexistente() {
        assertNull(mapa.get("chave3"));
        assertNull(mapa.get("chave4"));
    }

    @Test
    public void testRemoveKeyExists() {
        mapa.put("um", 1);
        mapa.put("dois", 2);
        mapa.put("três", 3);


        assertEquals(2, mapa.remove("dois"));

        assertEquals(2, mapa.size());

        assertNull(mapa.get("dois"));
    }

}