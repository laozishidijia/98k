Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'learn',
	appFolder : server_context + '/resources/js/learn/app',
	controllers : [ 'learnController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport',{
			layout : 'fit',
			items : [ {
				xtype : 'learnGrid'
			} ]
		});
	}
});
