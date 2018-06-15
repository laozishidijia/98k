Ext.define('secondgoods.model.SecondGoodsModel',{
    extend : 'Ext.data.Model',
	alias : 'widget.secondgoodsModel',
	fields : [
		{
			name : 'id',
			type : 'int',
			sortable : true
		},{
		name : 'sname',
		type : 'string',
		sortable : true
	}, {
		name : 'snumber',
		type : 'long',
		sortable : true
	}, {
		name : 'sprice',
		type : 'float',
		sortable : true
	}, {
		name : 'stime',
		type : 'float',
		sortable : true
	}, {
		name : 'sdescrible',
		type : 'string',
		sortable : true
	}, {
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}]
 

});