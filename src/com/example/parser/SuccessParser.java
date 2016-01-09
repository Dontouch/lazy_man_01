package com.example.parser;

import org.json.JSONException;

import android.text.TextUtils;

public class SuccessParser extends BaseParser<Boolean> {

	@Override
	public Boolean parseJSON(String paramString) throws JSONException {
		if (!TextUtils.isEmpty(checkResponse(paramString))) {
			return true;
		}
		return false;
	}
}
