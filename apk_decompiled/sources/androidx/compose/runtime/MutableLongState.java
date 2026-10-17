package androidx.compose.runtime;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface MutableLongState extends LongState, MutableState<Long> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static Long getValue(MutableLongState mutableLongState) {
            return Long.valueOf(MutableLongState.access$getValue$jd(mutableLongState));
        }

        @Deprecated
        public static void setValue(MutableLongState mutableLongState, long j) {
            MutableLongState.super.setValue(j);
        }
    }

    static /* synthetic */ long access$getValue$jd(MutableLongState mutableLongState) {
        return super.getValue().longValue();
    }

    @Override // androidx.compose.runtime.LongState
    long getLongValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    default Long getValue() {
        return Long.valueOf(getLongValue());
    }

    void setLongValue(long j);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Long l) {
        setValue(l.longValue());
    }

    default void setValue(long j) {
        setLongValue(j);
    }
}
