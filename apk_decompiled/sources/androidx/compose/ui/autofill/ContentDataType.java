package androidx.compose.ui.autofill;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ContentDataType {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ContentDataType None = ContentDataType_androidKt.ContentDataType(0);
        private static final ContentDataType Text = ContentDataType_androidKt.ContentDataType(1);
        private static final ContentDataType List = ContentDataType_androidKt.ContentDataType(3);
        private static final ContentDataType Date = ContentDataType_androidKt.ContentDataType(4);
        private static final ContentDataType Toggle = ContentDataType_androidKt.ContentDataType(2);

        private Companion() {
        }

        public final ContentDataType getDate() {
            return Date;
        }

        public final ContentDataType getList() {
            return List;
        }

        public final ContentDataType getNone() {
            return None;
        }

        public final ContentDataType getText() {
            return Text;
        }

        public final ContentDataType getToggle() {
            return Toggle;
        }
    }
}
