package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.material3.LabelKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class f6 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ f6(rw0 rw0Var, boolean z, iy iyVar, int i) {
        this.d = 3;
        this.g = rw0Var;
        this.e = z;
        this.h = iyVar;
        this.f = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 SelectionHandleIcon$lambda$0;
        w01 HandleInteractions$lambda$7;
        w01 TextFieldSelectionHandle$lambda$3;
        int i = this.d;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                SelectionHandleIcon$lambda$0 = AndroidSelectionHandles_androidKt.SelectionHandleIcon$lambda$0((Modifier) obj4, (iy) obj3, this.e, this.f, (Composer) obj, intValue);
                return SelectionHandleIcon$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                HandleInteractions$lambda$7 = LabelKt.HandleInteractions$lambda$7(this.e, (TooltipState) obj4, (MutableInteractionSource) obj3, this.f, (Composer) obj, intValue2);
                return HandleInteractions$lambda$7;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                TextFieldSelectionHandle$lambda$3 = TextFieldSelectionManagerKt.TextFieldSelectionHandle$lambda$3(this.e, (ResolvedTextDirection) obj4, (TextFieldSelectionManager) obj3, this.f, (Composer) obj, intValue3);
                return TextFieldSelectionHandle$lambda$3;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f | 1);
                o01.b((rw0) obj4, this.e, (iy) obj3, (Composer) obj, updateChangedFlags);
                return w01.a;
        }
    }

    public /* synthetic */ f6(Modifier modifier, iy iyVar, boolean z, int i) {
        this.d = 0;
        this.g = modifier;
        this.h = iyVar;
        this.e = z;
        this.f = i;
    }

    public /* synthetic */ f6(boolean z, Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.e = z;
        this.g = obj;
        this.h = obj2;
        this.f = i;
    }
}
