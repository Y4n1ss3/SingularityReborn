package defpackage;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a90 implements ky {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ a90(ii0 ii0Var, ii0 ii0Var2, Handle handle, TextFieldSelectionState textFieldSelectionState, boolean z) {
        this.f = ii0Var;
        this.g = textFieldSelectionState;
        this.e = z;
        this.h = handle;
        this.i = ii0Var2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 DropdownMenuContent_Qj0Zi0g$lambda$5$lambda$4;
        w01 detectSelectionHandleDragGestures$lambda$0;
        int i = this.d;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                DropdownMenuContent_Qj0Zi0g$lambda$5$lambda$4 = MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$5$lambda$4(this.e, (MutableTransitionState) obj5, (MutableState) obj4, (State) obj3, (State) obj2, (GraphicsLayerScope) obj);
                return DropdownMenuContent_Qj0Zi0g$lambda$5$lambda$4;
            default:
                detectSelectionHandleDragGestures$lambda$0 = TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$0((ii0) obj5, (TextFieldSelectionState) obj4, this.e, (Handle) obj3, (ii0) obj2, (Offset) obj);
                return detectSelectionHandleDragGestures$lambda$0;
        }
    }

    public /* synthetic */ a90(boolean z, MutableTransitionState mutableTransitionState, MutableState mutableState, State state, State state2) {
        this.e = z;
        this.f = mutableTransitionState;
        this.g = mutableState;
        this.h = state;
        this.i = state2;
    }
}
