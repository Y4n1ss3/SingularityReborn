package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface RootForTest {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface UncaughtExceptionHandler {
        void onUncaughtException(Throwable th);
    }

    Density getDensity();

    SemanticsOwner getSemanticsOwner();

    TextInputService getTextInputService();

    default boolean sendIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent) {
        return false;
    }

    /* renamed from: sendKeyEvent-ZmokQxo, reason: not valid java name */
    boolean mo6641sendKeyEventZmokQxo(KeyEvent keyEvent);

    @er
    static /* synthetic */ void getTextInputService$annotations() {
    }

    default void measureAndLayoutForTest() {
    }

    default void forceAccessibilityForTesting(boolean z) {
    }

    default void setAccessibilityEventBatchIntervalMillis(long j) {
    }

    default void setUncaughtExceptionHandler(UncaughtExceptionHandler uncaughtExceptionHandler) {
    }
}
