package ProjetFinDAnnee.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Approvisionnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Temporal(TemporalType.DATE)
    private Date dateAppro;

    @OneToMany(mappedBy = "approvisionnement")
    private List<ProduitAppro> produitAppros;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Utilisateur  utilisateur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ProduitAppro> getProduitAppros() {
        return produitAppros;
    }

    public void setProduitAppros(List<ProduitAppro> produitAppros) {
        this.produitAppros = produitAppros;
    }

    public Date getDateAppro() {
        return dateAppro;
    }

    public void setDateAppro(Date dateAppro) {
        this.dateAppro = dateAppro;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
