package androidx.compose.foundation.lazy.grid;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LazyGridItemInfo {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int UnknownColumn = -1;
    public static final int UnknownRow = -1;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int UnknownColumn = -1;
        public static final int UnknownRow = -1;

        private Companion() {
        }
    }

    int getColumn();

    Object getContentType();

    int getIndex();

    Object getKey();

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    long mo891getOffsetnOccac();

    int getRow();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo892getSizeYbymL2g();

    int getSpan();
}
