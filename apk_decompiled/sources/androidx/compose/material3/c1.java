package androidx.compose.material3;

import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ SnackbarData e;

    public /* synthetic */ c1(SnackbarData snackbarData, int i) {
        this.d = i;
        this.e = snackbarData;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        boolean invoke$lambda$5$lambda$4$lambda$3;
        w01 invoke$lambda$1$lambda$0;
        w01 invoke$lambda$1$lambda$02;
        int i = this.d;
        SnackbarData snackbarData = this.e;
        switch (i) {
            case 0:
                invoke$lambda$5$lambda$4$lambda$3 = SnackbarHostKt$FadeInFadeOutWithScale$1$1.invoke$lambda$5$lambda$4$lambda$3(snackbarData);
                return Boolean.valueOf(invoke$lambda$5$lambda$4$lambda$3);
            case 1:
                invoke$lambda$1$lambda$0 = SnackbarKt$Snackbar$actionComposable$1.invoke$lambda$1$lambda$0(snackbarData);
                return invoke$lambda$1$lambda$0;
            default:
                invoke$lambda$1$lambda$02 = SnackbarKt$Snackbar$dismissActionComposable$1.invoke$lambda$1$lambda$0(snackbarData);
                return invoke$lambda$1$lambda$02;
        }
    }
}
