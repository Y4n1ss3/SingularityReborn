package androidx.compose.material3;

import defpackage.iy;
import defpackage.un;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        boolean invoke$lambda$7$lambda$6$lambda$5$lambda$2;
        boolean invoke$lambda$7$lambda$6$lambda$5$lambda$3;
        boolean invoke$lambda$7$lambda$6$lambda$5$lambda$4;
        w01 invoke$lambda$1$lambda$0;
        boolean invoke$lambda$7$lambda$6$lambda$5$lambda$42;
        w01 invoke$lambda$2$lambda$1;
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                invoke$lambda$7$lambda$6$lambda$5$lambda$2 = BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.invoke$lambda$7$lambda$6$lambda$5$lambda$2((un) obj2, (SheetState) obj);
                return Boolean.valueOf(invoke$lambda$7$lambda$6$lambda$5$lambda$2);
            case 1:
                invoke$lambda$7$lambda$6$lambda$5$lambda$3 = BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.invoke$lambda$7$lambda$6$lambda$5$lambda$3((un) obj2, (SheetState) obj);
                return Boolean.valueOf(invoke$lambda$7$lambda$6$lambda$5$lambda$3);
            case 2:
                invoke$lambda$7$lambda$6$lambda$5$lambda$4 = BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.invoke$lambda$7$lambda$6$lambda$5$lambda$4((un) obj2, (SheetState) obj);
                return Boolean.valueOf(invoke$lambda$7$lambda$6$lambda$5$lambda$4);
            case 3:
                invoke$lambda$1$lambda$0 = BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.invoke$lambda$1$lambda$0((SheetState) obj, (un) obj2);
                return invoke$lambda$1$lambda$0;
            case 4:
                invoke$lambda$7$lambda$6$lambda$5$lambda$42 = ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.invoke$lambda$7$lambda$6$lambda$5$lambda$4((SheetState) obj, (un) obj2);
                return Boolean.valueOf(invoke$lambda$7$lambda$6$lambda$5$lambda$42);
            default:
                invoke$lambda$2$lambda$1 = SnackbarHostKt$FadeInFadeOutWithScale$1$1.invoke$lambda$2$lambda$1((SnackbarData) obj2, (FadeInFadeOutState) obj);
                return invoke$lambda$2$lambda$1;
        }
    }

    public /* synthetic */ h(SheetState sheetState, un unVar, int i) {
        this.d = i;
        this.f = sheetState;
        this.e = unVar;
    }
}
