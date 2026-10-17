package defpackage;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class p5 {
    public static /* bridge */ /* synthetic */ Class A() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return RemoveSpaceGesture.class;
    }

    public static /* bridge */ /* synthetic */ InsertGesture h(Object obj) {
        return (InsertGesture) obj;
    }

    public static /* bridge */ /* synthetic */ RemoveSpaceGesture i(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectGesture j(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean p(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ Class t() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ Class w() {
        return DeleteRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return JoinOrSplitGesture.class;
    }
}
