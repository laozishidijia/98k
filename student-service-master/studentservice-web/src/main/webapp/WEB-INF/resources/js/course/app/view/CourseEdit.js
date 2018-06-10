Ext.define('course.view.CourseEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.courseEdit',
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
				name : 'speciality',
				fieldLabel : '专业'
			}, {
				xtype : 'textfield',
				name : 'clazz',
				fieldLabel : '班级'
			}, {
				xtype : 'textfield',
				name : 'monday',
				fieldLabel : '周一'
			},{
				xtype : 'textfield',
				name : 'tuesday',
				fieldLabel : '周二'
			},{
				xtype : 'textfield',
				name : 'wednesday',
				fieldLabel : '周三'
			},{
				xtype : 'textfield',
				name : 'thursday',
				fieldLabel : '周四'
			},{
				xtype : 'textfield',
				name : 'friday',
				fieldLabel : '周五'
			},{
				xtype : 'textfield',
				name : 'saturday',
				fieldLabel : '周六'
			},{
				xtype : 'textfield',
				name : 'sunday',
				fieldLabel : '周日'
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
