Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'infomation',
	appFolder : server_context + '/resources/js/infomation/app',
	controllers : [ 'InfomationController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'infomationGrid'
			} ]
		});
	}
});
