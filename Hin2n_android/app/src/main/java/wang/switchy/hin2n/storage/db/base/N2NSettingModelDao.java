package wang.switchy.hin2n.storage.db.base;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import wang.switchy.hin2n.storage.db.base.model.N2NSettingModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "N2NSettingList".
*/
public class N2NSettingModelDao extends AbstractDao<N2NSettingModel, Long> {

    public static final String TABLENAME = "N2NSettingList";

    /**
     * Properties of entity N2NSettingModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Version = new Property(1, int.class, "version", false, "VERSION");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Ip = new Property(3, String.class, "ip", false, "IP");
        public final static Property Netmask = new Property(4, String.class, "netmask", false, "NETMASK");
        public final static Property Community = new Property(5, String.class, "community", false, "COMMUNITY");
        public final static Property Password = new Property(6, String.class, "password", false, "PASSWORD");
        public final static Property SuperNode = new Property(7, String.class, "superNode", false, "SUPER_NODE");
        public final static Property MoreSettings = new Property(8, boolean.class, "moreSettings", false, "MORE_SETTINGS");
        public final static Property SuperNodeBackup = new Property(9, String.class, "superNodeBackup", false, "SUPER_NODE_BACKUP");
        public final static Property MacAddr = new Property(10, String.class, "macAddr", false, "MAC_ADDR");
        public final static Property Mtu = new Property(11, int.class, "mtu", false, "MTU");
        public final static Property LocalIP = new Property(12, String.class, "localIP", false, "LOCAL_IP");
        public final static Property HolePunchInterval = new Property(13, int.class, "holePunchInterval", false, "HOLE_PUNCH_INTERVAL");
        public final static Property ResoveSupernodeIP = new Property(14, boolean.class, "resoveSupernodeIP", false, "RESOVE_SUPERNODE_IP");
        public final static Property LocalPort = new Property(15, int.class, "localPort", false, "LOCAL_PORT");
        public final static Property AllowRouting = new Property(16, boolean.class, "allowRouting", false, "ALLOW_ROUTING");
        public final static Property DropMuticast = new Property(17, boolean.class, "dropMuticast", false, "DROP_MUTICAST");
        public final static Property UseHttpTunnel = new Property(18, boolean.class, "useHttpTunnel", false, "USE_HTTP_TUNNEL");
        public final static Property TraceLevel = new Property(19, int.class, "traceLevel", false, "TRACE_LEVEL");
        public final static Property IsSelcected = new Property(20, boolean.class, "isSelcected", false, "IS_SELCECTED");
        public final static Property GatewayIp = new Property(21, String.class, "gatewayIp", false, "GATEWAY_IP");
        public final static Property DnsServer = new Property(22, String.class, "dnsServer", false, "DNS_SERVER");
        public final static Property EncryptionMode = new Property(23, String.class, "encryptionMode", false, "ENCRYPTION_MODE");
    }


    public N2NSettingModelDao(DaoConfig config) {
        super(config);
    }
    
    public N2NSettingModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"N2NSettingList\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"VERSION\" INTEGER NOT NULL ," + // 1: version
                "\"NAME\" TEXT," + // 2: name
                "\"IP\" TEXT," + // 3: ip
                "\"NETMASK\" TEXT," + // 4: netmask
                "\"COMMUNITY\" TEXT," + // 5: community
                "\"PASSWORD\" TEXT," + // 6: password
                "\"SUPER_NODE\" TEXT," + // 7: superNode
                "\"MORE_SETTINGS\" INTEGER NOT NULL ," + // 8: moreSettings
                "\"SUPER_NODE_BACKUP\" TEXT," + // 9: superNodeBackup
                "\"MAC_ADDR\" TEXT," + // 10: macAddr
                "\"MTU\" INTEGER NOT NULL ," + // 11: mtu
                "\"LOCAL_IP\" TEXT," + // 12: localIP
                "\"HOLE_PUNCH_INTERVAL\" INTEGER NOT NULL ," + // 13: holePunchInterval
                "\"RESOVE_SUPERNODE_IP\" INTEGER NOT NULL ," + // 14: resoveSupernodeIP
                "\"LOCAL_PORT\" INTEGER NOT NULL ," + // 15: localPort
                "\"ALLOW_ROUTING\" INTEGER NOT NULL ," + // 16: allowRouting
                "\"DROP_MUTICAST\" INTEGER NOT NULL ," + // 17: dropMuticast
                "\"USE_HTTP_TUNNEL\" INTEGER NOT NULL ," + // 18: useHttpTunnel
                "\"TRACE_LEVEL\" INTEGER NOT NULL ," + // 19: traceLevel
                "\"IS_SELCECTED\" INTEGER NOT NULL ," + // 20: isSelcected
                "\"GATEWAY_IP\" TEXT," + // 21: gatewayIp
                "\"DNS_SERVER\" TEXT," + // 22: dnsServer
                "\"ENCRYPTION_MODE\" TEXT);"); // 23: encryptionMode
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"N2NSettingList\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, N2NSettingModel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getVersion());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String ip = entity.getIp();
        if (ip != null) {
            stmt.bindString(4, ip);
        }
 
        String netmask = entity.getNetmask();
        if (netmask != null) {
            stmt.bindString(5, netmask);
        }
 
        String community = entity.getCommunity();
        if (community != null) {
            stmt.bindString(6, community);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(7, password);
        }
 
        String superNode = entity.getSuperNode();
        if (superNode != null) {
            stmt.bindString(8, superNode);
        }
        stmt.bindLong(9, entity.getMoreSettings() ? 1L: 0L);
 
        String superNodeBackup = entity.getSuperNodeBackup();
        if (superNodeBackup != null) {
            stmt.bindString(10, superNodeBackup);
        }
 
        String macAddr = entity.getMacAddr();
        if (macAddr != null) {
            stmt.bindString(11, macAddr);
        }
        stmt.bindLong(12, entity.getMtu());
 
        String localIP = entity.getLocalIP();
        if (localIP != null) {
            stmt.bindString(13, localIP);
        }
        stmt.bindLong(14, entity.getHolePunchInterval());
        stmt.bindLong(15, entity.getResoveSupernodeIP() ? 1L: 0L);
        stmt.bindLong(16, entity.getLocalPort());
        stmt.bindLong(17, entity.getAllowRouting() ? 1L: 0L);
        stmt.bindLong(18, entity.getDropMuticast() ? 1L: 0L);
        stmt.bindLong(19, entity.getUseHttpTunnel() ? 1L: 0L);
        stmt.bindLong(20, entity.getTraceLevel());
        stmt.bindLong(21, entity.getIsSelcected() ? 1L: 0L);
 
        String gatewayIp = entity.getGatewayIp();
        if (gatewayIp != null) {
            stmt.bindString(22, gatewayIp);
        }
 
        String dnsServer = entity.getDnsServer();
        if (dnsServer != null) {
            stmt.bindString(23, dnsServer);
        }
 
        String encryptionMode = entity.getEncryptionMode();
        if (encryptionMode != null) {
            stmt.bindString(24, encryptionMode);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, N2NSettingModel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getVersion());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String ip = entity.getIp();
        if (ip != null) {
            stmt.bindString(4, ip);
        }
 
        String netmask = entity.getNetmask();
        if (netmask != null) {
            stmt.bindString(5, netmask);
        }
 
        String community = entity.getCommunity();
        if (community != null) {
            stmt.bindString(6, community);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(7, password);
        }
 
        String superNode = entity.getSuperNode();
        if (superNode != null) {
            stmt.bindString(8, superNode);
        }
        stmt.bindLong(9, entity.getMoreSettings() ? 1L: 0L);
 
        String superNodeBackup = entity.getSuperNodeBackup();
        if (superNodeBackup != null) {
            stmt.bindString(10, superNodeBackup);
        }
 
        String macAddr = entity.getMacAddr();
        if (macAddr != null) {
            stmt.bindString(11, macAddr);
        }
        stmt.bindLong(12, entity.getMtu());
 
        String localIP = entity.getLocalIP();
        if (localIP != null) {
            stmt.bindString(13, localIP);
        }
        stmt.bindLong(14, entity.getHolePunchInterval());
        stmt.bindLong(15, entity.getResoveSupernodeIP() ? 1L: 0L);
        stmt.bindLong(16, entity.getLocalPort());
        stmt.bindLong(17, entity.getAllowRouting() ? 1L: 0L);
        stmt.bindLong(18, entity.getDropMuticast() ? 1L: 0L);
        stmt.bindLong(19, entity.getUseHttpTunnel() ? 1L: 0L);
        stmt.bindLong(20, entity.getTraceLevel());
        stmt.bindLong(21, entity.getIsSelcected() ? 1L: 0L);
 
        String gatewayIp = entity.getGatewayIp();
        if (gatewayIp != null) {
            stmt.bindString(22, gatewayIp);
        }
 
        String dnsServer = entity.getDnsServer();
        if (dnsServer != null) {
            stmt.bindString(23, dnsServer);
        }
 
        String encryptionMode = entity.getEncryptionMode();
        if (encryptionMode != null) {
            stmt.bindString(24, encryptionMode);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public N2NSettingModel readEntity(Cursor cursor, int offset) {
        N2NSettingModel entity = new N2NSettingModel( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // version
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // ip
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // netmask
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // community
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // password
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // superNode
            cursor.getShort(offset + 8) != 0, // moreSettings
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // superNodeBackup
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // macAddr
            cursor.getInt(offset + 11), // mtu
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // localIP
            cursor.getInt(offset + 13), // holePunchInterval
            cursor.getShort(offset + 14) != 0, // resoveSupernodeIP
            cursor.getInt(offset + 15), // localPort
            cursor.getShort(offset + 16) != 0, // allowRouting
            cursor.getShort(offset + 17) != 0, // dropMuticast
            cursor.getShort(offset + 18) != 0, // useHttpTunnel
            cursor.getInt(offset + 19), // traceLevel
            cursor.getShort(offset + 20) != 0, // isSelcected
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // gatewayIp
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // dnsServer
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23) // encryptionMode
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, N2NSettingModel entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setVersion(cursor.getInt(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setIp(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setNetmask(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCommunity(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPassword(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSuperNode(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setMoreSettings(cursor.getShort(offset + 8) != 0);
        entity.setSuperNodeBackup(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setMacAddr(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setMtu(cursor.getInt(offset + 11));
        entity.setLocalIP(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setHolePunchInterval(cursor.getInt(offset + 13));
        entity.setResoveSupernodeIP(cursor.getShort(offset + 14) != 0);
        entity.setLocalPort(cursor.getInt(offset + 15));
        entity.setAllowRouting(cursor.getShort(offset + 16) != 0);
        entity.setDropMuticast(cursor.getShort(offset + 17) != 0);
        entity.setUseHttpTunnel(cursor.getShort(offset + 18) != 0);
        entity.setTraceLevel(cursor.getInt(offset + 19));
        entity.setIsSelcected(cursor.getShort(offset + 20) != 0);
        entity.setGatewayIp(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setDnsServer(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setEncryptionMode(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(N2NSettingModel entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(N2NSettingModel entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(N2NSettingModel entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
