package maolei.study.jackson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BeanJson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		jsonToBean(mapToJson());
	}
	public static final void jsonToBean(String json) throws JsonParseException, JsonMappingException, IOException{
//		String json = "{\"name\":\"morry\",\"title\":\"title\"}";
		ObjectMapper  m = new ObjectMapper();  
		Bean bean = m.readValue(json, Bean.class); 
		System.out.println(bean);
	}
	public static final String mapToJson() throws JsonProcessingException{
		Map<String, Object> map = new HashMap<String,Object>();  
        map.put("name","morry");  
        map.put("title", "ClassName");  
        ObjectMapper  mapper = new ObjectMapper();  
        String jsonfromMap =  mapper.writeValueAsString(map);  
        System.out.println(jsonfromMap); 
        return jsonfromMap;
	}

}
