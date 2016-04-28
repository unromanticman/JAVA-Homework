package API;


public class Theater {
	
	/**
	* 戲院訂位，'X'代表空位，'Y'代表已定
	* 座標採數學座標系
	* 
	**/
	
	
	private char [][] seat;
	
	private boolean isInit = false;
	
	public Theater(){
		
	}
	public Theater(int rows,int cols){
		initSeat(rows,cols);
	}
	
	/**
	*  初始化座位 
	**/
	public void initSeat(int rows, int cols) {
		
		//如果維度小於0則回傳訂位失敗
		if(isPointLessThanZero(rows,cols)){
			System.out.println("座位初始化失敗");
			return;
		}
		seat = new char[rows][cols];
		
		//初始化未訂位之座位為0
	
		for(int i=0;i<rows;i++){
			java.util.Arrays.fill(seat[i],'X');
		}
		
		//已初始化
		isInit = true;
	}
	
	/**
	* 顯示座位圖表 
	**/
	public void showSeat() {
		if(!isInit){
			System.out.println("座位未初始化");
		}
		else{
			
			for(int i=0;i<seat.length;i++){
				for(int j=0;j<seat[i].length;j++){
					System.out.print(seat[i][j]+" ");
				}
				System.out.print('\n');
			}
		}
		
		
	}
	
	/**
	*  連續訂位 
	**/
	public int bookSeat(int numOfTicket) {
		
		int status = 0;
		
		//檢查座位是否已初始化 未初始化回傳訂位失敗
		if(!isInit){
			return status;
		}
		//先確認 訂位失敗 假如連續票數大於cols的長度即回傳 0
		if (seat[0].length < numOfTicket){
			return status;
		}
		
		try{
			for(int i=0;i<seat.length;i++){
				for(int j=0 ; j<=seat[i].length - numOfTicket;j++){
					
					//確認連續座位Flag
					boolean isSeat = false;
					
					for(int k=0;k<numOfTicket;k++){
						//確認該列只要一個有訂位即設定為有訂位
						if(seat[i][j+k] == 'Y'){
							isSeat = true;
							break;
						}
					}
					
					if(!isSeat){
						for(int k=0;k<numOfTicket;k++){
							//成功訂位
							seat[i][j+k] = 'Y';
							status = 1;
						}
						return status;
					}
				}
			}
			//假如都沒訂到位表示位子已滿
			status = -1;
		}
		catch(Exception e){
			//訂位失敗
			status = 0;
		}

		return status;
    }
	
	/**
	*  單獨訂位 
	**/
	public int bookSeat(int x, int y) {

		int status = 0;
		
		//檢查座位是否已初始化 未初始化回傳訂位失敗
		if(!isInit){
			return status;
		}
		
		//如果座標小於0則回傳訂位失敗
		if(isPointLessThanZero(x,y)){
			return status;
		}
		
		//先確認 訂位失敗 假如連續票數大於cols的長度即回傳 0
		if (seat.length -1 < y || seat[0].length - 1 < x){
			return status;
		}
		
		try{
			if(seat[y][x] == 'X'){
				//訂位成功
				seat[y][x] = 'Y';
				status = 1;
			}
			else{
				//座位已滿
				status = -1;
			}
		}
		catch(Exception e){
			//訂位失敗
			status = 0;
		}

		return status;
	}
	
	/**
	*  區塊訂位 
	**/
	public int bookSeat(int x1, int y1, int x2, int y2) {
	
		int status = 0;
		
		//檢查座位是否已初始化 未初始化回傳訂位失敗
		if(!isInit){
			return status;
		}
		
		//如果座標小於0則回傳訂位失敗
		if(isPointLessThanZero(x1,y1) ||
		   isPointLessThanZero(x2,y2) ){
			return status;
		}
		
		//修正座標開頭與結尾，假如填入座標順序相反
		if( y2<y1 ||
		   (y2 == y1 && x1 > x2)
		 ){
			int temp = x1;
			x1 = x2;
			x2 = temp;
			
			temp = y1;
			y1 = y2;
			y2 =temp;
		}
		
		
		//檢查陣列維度
		if(	seat[0].length - 1  < x1 ||  
			seat[0].length - 1  < x2 ||
			seat.length - 1 < y1 ||
			seat.length - 1 <y2 ){
			return status;
		}
		
		
		//確認連續座位Flag
		boolean isSeat = false;
		
		try{
			//檢查前端
			int end =  (y1 == y2) ? x2 : seat.length; //設定x軸結尾
			
			for(int i=x1;i< end ;i++){
				if(seat[y1][i] == 'Y'){
					isSeat = true;
				}
			}
			//檢查中間
			for(int i=y1+1;i<y2;i++){
				for(int j=0;j<seat[i].length;j++){
					if(seat[i][j] == 'Y'){
						isSeat = true;
					}
				}
			}
			//檢查末端
			int start =  (y1 == y2) ? x1 : 0; //設定x軸起始
			for(int i= start ;i<=x2;i++){
				if(seat[y2][i] == 'Y'){
					isSeat = true;
				}
			}
			
			if(isSeat){
				//座位已滿
				status = -1;
			}
			else{
				//訂位前端
				end =  (y1 == y2) ? x2 : seat.length; //設定x軸結尾
				for(int i=x1;i<end;i++){
					seat[y1][i] = 'Y';
				}
				//訂位中間
				for(int i=y1+1;i<y2;i++){
					for(int j=0;j<seat[i].length;j++){
						seat[i][j] = 'Y';
					}
				}
				//訂位末端
				start =  (y1 == y2) ? x1 : 0; //設定x軸起始
				for(int i=start;i<=x2;i++){
					seat[y2][i] = 'Y';
				}
				//訂位成功
				status = 1;
			}
		}
		catch(Exception e ){
			//訂位失敗
			status = 0;
		}
		
		return status;
	}
	/**
	*  檢驗座標是否小於 0 
	**/
	private boolean isPointLessThanZero(int x,int y){
		return x < 0 || y < 0 ?  true : false; 
	}
}
