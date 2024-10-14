// import java.lang.reflect.Array;
import java.util.ArrayList;

class Town
{
    private String name;
    private ArrayList<Road> roads;

    public Town() 
    {
        name = "";
        roads = new ArrayList<Road>();
    }
    public Town(String name) 
    {
        this.name = name;
        roads = new ArrayList<Road>();
    }
    public Town(String name, ArrayList<Road> roads) 
    {
        this.name = name;
        this.roads = roads;
    }

    public String getName()
    {
        return name;
    }
    public ArrayList<Road> getRoads()
    {
        return roads;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setRoads(ArrayList<Road> roads)
    {
        this.roads = roads;
    }

    @Override
    public String toString()
    {
        String res = "";
        res += "Город: " + name + "\n";
        res += "Пути из города:\n";
        for (Road road : roads) {
            res += road + "\n";
        }
        return res;
    }
}