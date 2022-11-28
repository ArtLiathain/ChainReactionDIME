// generated by info.scce.dime.generator.rest.SelectiveControllerGenerator
package de.ls5.dywa.generated.rest.controller;

@javax.transaction.Transactional
@javax.enterprise.context.RequestScoped
public class BoardREST {

	@javax.inject.Inject
	private info.scce.dime.rest.ObjectCache objectCache;
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController DomainFileController;
	
	
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.BoardREST BoardREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.BoardController BoardController;
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.TileREST TileREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TileController TileController;

	public long create(final java.lang.String name) {
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board obj = this.BoardController.create(name);
		return obj.getDywaId();
	}

	
	public de.ls5.dywa.generated.rest.types.Board read_GameBoardBoardSelectivex1_Sw__HYPHEN_MINUS__VYWpvEe2h5bRrsXzQFA(final long id) {
		
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board obj = this.BoardController.read(id);
		
		if (obj == null) {
			return null;
		}

		de.ls5.dywa.generated.rest.types.Board result = objectCache.getRestTo(obj);
		
		if (result == null) {
			result = de.ls5.dywa.generated.rest.types.Board.fromDywaEntity(obj, objectCache);
		}
		
		if (!objectCache.containsSelective(result, "GameBoardBoardSelectivex1_Sw__HYPHEN_MINUS__VYWpvEe2h5bRrsXzQFA")) {
			de.ls5.dywa.generated.rest.types.GameBoardBoardSelectivex1_Sw__HYPHEN_MINUS__VYWpvEe2h5bRrsXzQFA.copy(obj, result, objectCache);
		}

		return result;
	}

	public de.ls5.dywa.generated.rest.types.Board readTransient_GameBoardBoardSelectivex1_Sw__HYPHEN_MINUS__VYWpvEe2h5bRrsXzQFA(final de.ls5.dywa.generated.rest.types.Board obj) {

		final de.ls5.dywa.generated.rest.types.Board result;
		
		if (this.objectCache.containsSelective(obj, "GameBoardBoardSelectivex1_Sw__HYPHEN_MINUS__VYWpvEe2h5bRrsXzQFA")) {
			return obj;
		}
		else {
			result = obj;
			this.objectCache.putSelective(obj, "GameBoardBoardSelectivex1_Sw__HYPHEN_MINUS__VYWpvEe2h5bRrsXzQFA");
		}

		// Update references to persistent objects

		return result;
	}

		public java.util.Set<de.ls5.dywa.generated.rest.types.Board> readAll_GameBoardBoardSelectivex1_Sw__HYPHEN_MINUS__VYWpvEe2h5bRrsXzQFA() {
			
			final java.util.Set<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board> objs =
			this.BoardController.fetch();
	
			final java.util.Set<de.ls5.dywa.generated.rest.types.Board> result = new java.util.HashSet<>();

			for (final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board s : objs) {
				de.ls5.dywa.generated.rest.types.Board cached = objectCache.getRestTo(s);
				
				if (cached == null) {
					cached = de.ls5.dywa.generated.rest.types.Board.fromDywaEntity(s, objectCache);
				}
				
				if (!objectCache.containsSelective(cached, "GameBoardBoardSelectivex1_Sw__HYPHEN_MINUS__VYWpvEe2h5bRrsXzQFA")) {
					de.ls5.dywa.generated.rest.types.GameBoardBoardSelectivex1_Sw__HYPHEN_MINUS__VYWpvEe2h5bRrsXzQFA.copy(s, cached, objectCache);
				}

				result.add(cached);
			}
			
			return result;
		}


	public void update_GameBoardBoardSelectivex1_Sw__HYPHEN_MINUS__VYWpvEe2h5bRrsXzQFA(final de.ls5.dywa.generated.rest.types.Board value) {

		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board obj = this.BoardController.read(value.getDywaId());
		
		this.update_GameBoardBoardSelectivex1_Sw__HYPHEN_MINUS__VYWpvEe2h5bRrsXzQFA(value, obj);
	}

	public void update_GameBoardBoardSelectivex1_Sw__HYPHEN_MINUS__VYWpvEe2h5bRrsXzQFA(final de.ls5.dywa.generated.rest.types.Board value, final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board obj) {

		// for updates, consider a special selective so we don't clash with read-operations
		if (this.objectCache.containsSelective(obj, "GameBoardBoardSelectivex1_Sw__HYPHEN_MINUS__VYWpvEe2h5bRrsXzQFA")) {
			// We are already getting updated by someone else
			return;
		}
		else {
			// we don't care for the actual value. key alone is sufficient enough for detection of cycles
			this.objectCache.putSelective(obj, "GameBoardBoardSelectivex1_Sw__HYPHEN_MINUS__VYWpvEe2h5bRrsXzQFA");
		}

		if (value.isDywaNameSet()) {
			obj.setDywaName(value.getDywaName());
		}

	}
	public void update_BoardSelective(final de.ls5.dywa.generated.rest.types.Board value) {

		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board obj = this.BoardController.read(value.getDywaId());
		
		this.update_BoardSelective(value, obj);
	}

	public void update_BoardSelective(final de.ls5.dywa.generated.rest.types.Board value, final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board obj) {

		// for updates, consider a special selective so we don't clash with read-operations
		if (this.objectCache.containsSelective(obj, "BoardSelective")) {
			// We are already getting updated by someone else
			return;
		}
		else {
			// we don't care for the actual value. key alone is sufficient enough for detection of cycles
			this.objectCache.putSelective(obj, "BoardSelective");
		}

		if (value.isDywaNameSet()) {
			obj.setDywaName(value.getDywaName());
		}

		{
			final de.ls5.dywa.generated.rest.types.Board effectiveValue = value;
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board effectiveObj = obj;

		// If values were not specified, ignore them
		if (effectiveValue.istile_TileSet()) {
			checkVersion(value, obj);
			final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Tile>
			 source = effectiveObj.gettile_Tile();
			final java.util.List<de.ls5.dywa.generated.rest.types.Tile>
			 actual = java.util.Optional.ofNullable(effectiveValue.gettile_Tile()).orElseGet(java.util.Collections::emptyList);
			
			source.clear();
			
			for (final de.ls5.dywa.generated.rest.types.Tile item : actual) {
				
				final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Tile entity;

				// create new
				if (item.getDywaId() == info.scce.dime.util.Constants.DYWA_ID_CREATE_NEW) {
					if (! (item instanceof de.ls5.dywa.generated.rest.types.Tile)) {
						throw new java.lang.IllegalArgumentException("Runtime type does not match model type");
					}
				
					final java.lang.String dywaName;
					if (item.getDywaName() == null || item.getDywaName().isEmpty()) {
						dywaName = "tile";
					} else {
						dywaName = item.getDywaName();
					}
				
					final long id = TileREST.create(dywaName);
					item.setDywaId(id);
				
					//update_TileSelective
					this.TileREST.update_TileSelective(item);
					entity = this.TileController.read(item.getDywaId());
				}
				// create transient
				else if (item.getDywaId() == info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					if (! (item instanceof de.ls5.dywa.generated.rest.types.Tile)) {
						throw new java.lang.IllegalArgumentException("Runtime type does not match model type");
					}
				
					entity = this.TileREST.copyToTransient(item);
				}
				// lookup regular object
				else {
					//update_TileSelective
					this.TileREST.update_TileSelective(item);
					entity = this.TileController.read(item.getDywaId());
				}

				if (entity != null) {
					source.add(entity);
				}
			}
		}
	}
	}

	public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board copyToTransient(final de.ls5.dywa.generated.rest.types.Board value) {

		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board obj;

		if (this.objectCache.containsTransient(value)) {
			return this.objectCache.getTransient(value);
		}
		else {
			final java.lang.String name;
			if (value.getDywaName() == null || value.getDywaName().isEmpty()) {
				name = "Board_transient";
			} else {
				name = value.getDywaName();
			}
			obj = BoardController.createTransient(name);
			this.objectCache.putTransient(value, obj);
		}

		if (value.isDywaNameSet()) {
			obj.setDywaName(value.getDywaName());
		}

			{
				final de.ls5.dywa.generated.rest.types.Board effectiveValue = value;
				final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board effectiveObj = obj;

			// If values were not specified, ignore them
			if (effectiveValue.istile_TileSet()) {
				checkVersion(value, obj);

				final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Tile>
				 source = effectiveObj.gettile_Tile();
				final java.util.List<de.ls5.dywa.generated.rest.types.Tile>
				 actual = java.util.Optional.ofNullable(effectiveValue.gettile_Tile()).orElseGet(java.util.Collections::emptyList);

				for (final de.ls5.dywa.generated.rest.types.Tile item : actual) {

					final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Tile entity;

					// create new
					if (item.getDywaId() == info.scce.dime.util.Constants.DYWA_ID_CREATE_NEW) {
						if (! (item instanceof de.ls5.dywa.generated.rest.types.Tile)) {
							throw new java.lang.IllegalArgumentException("Runtime type does not match model type");
						}
					
						final java.lang.String dywaName;
						if (item.getDywaName() == null || item.getDywaName().isEmpty()) {
							dywaName = "tile";
						} else {
							dywaName = item.getDywaName();
						}
					
						final long id = TileREST.create(dywaName);
						item.setDywaId(id);
					
						//update_TileSelective
						this.TileREST.update_TileSelective(item);
						entity = this.TileController.read(item.getDywaId());
					}
					// create transient
					else if (item.getDywaId() == info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
						if (! (item instanceof de.ls5.dywa.generated.rest.types.Tile)) {
							throw new java.lang.IllegalArgumentException("Runtime type does not match model type");
						}
					
						entity = this.TileREST.copyToTransient(item);
					}
					// lookup regular object
					else {
						//update_TileSelective
						this.TileREST.update_TileSelective(item);
						entity = this.TileController.read(item.getDywaId());
					}

					if (entity != null) {
						source.add(entity);
					}
				}
			}
		}

		return obj;
	}

	public void delete(final long id) {
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board obj = this.BoardController.read(id);
		this.BoardController.delete(obj);
	}

	private void checkVersion(final de.ls5.dywa.generated.rest.types.Board value, final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board obj) {
		if (value.isDywaVersionSet() && value.getDywaVersion() != obj.getDywaVersion()) {
			throw new javax.persistence.OptimisticLockException(obj.getDywaName() + '[' + obj.getDywaId() + "] has been updated by other transaction");
		}
	}
}