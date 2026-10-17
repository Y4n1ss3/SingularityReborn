package androidx.compose.runtime;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface MutableIntState extends IntState, MutableState<Integer> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static Integer getValue(MutableIntState mutableIntState) {
            return Integer.valueOf(MutableIntState.access$getValue$jd(mutableIntState));
        }

        @Deprecated
        public static void setValue(MutableIntState mutableIntState, int i) {
            MutableIntState.super.setValue(i);
        }
    }

    static /* synthetic */ int access$getValue$jd(MutableIntState mutableIntState) {
        return super.getValue().intValue();
    }

    @Override // androidx.compose.runtime.IntState
    int getIntValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    default Integer getValue() {
        return Integer.valueOf(getIntValue());
    }

    void setIntValue(int i);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        setValue(num.intValue());
    }

    default void setValue(int i) {
        setIntValue(i);
    }
}
