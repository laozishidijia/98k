Ext.application({
	requires:['Ext.container.Viewport'],
	name : 'ssv',
	appFolder : server_context + '/resources/js/student/app',
	controllers : [ 'StudentController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'StudentGrid'
			} ]
		});
	}
});
