package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class t80 extends i {
    public final /* synthetic */ u80 d;

    public t80(u80 u80Var) {
        this.d = u80Var;
    }

    public final q80 a(int i) {
        Matcher matcher = this.d.a;
        k10 W = y80.W(matcher.start(i), matcher.end(i));
        if (W.d < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new q80(group, W);
    }

    @Override // defpackage.i, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof q80) {
            return super.contains((q80) obj);
        }
        return false;
    }

    @Override // defpackage.i
    public final int getSize() {
        return this.d.a.groupCount() + 1;
    }

    @Override // defpackage.i, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new hw0(new br(new cc(new k10(0, size() - 1, 1), 1), new h(this, 29), 3));
    }
}
