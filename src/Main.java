public class Main {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();
        Mapa map = new Mapa();
        mapa.put(5,8);
        mapa.put("a",70);
        mapa.put("a",50);
        mapa.put(5,"g");


        System.out.println(mapa.get("a"));
        System.out.println(mapa.size());

        System.out.println(mapa.remove("a"));

        System.out.println(mapa.isEmpty());
        System.out.println(map.isEmpty());



    }
}
