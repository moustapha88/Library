package ProjetFinDAnnee.service;

import ProjetFinDAnnee.model.ProduitCommande;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IProduitCommande extends Remote {
    public boolean addIProduitCommande(ProduitCommande p) throws RemoteException;
    public List<ProduitCommande> listeIProduitCommande() throws RemoteException;
    public List<ProduitCommande> getProduitCommandeByIdCommande(int id) throws RemoteException;
}
