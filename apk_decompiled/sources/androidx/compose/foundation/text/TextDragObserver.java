package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionAdjustment;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface TextDragObserver {
    void onCancel();

    /* renamed from: onDown-k-4lQ0M, reason: not valid java name */
    void mo1170onDownk4lQ0M(long j);

    /* renamed from: onDrag-k-4lQ0M, reason: not valid java name */
    void mo1171onDragk4lQ0M(long j);

    /* renamed from: onStart-3MmeM6k, reason: not valid java name */
    void mo1172onStart3MmeM6k(long j, SelectionAdjustment selectionAdjustment);

    void onStop();

    void onUp();
}
