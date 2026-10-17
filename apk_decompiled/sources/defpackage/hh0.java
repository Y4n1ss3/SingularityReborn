package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class hh0 extends wf implements z20 {
    private final boolean syntheticJavaProperty;

    public hh0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = false;
    }

    @Override // defpackage.wf
    public k20 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hh0) {
            hh0 hh0Var = (hh0) obj;
            return getOwner().equals(hh0Var.getOwner()) && getName().equals(hh0Var.getName()) && getSignature().equals(hh0Var.getSignature()) && q10.b(getBoundReceiver(), hh0Var.getBoundReceiver());
        }
        if (obj instanceof z20) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.wf
    public z20 getReflected() {
        if (this.syntheticJavaProperty) {
            lu0.a("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        k20 compute = compute();
        if (compute != this) {
            return (z20) compute;
        }
        throw new yn("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.z20
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // defpackage.z20
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        k20 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
