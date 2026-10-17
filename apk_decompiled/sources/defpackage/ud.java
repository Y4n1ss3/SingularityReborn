package defpackage;

import android.content.SharedPreferences;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.changelist.ChangeList;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ud implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ud(un unVar, ky kyVar, MutableState mutableState, MutableState mutableState2) {
        this.d = 8;
        this.e = unVar;
        this.f = mutableState;
        this.g = kyVar;
        this.h = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iy
    public final Object invoke() {
        w01 TooltipPopup$lambda$9$lambda$8;
        w01 insertMovableContentGuarded$lambda$0$0$0$0;
        w01 animateValue$lambda$1$0;
        w01 ModalBottomSheet_YbuCTN8$lambda$11$lambda$10;
        w01 DismissibleNavigationDrawer$lambda$30$lambda$29;
        SwipeToDismissBoxState rememberSwipeToDismissBoxState$lambda$5$lambda$4;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                TooltipPopup$lambda$9$lambda$8 = BasicTooltipKt.TooltipPopup$lambda$9$lambda$8((iy) obj2, (TooltipState) obj, (un) obj4, (MutableState) obj3);
                break;
            case 1:
                um.c((un) obj4, (jm) obj2, (MutableState) obj3, (MutableState) obj);
                break;
            case 2:
                insertMovableContentGuarded$lambda$0$0$0$0 = GapComposer.insertMovableContentGuarded$lambda$0$0$0$0((GapComposer) obj2, (ChangeList) obj, (SlotReader) obj4, (MovableContentStateReference) obj3);
                break;
            case 3:
                animateValue$lambda$1$0 = InfiniteTransitionKt.animateValue$lambda$1$0(obj2, (InfiniteTransition.TransitionAnimationState) obj, obj4, (InfiniteRepeatableSpec) obj3);
                break;
            case 4:
                ModalBottomSheet_YbuCTN8$lambda$11$lambda$10 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$11$lambda$10((SheetState) obj, (un) obj4, (Animatable) obj3, (iy) obj2);
                break;
            case 5:
                DismissibleNavigationDrawer$lambda$30$lambda$29 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$30$lambda$29((DrawerState) obj2, (Density) obj, (FiniteAnimationSpec) obj4, (FiniteAnimationSpec) obj3);
                break;
            case 6:
                rememberSwipeToDismissBoxState$lambda$5$lambda$4 = SwipeToDismissBoxKt.rememberSwipeToDismissBoxState$lambda$5$lambda$4((SwipeToDismissBoxValue) obj2, (Density) obj, (ky) obj4, (ky) obj3);
                break;
            case 7:
                rw0 rw0Var = (rw0) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                ky kyVar = (ky) obj4;
                MutableState mutableState = (MutableState) obj3;
                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                    rw0.a(rw0Var, "com.lumi.singularity.START_FRIDA");
                    r6.f(mutableState, Boolean.TRUE, sharedPreferences, "frida_is_running", true);
                    kyVar.invoke("Frida Server started");
                    break;
                } else {
                    rw0.a(rw0Var, "com.lumi.singularity.STOP_FRIDA");
                    r6.f(mutableState, Boolean.FALSE, sharedPreferences, "frida_is_running", false);
                    kyVar.invoke("Frida Server stopped");
                    break;
                }
            default:
                nq nqVar = nr.a;
                p01.t((un) obj4, hq.d, null, new o3((MutableState) obj3, (ky) obj2, (MutableState) obj, (hm) null), 2);
                break;
        }
        return w01Var;
    }

    public /* synthetic */ ud(un unVar, jm jmVar, MutableState mutableState, MutableState mutableState2) {
        this.d = 1;
        this.e = unVar;
        this.g = jmVar;
        this.f = mutableState;
        this.h = mutableState2;
    }

    public /* synthetic */ ud(SheetState sheetState, un unVar, Animatable animatable, iy iyVar) {
        this.d = 4;
        this.h = sheetState;
        this.e = unVar;
        this.f = animatable;
        this.g = iyVar;
    }

    public /* synthetic */ ud(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.d = i;
        this.g = obj;
        this.h = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
