// Generated from Json.g4 by ANTLR 4.7.2

package com.optran.languageref.testlanguages.json;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonParser}.
 */
public interface JsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JsonParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JsonParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#jsonRecord}.
	 * @param ctx the parse tree
	 */
	void enterJsonRecord(JsonParser.JsonRecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#jsonRecord}.
	 * @param ctx the parse tree
	 */
	void exitJsonRecord(JsonParser.JsonRecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JsonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JsonParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(JsonParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(JsonParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JsonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JsonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STR_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterSTR_VALUE(JsonParser.STR_VALUEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STR_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitSTR_VALUE(JsonParser.STR_VALUEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUM_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNUM_VALUE(JsonParser.NUM_VALUEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUM_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNUM_VALUE(JsonParser.NUM_VALUEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TRUE_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterTRUE_VALUE(JsonParser.TRUE_VALUEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TRUE_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitTRUE_VALUE(JsonParser.TRUE_VALUEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FALSE_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFALSE_VALUE(JsonParser.FALSE_VALUEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FALSE_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFALSE_VALUE(JsonParser.FALSE_VALUEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OBJ_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterOBJ_VALUE(JsonParser.OBJ_VALUEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OBJ_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitOBJ_VALUE(JsonParser.OBJ_VALUEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARRAY_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterARRAY_VALUE(JsonParser.ARRAY_VALUEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARRAY_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitARRAY_VALUE(JsonParser.ARRAY_VALUEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULL_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNULL_VALUE(JsonParser.NULL_VALUEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NULL_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNULL_VALUE(JsonParser.NULL_VALUEContext ctx);
}