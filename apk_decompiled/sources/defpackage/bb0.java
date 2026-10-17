package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class bb0 extends eb0 implements w20 {
    @Override // defpackage.wf
    public k20 computeReflected() {
        ki0.a.getClass();
        return this;
    }

    @Override // defpackage.w20
    public Object getDelegate() {
        return ((bb0) getReflected()).getDelegate();
    }

    @Override // defpackage.w20
    /* renamed from: getGetter, reason: collision with other method in class */
    public v20 mo7880getGetter() {
        ((bb0) getReflected()).mo7880getGetter();
        return null;
    }

    /* renamed from: getSetter, reason: collision with other method in class */
    public s20 m7881getSetter() {
        ((bb0) getReflected()).m7881getSetter();
        return null;
    }

    @Override // defpackage.iy
    public Object invoke() {
        return get();
    }

    public /* bridge */ /* synthetic */ u20 getGetter() {
        mo7880getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ r20 getSetter() {
        m7881getSetter();
        return null;
    }
}
