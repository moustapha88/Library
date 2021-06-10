package ProjetFinDAnnee.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProdComKey implements Serializable {

    private static final long serialVersionUID = -2403746842148223177L;

    @Column(name = "produit_id")
    private int produitId;

    @Column(name = "commande_id")
    private int commandeId;

    public ProdComKey() {
    }

    public ProdComKey(int produitId, int commandeId) {
        this.produitId = produitId;
        this.commandeId = commandeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdComKey that = (ProdComKey) o;
        return Objects.equals(produitId, that.produitId) &&
                Objects.equals(commandeId, that.commandeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produitId, commandeId);
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public int getCommandeId() {
        return commandeId;
    }

    public void setCommandeId(int commandeId) {
        this.commandeId = commandeId;
    }
}
