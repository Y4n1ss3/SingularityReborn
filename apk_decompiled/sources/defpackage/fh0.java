package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class fh0 extends hh0 implements y20 {
    @Override // defpackage.wf
    public k20 computeReflected() {
        ki0.a.getClass();
        return this;
    }

    @Override // defpackage.y20
    public Object getDelegate(Object obj) {
        return ((y20) getReflected()).getDelegate(obj);
    }

    @Override // defpackage.y20
    /* renamed from: getGetter, reason: collision with other method in class */
    public x20 mo7882getGetter() {
        ((y20) getReflected()).mo7882getGetter();
        return null;
    }

    @Override // defpackage.ky
    public Object invoke(Object obj) {
        return get(obj);
    }

    public /* bridge */ /* synthetic */ u20 getGetter() {
        mo7882getGetter();
        return null;
    }
}
