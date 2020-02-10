// Generated from littleG.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link littleGParser}.
 */
public interface littleGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link littleGParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(littleGParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(littleGParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(littleGParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(littleGParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void enterPgm_body(littleGParser.Pgm_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void exitPgm_body(littleGParser.Pgm_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(littleGParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(littleGParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void enterString_decl(littleGParser.String_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void exitString_decl(littleGParser.String_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(littleGParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(littleGParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(littleGParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(littleGParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(littleGParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(littleGParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(littleGParser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(littleGParser.Any_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(littleGParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(littleGParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void enterId_tail(littleGParser.Id_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void exitId_tail(littleGParser.Id_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_list(littleGParser.Param_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_list(littleGParser.Param_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(littleGParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(littleGParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_tail(littleGParser.Param_decl_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_tail(littleGParser.Param_decl_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declarations(littleGParser.Func_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declarations(littleGParser.Func_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(littleGParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(littleGParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(littleGParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(littleGParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(littleGParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(littleGParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(littleGParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(littleGParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBase_stmt(littleGParser.Base_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBase_stmt(littleGParser.Base_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(littleGParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(littleGParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(littleGParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(littleGParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(littleGParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(littleGParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(littleGParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(littleGParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(littleGParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(littleGParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(littleGParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(littleGParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prefix(littleGParser.Expr_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prefix(littleGParser.Expr_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(littleGParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(littleGParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void enterFactor_prefix(littleGParser.Factor_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void exitFactor_prefix(littleGParser.Factor_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expr(littleGParser.Postfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expr(littleGParser.Postfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(littleGParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(littleGParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(littleGParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(littleGParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tail(littleGParser.Expr_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tail(littleGParser.Expr_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(littleGParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(littleGParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(littleGParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(littleGParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(littleGParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(littleGParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(littleGParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(littleGParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(littleGParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(littleGParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(littleGParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(littleGParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#compop}.
	 * @param ctx the parse tree
	 */
	void enterCompop(littleGParser.CompopContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#compop}.
	 * @param ctx the parse tree
	 */
	void exitCompop(littleGParser.CompopContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleGParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(littleGParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleGParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(littleGParser.While_stmtContext ctx);
}