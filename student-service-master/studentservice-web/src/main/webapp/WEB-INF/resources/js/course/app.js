Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'course',
	appFolder : server_context + '/resources/js/course/app',
	controllers : [ 'CourseController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'courseGrid'
			} ]
		});
	}
});
