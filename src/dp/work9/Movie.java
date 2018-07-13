package work9;

class Movie {
	private static Movie s = null;
	private Movie(){}
	public static Movie getInstance(Boolean isSee){
		if(isSee){
			if( s == null){
				synchronized(Movie.class){
					if( s == null ){
						s = new Movie();
					}
				}
			}
		}
		return s;
	}
}