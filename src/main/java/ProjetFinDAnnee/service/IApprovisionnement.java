package ProjetFinDAnnee.service;

import ProjetFinDAnnee.model.Approvisionnement;
import ProjetFinDAnnee.model.ProduitAppro;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IApprovisionnement extends Remote {
    public boolean addApprovisionnement(Approvisionnement a) throws RemoteException;
    public List<Approvisionnement> listeAppro() throws RemoteException;
    public int findLastId() throws RemoteException;
    public Approvisionnement getLastInsertAppro(int id) throws RemoteException;
}
