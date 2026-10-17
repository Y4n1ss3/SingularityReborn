package androidx.compose.material3;

import androidx.compose.material3.internal.FloatProducer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements FloatProducer {
    public final /* synthetic */ int a;
    public final /* synthetic */ DrawerState b;

    public /* synthetic */ r0(DrawerState drawerState, int i) {
        this.a = i;
        this.b = drawerState;
    }

    @Override // androidx.compose.material3.internal.FloatProducer
    public final float invoke() {
        float invoke$lambda$1$lambda$0;
        float invoke$lambda$1$lambda$02;
        int i = this.a;
        DrawerState drawerState = this.b;
        switch (i) {
            case 0:
                invoke$lambda$1$lambda$0 = NavigationDrawerKt$DismissibleDrawerSheet$2.invoke$lambda$1$lambda$0(drawerState);
                return invoke$lambda$1$lambda$0;
            default:
                invoke$lambda$1$lambda$02 = NavigationDrawerKt$ModalDrawerSheet$2.invoke$lambda$1$lambda$0(drawerState);
                return invoke$lambda$1$lambda$02;
        }
    }
}
