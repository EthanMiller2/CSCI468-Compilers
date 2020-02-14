// Generated from LittleG.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LittleGParser}.
 */
public interface LittleGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LittleGParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LittleGParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LittleGParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(LittleGParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(LittleGParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void enterPgm_body(LittleGParser.Pgm_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void exitPgm_body(LittleGParser.Pgm_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(LittleGParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(LittleGParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void enterString_decl(LittleGParser.String_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void exitString_decl(LittleGParser.String_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(LittleGParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(LittleGParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(LittleGParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(LittleGParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(LittleGParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(LittleGParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(LittleGParser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(LittleGParser.Any_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(LittleGParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(LittleGParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void enterId_tail(LittleGParser.Id_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void exitId_tail(LittleGParser.Id_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_list(LittleGParser.Param_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_list(LittleGParser.Param_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(LittleGParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(LittleGParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_tail(LittleGParser.Param_decl_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_tail(LittleGParser.Param_decl_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declarations(LittleGParser.Func_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declarations(LittleGParser.Func_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(LittleGParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(LittleGParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(LittleGParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(LittleGParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(LittleGParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(LittleGParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(LittleGParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(LittleGParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBase_stmt(LittleGParser.Base_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBase_stmt(LittleGParser.Base_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(LittleGParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(LittleGParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(LittleGParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(LittleGParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(LittleGParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(LittleGParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(LittleGParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(LittleGParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(LittleGParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(LittleGParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LittleGParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LittleGParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prefix(LittleGParser.Expr_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prefix(LittleGParser.Expr_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(LittleGParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(LittleGParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void enterFactor_prefix(LittleGParser.Factor_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void exitFactor_prefix(LittleGParser.Factor_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expr(LittleGParser.Postfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expr(LittleGParser.Postfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(LittleGParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(LittleGParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(LittleGParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(LittleGParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tail(LittleGParser.Expr_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tail(LittleGParser.Expr_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(LittleGParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(LittleGParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(LittleGParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(LittleGParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(LittleGParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(LittleGParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(LittleGParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(LittleGParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(LittleGParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(LittleGParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(LittleGParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(LittleGParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#compop}.
	 * @param ctx the parse tree
	 */
	void enterCompop(LittleGParser.CompopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#compop}.
	 * @param ctx the parse tree
	 */
	void exitCompop(LittleGParser.CompopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleGParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(LittleGParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleGParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(LittleGParser.While_stmtContext ctx);
}