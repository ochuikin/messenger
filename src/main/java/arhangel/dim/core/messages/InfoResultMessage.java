package arhangel.dim.core.messages;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by olegchuikin on 02/05/16.
 */
public class InfoResultMessage extends Message {

    private String name;

    private List<Long> chats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getChats() {
        return chats;
    }

    public void setChats(List<Long> chats) {
        this.chats = chats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        InfoResultMessage that = (InfoResultMessage) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return !(chats != null ? !chats.equals(that.chats) : that.chats != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (chats != null ? chats.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LoginMessage{" +
                "id='" + getId() + '\'' +
                "name='" + name + '\'' +
                "name='" + ((chats == null) ? "" : String.join(" ", chats
                .stream().map(String::valueOf).collect(Collectors.toList()))) + '\'' +
                '}';
    }

}