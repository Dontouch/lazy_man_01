package com.example.adapter;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;
import com.example.parser.BaseParser;
import com.example.vo.HomeBanner;

public class HomeBannerParser extends BaseParser<List<HomeBanner>> {
	@Override
	public List<HomeBanner> parseJSON(String paramString) throws JSONException {
		if (!TextUtils.isEmpty(checkResponse(paramString))) {
			JSONObject j = new JSONObject(paramString);
 			return JSON.parseArray(j.getString("home_banner"), HomeBanner.class);
		}
		return null;
	}

}
