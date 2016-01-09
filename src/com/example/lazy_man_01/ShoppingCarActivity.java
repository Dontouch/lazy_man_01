package com.example.lazy_man_01;

import com.example.adapter.ShoppingCarAdapter;

import com.example.parser.ShoppingCarParser;
import com.example.util.Constant;
import com.example.util.Logger;
import com.example.vo.Addup;
import com.example.vo.Cart;
import com.example.vo.RequestVo;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;


/**
 * 购物车页面
 * @author wsj
 *
 */
public class ShoppingCarActivity extends BaseWapperActivity{

	protected static final String TAG = "ShoppingCarActivity";
	
	private ListView shopcar_service_list;//服务列表

	private TextView shopcar_total_buycount_text_1; //数量总计
	private TextView shopcar_total_bonus_text_1; //赠送积分总计
	private TextView shopcar_total_money_text_1; //金额总计
	private String productId;
	
	@Override
	//onclick事件，当点击结算按钮跳转到结算中心页面
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.shopcar_bottom_toPay_text:
			startActivity(new Intent(this, Payment_Center_Activity.class));
			finish();
			break;
		}
	}

	@Override
	protected void findViewById() {
		// TODO Auto-generated method stub
		shopcar_service_list = (ListView) findViewById(R.id.shopcar_service_list);
		shopcar_total_buycount_text_1= (TextView) findViewById(R.id.shopcar_total_buycount_text_1);
		shopcar_total_bonus_text_1= (TextView) findViewById(R.id.shopcar_total_bonus_text_1);
		shopcar_total_money_text_1= (TextView) findViewById(R.id.shopcar_total_money_text_1);
		findViewById(R.id.shopcar_bottom_toPay_text).setOnClickListener(this);
	}

	@Override
	//加载布局
	protected void loadViewLayout() {
		// TODO Auto-generated method stub
		setContentView(R.layout.shopping_car_activity);
		setTitle("购物车");
		selectedBottomTab(Constant.SHOPCAR);
	}

	@Override
	//页面的逻辑处理
	protected void processLogic() {
		// TODO Auto-generated method stub

		RequestVo requestVo = new RequestVo();
		requestVo.context=context;
		requestVo.jsonParser = new ShoppingCarParser();
		requestVo.requestUrl = R.string.cart;
		getDataFromServer(requestVo, new DataCallback<Cart>() {

			@Override
			public void processData(Cart paramObject, boolean paramBoolean) {
				
				Logger.d(TAG, paramObject.servicelist.size()+"");
				
				ShoppingCarAdapter adapter = new ShoppingCarAdapter(ShoppingCarActivity.this, paramObject);
				shopcar_service_list.setAdapter(adapter);	
				if (paramObject.servicelist.size() > 0) { //根据服务器返回的数据，显示相关信息
					Addup addup = paramObject.cart_addup ;
					shopcar_total_buycount_text_1.setText(addup.total_count + "");
					shopcar_total_bonus_text_1.setText(addup.total_point + "");
					shopcar_total_money_text_1.setText(addup.total_price + "");
				} else {
					setContentView(R.layout.shopping_none_car_activity);
					}
				
			}
		});
	}

	@Override
	protected void setListener() {
		// TODO Auto-generated method stub
		
	}
}
