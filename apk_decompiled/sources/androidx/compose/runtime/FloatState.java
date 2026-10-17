package androidx.compose.runtime;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface FloatState extends State<Float> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static Float getValue(FloatState floatState) {
            return Float.valueOf(FloatState.access$getValue$jd(floatState));
        }
    }

    static /* synthetic */ float access$getValue$jd(FloatState floatState) {
        return super.getValue().floatValue();
    }

    float getFloatValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    default Float getValue() {
        return Float.valueOf(getFloatValue());
    }
}
