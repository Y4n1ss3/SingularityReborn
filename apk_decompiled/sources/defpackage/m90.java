package defpackage;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class m90 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m90(int i, long j, Object obj) {
        this.d = i;
        this.e = j;
        this.f = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 Scrim_KTwxG1Y$lambda$33$lambda$32;
        w01 Scrim_3J_VO9M$lambda$35$lambda$34;
        w01 Scrim_Bx497Mc$lambda$71$lambda$70;
        switch (this.d) {
            case 0:
                Scrim_KTwxG1Y$lambda$33$lambda$32 = ModalBottomSheetKt.Scrim_KTwxG1Y$lambda$33$lambda$32(this.e, (State) this.f, (DrawScope) obj);
                return Scrim_KTwxG1Y$lambda$33$lambda$32;
            case 1:
                Scrim_3J_VO9M$lambda$35$lambda$34 = WideNavigationRailKt.Scrim_3J_VO9M$lambda$35$lambda$34(this.e, (State) this.f, (DrawScope) obj);
                return Scrim_3J_VO9M$lambda$35$lambda$34;
            default:
                Scrim_Bx497Mc$lambda$71$lambda$70 = NavigationDrawerKt.Scrim_Bx497Mc$lambda$71$lambda$70(this.e, (iy) this.f, (DrawScope) obj);
                return Scrim_Bx497Mc$lambda$71$lambda$70;
        }
    }
}
