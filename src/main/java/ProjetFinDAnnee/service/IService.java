package ProjetFinDAnnee.service;

import ProjetFinDAnnee.model.Service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IService extends Remote {
    public boolean addService(Service service) throws RemoteException;
    public List<Service> listeService() throws RemoteException;
    public Service findServiceById(int id) throws RemoteException;
}
