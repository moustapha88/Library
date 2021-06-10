package ProjetFinDAnnee.service;

import ProjetFinDAnnee.model.Commande;
import ProjetFinDAnnee.model.Facture;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IFacture extends Remote {
    public boolean addFacture(Facture facture) throws RemoteException;
    public List<Facture> listeFacture() throws RemoteException;

}
