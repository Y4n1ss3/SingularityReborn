package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import defpackage.iy;
import defpackage.ky;
import defpackage.lu0;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface FocusOwner extends FocusManager {
    /* renamed from: dispatchKeyEvent-YhN2O0w$default, reason: not valid java name */
    static /* synthetic */ boolean m4404dispatchKeyEventYhN2O0w$default(FocusOwner focusOwner, KeyEvent keyEvent, iy iyVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
            return false;
        }
        if ((i & 2) != 0) {
            iyVar = FocusOwner$dispatchKeyEvent$1.INSTANCE;
        }
        return focusOwner.mo4407dispatchKeyEventYhN2O0w(keyEvent, iyVar);
    }

    static /* synthetic */ boolean dispatchRotaryEvent$default(FocusOwner focusOwner, RotaryScrollEvent rotaryScrollEvent, iy iyVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: dispatchRotaryEvent");
            return false;
        }
        if ((i & 2) != 0) {
            iyVar = FocusOwner$dispatchRotaryEvent$1.INSTANCE;
        }
        return focusOwner.dispatchRotaryEvent(rotaryScrollEvent, iyVar);
    }

    /* renamed from: clearFocus-I7lrPNg, reason: not valid java name */
    boolean mo4405clearFocusI7lrPNg(boolean z, boolean z2, boolean z3, int i);

    void clearOwnerFocus();

    void dispatchIndirectPointerCancel();

    boolean dispatchIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent);

    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo, reason: not valid java name */
    boolean mo4406dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent);

    /* renamed from: dispatchKeyEvent-YhN2O0w, reason: not valid java name */
    boolean mo4407dispatchKeyEventYhN2O0w(KeyEvent keyEvent, iy iyVar);

    boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent, iy iyVar);

    /* renamed from: focusSearch-ULY8qGw, reason: not valid java name */
    Boolean mo4408focusSearchULY8qGw(int i, Rect rect, ky kyVar);

    void focusTargetAvailable();

    FocusTargetNode getActiveFocusTargetNode();

    Rect getFocusRect();

    xa0 getListeners();

    Modifier getModifier();

    FocusState getRootState();

    boolean hasFocusableContent();

    boolean hasNonInteropFocusableContent();

    boolean isFocusCaptured();

    /* renamed from: moveFocus-aToIllA, reason: not valid java name */
    boolean mo4409moveFocusaToIllA(int i, boolean z);

    void releaseFocus();

    /* renamed from: requestOwnerFocus-7o62pno, reason: not valid java name */
    boolean mo4410requestOwnerFocus7o62pno(FocusDirection focusDirection, Rect rect);

    /* renamed from: resetFocus-3ESFkO8, reason: not valid java name */
    boolean mo4411resetFocus3ESFkO8(int i);

    void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode);

    void scheduleInvalidation(FocusTargetNode focusTargetNode);

    void scheduleInvalidationForOwner();

    void setActiveFocusTargetNode(FocusTargetNode focusTargetNode);

    void setFocusCaptured(boolean z);

    /* renamed from: takeFocus-aToIllA, reason: not valid java name */
    boolean mo4412takeFocusaToIllA(int i, Rect rect);
}
