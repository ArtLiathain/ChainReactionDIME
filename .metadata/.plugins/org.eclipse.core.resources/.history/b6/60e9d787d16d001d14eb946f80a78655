package info.scce.dime.process.dime__HYPHEN_MINUS__models.basic;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Date;
import java.util.UUID;
import java.util.Optional;

import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import info.scce.dime.exception.GUIEncounteredSignal;
import info.scce.dime.exception.GUIEncounteredSignal.GUIInfo;
import info.scce.dime.process.CallFrame;
import info.scce.dime.process.DIMEProcess;
import info.scce.dime.process.DIMEProcessContext;
import info.scce.dime.process.JSONContext;
import info.scce.dime.process.ProcessCallFrame;
import info.scce.dime.util.CDIUtil;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@info.scce.dime.process.RequiresDI
public final class CreateTile_tZaLgW2vEe20BPbKhZTxXg implements DIMEProcess {


	// attributes shaping the context variables.
	public static class Context implements DIMEProcessContext {

		// bean manager
		private BeanManager beanManager;
		
		// current eventID
		private String eventId;
		
		// last MajorSIBId
		private String lastMajorSIBId;
		
		// current MajorGUI
		private GUIInfo majorGUIState = null;

		// stack variables
		private ProcessCallFrame callStack = new ProcessCallFrame();

		// direct dataflow variables.
		private java.lang.Long startX_zH8boW2vEe20BPbKhZTxXg;
		private java.lang.Long startY_zYxs8W2vEe20BPbKhZTxXg;
		private java.lang.Long startCapacity_z834gW2vEe20BPbKhZTxXg;
		private java.lang.Long startPopulation_gOKbwW27Ee2wdtdHmSs5yA;
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board startBoard_oGQi8W3HEe2wdtdHmSs5yA;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_tZdO0W2vEe20BPbKhZTxXg,
	_u7b__HYPHEN_MINUS__8W2vEe20BPbKhZTxXg,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TileController TileController;

	@Inject
	public CreateTile_tZaLgW2vEe20BPbKhZTxXg(final BeanManager beanManager, de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TileController TileController) {
		this.beanManager = beanManager;
		this.TileController = TileController;
	}

	private Context createContext(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board board, java.lang.Long capacity, java.lang.Long population, java.lang.Long x, java.lang.Long y) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startX_zH8boW2vEe20BPbKhZTxXg = x;
		ctx.startY_zYxs8W2vEe20BPbKhZTxXg = y;
		ctx.startCapacity_z834gW2vEe20BPbKhZTxXg = capacity;
		ctx.startPopulation_gOKbwW27Ee2wdtdHmSs5yA = population;
		ctx.startBoard_oGQi8W3HEe2wdtdHmSs5yA = board;
		
		return ctx;
	}

	public CreateTile_tZaLgW2vEe20BPbKhZTxXgResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board board, java.lang.Long capacity, java.lang.Long population, java.lang.Long x, java.lang.Long y) {
		final Context ctx = createContext(board, capacity, population, x, y);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._u7b__HYPHEN_MINUS__8W2vEe20BPbKhZTxXg);
	}
	
	

	@Override
	public CreateTile_tZaLgW2vEe20BPbKhZTxXgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private CreateTile_tZaLgW2vEe20BPbKhZTxXgResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _tZdO0W2vEe20BPbKhZTxXg: {
					return execute_tZdO0W2vEe20BPbKhZTxXg(ctx);
				}
				case _u7b__HYPHEN_MINUS__8W2vEe20BPbKhZTxXg: {
					curr = execute_u7b__HYPHEN_MINUS__8W2vEe20BPbKhZTxXg(ctx);
					break;
				}
				default: {
					throw new IllegalStateException("unhandled SIB container " + curr);
				}
			}
		}
	}
	
	/**
	 * The return type for this process. It stores the corresponding branch name 
	 * as well as the corresponding result for the branch.
	 */
	public static class CreateTile_tZaLgW2vEe20BPbKhZTxXgResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public CreateTile_tZaLgW2vEe20BPbKhZTxXgResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_tZdO0W2vEe20BPbKhZTxXg";
			this.success = success;
		}
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		
		public SuccessReturn getSuccessReturn() {
			return success;
		}

	}
	
	// model branches.
		/**
		 * Interface definition for return type of branch <code>success</code>.
		 */
		public interface SuccessReturn {
		}
	
		/**
		 * Return type of branch <code>success</code> accessing the 
		 * corresponding values in the process context, instead of storing
		 * the values locally.
		 */
		static class SuccessReturnImpl implements SuccessReturn {

			private final Context ctx;

	        SuccessReturnImpl(Context ctx) {
	            this.ctx = ctx;
	        }

		}
		


	// sibs
	// container for graph i/o 'success'.
	public CreateTile_tZaLgW2vEe20BPbKhZTxXgResult execute_tZdO0W2vEe20BPbKhZTxXg(final Context ctx) {
		return new CreateTile_tZaLgW2vEe20BPbKhZTxXgResult(new SuccessReturnImpl(ctx));
	}
	// container for create SIB 'Create Tile'.
	public SIB_ID execute_u7b__HYPHEN_MINUS__8W2vEe20BPbKhZTxXg(final Context ctx) {
		final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TileController domController = this.TileController;
	
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Tile createdObj = domController.create();
	
		createdObj.setx(ctx.startX_zH8boW2vEe20BPbKhZTxXg);
		createdObj.sety(ctx.startY_zYxs8W2vEe20BPbKhZTxXg);
		createdObj.setcapacity(ctx.startCapacity_z834gW2vEe20BPbKhZTxXg);
		createdObj.setpopulation(ctx.startPopulation_gOKbwW27Ee2wdtdHmSs5yA);
		createdObj.setboard(ctx.startBoard_oGQi8W3HEe2wdtdHmSs5yA);
	
	
		// branch 'success'
		return SIB_ID._tZdO0W2vEe20BPbKhZTxXg;
	}
	
}  
