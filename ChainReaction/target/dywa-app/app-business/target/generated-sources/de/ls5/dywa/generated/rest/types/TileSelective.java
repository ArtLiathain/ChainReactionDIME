// generated by SelectiveGenerator#generateFullSelective(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class TileSelective {

	public static void copy(
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Tile from,
		final de.ls5.dywa.generated.rest.types.Tile to,
		final info.scce.dime.rest.ObjectCache objectCache) {


		if (objectCache.containsSelective(to, "TileSelective")) {
			return;
		}

		to.setDywaId(from.getDywaId());

		// put to cache, after id has been set
		objectCache.putSelective(to, "TileSelective");

		// non-transient objects can be fetched completely from the DB
		if (from.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
			return;
		}

		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());

		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Tile effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Tile effectiveTo = to;
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board
		 source = effectiveFrom.getboard();
		if (source != null) {
			// original selective: BoardSelective
			de.ls5.dywa.generated.rest.types.Board cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.Board.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "BoardSelective")) {
				de.ls5.dywa.generated.rest.types.BoardSelective.copy(source, cached, objectCache);
			}
		
			effectiveTo.setboard(cached);
		}
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Tile effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Tile effectiveTo = to;
		effectiveTo.setx(effectiveFrom.getx());
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Tile effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Tile effectiveTo = to;
		effectiveTo.sety(effectiveFrom.gety());
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Tile effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Tile effectiveTo = to;
		effectiveTo.setcolour(effectiveFrom.getcolour());
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Tile effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Tile effectiveTo = to;
		effectiveTo.setpopulation(effectiveFrom.getpopulation());
		}
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Tile effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Tile effectiveTo = to;
		effectiveTo.setcapacity(effectiveFrom.getcapacity());
		}
	}
}
