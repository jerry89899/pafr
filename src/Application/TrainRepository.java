package Application;

import Data.DatabaseConnection;
import Data.LocalDB;

public class TrainRepository implements TrainRepositoryInterface {

    // hier een array met alle treinen waar je de treinen in modified ?
    //hier geef je aan welke databaseconnection je wilt gebruiken zodat dat niet in de service hoeft aangegeven te worden



    DatabaseConnection dbc = new LocalDB();






}
