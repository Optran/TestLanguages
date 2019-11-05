// Generated from Json.g4 by ANTLR 4.7.2

package com.optran.languageref.testlanguages.json;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JsonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JsonParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(JsonParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#jsonRecord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonRecord(JsonParser.JsonRecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(JsonParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(JsonParser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JsonParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STR_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTR_VALUE(JsonParser.STR_VALUEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUM_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUM_VALUE(JsonParser.NUM_VALUEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TRUE_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTRUE_VALUE(JsonParser.TRUE_VALUEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FALSE_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFALSE_VALUE(JsonParser.FALSE_VALUEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OBJ_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOBJ_VALUE(JsonParser.OBJ_VALUEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARRAY_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARRAY_VALUE(JsonParser.ARRAY_VALUEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULL_VALUE}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULL_VALUE(JsonParser.NULL_VALUEContext ctx);
}