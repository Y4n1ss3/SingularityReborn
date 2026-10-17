package androidx.compose.runtime;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface MutableDoubleState extends DoubleState, MutableState<Double> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static Double getValue(MutableDoubleState mutableDoubleState) {
            return Double.valueOf(MutableDoubleState.access$getValue$jd(mutableDoubleState));
        }

        @Deprecated
        public static void setValue(MutableDoubleState mutableDoubleState, double d) {
            MutableDoubleState.super.setValue(d);
        }
    }

    static /* synthetic */ double access$getValue$jd(MutableDoubleState mutableDoubleState) {
        return super.getValue().doubleValue();
    }

    @Override // androidx.compose.runtime.DoubleState
    double getDoubleValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    default Double getValue() {
        return Double.valueOf(getDoubleValue());
    }

    void setDoubleValue(double d);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Double d) {
        setValue(d.doubleValue());
    }

    default void setValue(double d) {
        setDoubleValue(d);
    }
}
