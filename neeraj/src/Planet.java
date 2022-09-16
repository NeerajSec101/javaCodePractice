import java.util.LinkedList;

public class Planet {
    private int nM;
    private String name;

    public void setnM(int nM) {
        this.nM = nM;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Planet(int nM, String name)throws Exception{
        this.nM = nM;
        this.name = name;
    }

    public LinkedList findPlanetsWithLessMoons(LinkedList planets){
        boolean planetWasRemoved = false;
        for (java.util.Iterator it = planets.iterator(); it.hasNext();){
            Planet otherPlanet = (Planet) it.next();
            if(otherPlanet.getNumberOfMoons()>=nM){
                it.remove();
                planetWasRemoved = true;
            }
        }

        switch (String.valueOf(planetWasRemoved)){
            case "ture":
                System.out.println(new String("Planet were removed"));
                break;
            case "false":
                System.out.println(new String("no planets were removed"));
                break;
            default:
                System.out.println(new String("Shouldn't happen"));
        }
        return planets;
    }

    public int getNumberOfMoons(){
        return nM;
    }
    public String getNames(){
        return name;
    }
}
