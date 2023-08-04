package Event.publisher;

import Event.Listener.Listener;

import java.util.List;

public interface Publisher {
    void add(Listener listener);
    void remove(Listener listener);
    void notify(List<Listener> listeners);
}
