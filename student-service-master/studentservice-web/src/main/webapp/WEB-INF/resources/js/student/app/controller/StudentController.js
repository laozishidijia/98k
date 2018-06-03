Ext.define('student.controller.StudentController', {
	extend : 'Ext.app.Controller',
	views : [ 'student.StudentList', 'student.Edit' ],
	stores:['studentStore'],
	models:['student'],
	init : function() {
		this.control({
			'viewport > panel' : {
				itemdblclick:this.studentEdit
			},
			'studentEdit button[action=save]':{
				click:this.updateStudent
			}
		});
	},
	updateStudent:function(button){
		console.log('clicked  the save button')
	},
	editUser : function(grid, record) {
		var view = Ext.widget('studentEdit');
		view.down('form').loadRecord(record);
	},
	onPanelRendered : function() {
		console.log('The panel was rendered');
	}
});