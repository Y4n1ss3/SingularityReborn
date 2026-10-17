package defpackage;

import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Scrollable2DStateKt;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class oq implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ State e;

    public /* synthetic */ oq(State state, int i) {
        this.d = i;
        this.e = state;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 SingleRowTopAppBar$lambda$7$lambda$6;
        w01 rememberDraggable2DState$lambda$0$0;
        w01 rememberDraggableState$lambda$0$0;
        Offset rememberScrollable2DState$lambda$0$0;
        float rememberScrollableState$lambda$0$0;
        int i = this.d;
        State state = this.e;
        switch (i) {
            case 0:
                SingleRowTopAppBar$lambda$7$lambda$6 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$7$lambda$6(state, (DrawScope) obj);
                return SingleRowTopAppBar$lambda$7$lambda$6;
            case 1:
                rememberDraggable2DState$lambda$0$0 = Draggable2DKt.rememberDraggable2DState$lambda$0$0(state, (Offset) obj);
                return rememberDraggable2DState$lambda$0$0;
            case 2:
                rememberDraggableState$lambda$0$0 = DraggableKt.rememberDraggableState$lambda$0$0(state, ((Float) obj).floatValue());
                return rememberDraggableState$lambda$0$0;
            case 3:
                rememberScrollable2DState$lambda$0$0 = Scrollable2DStateKt.rememberScrollable2DState$lambda$0$0(state, (Offset) obj);
                return rememberScrollable2DState$lambda$0$0;
            default:
                rememberScrollableState$lambda$0$0 = ScrollableStateKt.rememberScrollableState$lambda$0$0(state, ((Float) obj).floatValue());
                return Float.valueOf(rememberScrollableState$lambda$0$0);
        }
    }
}
