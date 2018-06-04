Ext.define('student.controller.StudentController', {
	extend : 'Ext.app.Controller',
	views : [ 'student.StudentList', 'student.Edit' ],
	stores : [ 'studentStore' ],
	models : [ 'studentModel' ],
	init : function() {
		this.control({
			'viewport > panel' : {
				itemdblclick : this.studentEdit
			},
			'studentEdit button[action=save]' : {
				click : this.updateStudent
			}
		});
	},
	updateStudent : function(button) {
		var win = button.up('window'), 
			form = win.down('form'),
			record = form.getRecord(), 
			values = form.getValues();
		record.set(values);
		win.close();
	},
	studentEdit : function(grid, record) {
		var view = Ext.widget('studentEdit');
		view.down('form').loadRecord(record);
	}
});