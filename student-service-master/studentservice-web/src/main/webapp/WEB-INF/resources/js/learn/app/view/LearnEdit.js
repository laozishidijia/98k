Ext.define('learn.view.learnEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.learnEdit',
	title : '编辑学生信息',
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
				name : 's_name',
				fieldLabel : '资料名称'
			}, {
				xtype : 'textfield',
				name : 's_time',
				fieldLabel : '发布时间'
			}, {
				xtype : 'textfield',
				name : 's_neirong',
				fieldLabel : '资料内容'
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
