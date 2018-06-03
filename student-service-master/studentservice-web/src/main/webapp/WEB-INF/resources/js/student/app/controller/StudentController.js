Ext.define('student.controller.StudentController', {
	extend : 'Ext.app.Controller',
	views : [ 'student.StudentList', 'student.Edit' ],
	
	init : function() {
		this.control({
			'viewport > panel' : {
				render : this.onPanelRendered
			}
		});
	},
	editUser : function(grid, record) {
		var view = Ext.widget('studentEdit');
		view.down('form').loadRecord(record);
	},
	onPanelRendered : function() {
		console.log('The panel was rendered');
	}
});