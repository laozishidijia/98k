Ext.define('ssv.view.StudentGrid' ,{
    extend: 'Ext.grid.GridPanel',
    alias: 'widget.StudentGrid',
    title: '学生列表',
    store:'studentStore',
    autoLoad: true,
    initComponent: function() {
        this.columns = [
            {header: 'Departement',  dataIndex: 'sdept',  flex: 1},
            {header:'ID_num',dataIndex:'sid',flex:1},
            {header: 'Name', dataIndex: 'sname', flex: 1}
        ];
        this.callParent(arguments);
    }
});