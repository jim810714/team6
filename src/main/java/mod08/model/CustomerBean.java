package mod08.model;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class CustomerBean implements Serializable {
	private static final long serialVersionUID = 1L;
	Integer pId;
	String pName;
	Integer amount;
	Date expire;

	public CustomerBean(Integer pId, String pName, Integer amount, Date expire) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.amount = amount;
		this.expire = expire;
	}

	public CustomerBean() {
	}

	// 此方法定義可讀性質 productId
	public Integer getProductId() {
		return pId;
	}

	// 此方法定義可寫性質 productId
	public void setProductId(Integer productId) {
		this.pId = productId;
	}

	// 此方法定義可讀性質 productName
	public String getProductName() {
		return pName;
	}

	// 此方法定義可寫性質 productName
	public void setProductName(String productName) {
		this.pName = productName;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

//	public Date getExpire() {
//		return expire;
//	}
	public String getExpire() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH點mm分ss秒 SSS");
		sdf.setLenient(true); //寬鬆的日期
		String date1 = sdf.format(expire);
		return date1;
	}

	public void setExpire(Date expire) {
		this.expire = expire;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomerBean [pId=");
		builder.append(pId);
		builder.append(", pName=");
		builder.append(pName);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", expire=");
		builder.append(expire);
		builder.append("]");
		return builder.toString();
	}

//	@Override
//	public String toString() {
//		return "CustomerBean [pId=" + pId + ", pName=" + pName + ", amount=" + amount + ", expire=" + expire + "]";
//	}
}
