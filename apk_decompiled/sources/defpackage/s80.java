package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class s80 extends t {
    public final /* synthetic */ int d = 1;
    public final Object e;

    public s80(List list) {
        list.getClass();
        this.e = list;
    }

    @Override // defpackage.i, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // defpackage.t, java.util.List
    public final Object get(int i) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                String group = ((u80) obj).a.group(i);
                return group == null ? "" : group;
            default:
                List list = (List) obj;
                if (i >= 0 && i <= y80.v(this)) {
                    return list.get(y80.v(this) - i);
                }
                StringBuilder f = kp0.f(i, "Element index ", " must be in range [");
                f.append(new k10(0, y80.v(this), 1));
                f.append("].");
                throw new IndexOutOfBoundsException(f.toString());
        }
    }

    @Override // defpackage.t, defpackage.i
    public final int getSize() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                return ((u80) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.t, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.d) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.t, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.d) {
            case 1:
                return new nj0(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.t, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.d) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.t, java.util.List
    public ListIterator listIterator() {
        switch (this.d) {
            case 1:
                return new nj0(this, 0);
            default:
                return super.listIterator();
        }
    }

    public s80(u80 u80Var) {
        this.e = u80Var;
    }

    @Override // defpackage.t, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.d) {
            case 1:
                return new nj0(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
