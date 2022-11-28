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
public final class CreateBoard_JZdn0W2uEe20BPbKhZTxXg implements DIMEProcess {


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
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_Zl2E8W2wEe20BPbKhZTxXg,
	_MrXrMG2zEe20BPbKhZTxXg,
	_R6bxEW2zEe20BPbKhZTxXg,
	_R6jF3W2zEe20BPbKhZTxXg,
	_UAp2sW2zEe20BPbKhZTxXg,
	_UAyZnG2zEe20BPbKhZTxXg,
	_uQAfgW2zEe20BPbKhZTxXg,
	_uQC7wW2zEe20BPbKhZTxXg,
	_uPwA2W2zEe20BPbKhZTxXg,
	_uQJpcW2zEe20BPbKhZTxXg,
	_uQNT1W2zEe20BPbKhZTxXg,
	_uQF_F22zEe20BPbKhZTxXg,
	_oNz3EW20Ee20BPbKhZTxXg,
	_oN1FMW20Ee20BPbKhZTxXg,
	_oN4IiW20Ee20BPbKhZTxXg,
	_oN6kx220Ee20BPbKhZTxXg,
	_oN9BA220Ee20BPbKhZTxXg,
	_oN7y4W20Ee20BPbKhZTxXg,
	_DQgoYW21Ee20BPbKhZTxXg,
	_DQhPgG21Ee20BPbKhZTxXg,
	_DQidkW21Ee20BPbKhZTxXg,
	_DQidr221Ee20BPbKhZTxXg,
	_Kx7ycW21Ee20BPbKhZTxXg,
	_Kx__HYPHEN_MINUS__OxG21Ee20BPbKhZTxXg,
	_KyEVUW21Ee20BPbKhZTxXg,
	_KyE8YW21Ee20BPbKhZTxXg,
	_O3LJgW21Ee20BPbKhZTxXg,
	_O3Oz4W21Ee20BPbKhZTxXg,
	_O3Pa9G21Ee20BPbKhZTxXg,
	_O3QCBm21Ee20BPbKhZTxXg,
	_U_GKAW21Ee20BPbKhZTxXg,
	_2zM2UW24Ee2wdtdHmSs5yA,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.BoardController BoardController;

	@Inject
	public CreateBoard_JZdn0W2uEe20BPbKhZTxXg(final BeanManager beanManager, de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.BoardController BoardController) {
		this.beanManager = beanManager;
		this.BoardController = BoardController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public CreateBoard_JZdn0W2uEe20BPbKhZTxXgResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._2zM2UW24Ee2wdtdHmSs5yA);
	}
	
	

	@Override
	public CreateBoard_JZdn0W2uEe20BPbKhZTxXgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private CreateBoard_JZdn0W2uEe20BPbKhZTxXgResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _Zl2E8W2wEe20BPbKhZTxXg: {
					curr = execute_Zl2E8W2wEe20BPbKhZTxXg(ctx);
					break;
				}
				case _MrXrMG2zEe20BPbKhZTxXg: {
					curr = execute_MrXrMG2zEe20BPbKhZTxXg(ctx);
					break;
				}
				case _R6bxEW2zEe20BPbKhZTxXg: {
					curr = execute_R6bxEW2zEe20BPbKhZTxXg(ctx);
					break;
				}
				case _R6jF3W2zEe20BPbKhZTxXg: {
					curr = execute_R6jF3W2zEe20BPbKhZTxXg(ctx);
					break;
				}
				case _UAp2sW2zEe20BPbKhZTxXg: {
					curr = execute_UAp2sW2zEe20BPbKhZTxXg(ctx);
					break;
				}
				case _UAyZnG2zEe20BPbKhZTxXg: {
					curr = execute_UAyZnG2zEe20BPbKhZTxXg(ctx);
					break;
				}
				case _uQAfgW2zEe20BPbKhZTxXg: {
					curr = execute_uQAfgW2zEe20BPbKhZTxXg(ctx);
					break;
				}
				case _uQC7wW2zEe20BPbKhZTxXg: {
					curr = execute_uQC7wW2zEe20BPbKhZTxXg(ctx);
					break;
				}
				case _uPwA2W2zEe20BPbKhZTxXg: {
					curr = execute_uPwA2W2zEe20BPbKhZTxXg(ctx);
					break;
				}
				case _uQJpcW2zEe20BPbKhZTxXg: {
					curr = execute_uQJpcW2zEe20BPbKhZTxXg(ctx);
					break;
				}
				case _uQNT1W2zEe20BPbKhZTxXg: {
					curr = execute_uQNT1W2zEe20BPbKhZTxXg(ctx);
					break;
				}
				case _uQF_F22zEe20BPbKhZTxXg: {
					curr = execute_uQF_F22zEe20BPbKhZTxXg(ctx);
					break;
				}
				case _oNz3EW20Ee20BPbKhZTxXg: {
					curr = execute_oNz3EW20Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _oN1FMW20Ee20BPbKhZTxXg: {
					curr = execute_oN1FMW20Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _oN4IiW20Ee20BPbKhZTxXg: {
					curr = execute_oN4IiW20Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _oN6kx220Ee20BPbKhZTxXg: {
					curr = execute_oN6kx220Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _oN9BA220Ee20BPbKhZTxXg: {
					curr = execute_oN9BA220Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _oN7y4W20Ee20BPbKhZTxXg: {
					curr = execute_oN7y4W20Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _DQgoYW21Ee20BPbKhZTxXg: {
					curr = execute_DQgoYW21Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _DQhPgG21Ee20BPbKhZTxXg: {
					curr = execute_DQhPgG21Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _DQidkW21Ee20BPbKhZTxXg: {
					curr = execute_DQidkW21Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _DQidr221Ee20BPbKhZTxXg: {
					curr = execute_DQidr221Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _Kx7ycW21Ee20BPbKhZTxXg: {
					curr = execute_Kx7ycW21Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _Kx__HYPHEN_MINUS__OxG21Ee20BPbKhZTxXg: {
					curr = execute_Kx__HYPHEN_MINUS__OxG21Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _KyEVUW21Ee20BPbKhZTxXg: {
					curr = execute_KyEVUW21Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _KyE8YW21Ee20BPbKhZTxXg: {
					curr = execute_KyE8YW21Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _O3LJgW21Ee20BPbKhZTxXg: {
					curr = execute_O3LJgW21Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _O3Oz4W21Ee20BPbKhZTxXg: {
					curr = execute_O3Oz4W21Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _O3Pa9G21Ee20BPbKhZTxXg: {
					curr = execute_O3Pa9G21Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _O3QCBm21Ee20BPbKhZTxXg: {
					curr = execute_O3QCBm21Ee20BPbKhZTxXg(ctx);
					break;
				}
				case _U_GKAW21Ee20BPbKhZTxXg: {
					return execute_U_GKAW21Ee20BPbKhZTxXg(ctx);
				}
				case _2zM2UW24Ee2wdtdHmSs5yA: {
					curr = execute_2zM2UW24Ee2wdtdHmSs5yA(ctx);
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
	public static class CreateBoard_JZdn0W2uEe20BPbKhZTxXgResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public CreateBoard_JZdn0W2uEe20BPbKhZTxXgResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_U_GKAW21Ee20BPbKhZTxXg";
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
			public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board getBoard();
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

			public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board getBoard() {
				return ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA;
			}
		}
		


	// sibs
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_Zl2E8W2wEe20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 3l, 0l, 0l, 3l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._O3QCBm21Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_MrXrMG2zEe20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 3l, 0l, 5l, 3l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._oN6kx220Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_R6bxEW2zEe20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 3l, 0l, 5l, 2l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._Zl2E8W2wEe20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_R6jF3W2zEe20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 3l, 0l, 0l, 2l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._KyE8YW21Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_UAp2sW2zEe20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 3l, 0l, 5l, 1l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._R6jF3W2zEe20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_UAyZnG2zEe20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 3l, 0l, 0l, 1l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._DQidkW21Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_uQAfgW2zEe20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 3l, 0l, 2l, 0l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._uQJpcW2zEe20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_uQC7wW2zEe20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 2l, 0l, 0l, 0l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._uQNT1W2zEe20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_uPwA2W2zEe20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 3l, 0l, 4l, 0l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._uQF_F22zEe20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_uQJpcW2zEe20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 3l, 0l, 3l, 0l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._uPwA2W2zEe20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_uQNT1W2zEe20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 3l, 0l, 1l, 0l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._uQAfgW2zEe20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_uQF_F22zEe20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 2l, 0l, 5l, 0l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._UAyZnG2zEe20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_oNz3EW20Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 3l, 0l, 3l, 4l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._oN1FMW20Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_oN1FMW20Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 3l, 0l, 4l, 4l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._oN9BA220Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_oN4IiW20Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 3l, 0l, 1l, 4l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._oN7y4W20Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_oN6kx220Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 2l, 0l, 0l, 4l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._oN4IiW20Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_oN9BA220Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 2l, 0l, 5l, 4l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._U_GKAW21Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_oN7y4W20Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 3l, 0l, 2l, 4l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._oNz3EW20Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_DQgoYW21Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 4l, 0l, 3l, 1l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._DQhPgG21Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_DQhPgG21Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 4l, 0l, 4l, 1l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._UAp2sW2zEe20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_DQidkW21Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 4l, 0l, 1l, 1l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._DQidr221Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_DQidr221Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 4l, 0l, 2l, 1l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._DQgoYW21Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_Kx7ycW21Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 4l, 0l, 2l, 2l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._KyEVUW21Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_Kx__HYPHEN_MINUS__OxG21Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 4l, 0l, 4l, 2l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._R6bxEW2zEe20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_KyEVUW21Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 4l, 0l, 3l, 2l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._Kx__HYPHEN_MINUS__OxG21Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_KyE8YW21Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 4l, 0l, 1l, 2l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._Kx7ycW21Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_O3LJgW21Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 4l, 0l, 2l, 3l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._O3Pa9G21Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_O3Oz4W21Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 4l, 0l, 4l, 3l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._MrXrMG2zEe20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_O3Pa9G21Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 4l, 0l, 3l, 3l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._O3Oz4W21Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateTile' and sub process 'CreateTile'.
	public SIB_ID execute_O3QCBm21Ee20BPbKhZTxXg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateTile_tZaLgW2vEe20BPbKhZTxXg.CreateTile_tZaLgW2vEe20BPbKhZTxXgResult result = instance.execute(false, ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA, 4l, 0l, 1l, 3l);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._O3LJgW21Ee20BPbKhZTxXg;
		}
			default: throw new IllegalStateException("SIB 'CreateTile' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph i/o 'success'.
	public CreateBoard_JZdn0W2uEe20BPbKhZTxXgResult execute_U_GKAW21Ee20BPbKhZTxXg(final Context ctx) {
		return new CreateBoard_JZdn0W2uEe20BPbKhZTxXgResult(new SuccessReturnImpl(ctx));
	}
	// container for create SIB 'Create Board'.
	public SIB_ID execute_2zM2UW24Ee2wdtdHmSs5yA(final Context ctx) {
		final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.BoardController domController = this.BoardController;
	
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Board createdObj = domController.create();
	
	
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
		ctx.Create_BoardSuccessCreated_2z29oW24Ee2wdtdHmSs5yA = createdObj;
	
		// branch 'success'
		return SIB_ID._uQC7wW2zEe20BPbKhZTxXg;
	}
	
}  
