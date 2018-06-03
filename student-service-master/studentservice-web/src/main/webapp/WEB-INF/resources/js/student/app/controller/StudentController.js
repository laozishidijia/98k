Ext.define('student.controller.StudentController', {
	extend: 'Ext.app.Controller',
	 views: [
	        'StudentList'
	    ],
	init : function() {
		this.control({
			'viewport > panel' : {
				render : this.onPanelRendered
			}
		});
	},
	onPanelRendered : function() {
		console.log('The panel was rendered');
	}
});