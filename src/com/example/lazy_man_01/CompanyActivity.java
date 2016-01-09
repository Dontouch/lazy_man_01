package com.example.lazy_man_01;

import java.util.ArrayList;
import java.util.List;

import com.example.adapter.CompanyAdapter;
import com.example.parser.CompanyParser;
import com.example.vo.CompanyCategory;
import com.example.vo.RequestVo;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

/**
 * 推荐商家
 * @author Dontouch
 *
 */
public class CompanyActivity extends BaseWapperActivity{

	
	private List<CompanyCategory> list;
	private TextView textBrandInfoNull;
	private TextView textTitle;
	private ExpandableListView expandableLV;
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void findViewById() {
		expandableLV =  (ExpandableListView) findViewById(R.id.listCompanyInfo);
		//listView = (ListView) findViewById(R.id.productList);
		System.out.println(expandableLV==null);
	}
	
	//加载布局文件
	@Override
	protected void loadViewLayout() {
		setContentView(R.layout.company_activity);
		//setContentView(R.layout.product_list_activity);
		list = new ArrayList<CompanyCategory>();
		setTitle("推荐商家");
	}
	//执行逻辑
	@Override
	protected void processLogic() {
		RequestVo reqVo = new RequestVo();
		reqVo.requestUrl = R.string.url_brand;
		reqVo.context = context;
		
		reqVo.jsonParser = new CompanyParser();
		
		super.getDataFromServer(reqVo, new DataCallback<List<CompanyCategory>>() {

			@Override
			public void processData(List<CompanyCategory> paramObject,
					boolean paramBoolean) {
				list = paramObject;
				CompanyAdapter companyAdapter = new CompanyAdapter(list, expandableLV, CompanyActivity.this);
				expandableLV.setAdapter(companyAdapter);
			}

			
		});
	}
	//设置监听事件
	@Override
	protected void setListener() {
		// TODO Auto-generated method stub
		
	}
}
