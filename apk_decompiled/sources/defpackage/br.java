package defpackage;

import java.io.File;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class br implements ao0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public br(File file, tv tvVar) {
        this.a = 1;
        file.getClass();
        this.b = file;
        this.c = tvVar;
    }

    @Override // defpackage.ao0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ar(this);
            case 1:
                return new vr(this);
            case 2:
                return new dz(this);
            default:
                return new hw0(this);
        }
    }

    public /* synthetic */ br(Object obj, ty tyVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = tyVar;
    }
}
