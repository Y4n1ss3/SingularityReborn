package defpackage;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.DrawerValue;
import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderRange;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.runtime.saveable.MapSaverKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class z4 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ ky e;

    public /* synthetic */ z4(ky kyVar, int i) {
        this.d = i;
        this.e = kyVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        AnchoredDraggableState Saver$lambda$4;
        DrawerState Saver$lambda$1;
        Object mapSaver$lambda$1;
        w01 offset$lambda$0;
        w01 absoluteOffset$lambda$0;
        w01 InputField$lambda$38$lambda$37;
        w01 InputField$lambda$25$lambda$24;
        w01 RangeSlider$lambda$18$lambda$17;
        Snapshot takeNewSnapshot$lambda$0;
        Object callWithFrameNanos$lambda$0;
        SwipeToDismissBoxState Saver$lambda$3;
        switch (this.d) {
            case 0:
                Saver$lambda$4 = AnchoredDraggableState.Companion.Saver$lambda$4(this.e, obj);
                return Saver$lambda$4;
            case 1:
                Saver$lambda$1 = DrawerState.Companion.Saver$lambda$1(this.e, (DrawerValue) obj);
                return Saver$lambda$1;
            case 2:
                mapSaver$lambda$1 = MapSaverKt.mapSaver$lambda$1(this.e, (List) obj);
                return mapSaver$lambda$1;
            case 3:
                offset$lambda$0 = OffsetKt.offset$lambda$0(this.e, (InspectorInfo) obj);
                return offset$lambda$0;
            case 4:
                absoluteOffset$lambda$0 = OffsetKt.absoluteOffset$lambda$0(this.e, (InspectorInfo) obj);
                return absoluteOffset$lambda$0;
            case 5:
                InputField$lambda$38$lambda$37 = SearchBarDefaults.InputField$lambda$38$lambda$37(this.e, (FocusState) obj);
                return InputField$lambda$38$lambda$37;
            case 6:
                InputField$lambda$25$lambda$24 = SearchBarDefaults.InputField$lambda$25$lambda$24(this.e, (FocusState) obj);
                return InputField$lambda$25$lambda$24;
            case 7:
                RangeSlider$lambda$18$lambda$17 = SliderKt.RangeSlider$lambda$18$lambda$17(this.e, (SliderRange) obj);
                return RangeSlider$lambda$18$lambda$17;
            case 8:
                takeNewSnapshot$lambda$0 = SnapshotKt.takeNewSnapshot$lambda$0(this.e, (SnapshotIdSet) obj);
                return takeNewSnapshot$lambda$0;
            case 9:
                callWithFrameNanos$lambda$0 = SuspendAnimationKt.callWithFrameNanos$lambda$0(this.e, ((Long) obj).longValue());
                return callWithFrameNanos$lambda$0;
            default:
                Saver$lambda$3 = SwipeToDismissBoxState.Companion.Saver$lambda$3(this.e, (SwipeToDismissBoxValue) obj);
                return Saver$lambda$3;
        }
    }
}
