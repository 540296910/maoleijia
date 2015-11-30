package maolei.study.jackson;

public class Bean {
	private String name;
	private String title;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String toString(){
		return "name:"+name+",title:"+title;
	}
}
