Ext.define('goods.view.goodsEdit', {
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
				name : 'Itemsdescribe',
				fieldLabel : '物品描述'
			}, {
				xtype : 'textfield',
				name : 'itemsid',
				fieldLabel : '编号'
			}, {
				xtype : 'textfield',
				name : 'itemsname',
				fieldLabel : '名称'
			},
			{
				xtype : 'textfield',
				name : 'itemsnumber',
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
