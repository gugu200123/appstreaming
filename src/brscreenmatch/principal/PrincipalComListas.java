package brscreenmatch.principal;

import brscreenmatch.modelos.Filme;
import brscreenmatch.modelos.Serie;
import brscreenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2023);
        Filme reiLeao = new Filme("Rei Leão",1994);
        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(reiLeao);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for(Titulo item:lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

    }
}
