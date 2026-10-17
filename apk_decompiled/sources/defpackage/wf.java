package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class wf implements k20, Serializable {
    public static final Object NO_RECEIVER = vf.d;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient k20 reflected;
    private final String signature;

    public wf(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.k20
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.k20
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public k20 compute() {
        k20 k20Var = this.reflected;
        if (k20Var != null) {
            return k20Var;
        }
        k20 computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract k20 computeReflected();

    @Override // defpackage.j20
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public l20 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return ki0.a(cls);
        }
        ki0.a.getClass();
        return new ke0(cls);
    }

    @Override // defpackage.k20
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract k20 getReflected();

    @Override // defpackage.k20
    public b30 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.k20
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.k20
    public c30 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.k20
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.k20
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.k20
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.k20
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
