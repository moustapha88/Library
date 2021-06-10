package ProjetFinDAnnee.service;


import ProjetFinDAnnee.model.Categorie;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ICategorie extends Remote {
    public boolean addCategorie(Categorie categorie) throws RemoteException;
    public List<Categorie> listeCategorie() throws RemoteException;
    public Categorie findCategorieById(int id) throws RemoteException;
}
