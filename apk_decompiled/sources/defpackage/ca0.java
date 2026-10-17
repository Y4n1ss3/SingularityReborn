package defpackage;

import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ca0 implements qy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ca0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.qy
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        w01 movableContentWithReceiverOf$lambda$7;
        w01 movableContentOf$lambda$7;
        boolean _init_$lambda$3;
        int i = this.d;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                movableContentWithReceiverOf$lambda$7 = MovableContentKt.movableContentWithReceiverOf$lambda$7((MovableContent) obj7, obj, obj2, obj3, obj4, (Composer) obj5, ((Integer) obj6).intValue());
                return movableContentWithReceiverOf$lambda$7;
            case 1:
                movableContentOf$lambda$7 = MovableContentKt.movableContentOf$lambda$7((MovableContent) obj7, obj, obj2, obj3, obj4, (Composer) obj5, ((Integer) obj6).intValue());
                return movableContentOf$lambda$7;
            default:
                _init_$lambda$3 = SelectionManager._init_$lambda$3((SelectionManager) obj7, ((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, (Offset) obj3, (Offset) obj4, ((Boolean) obj5).booleanValue(), (SelectionAdjustment) obj6);
                return Boolean.valueOf(_init_$lambda$3);
        }
    }
}
