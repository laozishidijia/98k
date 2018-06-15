Ext.define('secondgoods.view.SecondGoodsEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.secondgoodsEdit',
	title : '编辑二手商品信息',
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
				name : 'Sname',
				fieldLabel : '二手商品名称'
			}, {
				xtype : 'textfield',
				name : 'Snumber',
				fieldLabel : '二手商品编号'
			}, {
				xtype : 'textfield',
				name : 'Sprice',
				fieldLabel : '二手商品价格'
			},
			{
				xtype : 'textfield',
				name : 'Stime',
				fieldLabel : '二手商品的使用时间'
			},
			{
				xtype : 'textfield',
				name : 'Sdescrible',
				fieldLabel : '二手商品的描述'
			}]
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
