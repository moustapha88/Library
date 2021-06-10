package ProjetFinDAnnee.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, unique = true)
    private String libelle;

    @Column(length = 4, unique = true)
    private String code;

    @Column(length = 100, unique = true)
    private String description;

    private float prixNormal;

    private float qteMinimal;

    private float qteStock;

    private float qteCritique;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @OneToMany(mappedBy = "produit")
    private List<ProduitCommande> produitCommande;

    @OneToMany(mappedBy = "produit")
    private List<ProduitAppro> produitAppros;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrixNormal() {
        return prixNormal;
    }

    public void setPrixNormal(float prixNormal) {
        this.prixNormal = prixNormal;
    }

    public float getQteMinimal() {
        return qteMinimal;
    }

    public void setQteMinimal(float qteMinimal) {
        this.qteMinimal = qteMinimal;
    }

    public float getQteCritique() {
        return qteCritique;
    }

    public void setQteCritique(float qteCritique) {
        this.qteCritique = qteCritique;
    }

    public float getQteStock() {
        return qteStock;
    }

    public void setQteStock(float qteStock) {
        this.qteStock = qteStock;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<ProduitCommande> getProduitCommande() {
        return produitCommande;
    }

    public void setProduitCommande(List<ProduitCommande> produitCommande) {
        this.produitCommande = produitCommande;
    }

    public List<ProduitAppro> getProduitAppros() {
        return produitAppros;
    }

    public void setProduitAppros(List<ProduitAppro> produitAppros) {
        this.produitAppros = produitAppros;
    }

    @Override
    public String toString() {
        return libelle  ;
    }
}
