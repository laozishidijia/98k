Ext.define('student.view.StudentEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.studentEdit',
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
				name : 's_id',
				fieldLabel : '学号'
			}, {
				xtype : 'textfield',
				name : 's_name',
				fieldLabel : '姓名'
			}, {
				xtype : 'textfield',
				name : 's_dept',
				fieldLabel : '专业'
			},
			{
				xtype : 'textfield',
				name : 's_class',
				fieldLabel : '班级'
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
