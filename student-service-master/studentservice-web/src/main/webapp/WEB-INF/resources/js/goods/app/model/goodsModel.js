Ext.define('goods.model.GoodsModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.goodsModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'g_id',
		type : 'string',
		sortable : true
	}, {
		name : 'g_name',
		type : 'string',
		sortable : true
	}, {
		name : 'g_describe',
		type : 'string',
		sortable : true
	}, {
		name : 'g_number',
		type : 'string',
		sortable : true
	},{
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	} ]
});