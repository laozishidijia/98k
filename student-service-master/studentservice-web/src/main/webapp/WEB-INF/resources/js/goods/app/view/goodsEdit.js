Ext.define('goods.view.GoodsEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.goodsEdit',
	title : '编辑物品信息',
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
				fieldLabel : '序号'
			}, {
				xtype : 'textfield',
				name : 's_name',
				fieldLabel : '名称'
			}, {
				xtype : 'textfield',
				name : 's_dept',
				fieldLabel : '描述'
			},
			{
				xtype : 'textfield',
				name : 's_class',
				fieldLabel : '数量'
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
