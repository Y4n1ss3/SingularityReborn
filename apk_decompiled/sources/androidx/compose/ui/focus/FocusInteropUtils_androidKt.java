package androidx.compose.ui.focus;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FocusInteropUtils_androidKt {
    private static final int[] tempCoordinates = new int[2];
    private static final Rect tempRect = new Rect();

    public static final androidx.compose.ui.geometry.Rect calculateFocusRectRelativeTo(View view, View view2) {
        int[] iArr = tempCoordinates;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        float f = i - iArr[0];
        float f2 = i2 - iArr[1];
        Rect rect = tempRect;
        view.getFocusedRect(rect);
        int i3 = rect.left;
        return new androidx.compose.ui.geometry.Rect(i3 + f, rect.top + f2, f + i3 + rect.width(), f2 + rect.top + rect.height());
    }

    public static final boolean requestInteropFocus(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* renamed from: toAndroidFocusDirection-3ESFkO8, reason: not valid java name */
    public static final Integer m4400toAndroidFocusDirection3ESFkO8(int i) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m4388equalsimpl0(i, companion.m4399getUpdhqQ8s())) {
            return 33;
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4392getDowndhqQ8s())) {
            return 130;
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4395getLeftdhqQ8s())) {
            return 17;
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4398getRightdhqQ8s())) {
            return 66;
        }
        if (FocusDirection.m4388equalsimpl0(i, companion.m4396getNextdhqQ8s())) {
            return 2;
        }
        return FocusDirection.m4388equalsimpl0(i, companion.m4397getPreviousdhqQ8s()) ? 1 : null;
    }

    public static final FocusDirection toFocusDirection(int i) {
        if (i == 1) {
            return FocusDirection.m4385boximpl(FocusDirection.Companion.m4397getPreviousdhqQ8s());
        }
        if (i == 2) {
            return FocusDirection.m4385boximpl(FocusDirection.Companion.m4396getNextdhqQ8s());
        }
        if (i == 17) {
            return FocusDirection.m4385boximpl(FocusDirection.Companion.m4395getLeftdhqQ8s());
        }
        if (i == 33) {
            return FocusDirection.m4385boximpl(FocusDirection.Companion.m4399getUpdhqQ8s());
        }
        if (i == 66) {
            return FocusDirection.m4385boximpl(FocusDirection.Companion.m4398getRightdhqQ8s());
        }
        if (i != 130) {
            return null;
        }
        return FocusDirection.m4385boximpl(FocusDirection.Companion.m4392getDowndhqQ8s());
    }

    /* renamed from: toFocusDirection-ZmokQxo, reason: not valid java name */
    public static final FocusDirection m4401toFocusDirectionZmokQxo(KeyEvent keyEvent) {
        long m5932getKeyZmokQxo = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5773getNavigatePreviousEK5gGoQ())) {
            return FocusDirection.m4385boximpl(FocusDirection.Companion.m4397getPreviousdhqQ8s());
        }
        if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5771getNavigateNextEK5gGoQ())) {
            return FocusDirection.m4385boximpl(FocusDirection.Companion.m4396getNextdhqQ8s());
        }
        if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5860getTabEK5gGoQ())) {
            return FocusDirection.m4385boximpl(KeyEvent_androidKt.m5938isShiftPressedZmokQxo(keyEvent) ? FocusDirection.Companion.m4397getPreviousdhqQ8s() : FocusDirection.Companion.m4396getNextdhqQ8s());
        }
        if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5690getDirectionRightEK5gGoQ())) {
            return FocusDirection.m4385boximpl(FocusDirection.Companion.m4398getRightdhqQ8s());
        }
        if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5689getDirectionLeftEK5gGoQ())) {
            return FocusDirection.m4385boximpl(FocusDirection.Companion.m4395getLeftdhqQ8s());
        }
        if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5691getDirectionUpEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5812getPageUpEK5gGoQ())) {
            return FocusDirection.m4385boximpl(FocusDirection.Companion.m4399getUpdhqQ8s());
        }
        if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5686getDirectionDownEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5811getPageDownEK5gGoQ())) {
            return FocusDirection.m4385boximpl(FocusDirection.Companion.m4392getDowndhqQ8s());
        }
        if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5685getDirectionCenterEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5699getEnterEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5796getNumPadEnterEK5gGoQ())) {
            return FocusDirection.m4385boximpl(FocusDirection.Companion.m4393getEnterdhqQ8s());
        }
        if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5628getBackEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5702getEscapeEK5gGoQ())) {
            return FocusDirection.m4385boximpl(FocusDirection.Companion.m4394getExitdhqQ8s());
        }
        return null;
    }

    public static final LayoutDirection toLayoutDirection(int i) {
        if (i == 0) {
            return LayoutDirection.Ltr;
        }
        if (i != 1) {
            return null;
        }
        return LayoutDirection.Rtl;
    }
}
