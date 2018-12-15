package DataRepresentation;

public class RollingComponentFactory {

    public static RollingComponent BuildRC(RollingComponentType type, String id, int seats){
        RollingComponent rc = null;
        switch (type){
            case FirstClassWagon:
                rc = new FirstClassWagon(id,seats);
                break;

            case SecondClassWagon:
                rc = new SecondClassWagon(id,seats);
                break;

            case CargoWagon:
                rc = new SecondClassWagon(id,seats);
                break;

            case Locomotive:
                rc = new Locomotive(id,seats);
                break;

        }
        return rc;
    }
    public static RollingComponent BuildRC(RollingComponentType type, String id){
        RollingComponent rc = null;
        switch (type){
            case FirstClassWagon:
                rc = new FirstClassWagon(id);
                break;

            case SecondClassWagon:
                rc = new SecondClassWagon(id);
                break;

            case CargoWagon:
                rc = new SecondClassWagon(id);
                break;

            case Locomotive:
                rc = new Locomotive(id);
                break;

        }
        return rc;
    }


}
