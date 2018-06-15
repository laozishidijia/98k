Ext.define('secondgoods.controller.SecondGoodsController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.goodsController',
	stores : [ 'SecondGoodsStore' ],
	models : [ 'SecondGoodsModel' ],
	views : [ 'SecondGoodsGrid', 'SecondGoodsEdit' ],
	init : function() {
		this.control({
			'secondgoodsGrid' : {
				itemdblclick : this.editSecondGoods
			},
			'secondgoodsEdit button[action=save]' : {
				click : this.updateSecondGoods
			}
		});
	},
	editSecondGoods : function(grid, record) {
		var view = Ext.widget('secondgoodsEdit');
		view.down('form').loadRecord(record);
	},
	updateSecondGoods : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
