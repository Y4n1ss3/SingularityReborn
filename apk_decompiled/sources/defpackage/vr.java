package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class vr extends n {
    public final /* synthetic */ int f = 1;
    public final Object g;
    public final Object h;

    public vr(br brVar) {
        this.h = brVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        File file = (File) brVar.b;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (!file.isFile()) {
            this.d = 2;
        } else {
            file.getClass();
            arrayDeque.push(new qv(file));
        }
    }

    @Override // defpackage.n
    public final void a() {
        File file;
        File a;
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((HashSet) this.h).add(next)) {
                        this.e = next;
                        this.d = 1;
                        break;
                    }
                }
                this.d = 2;
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) obj;
                while (true) {
                    sv svVar = (sv) arrayDeque.peek();
                    if (svVar == null) {
                        file = null;
                    } else {
                        a = svVar.a();
                        if (a == null) {
                            arrayDeque.pop();
                        } else if (!a.equals(svVar.a) && a.isDirectory() && arrayDeque.size() < Integer.MAX_VALUE) {
                            arrayDeque.push(b(a));
                        }
                    }
                }
                file = a;
                if (file == null) {
                    this.d = 2;
                    break;
                } else {
                    this.e = file;
                    this.d = 1;
                    break;
                }
                break;
        }
    }

    public ov b(File file) {
        int ordinal = ((tv) ((br) this.h).c).ordinal();
        if (ordinal == 0) {
            file.getClass();
            return new rv(file);
        }
        if (ordinal == 1) {
            file.getClass();
            return new pv(file);
        }
        o.n();
        return null;
    }

    public vr(Iterator it, fo0 fo0Var) {
        it.getClass();
        this.g = it;
        this.h = new HashSet();
    }
}
