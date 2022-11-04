package RepasoFicheros;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;


public class Ejercicio2FXpath {
    public static void main(String[] args) throws Exception{
        //Metemos las expresiones de XPath para buscar los 6 ejercicios
        String xPath1 = "/colegio/modulos/modulo/nombre/text()";
        String xPath2 = "/colegio/modulos/modulo[ciclo = 'DAM']/nombre";
        String xPath3 = "/colegio/modulos/modulo[curso='1']/nombre";
        String xPath4 = "/colegio/modulos/modulo[horasSemanales<='4']/nombre";
        String xPath5 = "/colegio/modulos/modulo[ciclo='DAM' and curso='2']/nombre";
        String xPath6 = "/colegio/modulos/modulo[horasSemanales>'3']/horasSemanales/text()";
        
        //A continuación cargamos el documento xml
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documento = builder.parse(new File("C:\\Users\\sergi\\OneDrive\\Escritorio\\TODO\\DAM\\2ºCURSO\\ACCESO A DATOS\\UD3\\REPASO_FICHEROS\\asignaturas.xml"));
        
        //Preparacion de XPath
        XPath xpath = XPathFactory.newInstance().newXPath();
        
        //Ahora vamos a hacer las consultas
        NodeList nodo= (NodeList) xpath.evaluate(xPath1, documento, XPathConstants.NODESET);
        System.out.println("************************************");
        System.out.println("Primer apartado:");
        System.out.println("************************************");
        for (int i=0; i<nodo.getLength(); i++){
            System.out.println(nodo.item(i).getNodeValue());
        }
        nodo = (NodeList) xpath.evaluate(xPath2, documento, XPathConstants.NODESET);
        System.out.println("************************************");
        System.out.println("Segundo apartado:");
        System.out.println("************************************");
        for (int i=0; i<nodo.getLength(); i++){
            System.out.println(nodo.item(i).getChildNodes().item(0).getNodeValue());
        }
        nodo = (NodeList) xpath.evaluate(xPath3, documento, XPathConstants.NODESET);
        System.out.println("************************************");
        System.out.println("Tercer apartado:");
        System.out.println("************************************");
        for (int i=0; i<nodo.getLength(); i++){
            System.out.println(nodo.item(i).getChildNodes().item(0).getNodeValue());
        }
        nodo = (NodeList) xpath.evaluate(xPath4, documento, XPathConstants.NODESET);
        System.out.println("************************************");
        System.out.println("Cuarto apartado:");
        System.out.println("************************************");
        for (int i=0; i<nodo.getLength(); i++){
            System.out.println(nodo.item(i).getChildNodes().item(0).getNodeValue());
        }
        nodo = (NodeList) xpath.evaluate(xPath5, documento, XPathConstants.NODESET);
        System.out.println("************************************");
        System.out.println("Quinto apartado:");
        System.out.println("************************************");
        for (int i=0; i<nodo.getLength(); i++){
            System.out.println(nodo.item(i).getChildNodes().item(0).getNodeValue());
        }
        nodo = (NodeList) xpath.evaluate(xPath6, documento, XPathConstants.NODESET);
        System.out.println("************************************");
        System.out.println("Sexto apartado:");
        System.out.println("************************************");
        for (int i=0; i<nodo.getLength(); i++){
            System.out.println(nodo.item(i).getNodeValue());
        }
        
        
    }
    
}
