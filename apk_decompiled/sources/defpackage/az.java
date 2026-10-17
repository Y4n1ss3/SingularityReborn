package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.LinkComposer;
import androidx.compose.runtime.MovableContent;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class az implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ MovableContent e;
    public final /* synthetic */ Object f;

    public /* synthetic */ az(MovableContent movableContent, Object obj, int i) {
        this.d = i;
        this.e = movableContent;
        this.f = obj;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 invokeMovableContentLambda$lambda$0;
        w01 invokeMovableContentLambda$lambda$0$0;
        int i = this.d;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                invokeMovableContentLambda$lambda$0 = GapComposer.invokeMovableContentLambda$lambda$0(this.e, this.f, composer, intValue);
                return invokeMovableContentLambda$lambda$0;
            default:
                invokeMovableContentLambda$lambda$0$0 = LinkComposer.invokeMovableContentLambda$lambda$0$0(this.e, this.f, composer, intValue);
                return invokeMovableContentLambda$lambda$0$0;
        }
    }
}
