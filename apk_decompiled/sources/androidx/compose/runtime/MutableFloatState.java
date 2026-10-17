package androidx.compose.runtime;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface MutableFloatState extends FloatState, MutableState<Float> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static Float getValue(MutableFloatState mutableFloatState) {
            return Float.valueOf(MutableFloatState.access$getValue$jd(mutableFloatState));
        }

        @Deprecated
        public static void setValue(MutableFloatState mutableFloatState, float f) {
            MutableFloatState.super.setValue(f);
        }
    }

    static /* synthetic */ float access$getValue$jd(MutableFloatState mutableFloatState) {
        return super.getValue().floatValue();
    }

    @Override // androidx.compose.runtime.FloatState
    float getFloatValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    default Float getValue() {
        return Float.valueOf(getFloatValue());
    }

    void setFloatValue(float f);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Float f) {
        setValue(f.floatValue());
    }

    default void setValue(float f) {
        setFloatValue(f);
    }
}
