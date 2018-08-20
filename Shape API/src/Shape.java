import java.util.Random;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class Shape {

	int id;
	String type;
	int area;

	public Shape() {
		Random random = new Random();
		area = 5 + random.nextInt(100);
	}

	public JSONObject shapeToJSON() {
		JSONObject result = new JSONObject();
		try {
			result.put("id", id);
			result.put("type", type);
			result.put("area", area);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return result;

	}

}
