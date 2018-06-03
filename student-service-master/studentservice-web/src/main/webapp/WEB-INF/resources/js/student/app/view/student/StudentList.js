Ext.define('student.view.student.StudentList' ,{
    extend: 'Ext.grid.Panel',
    alias: 'widget.StudentList',

    title: 'All Students',

    initComponent: function() {
        this.store = {
            fields: ['sdept', 'sid','sname'],
            data  : [
                {sdept:'計算機',sid:'201608040126',sname:'hzg'},
                {sdept:'計算機',sid:'201608040128',sname:'zlk'},
                {sdept:'計算機',sid:'201608040125',sname:'sty'}
            ]
        };
        this.columns = [
            {header: 'Departement',  dataIndex: 'sdept',  flex: 1},
            {header:'ID_num',dataIndex:'sid',flex:1},
            {header: 'Name', dataIndex: 'sname', flex: 1}
        ];
        this.callParent(arguments);
    }
});