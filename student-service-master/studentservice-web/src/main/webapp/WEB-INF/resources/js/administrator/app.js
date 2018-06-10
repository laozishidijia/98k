Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'administrator',
	appFolder : server_context + '/resources/js/administrator/app',
	controllers:[
		'AdministratorController'
		],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'administratorList'
			} ]
		});
	}
});
