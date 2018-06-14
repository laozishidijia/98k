Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'secondgoods',
	appFolder : server_context + '/resources/js/secondgoods/app',
	controllers : [ 'SecondGoodsController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport',{
			layout : 'fit',
			items : [ {
				xtype : 'secondgoodsGrid'
			} ]
		});
	}
});
