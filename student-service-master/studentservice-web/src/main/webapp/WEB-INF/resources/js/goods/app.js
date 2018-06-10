Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'goods',
	appFolder : server_context + '/resources/js/goods/app',
	controllers : [ 'GoodsController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport',{
			layout : 'fit',
			items : [ {
				xtype : 'goodsGrid'
			} ]
		});
	}
});
