package androidx.compose.foundation.text.selection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface MouseSelectionObserver {
    /* renamed from: onDrag-3MmeM6k */
    boolean mo1412onDrag3MmeM6k(long j, SelectionAdjustment selectionAdjustment);

    void onDragDone();

    /* renamed from: onExtend-k-4lQ0M */
    boolean mo1413onExtendk4lQ0M(long j);

    /* renamed from: onExtendDrag-k-4lQ0M */
    boolean mo1414onExtendDragk4lQ0M(long j);

    /* renamed from: onStart-9KIMszo */
    boolean mo1415onStart9KIMszo(long j, SelectionAdjustment selectionAdjustment, int i);
}
