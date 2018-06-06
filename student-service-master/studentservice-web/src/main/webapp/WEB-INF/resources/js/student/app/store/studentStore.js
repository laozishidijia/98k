Ext.define('ssv.store.studentStore', {
    extend: 'Ext.data.Store',
    model:'ssv.model.studentModel',
    data  : [
                {sdept:'計算機',sid:'201608040126',sname:'hzg'},
                {sdept:'計算機',sid:'201608040128',sname:'zlk'},
                {sdept:'計算機',sid:'201608040125',sname:'sty'}
            ]
});