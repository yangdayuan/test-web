package com.mogujie.app.juandou.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.mogujie.app.common.BizException;
import com.mogujie.app.common.CommonUtils;
import com.mogujie.app.common.TOPClient;
import com.mogujie.app.juandou.annotation.CacheData;
import com.taobao.api.ApiException;
import com.taobao.api.domain.Item;
import com.taobao.api.domain.TaobaokeItem;
import com.taobao.api.request.ItemGetRequest;
import com.taobao.api.request.TaobaokeItemsGetRequest;
import com.taobao.api.response.ItemGetResponse;
import com.taobao.api.response.TaobaokeItemsGetResponse;

/**
 * 
 * @author lvpinglin
 *
 */
@Component
public class ItemManager {
	
	@Resource
	private TOPClient topClient;
	
	/**
	 * 根据淘宝商品id查询相应的淘宝客商品
	 * @param id
	 * @return
	 * @throws BizException
	 */
	@CacheData
	public TaobaokeItem queryTaobaokeItemById(long id) throws BizException {
		Item item = queryItemById(id);
		
		TaobaokeItem tbkItem = queryTaobaokeItemByItem(item);
		
		setCouponMessage(tbkItem);
		
		return tbkItem;
	}
	
	/**
	 * 根据淘宝商品id查询相应的淘宝商品
	 * @param id
	 * @return
	 */
	private Item queryItemById(long id) {
		Item item = new Item();
		ItemGetRequest req = new ItemGetRequest();
		req.setFields("num_iid,title,list_time,delist_time,nick,pic_url,price,detail_url,is_virtual,cid,auction_point,num");
		req.setNumIid(id);
		try {
			ItemGetResponse resp = topClient.getDefaultTaobaoClient().execute(req);
			if (resp.isSuccess()) {
				item = resp.getItem();
			}
		} catch (ApiException e) {
			// TODO
		}
		return item;
	}
	
	/**
	 * 把普通的淘宝商品转成淘宝客商品
	 * @param item
	 * @return
	 */
	private TaobaokeItem queryTaobaokeItemByItem(Item item) {
		if (item == null) {
			return null;
		}
		TaobaokeItemsGetRequest req = new TaobaokeItemsGetRequest();
		req.setKeyword(item.getTitle());
        req.setFields("num_iid,click_url,commission,commission_rate,nick,shop_click_url,volume,seller_credit_score");
        req.setNick("小货郎遛遛");
        req.setCid(item.getCid());
        req.setOuterCode(CommonUtils.generateOutercode("buyer"));
		return null;
	}
	
	private TaobaokeItem getTaobaokeItemList(TaobaokeItemsGetRequest req, long pageNo, long pageSize) {
		req.setPageNo(pageNo);
        req.setPageSize(pageSize);
        try {
        		TaobaokeItemsGetResponse resp = topClient.getDefaultTaobaoClient().execute(req);
        } catch (ApiException e) {
			// TODO
		}
        return null;
	}
	
	/**
	 * 设置优惠价
	 * @param tbkItem
	 */
	private void setCouponMessage(TaobaokeItem tbkItem) {
		//TODO
	}

}
