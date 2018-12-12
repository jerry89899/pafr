package DataRepresentation;

public interface Pullable {

    Locomotive getPulledBy();

    void setPulledby(Pullable locomotiveId);

}
