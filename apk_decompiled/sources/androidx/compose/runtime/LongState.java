package androidx.compose.runtime;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LongState extends State<Long> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static Long getValue(LongState longState) {
            return Long.valueOf(LongState.access$getValue$jd(longState));
        }
    }

    static /* synthetic */ long access$getValue$jd(LongState longState) {
        return super.getValue().longValue();
    }

    long getLongValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    default Long getValue() {
        return Long.valueOf(getLongValue());
    }
}
