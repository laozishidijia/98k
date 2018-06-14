Ext.define('Learn.controller.LearnController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.LearnController',
	stores : [ 'LearnStore' ],
	models : [ 'LearnModel' ],
	views : [ 'LearnGrid', 'LearnEdit' ],
	init : function() {
		this.control({
			'LearnGrid' : {
				itemdblclick : this.editLearn
			},
			'LearnEdit button[action=save]' : {
				click : this.updateLearn
			}
		});
	},
	editLearn : function(grid, record) {
		var view = Ext.widget('LearnEdit');
		view.down('form').loadRecord(record);
	},
	updateLearn : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
