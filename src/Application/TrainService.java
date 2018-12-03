package Application;

import DataRepresentation.TrainFactory;

public class TrainService implements TrainRepositoryInterface, TrainServiceInterface {

    public TrainFactory train;
    public TrainRepositoryInterface trainRepo;
}
