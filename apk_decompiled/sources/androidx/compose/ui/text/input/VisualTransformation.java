package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface VisualTransformation {
    public static final Companion Companion = Companion.$$INSTANCE;

    TransformedText filter(AnnotatedString annotatedString);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final VisualTransformation None = new lu0(5);

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransformedText None$lambda$0(AnnotatedString annotatedString) {
            return new TransformedText(annotatedString, OffsetMapping.Companion.getIdentity());
        }

        public final VisualTransformation getNone() {
            return None;
        }

        public static /* synthetic */ void getNone$annotations() {
        }
    }
}
