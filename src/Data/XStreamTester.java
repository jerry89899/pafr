package Data;
        import java.io.*;
        import java.nio.charset.StandardCharsets;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.ArrayList;
        import javax.xml.transform.OutputKeys;
        import javax.xml.transform.Source;
        import javax.xml.transform.Transformer;
        import javax.xml.transform.sax.SAXSource;
        import javax.xml.transform.sax.SAXTransformerFactory;
        import javax.xml.transform.stream.StreamResult;

        import Application.TrainService;
        import DataRepresentation.Locomotive;
        import DataRepresentation.RollingComponentType;
        import DataRepresentation.SecondClassWagon;
        import DataRepresentation.Train;
        import org.xml.sax.InputSource;
        import com.thoughtworks.xstream.XStream;
        import com.thoughtworks.xstream.io.xml.StaxDriver;

public class XStreamTester {

    public void SaveToXml(Train train) {
        XStreamTester tester = new XStreamTester();
        XStream xstream = new XStream(new StaxDriver());
        //Object to XML Conversion

        try (PrintWriter out = new PrintWriter("C:\\Users\\guyli\\OneDrive\\Documenten\\SCHOOL\\PAFR\\OOAD\\src\\Data\\Locomotives.xml")) {
            String xml = xstream.toXML(train.getLocomotive());
            out.println((formatXml(xml)));

    } catch (IOException ex) {
        System.err.println("file not found");
    }
            try (PrintWriter outt = new PrintWriter("C:\\Users\\guyli\\OneDrive\\Documenten\\SCHOOL\\PAFR\\OOAD\\src\\Data\\Wagons.xml")) {
                String xmll = xstream.toXML(train.getRollingComponents());
                outt.println((formatXml(xmll)));
        } catch (IOException ex) {
            System.err.println("file not found");
        }
    }

        public void XmlToObject() throws IOException{
        XStream xstream = new XStream(new StaxDriver());
        //XML to Object Conversion
            byte[] encoded = Files.readAllBytes(Paths.get("C:\\Users\\guyli\\OneDrive\\Documenten\\SCHOOL\\PAFR\\OOAD\\src\\Data\\Locomotives.xml"));
            String xml =  new String(encoded, StandardCharsets.UTF_8 );

            //XML to Object Conversion

            Locomotive locomotive = (Locomotive) xstream.fromXML(xml);

            byte[] encod = Files.readAllBytes(Paths.get("C:\\Users\\guyli\\OneDrive\\Documenten\\SCHOOL\\PAFR\\OOAD\\src\\Data\\Wagons.xml"));
            String wg =  new String(encod, StandardCharsets.UTF_8 );

            //XML to Object Conversion

            SecondClassWagon wagon = (SecondClassWagon) xstream.fromXML(wg);

            new Train("savedtrain", locomotive);

    }

    public static String formatXml(String xml){
        try{
            Transformer serializer=
                    SAXTransformerFactory.newInstance().newTransformer();
            serializer.setOutputProperty(OutputKeys.INDENT, "yes");


            serializer.setOutputProperty("{http://xml.apache.org/xslt}indentamount", "2");
            Source xmlSource=new SAXSource(new InputSource(new
                    ByteArrayInputStream(xml.getBytes())));
            StreamResult res = new StreamResult(new
                    ByteArrayOutputStream());
            serializer.transform(xmlSource, res);
            return new String
                    (((ByteArrayOutputStream)res.getOutputStream()).toByteArray());
        } catch(Exception e){
            return xml;
        }
    }
    private ArrayList<Train> getTrain(){
        TrainService ts = new TrainService();
        ts.newRollingComponent(RollingComponentType.Locomotive, "Loc1",0);
        ts.newRollingComponent(RollingComponentType.FirstClassWagon, "First1",10);
        ts.newRollingComponent(RollingComponentType.SecondClassWagon,"Second1");
        System.out.println(ts.getRollingComponents());
        ts.newTrain(ts.getRollingComponents().get(0), "test1");
        ts.getTrains().get(0).addWagon(ts.getRollingComponents().get(2));
        ArrayList<Train> trains = ts.getTrains();

        return trains;
    }
}


