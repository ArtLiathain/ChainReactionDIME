package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Tile extends info.scce.dime.rest.RESTBaseType  {

	Board
	 getboard();
	boolean isboardSet();

	void setboard(final Board
	 board);
	java.lang.Long
	 getx();
	boolean isxSet();

	void setx(final java.lang.Long
	 x);
	java.lang.Long
	 gety();
	boolean isySet();

	void sety(final java.lang.Long
	 y);
	java.lang.Long
	 getcolour();
	boolean iscolourSet();

	void setcolour(final java.lang.Long
	 colour);
	java.lang.Long
	 getpopulation();
	boolean ispopulationSet();

	void setpopulation(final java.lang.Long
	 population);
	java.lang.Long
	 getcapacity();
	boolean iscapacitySet();

	void setcapacity(final java.lang.Long
	 capacity);

	public static Tile fromDywaEntity(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Tile entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Tile result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Tile) {
			result = new de.ls5.dywa.generated.rest.types.TileImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
