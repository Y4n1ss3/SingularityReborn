package androidx.compose.ui.text.input;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface OffsetMapping {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final OffsetMapping Identity = new OffsetMapping() { // from class: androidx.compose.ui.text.input.OffsetMapping$Companion$Identity$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int originalToTransformed(int i) {
                return i;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int transformedToOriginal(int i) {
                return i;
            }
        };

        private Companion() {
        }

        public final OffsetMapping getIdentity() {
            return Identity;
        }
    }

    int originalToTransformed(int i);

    int transformedToOriginal(int i);
}
