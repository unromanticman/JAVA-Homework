package regularUpdate;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.DB;  
import com.mongodb.DBCollection;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.mongodb.BasicDBObject;  
import com.mongodb.DBCursor;
import com.mongodb.DBObject;  
  
public class Source extends Thread{
	
	static String collName = "visca"+"2016-05-09";
	
	public void run() { 

			//先檢查是否有該collect 假如沒有就創建
			try {
				Mongo m = new Mongo();
				DB db = m.getDB( "viscaResult" );
				DBCollection coll = db.getCollection(collName);
				try{
					BasicDBObject query = new BasicDBObject();
					DBCursor cursor = coll.find(query);
					if(cursor.size() == 0){
						db.createCollection(collName, null);
						BasicDBObject doc = new BasicDBObject();
						doc.put("INITIZE","INITIZE");
						doc.put("date", new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
						coll.insert(doc);
					}
					
				}
				catch(Exception e){
				}
				
			} catch (Exception e){
				
			}  
			
			
			int value = 0;
			//計算資料
			try {
				Mongo m = new Mongo();
				DB db = m.getDB( "visca" );
				DBCollection coll = db.getCollection("tincan");
				BasicDBObject query = new BasicDBObject();
				System.out.println("query:" + query);
				DBCursor cursor = coll.find(query);
				value = cursor.size();
			} catch (Exception e){
				
			}  
			
			//加入到結果DB
			try {
				Mongo m = new Mongo();
				DB db = m.getDB( "viscaResult" );
				DBCollection coll = db.getCollection(collName);
				BasicDBObject query = new BasicDBObject();
				BasicDBObject doc = new BasicDBObject();
				doc.put("name","documentSUM");
				doc.put("value",value);
				doc.put("date", new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
				System.out.println("query:" + doc);
				coll.insert(doc);
				} catch (UnknownHostException e) {
					
				}
			catch (MongoException e) {
			}  
			
			//停止
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			} 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Source().start(); 
		//這邊是網頁裡面取得資料
		//計算資料
		
	}

}
