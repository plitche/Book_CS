package ch1.design_parttern.observer_pattern;

public interface Subject {

    public void register(Observer obj);
    public void unregister(Object obj);
    public void notifyObservers();
    public Object getUpdate(Observer obj);

}
