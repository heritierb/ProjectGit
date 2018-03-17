package ProjectGit;

public class ProjectGit {
	
	private String gitFromScratch;
	
	public static void main(String[] args) {
		System.out.println("Hello");
	}
	
	public ProjectGit(String parameter) {
		this.gitFromScratch = parameter;
	}
	
	public String returnTheString(){
		return this.gitFromScratch;
	}
	
}
