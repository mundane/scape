package eu.scape_project.pit.tools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType( XmlAccessType.FIELD )
public class PathwaySpec {

	@XmlAttribute
	String in;
	
	@XmlAttribute
	String out;
	
}