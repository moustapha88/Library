package ProjetFinDAnnee.service;

import ProjetFinDAnnee.model.Commande;
import ProjetFinDAnnee.model.ProduitAppro;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IProduitAppro extends Remote {
    public boolean addProduitAppro(ProduitAppro produitAppro) throws RemoteException;
    public List<ProduitAppro> listeProditAppro() throws RemoteException;
}
