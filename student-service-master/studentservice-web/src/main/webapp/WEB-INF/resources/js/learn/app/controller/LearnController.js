Ext.define('learn.controller.learnController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.learnController',
	stores : [ 'learnStore' ],
	models : [ 'learnModel' ],
	views : [ 'learnGrid', 'learnEdit' ],
	init : function() {
		this.control({
			'learnGrid' : {
				itemdblclick : this.editLearn
			},
			'learnEdit button[action=save]' : {
				click : this.updateLearn
			}
		});
	},
	editLearn : function(grid, record) {
		var view = Ext.widget('learnEdit');
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
