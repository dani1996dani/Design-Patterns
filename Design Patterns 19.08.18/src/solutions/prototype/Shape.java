package solutions.prototype;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public abstract class Shape{

    int id;
    String type;
    int area;



    public void loadShapeData(String shapeType) throws IOException {
        URL url = new URL("http://localhost:8088/Shape_API/ShapeServlet?type=" + shapeType);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setUseCaches(false);
        connection.setRequestMethod("GET");

        InputStream inputStream = connection.getInputStream();


        byte[] buffer = new byte[64];
        int actuallyRead = inputStream.read(buffer);
        String response = new String(buffer, 0, actuallyRead);
        shapeFromJSON(response);
    }


    protected JSONObject shapeToJSON() {
        JSONObject result = new JSONObject();
        try {
            result.put("id", id);
            result.put("type", type);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return result;

    }

    protected void shapeFromJSON(String jsonString) {
        try {
            JSONObject object = new JSONObject(jsonString);
            this.type = object.getString("type");
            this.id = object.getInt("id");
            this.area = object.getInt("area");

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}
