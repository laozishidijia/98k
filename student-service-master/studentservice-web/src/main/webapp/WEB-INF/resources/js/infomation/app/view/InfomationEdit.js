Ext.define('infomation.view.InfomationEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.infomationEdit',
	title : '编辑反馈信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [{
				xtype : 'textfield',
				name : 'info_message',
				fieldLabel : '反馈信息'
			}, {
				xtype : 'textfield',
				name : 'info_name',
				fieldLabel : '用户姓名'
			}, {
				xtype : 'textfield',
				name : 'info_time',
				fieldLabel : '反馈时间'
			}
			]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});
