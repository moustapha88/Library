package ProjetFinDAnnee.service;

import ProjetFinDAnnee.model.Payement;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IPayement extends Remote {
    public boolean addPayement(Payement payement) throws RemoteException;
    public List<Payement> listePayement() throws RemoteException;
}
