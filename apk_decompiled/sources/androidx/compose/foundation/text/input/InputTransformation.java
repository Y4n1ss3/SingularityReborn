package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface InputTransformation {
    public static final Companion Companion = Companion.$$INSTANCE;

    default KeyboardOptions getKeyboardOptions() {
        return null;
    }

    void transformInput(TextFieldBuffer textFieldBuffer);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion implements InputTransformation {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.foundation.text.input.InputTransformation
        public void transformInput(TextFieldBuffer textFieldBuffer) {
        }
    }

    default void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}
