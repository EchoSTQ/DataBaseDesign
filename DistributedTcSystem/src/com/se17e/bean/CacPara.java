package com.se17e.bean;

public class CacPara {
	private int mode = 1;	//默认是制冷
	
	private int speed = 2; //默认是中风
	
	private int tempHighLimit = 25;	//默认制冷最高25度
	private int tempLowLimit = 18;	//默认制冷最低18度
	
	private int defaultTargetTemp = 25; 	//默认目标温度25度
	
	private int FeeRateH;	//默认最高费率（高风）1度/元
	private int FeeRateM;	//默认中等费率（中风）2度/元
	private int FeeRateL;	//默认最低费率（低风）3度/元
	
	public CacPara() {
		super();
	}
	
	public CacPara(int mode, int speed, int tempHighLimit, int tempLowLimit, int defaultTargetTemp, int feeRateH,
			int feeRateM, int feeRateL) {
		super();
		this.mode = mode;
		this.speed = speed;
		this.tempHighLimit = tempHighLimit;
		this.tempLowLimit = tempLowLimit;
		this.defaultTargetTemp = defaultTargetTemp;
		FeeRateH = feeRateH;
		FeeRateM = feeRateM;
		FeeRateL = feeRateL;
	}
	
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getTempHighLimit() {
		return tempHighLimit;
	}
	public void setTempHighLimit(int tempHighLimit) {
		this.tempHighLimit = tempHighLimit;
	}
	public int getTempLowLimit() {
		return tempLowLimit;
	}
	public void setTempLowLimit(int tempLowLimit) {
		this.tempLowLimit = tempLowLimit;
	}
	public int getDefaultTargetTemp() {
		return defaultTargetTemp;
	}
	public void setDefaultTargetTemp(int defaultTargetTemp) {
		this.defaultTargetTemp = defaultTargetTemp;
	}
	public int getFeeRateH() {
		return FeeRateH;
	}
	public void setFeeRateH(int feeRateH) {
		FeeRateH = feeRateH;
	}
	public int getFeeRateM() {
		return FeeRateM;
	}
	public void setFeeRateM(int feeRateM) {
		FeeRateM = feeRateM;
	}
	public int getFeeRateL() {
		return FeeRateL;
	}
	public void setFeeRateL(int feeRateL) {
		FeeRateL = feeRateL;
	}
	
	
}
