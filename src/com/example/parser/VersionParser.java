package com.example.parser;

import org.json.JSONException;
import org.json.JSONObject;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;
import com.example.vo.Version;

/**
 * 版本解析器
 * @author Dontouch
 *
 */
public class VersionParser extends BaseParser<Version> {

	@Override
	public Version parseJSON(String paramString) throws JSONException {
		// TODO Auto-generated method stub
		if (!TextUtils.isEmpty(checkResponse(paramString))) {
			JSONObject j = new JSONObject(paramString);
			String version = j.getString("version");
			return JSON.parseObject(version, Version.class);
		}
		return null;
	}

}
