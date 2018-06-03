Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	requires:['Ext.container.Viewport'],
	name : 'student',
	appFolder : server_context + '/resources/js/student/app',
	controllers : [ 'StudentController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'StudentList',
				title:'Student',
				html:'List of Student go here'
			} ]
		});
	}
});
