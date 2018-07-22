package soft.mbh.com.JaxbExample;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import soft.mbh.com.JaxbExample.model.PersonneDTO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   	 try {

 		File file = new File("C:\\file.xml");
 		JAXBContext jaxbContext = JAXBContext.newInstance(PersonneDTO.class);

 		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
 		PersonneDTO personne = (PersonneDTO) jaxbUnmarshaller.unmarshal(file);
 		System.out.println(personne.getNom());

 	  } catch (JAXBException e) {
 		e.printStackTrace();
 	  }

 	}

    }

