Ext.application({
	requires:['Ext.container.Viewport'],
	name : 'student',
	appFolder : 'app',
	controllers : ['StudentController'],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : {
				xtype : 'StudentList',
			}
		});
	}
});
