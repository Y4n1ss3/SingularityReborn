package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class sn {
    public static final sn d;
    public static final sn e;
    public static final sn f;
    public static final sn g;
    public static final sn h;
    public static final /* synthetic */ sn[] i;

    static {
        sn snVar = new sn("CPU_ACQUIRED", 0);
        d = snVar;
        sn snVar2 = new sn("BLOCKING", 1);
        e = snVar2;
        sn snVar3 = new sn("PARKING", 2);
        f = snVar3;
        sn snVar4 = new sn("DORMANT", 3);
        g = snVar4;
        sn snVar5 = new sn("TERMINATED", 4);
        h = snVar5;
        i = new sn[]{snVar, snVar2, snVar3, snVar4, snVar5};
    }

    public static sn valueOf(String str) {
        return (sn) Enum.valueOf(sn.class, str);
    }

    public static sn[] values() {
        return (sn[]) i.clone();
    }
}
