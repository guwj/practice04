package prob4;

public class SmartPhone extends MusicPhone {

	public void execute ( String function ) {
		if ( function.equals("음악") ) {
			downplayMusic();
			return;
		}else if ( function.equals("앱")){
			appExecute();
			return;
		}else {
			super.execute( function );
		}
	}
	
	public void downplayMusic(){
		System.out.println("다운로드 해서 음악 재생");
	}
	
	public void appExecute(){
		System.out.println("앱실행");
	}
	
}
