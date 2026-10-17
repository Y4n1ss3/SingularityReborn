package defpackage;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.SelectRangeGesture;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class tz {
    public static /* bridge */ /* synthetic */ boolean A(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean C(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    public static /* bridge */ /* synthetic */ DeleteGesture k(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture l(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ HandwritingGesture m(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static /* bridge */ /* synthetic */ JoinOrSplitGesture n(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture o(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj) {
        return obj instanceof DeleteGesture;
    }

    public static /* bridge */ /* synthetic */ HandwritingGesture z(Object obj) {
        return (HandwritingGesture) obj;
    }
}
