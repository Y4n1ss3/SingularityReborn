package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class s extends t implements RandomAccess {
    public final /* synthetic */ int d = 1;
    public int e;
    public int f;
    public final List g;

    public s(t tVar, int i, int i2) {
        this.g = tVar;
        this.e = i;
        p pVar = t.Companion;
        int size = tVar.size();
        pVar.getClass();
        p.c(i, i2, size);
        this.f = i2 - i;
    }

    @Override // defpackage.t, java.util.List
    public final Object get(int i) {
        int i2 = this.d;
        List list = this.g;
        switch (i2) {
            case 0:
                p pVar = t.Companion;
                int i3 = this.f;
                pVar.getClass();
                p.a(i, i3);
                return ((t) list).get(this.e + i);
            default:
                p pVar2 = t.Companion;
                int i4 = this.f;
                pVar2.getClass();
                p.a(i, i4);
                return list.get(this.e + i);
        }
    }

    @Override // defpackage.t, defpackage.i
    public final int getSize() {
        switch (this.d) {
        }
        return this.f;
    }

    @Override // defpackage.t, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public List subList(int i, int i2) {
        switch (this.d) {
            case 0:
                p pVar = t.Companion;
                int i3 = this.f;
                pVar.getClass();
                p.c(i, i2, i3);
                t tVar = (t) this.g;
                int i4 = this.e;
                return new s(tVar, i + i4, i4 + i2);
            default:
                return super.subList(i, i2);
        }
    }

    public s(List list) {
        this.g = list;
    }
}
