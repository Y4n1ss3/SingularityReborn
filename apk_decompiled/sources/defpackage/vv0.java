package defpackage;

import androidx.compose.animation.core.Transition;
import androidx.compose.material3.AppBarMenuState;
import androidx.compose.material3.ToggleableAppBarItem;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class vv0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ vv0(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.e = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 MenuContent$lambda$3;
        w01 animateTo$lambda$3;
        int i = this.d;
        int i2 = this.e;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                MenuContent$lambda$3 = ToggleableAppBarItem.MenuContent$lambda$3((ToggleableAppBarItem) obj4, (AppBarMenuState) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return MenuContent$lambda$3;
            default:
                animateTo$lambda$3 = Transition.animateTo$lambda$3((Transition) obj4, obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return animateTo$lambda$3;
        }
    }
}
