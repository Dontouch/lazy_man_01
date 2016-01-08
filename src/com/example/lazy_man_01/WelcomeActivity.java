package com.example.lazy_man_01;

import java.io.File;

import com.example.engine.DownLoadTask;
import com.example.engine.DownLoadTask.DownlaodListener;
import com.example.util.Logger;
import com.example.vo.Version;
import com.itheima.redbaby.R;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

/**
 * 欢迎界面
 * @author Dontouch
 *
 */
public class WelcomeActivity extends Activity implements Runnable,DownlaodListener {

	private static final String TAG = " WelcomeActivity";
	
	private static final int SHOW_UPDATE_DIALOG = 11; //提示用户更新
	private static final int DOWN_ERROR = 12;  //下载失败
	private Version version;  //从服务器获取的版本信息
	private boolean flag = true; //是否设置进度条最大值
	private ProgressDialog mProgressDialog; //进度条
	private int progressVaue;  //进度条当前的值
	private File file;  //apk 文件
	private DownLoadTask downLoadTask;  //下载任务 
	
	
	private Handler handler = new Handler(){
		
		public void handlerMessage(Message msg){
			switch (msg.what) {
			case DOWN_ERROR:
				mProgressDialog.dismiss();
				Toast.makeText(WelcomeActivity.this, R.string.down_error, Toast.LENGTH_SHORT).show();
				gotoHome();
				break;
			case SHOW_UPDATE_DIALOG:
				Logger.d(TAG, "更新版本提示");

				new Builder(WelcomeActivity.this).setTitle("升级提醒").setMessage("亲，有新的版本赶快升级!").setCancelable(false)
						.setPositiveButton("是", new OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog, int which) {
								downApk();
							}
						}).setNegativeButton("否", new OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog, int which) {
								Logger.d(TAG, "不更新直接进入主界面");
								gotoHome();
							}
						}).show();
				break;

			default:
				break;
			}
		};
	
	};
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

    /**
     * 继承于DownloadListener
     */
	@Override
	public void update(int total, int len, int threadid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void downLoadFinish(int totalSucess) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void downLoadError(int type) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 进入主页
	 */
	private void gotoHome() {
		Intent intent = new Intent(this, HomeActivity.class);
		startActivity(intent);
		finish();
	}
	
	/** 从服务器下载新的Apk */
	private void downApk() {
		initProgressDialog();
		file = new File(ECApplication.getCacheDirPath(), "redbaby.apk");
		downLoadTask = new DownLoadTask(version.getUrl(), file.getAbsolutePath(), 5);
		downLoadTask.setListener(this);
		ThreadPoolManager.getInstance().addTask(downLoadTask);

	}
	

	/**
	 * 初始化进度条
	 */
	private void initProgressDialog() {
		mProgressDialog = new ProgressDialog(this);// 进度条初始化
		mProgressDialog.setCancelable(false);
		mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		mProgressDialog.setMessage(getString(R.string.downning));
		mProgressDialog.show();
	}

}
