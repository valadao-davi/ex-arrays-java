import java.util.ArrayList; //importar a classe array list do Java
public class Playlist{ // criando a classe "Playlist"
    public static void main (String[]args){
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>(); // criação de um objeto novo de strings para adicionar músicas
        listaParaIlhaDeserta.add("Pantera - Floods");
        listaParaIlhaDeserta.add("I miss you - Blink-182");
        listaParaIlhaDeserta.add("Sappy - Nirvana");
        listaParaIlhaDeserta.add("Empire Ants - Gorillaz");
        listaParaIlhaDeserta.add("For Whom The Bell Tolls - Metallica");
        listaParaIlhaDeserta.add("índios - Legião Urbana");
        System.out.println(listaParaIlhaDeserta); //imprime todas as músicas
        System.out.println(listaParaIlhaDeserta.size() + " Músicas"); //checa o tamanho da lista
        listaParaIlhaDeserta.remove(3); // remoção da música "Empire Ants - Gorillaz"
        System.out.println(listaParaIlhaDeserta.size() + " Músicas"); // checa novamente o tamanho da lista
        //troca de posição dos itens
        int muscA = 0; //variável recebe o número 0, que na lista corresponde a "Pantera"
        int muscB = 3; // variável recebe o número 3, que na lista corresponde a "Metallica"
        String temp = listaParaIlhaDeserta.get(muscA); // variavel que recebe a música diretamente
        listaParaIlhaDeserta.set(0, listaParaIlhaDeserta.get(muscB));  //substitui a música 0 (Pantera - Floods) para a música 3(For Whom The Bell Tolls - Metallica)
        listaParaIlhaDeserta.set(muscB, temp);  //substitui a música 3 ((For Whom The Bell Tolls - Metallica) para a música 0 (Pantera - Floods)
        System.out.println(listaParaIlhaDeserta); // imprime a ordem das músicas mostrando a ordem trocada
    }
}