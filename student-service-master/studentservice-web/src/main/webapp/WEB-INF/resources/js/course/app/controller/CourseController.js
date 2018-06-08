Ext.define('course.controller.CourseController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.courseController',
	stores : [ 'CourseStore' ],
	models : [ 'CourseModel' ],
	views : [ 'CourseGrid'],
	init : function() {
		this.control({
			'courseGrid' : {
				itemdblclick : this.editCourse
			},
			'courseEdit button[action=save]' : {
				click : this.updateCourse
			}
		});
	},
	editCourse : function(grid, record) {
		var view = Ext.widget('courseEdit');
		view.down('form').loadRecord(record);
	},
	updateCourse : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
