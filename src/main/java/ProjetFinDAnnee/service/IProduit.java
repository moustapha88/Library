package ProjetFinDAnnee.service;

import ProjetFinDAnnee.model.Produit;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IProduit extends Remote {
    public boolean addProduit(Produit produit) throws RemoteException;
    public boolean updateProduit(Produit produit) throws RemoteException;
    public List<Produit> listeProduit() throws RemoteException;
}
