package com.optran.languageref.testlanguages.json.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.optran.languageref.testlanguages.json.JsonBaseListener;
import com.optran.languageref.testlanguages.json.JsonParser.ArrayContext;
import com.optran.languageref.testlanguages.json.JsonParser.EntryContext;
import com.optran.languageref.testlanguages.json.JsonParser.FALSE_VALUEContext;
import com.optran.languageref.testlanguages.json.JsonParser.NULL_VALUEContext;
import com.optran.languageref.testlanguages.json.JsonParser.NUM_VALUEContext;
import com.optran.languageref.testlanguages.json.JsonParser.ObjectContext;
import com.optran.languageref.testlanguages.json.JsonParser.STR_VALUEContext;
import com.optran.languageref.testlanguages.json.JsonParser.TRUE_VALUEContext;
import com.optran.languageref.testlanguages.utils.stack.Stack;

public class JsonListenerImpl extends JsonBaseListener {
	private Stack<Boolean>modeStack;
	private Stack<Map<String, Object>>objectStack;
	private Stack<List<Object>>listStack;
	private Object value;
	public JsonListenerImpl() {
		modeStack = new Stack<Boolean>();
		listStack = new Stack<List<Object>>();
		objectStack = new Stack<Map<String,Object>>();
	}
	@Override
	public void enterObject(ObjectContext ctx) {
		objectStack.push(new HashMap<String, Object>());
		modeStack.push(true);
	}
	@Override
	public void exitObject(ObjectContext ctx) {
		value = objectStack.pop();
		modeStack.pop();
	}
	@Override
	public void enterArray(ArrayContext ctx) {
		listStack.push(new LinkedList<Object>());
		modeStack.push(false);
	}
	@Override
	public void exitArray(ArrayContext ctx) {
		if(value!=null) {
			listStack.peek().add(value);
		}
		value = listStack.pop();
		modeStack.pop();
	}
	@Override
	public void exitEntry(EntryContext ctx) {
		objectStack.peek().put(ctx.STRING().getText(), value);
		value = null;
	}
	@Override
	public void exitSTR_VALUE(STR_VALUEContext ctx) {
		if(modeStack.peek()) {
			value = ctx.getText();
		} else {
			listStack.peek().add(ctx.getText());
		}
	}
	@Override
	public void exitNUM_VALUE(NUM_VALUEContext ctx) {
		if(modeStack.peek()) {
			value = ctx.getText();
		} else {
			listStack.peek().add(ctx.getText());
		}
	}
	@Override
	public void exitTRUE_VALUE(TRUE_VALUEContext ctx) {
		if(modeStack.peek()) {
			value = ctx.getText();
		} else {
			listStack.peek().add(ctx.getText());
		}
	}
	@Override
	public void exitFALSE_VALUE(FALSE_VALUEContext ctx) {
		if(modeStack.peek()) {
			value = ctx.getText();
		} else {
			listStack.peek().add(ctx.getText());
		}
	}
	@Override
	public void exitNULL_VALUE(NULL_VALUEContext ctx) {
		if(modeStack.peek()) {
			value = ctx.getText();
		} else {
			listStack.peek().add(ctx.getText());
		}
	}
	public void popall() {
		while(!objectStack.isEmpty()) {
			System.out.println(objectStack.pop());
		}
	}
	@Override
	public String toString() {
		return value.toString();
	}
}
