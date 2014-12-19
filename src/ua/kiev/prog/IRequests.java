package ua.kiev.prog;

/**
 * Created by Владимир on 19.12.2014.
 */
public interface IRequests {
    public void getByDistrict(String district);
    public void getByAddress(String address);
    public void getBySquare(double square);
    public void getByRoom(int rooms);
    public void getByPrice(double price);
}
