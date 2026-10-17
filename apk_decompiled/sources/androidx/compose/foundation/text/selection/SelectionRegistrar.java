package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.l60;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface SelectionRegistrar {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long InvalidSelectableId = 0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long InvalidSelectableId = 0;

        private Companion() {
        }
    }

    l60 getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long j);

    void notifySelectableChange(long j);

    /* renamed from: notifySelectionUpdate-njBpvok, reason: not valid java name */
    boolean mo1541notifySelectionUpdatenjBpvok(LayoutCoordinates layoutCoordinates, long j, long j2, boolean z, SelectionAdjustment selectionAdjustment, boolean z2);

    void notifySelectionUpdateEnd();

    void notifySelectionUpdateSelectAll(long j, boolean z);

    /* renamed from: notifySelectionUpdateStart-ubNVwUQ, reason: not valid java name */
    void mo1542notifySelectionUpdateStartubNVwUQ(LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionAdjustment, boolean z);

    Selectable subscribe(Selectable selectable);

    void unsubscribe(Selectable selectable);
}
