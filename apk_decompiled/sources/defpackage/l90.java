package defpackage;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class l90 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ iy f;

    public /* synthetic */ l90(String str, iy iyVar, int i) {
        this.d = i;
        this.e = str;
        this.f = iyVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 Scrim_KTwxG1Y$lambda$31$lambda$30;
        w01 Scrim_Bx497Mc$lambda$69$lambda$68;
        switch (this.d) {
            case 0:
                Scrim_KTwxG1Y$lambda$31$lambda$30 = ModalBottomSheetKt.Scrim_KTwxG1Y$lambda$31$lambda$30(this.e, this.f, (SemanticsPropertyReceiver) obj);
                return Scrim_KTwxG1Y$lambda$31$lambda$30;
            default:
                Scrim_Bx497Mc$lambda$69$lambda$68 = NavigationDrawerKt.Scrim_Bx497Mc$lambda$69$lambda$68(this.e, this.f, (SemanticsPropertyReceiver) obj);
                return Scrim_Bx497Mc$lambda$69$lambda$68;
        }
    }
}
