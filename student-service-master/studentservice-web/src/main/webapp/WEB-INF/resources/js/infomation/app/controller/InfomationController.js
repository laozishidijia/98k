Ext.define('infomation.controller.InfomationController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.infomationController',
	stores : [ 'InfomationStore' ],
	models : [ 'InfomationModel' ],
	views : [ 'InfomationGrid','InfomationEdit' ],
	init : function() {
		this.control({
			'infomationGrid' : {
				itemdblclick : this.editInfomation
			},
			'infomationEdit button[action=save]' : {
				click : this.updateInfomation
			}
		});
	},
	editInfomation : function(grid, record) {
		var view = Ext.widget('infomationEdit');
		view.down('form').loadRecord(record);
	},
	updateInfomation : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
