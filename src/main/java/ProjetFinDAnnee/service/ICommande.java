package ProjetFinDAnnee.service;

import ProjetFinDAnnee.model.Commande;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ICommande extends Remote {
    public boolean addCommande(Commande commande) throws RemoteException;
    public boolean updateCommande(Commande commande) throws RemoteException;
    public List<Commande> listeCommande() throws RemoteException;
    public List<Commande> listeCommandeByIdClient(int id) throws RemoteException;
    public Commande getLastInsertCommande(int id) throws RemoteException;
    public int findLastId() throws RemoteException;
}
