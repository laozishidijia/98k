/**
 * 
 */
Ext.define('infomation.controller.InfomationController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.infomationController',
	stores : [ 'InfomationStore' ],
	models : [ 'InfomationModel' ],
	views : [ 'InfomationGrid', 'InfomationEdit' ],
	init : function() {
		this.control({
			'infomationGrid' : {
				itemdblclick : this.editStudent
			},
			'infomationEdit button[action=save]' : {
				click : this.updateStudent
			}
		});
	},
	editStudent : function(grid, record) {
		var view = Ext.widget('infomationEdit');
		view.down('form').loadRecord(record);
	},
	updateStudent : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
	
});