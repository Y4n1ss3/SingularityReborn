package androidx.compose.ui.autofill;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface FillableData {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    default Boolean getBooleanValue() {
        return null;
    }

    default long getDateMillisOrDefault(long j) {
        Long dateMillisValue = getDateMillisValue();
        return dateMillisValue != null ? dateMillisValue.longValue() : j;
    }

    default Long getDateMillisValue() {
        return null;
    }

    default int getListIndexOrDefault(int i) {
        Integer listIndexValue = getListIndexValue();
        return listIndexValue != null ? listIndexValue.intValue() : i;
    }

    default Integer getListIndexValue() {
        return null;
    }

    default CharSequence getTextValue() {
        return null;
    }
}
