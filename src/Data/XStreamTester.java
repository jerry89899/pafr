package Data;
        import java.io.*;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.util.ArrayList;
        import javax.xml.transform.OutputKeys;
        import javax.xml.transform.Source;
        import javax.xml.transform.Transformer;
        import javax.xml.transform.sax.SAXSource;
        import javax.xml.transform.sax.SAXTransformerFactory;
        import javax.xml.transform.stream.StreamResult;

        import Application.TrainService;
        import DataRepresentation.RollingComponentType;
        import DataRepresentation.Train;
        import org.xml.sax.InputSource;
        import com.thoughtworks.xstream.XStream;
        import com.thoughtworks.xstream.io.xml.StaxDriver;

public class XStreamTester {

    public void SaveToXml(ArrayList<Train> train) {
        XStreamTester tester = new XStreamTester();
        XStream xstream = new XStream(new StaxDriver());
        //Object to XML Conversion

        try (PrintWriter out = new PrintWriter("Data/XStream.xml")) {
            String xml = xstream.toXML(train);
            out.println((formatXml(xml)));
        } catch (IOException ex) {
            System.err.println("file not found");
        }
    }

        public void XmlToObject() throws IOException{
        XStream xstream = new XStream(new StaxDriver());
        //XML to Object Conversion
            String sCurrentLine;
            StringBuilder sb = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader("Data/XStream.xml"))){

                while ((sCurrentLine = br.readLine()) != null) {
                    sb.append(sCurrentLine);
                }

            }

        Train train = (Train)xstream.fromXML(sb.toString());
        System.out.println(train);
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
        ts.NewRollingComponent(RollingComponentType.Locomotive, "Loc1",0);
        ts.NewRollingComponent(RollingComponentType.FirstClassWagon, "First1",10);
        ts.NewRollingComponent(RollingComponentType.SecondClassWagon,"Second1");
        System.out.println(ts.getRollingComponents());
        ts.NewTrain(ts.getRollingComponents().get(0), "test1");
        ts.getTrains().get(0).addWagon(ts.getRollingComponents().get(2));
        ArrayList<Train> trains = ts.getTrains();

        return trains;
    }
}


