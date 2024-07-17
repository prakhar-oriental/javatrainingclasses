package Inheritance;

public class Planning {
   public String duration;
   public String designPattern;
   public int noresource;
public Planning(String duration, String designPattern, int noresource) {
	super();
	this.duration = duration;
	this.designPattern = designPattern;
	this.noresource = noresource;
}
public void idea()
{
	
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public String getDesignPattern() {
	return designPattern;
}
public void setDesignPattern(String designPattern) {
	this.designPattern = designPattern;
}
public int getNoresource() {
	return noresource;
}
public void setNoresource(int noresource) {
	this.noresource = noresource;
}
   
}
