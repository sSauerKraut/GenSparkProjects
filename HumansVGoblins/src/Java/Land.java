import java.util.HashMap;

public class Land {

    public Character owner;
    public Integer gridSpace;

    public void setOwner(Character x) {
        this.owner = x;
    }

    public Character getOwner() {
        return this.owner;
    }

    public void setGridSpace(Integer x) {
        this.gridSpace = x;
    }

    public Integer getGridSpace() {
        return this.gridSpace;
    }

    public Land(Integer x) {
        this.owner = 'U';
        this.gridSpace = x;
    }

}
