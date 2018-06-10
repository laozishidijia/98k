Ext.define('goods.controller.GoodsController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.goodsController',
	stores : [ 'GoodsStore' ],
	models : [ 'GoodsModel' ],
	views : [ 'GoodsGrid', 'GoodsEdit' ],
	init : function() {
		this.control({
			'goodsGrid' : {
				itemdblclick : this.editGoods
			},
			'goodsEdit button[action=save]' : {
				click : this.updateGoods
			}
		});
	},
	editGoods : function(grid, record) {
		var view = Ext.widget('goodsEdit');
		view.down('form').loadRecord(record);
	},
	updateGoods : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
