package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class cu extends t implements bu, Serializable {
    public final Enum[] d;

    public cu(Enum[] enumArr) {
        enumArr.getClass();
        this.d = enumArr;
    }

    @Override // defpackage.i, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        Enum[] enumArr = this.d;
        enumArr.getClass();
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r3;
    }

    @Override // defpackage.t, java.util.List
    public final Object get(int i) {
        p pVar = t.Companion;
        Enum[] enumArr = this.d;
        int length = enumArr.length;
        pVar.getClass();
        p.a(i, length);
        return enumArr[i];
    }

    @Override // defpackage.t, defpackage.i
    public final int getSize() {
        return this.d.length;
    }

    @Override // defpackage.t, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        Enum[] enumArr = this.d;
        enumArr.getClass();
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r4) {
            return ordinal;
        }
        return -1;
    }

    @Override // defpackage.t, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        Enum[] enumArr = this.d;
        enumArr.getClass();
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r4) {
            return ordinal;
        }
        return -1;
    }
}
