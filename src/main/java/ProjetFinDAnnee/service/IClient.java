package ProjetFinDAnnee.service;

import ProjetFinDAnnee.model.Client;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IClient extends Remote {
    public boolean addClient(Client client) throws RemoteException;
    public List<Client> listeClient() throws RemoteException;
    public Client getClient(String nom, String password) throws RemoteException;
    public Client getClientById(int id) throws RemoteException;
    public int getnbCommandeByIdClient(int id) throws RemoteException;
}
