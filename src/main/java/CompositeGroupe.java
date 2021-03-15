import java.util.ArrayList;

public class CompositeGroupe implements Groupe{
    // agregat
    private ArrayList<Groupe> childGroup = new ArrayList<Groupe>();

    @Override
    public void afficheGroupe() {
        for(Groupe groupe : this.childGroup) {
            groupe.afficheGroupe();
        }
    }

    public void add(Groupe groupe) {
        this.childGroup.add(groupe);
    }

    public void remove(Groupe groupe) {
        this.childGroup.remove(groupe);
    }
}
