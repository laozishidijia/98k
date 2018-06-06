Ext.define('ssv.controller.StudentController', {
	extend : 'Ext.app.Controller',
	views : [ 'StudentGrid', 'Edit' ],
	stores:['studentStore'],
	models:['studentModel'],
	init : function() {
		this.control({
			'viewport > StudentGrid' : {
				itemdblclick:this.Edit
			},
			'studentEdit button[action=save]':{
				click:this.updateStudent
			}
		});
	},
	updateStudent:function(button){
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	},
	studentEdit : function(grid, record) {
		var view = Ext.widget('studentEdit');
		view.down('form').loadRecord(record);
	}
	
});